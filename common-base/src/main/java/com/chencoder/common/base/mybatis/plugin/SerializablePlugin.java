package com.chencoder.common.base.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;
import java.util.Properties;

/**
 * Example类和model类实现序列化插件
 */
public class SerializablePlugin extends PluginAdapter {
    private FullyQualifiedJavaType serializable = new FullyQualifiedJavaType("java.io.Serializable");
    private FullyQualifiedJavaType exampleType = new FullyQualifiedJavaType("com.chencoder.common.base.base.Example");
    private FullyQualifiedJavaType recordType = new FullyQualifiedJavaType("com.chencoder.common.base.base.Record");
    private boolean suppressJavaInterface = false;

    public SerializablePlugin() {
    }

    public boolean validate(List<String> warnings) {
        return true;
    }

    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.makeRecord(topLevelClass, introspectedTable);
        return true;
    }


    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.makeRecord(topLevelClass, introspectedTable);
        return true;
    }

    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.makeRecord(topLevelClass, introspectedTable);
        return true;
    }


    protected void makeRecord(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if(!this.suppressJavaInterface) {
            topLevelClass.addImportedType(this.recordType);
            topLevelClass.addSuperInterface(this.recordType);
        }
    }

    /**
     * 添加给Example类序列化的方法
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable){
        makeExample(topLevelClass, introspectedTable);

        for (InnerClass innerClass : topLevelClass.getInnerClasses()) {
            if ("GeneratedCriteria".equals(innerClass.getType().getShortName())) {
                innerClass.addSuperInterface(serializable);
            }
            if ("Criteria".equals(innerClass.getType().getShortName())) {
                innerClass.addSuperInterface(serializable);
            }
            if ("Criterion".equals(innerClass.getType().getShortName())) {
                innerClass.addSuperInterface(serializable);
            }
        }

        return true;
    }

    private void makeExample(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if(!this.suppressJavaInterface) {
            topLevelClass.addImportedType(this.exampleType);
            topLevelClass.addSuperInterface(this.exampleType);
        }
    }

}
