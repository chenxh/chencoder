package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;

public class ErpUserAppK implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 自定义key
     *
     * @mbg.generated
     */
    private String userKey;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userKey=").append(userKey);
        sb.append(", accountDictId=").append(accountDictId);
        sb.append(", extDictId=").append(extDictId);
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
        ErpUserAppK other = (ErpUserAppK) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserKey() == null ? other.getUserKey() == null : this.getUserKey().equals(other.getUserKey()))
            && (this.getAccountDictId() == null ? other.getAccountDictId() == null : this.getAccountDictId().equals(other.getAccountDictId()))
            && (this.getExtDictId() == null ? other.getExtDictId() == null : this.getExtDictId().equals(other.getExtDictId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserKey() == null) ? 0 : getUserKey().hashCode());
        result = prime * result + ((getAccountDictId() == null) ? 0 : getAccountDictId().hashCode());
        result = prime * result + ((getExtDictId() == null) ? 0 : getExtDictId().hashCode());
        return result;
    }
}