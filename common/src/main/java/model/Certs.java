package model;

/**
 * 证照目录分类表
 */
public class Certs {
    public int id;
    public String certName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }
}
