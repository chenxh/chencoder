package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Record;
import java.util.Date;

public class SyncSapPer implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 员工编号（1）
     *
     * @mbg.generated
     */
    private String badgeNo;

    /**
     * 员工姓名（24）
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 性别(4),1：男，2：女
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * 身份证号（16）
     *
     * @mbg.generated
     */
    private String idCard;

    /**
     * 移动电话（10）
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 岗位(11)
     *
     * @mbg.generated
     */
    private String staCode;

    /**
     * 机构编码(18)
     *
     * @mbg.generated
     */
    private String orgCode;

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

    public String getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(String badgeNo) {
        this.badgeNo = badgeNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStaCode() {
        return staCode;
    }

    public void setStaCode(String staCode) {
        this.staCode = staCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
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
        sb.append(", badgeNo=").append(badgeNo);
        sb.append(", userName=").append(userName);
        sb.append(", gender=").append(gender);
        sb.append(", idCard=").append(idCard);
        sb.append(", mobile=").append(mobile);
        sb.append(", staCode=").append(staCode);
        sb.append(", orgCode=").append(orgCode);
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
        SyncSapPer other = (SyncSapPer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBadgeNo() == null ? other.getBadgeNo() == null : this.getBadgeNo().equals(other.getBadgeNo()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getStaCode() == null ? other.getStaCode() == null : this.getStaCode().equals(other.getStaCode()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getExtJson() == null ? other.getExtJson() == null : this.getExtJson().equals(other.getExtJson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBadgeNo() == null) ? 0 : getBadgeNo().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getStaCode() == null) ? 0 : getStaCode().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getExtJson() == null) ? 0 : getExtJson().hashCode());
        return result;
    }
}