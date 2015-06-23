package DAO;

import DB.DBconnection;
import DTO.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Created by Pxjw on 2015/6/21.
 */
public class UserDAO {
    /**
     * 登陆  注册
     */

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //注册    就是把指定的UserDTO对象  添加进数据库中的表
    public boolean register(UserDTO user) throws SQLException {
        try {
            //获得和数据库的连接
            conn = DBconnection.getConnection();
            //准备SQL
            String sql = "INSERT  INTO  tb_user(uname,upass,uflag)VALUES(?,?,?)";
            //获得执行的命令
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUname());
            ps.setString(2, user.getUpass());
            ps.setInt(3, user.getUflag());
            //执行
            //flag=!ps.execute();
            int i = ps.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DBconnection.close(conn, ps, null);
        }
        return false;
    }


    //登陆
    public UserDTO login(String username) throws SQLException {
        UserDTO user = null;
        try {
            conn = DBconnection.getConnection();
            String sql = "SELECT  *  FROM  tb_user  WHERE  uname=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                int uid = rs.getInt("uid");
                String uname = rs.getString("uname");
                String upass = rs.getString("upass");
                int uflag = rs.getInt("uflag");
                user = new UserDTO(uid, uname, upass, uflag);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DBconnection.close(conn, ps, rs);
        }
        return user;

    }
}

