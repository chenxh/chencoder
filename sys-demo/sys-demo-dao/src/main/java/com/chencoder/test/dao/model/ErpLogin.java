package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class ErpLogin implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 帐号
     *
     * @mbg.generated
     */
    private String loginNo;

    /**
     * 密码（加密）
     *
     * @mbg.generated
     */
    private String loginPwd;

    /**
     * 手机号码帐户
     *
     * @mbg.generated
     */
    private String phoneNo;

    /**
     * 电子邮箱帐户
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 员工编号
     *
     * @mbg.generated
     */
    private String badgeNo;

    /**
     * 帐号类型(1一帐户多用,2ERP帐户,3配送帐户,4捡货员帐户,5推广帐户,)
     *
     * @mbg.generated
     */
    private Long accountType;

    /**
     * 密码过期时间,默认3个月自动过期
     *
     * @mbg.generated
     */
    private Date pwdExpiredTime;

    /**
     * 状态(-1无效,1有效,2锁定)
     *
     * @mbg.generated
     */
    private Long status;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(String badgeNo) {
        this.badgeNo = badgeNo;
    }

    public Long getAccountType() {
        return accountType;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

    public Date getPwdExpiredTime() {
        return pwdExpiredTime;
    }

    public void setPwdExpiredTime(Date pwdExpiredTime) {
        this.pwdExpiredTime = pwdExpiredTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
        sb.append(", userId=").append(userId);
        sb.append(", loginNo=").append(loginNo);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", email=").append(email);
        sb.append(", badgeNo=").append(badgeNo);
        sb.append(", accountType=").append(accountType);
        sb.append(", pwdExpiredTime=").append(pwdExpiredTime);
        sb.append(", status=").append(status);
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
        ErpLogin other = (ErpLogin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLoginNo() == null ? other.getLoginNo() == null : this.getLoginNo().equals(other.getLoginNo()))
            && (this.getLoginPwd() == null ? other.getLoginPwd() == null : this.getLoginPwd().equals(other.getLoginPwd()))
            && (this.getPhoneNo() == null ? other.getPhoneNo() == null : this.getPhoneNo().equals(other.getPhoneNo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBadgeNo() == null ? other.getBadgeNo() == null : this.getBadgeNo().equals(other.getBadgeNo()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getPwdExpiredTime() == null ? other.getPwdExpiredTime() == null : this.getPwdExpiredTime().equals(other.getPwdExpiredTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getLastUpdUser() == null ? other.getLastUpdUser() == null : this.getLastUpdUser().equals(other.getLastUpdUser()))
            && (this.getLastUpdTime() == null ? other.getLastUpdTime() == null : this.getLastUpdTime().equals(other.getLastUpdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLoginNo() == null) ? 0 : getLoginNo().hashCode());
        result = prime * result + ((getLoginPwd() == null) ? 0 : getLoginPwd().hashCode());
        result = prime * result + ((getPhoneNo() == null) ? 0 : getPhoneNo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBadgeNo() == null) ? 0 : getBadgeNo().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getPwdExpiredTime() == null) ? 0 : getPwdExpiredTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getLastUpdUser() == null) ? 0 : getLastUpdUser().hashCode());
        result = prime * result + ((getLastUpdTime() == null) ? 0 : getLastUpdTime().hashCode());
        return result;
    }
}