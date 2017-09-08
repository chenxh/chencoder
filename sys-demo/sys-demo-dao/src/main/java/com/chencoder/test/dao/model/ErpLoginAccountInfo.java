package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class ErpLoginAccountInfo implements Record {
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
     * 登录状态(1:在线，2：离线)
     *
     * @mbg.generated
     */
    private Long status;

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

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date created;

    /**
     * 更新人员ID
     *
     * @mbg.generated
     */
    private Long lastUpdUser;

    /**
     * 最后修改时间
     *
     * @mbg.generated
     */
    private Date lastUpdTime;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(Long lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
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
        sb.append(", status=").append(status);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", logoutTime=").append(logoutTime);
        sb.append(", created=").append(created);
        sb.append(", lastUpdUser=").append(lastUpdUser);
        sb.append(", lastUpdTime=").append(lastUpdTime);
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
        ErpLoginAccountInfo other = (ErpLoginAccountInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getAccountDictId() == null ? other.getAccountDictId() == null : this.getAccountDictId().equals(other.getAccountDictId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getLogoutTime() == null ? other.getLogoutTime() == null : this.getLogoutTime().equals(other.getLogoutTime()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getLastUpdUser() == null ? other.getLastUpdUser() == null : this.getLastUpdUser().equals(other.getLastUpdUser()))
            && (this.getLastUpdTime() == null ? other.getLastUpdTime() == null : this.getLastUpdTime().equals(other.getLastUpdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getAccountDictId() == null) ? 0 : getAccountDictId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getLogoutTime() == null) ? 0 : getLogoutTime().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getLastUpdUser() == null) ? 0 : getLastUpdUser().hashCode());
        result = prime * result + ((getLastUpdTime() == null) ? 0 : getLastUpdTime().hashCode());
        return result;
    }
}