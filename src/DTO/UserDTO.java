package DTO;

/**
 * Created by Pxjw on 2015/6/10.
 * 用户信息表
 * 分别为：
 * Email，密码，真实姓名，昵称
 */
public class UserDTO {
    private int uid;
    private String email;
    private String password;
    private String realname;
    private String uname;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
