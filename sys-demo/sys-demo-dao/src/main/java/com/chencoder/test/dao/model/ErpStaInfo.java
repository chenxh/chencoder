package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class ErpStaInfo implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 部门编码
     *
     * @mbg.generated
     */
    private String depCode;

    /**
     * 岗位编码
     *
     * @mbg.generated
     */
    private String staCode;

    /**
     * 岗位名称
     *
     * @mbg.generated
     */
    private String staName;

    /**
     * 状态（1：有效，无效）
     *
     * @mbg.generated
     */
    private Integer status;

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

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getStaCode() {
        return staCode;
    }

    public void setStaCode(String staCode) {
        this.staCode = staCode;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
        sb.append(", depCode=").append(depCode);
        sb.append(", staCode=").append(staCode);
        sb.append(", staName=").append(staName);
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
        ErpStaInfo other = (ErpStaInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDepCode() == null ? other.getDepCode() == null : this.getDepCode().equals(other.getDepCode()))
            && (this.getStaCode() == null ? other.getStaCode() == null : this.getStaCode().equals(other.getStaCode()))
            && (this.getStaName() == null ? other.getStaName() == null : this.getStaName().equals(other.getStaName()))
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
        result = prime * result + ((getDepCode() == null) ? 0 : getDepCode().hashCode());
        result = prime * result + ((getStaCode() == null) ? 0 : getStaCode().hashCode());
        result = prime * result + ((getStaName() == null) ? 0 : getStaName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getLastUpdUser() == null) ? 0 : getLastUpdUser().hashCode());
        result = prime * result + ((getLastUpdTime() == null) ? 0 : getLastUpdTime().hashCode());
        return result;
    }
}