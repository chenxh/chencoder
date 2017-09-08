package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class SyncSapDep implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 上级部门编码（1）
     *
     * @mbg.generated
     */
    private String parentDepCode;

    /**
     * 部门编码（2）
     *
     * @mbg.generated
     */
    private String depCode;

    /**
     * 部门名称（4）
     *
     * @mbg.generated
     */
    private String depName;

    /**
     * 同步时间
     *
     * @mbg.generated
     */
    private Date insertTime;

    /**
     * 每行记录对应整个数据
     *
     * @mbg.generated
     */
    private String extJson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentDepCode() {
        return parentDepCode;
    }

    public void setParentDepCode(String parentDepCode) {
        this.parentDepCode = parentDepCode;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentDepCode=").append(parentDepCode);
        sb.append(", depCode=").append(depCode);
        sb.append(", depName=").append(depName);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", extJson=").append(extJson);
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
        SyncSapDep other = (SyncSapDep) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentDepCode() == null ? other.getParentDepCode() == null : this.getParentDepCode().equals(other.getParentDepCode()))
            && (this.getDepCode() == null ? other.getDepCode() == null : this.getDepCode().equals(other.getDepCode()))
            && (this.getDepName() == null ? other.getDepName() == null : this.getDepName().equals(other.getDepName()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getExtJson() == null ? other.getExtJson() == null : this.getExtJson().equals(other.getExtJson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentDepCode() == null) ? 0 : getParentDepCode().hashCode());
        result = prime * result + ((getDepCode() == null) ? 0 : getDepCode().hashCode());
        result = prime * result + ((getDepName() == null) ? 0 : getDepName().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getExtJson() == null) ? 0 : getExtJson().hashCode());
        return result;
    }
}