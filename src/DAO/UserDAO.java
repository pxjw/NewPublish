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
     * ��½  ע��
     */

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //ע��    ���ǰ�ָ����UserDTO����  ��ӽ����ݿ��еı�
    public boolean register(UserDTO user) throws SQLException {
        try {
            //��ú����ݿ������
            conn = DBconnection.getConnection();
            //׼��SQL
            String sql = "INSERT  INTO  tb_user(uname,upass,uflag)VALUES(?,?,?)";
            //���ִ�е�����
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUname());
            ps.setString(2, user.getUpass());
            ps.setInt(3, user.getUflag());
            //ִ��
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


    //��½
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

