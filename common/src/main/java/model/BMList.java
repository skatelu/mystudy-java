package model;

import java.util.List;

public class BMList {

    public Integer id; //机构id
    public String orgName; // 机构名称
    public List<ShareOrgInterface> shareOrgInterfaceList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<ShareOrgInterface> getShareOrgInterfaceList() {
        return shareOrgInterfaceList;
    }

    public void setShareOrgInterfaceList(List<ShareOrgInterface> shareOrgInterfaceList) {
        this.shareOrgInterfaceList = shareOrgInterfaceList;
    }
}
