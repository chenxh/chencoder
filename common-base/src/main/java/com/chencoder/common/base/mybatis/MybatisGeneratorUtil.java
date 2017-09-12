package com.chencoder.common.base.mybatis;

import com.chencoder.common.base.util.JdbcUtil;
import com.chencoder.common.base.util.StringUtil;
import com.chencoder.common.base.util.VelocityUtil;
import org.apache.commons.lang.ObjectUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MybatisGeneratorUtil {

    // generatorConfig模板路径
    private static String GENERATORCONFIG_VM = "/template/generatorConfig.vm";
    // Service模板路径
    private static String SERVICE_VM = "/template/Service.vm";
    // Dao模板路径
    private static String DAO_VM = "/template/Dao.vm";

    /**
     * 根据模板生成generatorConfig.xml文件
     * @param jdbc_driver   驱动路径
     * @param jdbc_url      链接
     * @param jdbc_username 帐号
     * @param jdbc_password 密码
     * @param module        项目模块
     * @param database      数据库
     * @param table_prefix  表前缀
     * @param package_name  包名
     */
    public static void generator(
            String jdbc_driver,
            String jdbc_url,
            String jdbc_username,
            String jdbc_password,
            String module,
            String database,
            String table_prefix,
            String package_name,
            Map<String, String> last_insert_id_tables) throws Exception{

        GENERATORCONFIG_VM = MybatisGeneratorUtil.class.getResource(GENERATORCONFIG_VM).getPath().replaceFirst("/", "");
        SERVICE_VM = MybatisGeneratorUtil.class.getResource(SERVICE_VM).getPath().replaceFirst("/", "");
        DAO_VM = MybatisGeneratorUtil.class.getResource(DAO_VM).getPath().replaceFirst("/", "");


        String targetProject = module + "/" + module + "-dao";
        String basePath = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "").replace(targetProject, "").replaceFirst("/", "");
        String generatorConfig_xml = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "") + "/src/main/resources/generatorConfig.xml";
        targetProject = basePath + targetProject;
        String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "' AND table_name LIKE '" + table_prefix + "_%';";

        System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
        List<Map<String, Object>> tables = new ArrayList<>();
        try {
            VelocityContext context = new VelocityContext();
            Map<String, Object> table;

            // 查询定制前缀项目的所有表
            JdbcUtil jdbcUtil = new JdbcUtil(jdbc_driver, jdbc_url, jdbc_username, jdbc_password);
            List<Map> result = jdbcUtil.selectByParams(sql, null);
            for (Map map : result) {
                System.out.println(map.get("TABLE_NAME"));
                table = new HashMap<>();
                table.put("table_name", map.get("TABLE_NAME"));
                table.put("model_name", StringUtil.lineToHump(ObjectUtils.toString(map.get("TABLE_NAME"))));
                tables.add(table);
            }
            jdbcUtil.release();

            String targetProject_pojo = basePath + module + "/" + module + "-pojo";

            context.put("generator_jdbc_driver", jdbc_driver);
            context.put("generator_jdbc_url", jdbc_url);
            context.put("generator_jdbc_username", jdbc_username);
            context.put("generator_jdbc_password", jdbc_password);

            context.put("tables", tables);
            context.put("generator_javaModelGenerator_targetPackage", package_name + ".pojo");
            context.put("generator_sqlMapGenerator_targetPackage", package_name + ".dao.mapper");
            context.put("generator_javaClientGenerator_targetPackage", package_name + ".dao.mapper");
            context.put("targetProject", targetProject_pojo);
            context.put("targetProject_sqlMap", targetProject);
            context.put("generator_jdbc_password", jdbc_password);

            context.put("last_insert_id_tables", last_insert_id_tables);
            VelocityUtil.generate(GENERATORCONFIG_VM, generatorConfig_xml, context);
            // 删除旧代码
            deleteDir(new File(targetProject_pojo + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/pojo"));
            deleteDir(new File(targetProject + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/dao/mapper"));
            //deleteDir(new File(targetProject_pojo + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/dao/mapper"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========== 结束生成generatorConfig.xml文件 ==========");


        generateMapperAndModel(generatorConfig_xml);


        generateDao(basePath, module, package_name, tables);

        geterateService(basePath, module, package_name, tables);



        System.out.println("========== 开始生成Controller ==========");
        System.out.println("========== 结束生成Controller ==========");
    }

    private static void geterateService(String basePath, String module, String packageName, List<Map<String, Object>> tables) throws Exception {
        System.out.println("========== 开始生成Service ==========");
        String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
        String servicePath = basePath + module + "/" + module + "-service" + "/src/main/java/" + packageName.replaceAll("\\.", "/") + "/service";
        createPathIfNotExists(servicePath);
        for (int i = 0; i < tables.size(); i++) {
            String model = StringUtil.lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
            String service = servicePath + "/" + model + "Service.java";
            // 生成service
            File serviceFile = new File(service);
            if (!serviceFile.exists()) {
                VelocityContext context = getContext(packageName, model,ctime);
                VelocityUtil.generate(SERVICE_VM, service, context);
                System.out.println(service);
            }
        }
        System.out.println("========== 结束生成Service ==========");
    }

    private static void generateMapperAndModel(String xmlPath)
            throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        System.out.println("========== 开始运行MybatisGenerator ==========");
        List<String> warnings = new ArrayList<>();
        File configFile = new File(xmlPath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("========== 结束运行MybatisGenerator ==========");
    }

    private static void generateDao(String basePath, String module, String packageName, List<Map<String, Object>> tables) throws Exception {
        System.out.println("========== 开始生成Dao ==========");
        String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
        String daoPath = basePath + module + "/" + module + "-dao" + "/src/main/java/" + packageName.replaceAll("\\.", "/") + "/dao/mapper";
        createPathIfNotExists(daoPath);
        for (int i = 0; i < tables.size(); i++) {
            String model = StringUtil.lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
            String dao = daoPath + "/" + model + "Mapper.java";
            // 生成service
            File serviceFile = new File(dao);
            if (!serviceFile.exists()) {
                VelocityContext context = getContext(packageName, model, ctime);
                VelocityUtil.generate(DAO_VM, dao, context);
                System.out.println(dao);
            }
        }
        System.out.println("========== 生成Dao结束 ==========");
    }

    private static void createPathIfNotExists(String daoPath) {
        File file = new File(daoPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private static VelocityContext getContext(String packageName, String model, String ctime) {
        VelocityContext context = new VelocityContext();
        context.put("package_name", packageName);
        context.put("beanClazz", model);
        context.put("ctime", ctime);
        context.put("beanProp", StringUtil.toLowerCaseFirstOne(model));
        return context;
    }


    // 递归删除非空文件夹
    public static void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteDir(files[i]);
            }
        }
        dir.delete();
    }
}
