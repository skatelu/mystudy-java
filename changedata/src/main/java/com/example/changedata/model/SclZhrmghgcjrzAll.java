package com.example.changedata.model;

import java.util.Date;

public class SclZhrmghgcjrzAll {
    private Integer id;

    private String certificatename;

    private String issuedept;

    private String certificateholdertype;

    private String certificateholder;

    private String certificatetype;

    private String certificateholdercode;

    private String certificatelevel;

    private String tel;

    private String project;

    private String citizenId;

    private Date firstTime;

    private Date stime;

    private Date etime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename == null ? null : certificatename.trim();
    }

    public String getIssuedept() {
        return issuedept;
    }

    public void setIssuedept(String issuedept) {
        this.issuedept = issuedept == null ? null : issuedept.trim();
    }

    public String getCertificateholdertype() {
        return certificateholdertype;
    }

    public void setCertificateholdertype(String certificateholdertype) {
        this.certificateholdertype = certificateholdertype == null ? null : certificateholdertype.trim();
    }

    public String getCertificateholder() {
        return certificateholder;
    }

    public void setCertificateholder(String certificateholder) {
        this.certificateholder = certificateholder == null ? null : certificateholder.trim();
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype == null ? null : certificatetype.trim();
    }

    public String getCertificateholdercode() {
        return certificateholdercode;
    }

    public void setCertificateholdercode(String certificateholdercode) {
        this.certificateholdercode = certificateholdercode == null ? null : certificateholdercode.trim();
    }

    public String getCertificatelevel() {
        return certificatelevel;
    }

    public void setCertificatelevel(String certificatelevel) {
        this.certificatelevel = certificatelevel == null ? null : certificatelevel.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId == null ? null : citizenId.trim();
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}