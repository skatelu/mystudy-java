package model;

import java.util.Date;


public class DicShareInterface {
    public Long id; // ID，自增
    public Integer isDeleted; //是否删除：0 未删除 1 删除
    public Date gmtCreate; //记录创建时间
    public Date gmtModified; //记录修改时间
    public String inteNote; //接口注释
    public String inteRequestPath; //接口请求路径
    public Integer inteConsumer; //接口消费者：0 第三方系统或政府部门，1 国办，2 省共享交换平台
    public Integer inteType; // 接口类型：0 查询，1 下载，2 验证

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

    public String getInteNote() {
        return inteNote;
    }

    public void setInteNote(String inteNote) {
        this.inteNote = inteNote;
    }

    public String getInteRequestPath() {
        return inteRequestPath;
    }

    public void setInteRequestPath(String inteRequestPath) {
        this.inteRequestPath = inteRequestPath;
    }

    public Integer getInteConsumer() {
        return inteConsumer;
    }

    public void setInteConsumer(Integer inteConsumer) {
        this.inteConsumer = inteConsumer;
    }

    public Integer getInteType() {
        return inteType;
    }

    public void setInteType(Integer inteType) {
        this.inteType = inteType;
    }
}
