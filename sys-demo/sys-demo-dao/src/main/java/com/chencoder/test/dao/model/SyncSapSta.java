package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class SyncSapSta implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 部门编码（1）
     *
     * @mbg.generated
     */
    private String orgCode;

    /**
     * 岗位编码（2）
     *
     * @mbg.generated
     */
    private String staCode;

    /**
     * 岗位名称（4）
     *
     * @mbg.generated
     */
    private String staName;

    private Date insertTime;

    private Integer yn;

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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
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

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
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
        sb.append(", orgCode=").append(orgCode);
        sb.append(", staCode=").append(staCode);
        sb.append(", staName=").append(staName);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", yn=").append(yn);
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
        SyncSapSta other = (SyncSapSta) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getStaCode() == null ? other.getStaCode() == null : this.getStaCode().equals(other.getStaCode()))
            && (this.getStaName() == null ? other.getStaName() == null : this.getStaName().equals(other.getStaName()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getYn() == null ? other.getYn() == null : this.getYn().equals(other.getYn()))
            && (this.getExtJson() == null ? other.getExtJson() == null : this.getExtJson().equals(other.getExtJson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getStaCode() == null) ? 0 : getStaCode().hashCode());
        result = prime * result + ((getStaName() == null) ? 0 : getStaName().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getYn() == null) ? 0 : getYn().hashCode());
        result = prime * result + ((getExtJson() == null) ? 0 : getExtJson().hashCode());
        return result;
    }
}