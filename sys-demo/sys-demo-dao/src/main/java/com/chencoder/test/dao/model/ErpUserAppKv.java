package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class ErpUserAppKv implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 自定义key
     *
     * @mbg.generated
     */
    private String userKey;

    /**
     * 自定义value
     *
     * @mbg.generated
     */
    private String userValue;

    /**
     * App类型（login_account_type）
     *
     * @mbg.generated
     */
    private Long accountDictId;

    /**
     * 扩展类型（user_app_ext_type）
     *
     * @mbg.generated
     */
    private Long extDictId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date created;

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

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserValue() {
        return userValue;
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }

    public Long getAccountDictId() {
        return accountDictId;
    }

    public void setAccountDictId(Long accountDictId) {
        this.accountDictId = accountDictId;
    }

    public Long getExtDictId() {
        return extDictId;
    }

    public void setExtDictId(Long extDictId) {
        this.extDictId = extDictId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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
        sb.append(", userKey=").append(userKey);
        sb.append(", userValue=").append(userValue);
        sb.append(", accountDictId=").append(accountDictId);
        sb.append(", extDictId=").append(extDictId);
        sb.append(", created=").append(created);
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
        ErpUserAppKv other = (ErpUserAppKv) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserKey() == null ? other.getUserKey() == null : this.getUserKey().equals(other.getUserKey()))
            && (this.getUserValue() == null ? other.getUserValue() == null : this.getUserValue().equals(other.getUserValue()))
            && (this.getAccountDictId() == null ? other.getAccountDictId() == null : this.getAccountDictId().equals(other.getAccountDictId()))
            && (this.getExtDictId() == null ? other.getExtDictId() == null : this.getExtDictId().equals(other.getExtDictId()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getLastUpdTime() == null ? other.getLastUpdTime() == null : this.getLastUpdTime().equals(other.getLastUpdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserKey() == null) ? 0 : getUserKey().hashCode());
        result = prime * result + ((getUserValue() == null) ? 0 : getUserValue().hashCode());
        result = prime * result + ((getAccountDictId() == null) ? 0 : getAccountDictId().hashCode());
        result = prime * result + ((getExtDictId() == null) ? 0 : getExtDictId().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getLastUpdTime() == null) ? 0 : getLastUpdTime().hashCode());
        return result;
    }
}