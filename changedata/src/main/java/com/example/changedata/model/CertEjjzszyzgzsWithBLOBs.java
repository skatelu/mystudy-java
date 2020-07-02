package com.example.changedata.model;

public class CertEjjzszyzgzsWithBLOBs extends CertEjjzszyzgzs {
    private String faceimg;

    private String extendinfo;

    public String getFaceimg() {
        return faceimg;
    }

    public void setFaceimg(String faceimg) {
        this.faceimg = faceimg == null ? null : faceimg.trim();
    }

    public String getExtendinfo() {
        return extendinfo;
    }

    public void setExtendinfo(String extendinfo) {
        this.extendinfo = extendinfo == null ? null : extendinfo.trim();
    }
}