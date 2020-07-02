package model;

import java.util.Date;

/**
 * 共享机构_共享接口配置表
 */
public class ShareOrgInterface {
    public Long id; // ID，自增
    public Integer isDeleted; //是否删除：0 未删除 1 删除
    public Date gmtCreate; //记录创建时间
    public Date gmtModified; //记录修改时间
    public Integer shareOrgId;// 共享机构ID
    public Integer shareInteId; // 共享接口ID
    public String inteNote;
    public Integer status; // 状态：0 开启，1 关闭

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

    public Integer getShareInteId() {
        return shareInteId;
    }

    public void setShareInteId(Integer shareInteId) {
        this.shareInteId = shareInteId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInteNote() {
        return inteNote;
    }

    public void setInteNote(String inteNote) {
        this.inteNote = inteNote;
    }
}
