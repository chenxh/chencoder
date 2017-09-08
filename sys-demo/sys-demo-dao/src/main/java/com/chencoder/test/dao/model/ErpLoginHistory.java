package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class ErpLoginHistory implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 帐户ID
     *
     * @mbg.generated
     */
    private Long loginId;

    /**
     * 帐户类型
     *
     * @mbg.generated
     */
    private Long accountDictId;

    /**
     * 登录IP地址
     *
     * @mbg.generated
     */
    private String loginIp;

    /**
     * 用户登录TOKEN
     *
     * @mbg.generated
     */
    private String loginToken;

    /**
     * 登录门店
     *
     * @mbg.generated
     */
    private String loginStoreid;

    /**
     * 所属站点Id(erp_deliver_station)
     *
     * @mbg.generated
     */
    private Long sationId;

    /**
     * 所属门店Id
     *
     * @mbg.generated
     */
    private Long storeId;

    /**
     * 推广员类型(1:多点配送员,2:物美员工)
     *
     * @mbg.generated
     */
    private Long mktType;

    /**
     * 客户端版本号，用于版本比较，例如：1.0.1
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 操作系统版本号
     *
     * @mbg.generated
     */
    private String sysversion;

    /**
     * 客户端平台信息（ANDROID、IOS）
     *
     * @mbg.generated
     */
    private String platform;

    /**
     * 设备型号，例如：三星I9000
     *
     * @mbg.generated
     */
    private String device;

    /**
     * 商家id
     *
     * @mbg.generated
     */
    private String venderid;

    /**
     * 由服务提供，每次打包固定一个版本，格式为：1.2.0
     *
     * @mbg.generated
     */
    private String apiversion;

    /**
     * 登录时间
     *
     * @mbg.generated
     */
    private Date loginTime;

    /**
     * 登出时间
     *
     * @mbg.generated
     */
    private Date logoutTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public Long getAccountDictId() {
        return accountDictId;
    }

    public void setAccountDictId(Long accountDictId) {
        this.accountDictId = accountDictId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public String getLoginStoreid() {
        return loginStoreid;
    }

    public void setLoginStoreid(String loginStoreid) {
        this.loginStoreid = loginStoreid;
    }

    public Long getSationId() {
        return sationId;
    }

    public void setSationId(Long sationId) {
        this.sationId = sationId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getMktType() {
        return mktType;
    }

    public void setMktType(Long mktType) {
        this.mktType = mktType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSysversion() {
        return sysversion;
    }

    public void setSysversion(String sysversion) {
        this.sysversion = sysversion;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getVenderid() {
        return venderid;
    }

    public void setVenderid(String venderid) {
        this.venderid = venderid;
    }

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginId=").append(loginId);
        sb.append(", accountDictId=").append(accountDictId);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginToken=").append(loginToken);
        sb.append(", loginStoreid=").append(loginStoreid);
        sb.append(", sationId=").append(sationId);
        sb.append(", storeId=").append(storeId);
        sb.append(", mktType=").append(mktType);
        sb.append(", version=").append(version);
        sb.append(", sysversion=").append(sysversion);
        sb.append(", platform=").append(platform);
        sb.append(", device=").append(device);
        sb.append(", venderid=").append(venderid);
        sb.append(", apiversion=").append(apiversion);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", logoutTime=").append(logoutTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ErpLoginHistory other = (ErpLoginHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getAccountDictId() == null ? other.getAccountDictId() == null : this.getAccountDictId().equals(other.getAccountDictId()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getLoginToken() == null ? other.getLoginToken() == null : this.getLoginToken().equals(other.getLoginToken()))
            && (this.getLoginStoreid() == null ? other.getLoginStoreid() == null : this.getLoginStoreid().equals(other.getLoginStoreid()))
            && (this.getSationId() == null ? other.getSationId() == null : this.getSationId().equals(other.getSationId()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getMktType() == null ? other.getMktType() == null : this.getMktType().equals(other.getMktType()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getSysversion() == null ? other.getSysversion() == null : this.getSysversion().equals(other.getSysversion()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getVenderid() == null ? other.getVenderid() == null : this.getVenderid().equals(other.getVenderid()))
            && (this.getApiversion() == null ? other.getApiversion() == null : this.getApiversion().equals(other.getApiversion()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getLogoutTime() == null ? other.getLogoutTime() == null : this.getLogoutTime().equals(other.getLogoutTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getAccountDictId() == null) ? 0 : getAccountDictId().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getLoginToken() == null) ? 0 : getLoginToken().hashCode());
        result = prime * result + ((getLoginStoreid() == null) ? 0 : getLoginStoreid().hashCode());
        result = prime * result + ((getSationId() == null) ? 0 : getSationId().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getMktType() == null) ? 0 : getMktType().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getSysversion() == null) ? 0 : getSysversion().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getVenderid() == null) ? 0 : getVenderid().hashCode());
        result = prime * result + ((getApiversion() == null) ? 0 : getApiversion().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getLogoutTime() == null) ? 0 : getLogoutTime().hashCode());
        return result;
    }
}