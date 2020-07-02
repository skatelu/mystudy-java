package testhttp.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserSjdw {
    public Integer id;
    public String userName;
    public String idcardNumber;
    public String policeNum;
    public String subBureau;
    public String phone;
    // 申请时长
    public Integer applyTmie;
    public Long createtime;
    public Long updatetime;
    public Long passtime;
    public Integer status;
    public Integer applyStatus;
    public String caseNum;
    public String applyReason;
}
