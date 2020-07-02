package model;

import java.util.Date;

/**
 * 共享机构_证照调用配置表
 */
public class ShareOrgCert {

    public Long id; // ID，自增
    public Integer isDeleted; //是否删除：0 未删除 1 删除
    public Date gmtCreate; //记录创建时间
    public Date gmtModified; //记录修改时间
    public Integer shareOrgId;// 共享机构ID
    public Integer certId; // 共享接口ID
    public String allowInteIds; //允许调用的共享接口id集合
    public Integer everydayToplimit; //每日上限次数
    public Integer usedTimes; //今日已调用次数
    public Date yxqqsrq; // 有效期起始日期
    public Date yxqjzrq; // 有效期截止日期
    public String fields; // 自定义选查字段，JSON数组

    public String certName;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getShareOrgId() {
        return shareOrgId;
    }

    public void setShareOrgId(Integer shareOrgId) {
        this.shareOrgId = shareOrgId;
    }

    public Integer getCertId() {
        return certId;
    }

    public void setCertId(Integer certId) {
        this.certId = certId;
    }

    public String getAllowInteIds() {
        return allowInteIds;
    }

    public void setAllowInteIds(String allowInteIds) {
        this.allowInteIds = allowInteIds;
    }

    public Integer getEverydayToplimit() {
        return everydayToplimit;
    }

    public void setEverydayToplimit(Integer everydayToplimit) {
        this.everydayToplimit = everydayToplimit;
    }

    public Integer getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
    }

    public Date getYxqqsrq() {
        return yxqqsrq;
    }

    public void setYxqqsrq(Date yxqqsrq) {
        this.yxqqsrq = yxqqsrq;
    }

    public Date getYxqjzrq() {
        return yxqjzrq;
    }

    public void setYxqjzrq(Date yxqjzrq) {
        this.yxqjzrq = yxqjzrq;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }
}
