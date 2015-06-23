package DTO;

/**
 * Created by Pxjw on 2015/6/10.
 * 用户信息表
 */
public class UserDTO {

    private  int  uid;
    private  String  uname;
    private  String  upass;
    private  int  uflag;
    public UserDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public UserDTO(int uid, String uname, String upass, int uflag) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.uflag = uflag;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpass() {
        return upass;
    }
    public void setUpass(String upass) {
        this.upass = upass;
    }
    public int getUflag() {
        return uflag;
    }
    public void setUflag(int uflag) {
        this.uflag = uflag;
    }





}
