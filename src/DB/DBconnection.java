package DB;

import java.sql.*;

/**
 * Created by Pxjw on 2015/6/14.
 */
public class DBconnection {
    private static String DriveString="com.mysql.jdbc.Driver";
    private static String UrlString="jdbc:mysql://localhost:3306/newspublish";
    private static String UserName="root";
    private static String PassWord="joy19940521";

    static Connection connection=null;

    public static Connection getConnection(){
        try {
            Class.forName(DriveString);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection= DriverManager.getConnection(UrlString,UserName,PassWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
    public static void close(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet) throws SQLException {

        if (connection!=null){
            connection.close();
        }
        if (preparedStatement!=null){
            preparedStatement.close();
        }
        if (resultSet!=null){
            resultSet.close();
        }
    }
    //Test
    public static void main(String []args)
    {
        DBconnection dBconnection=new DBconnection();
        System.out.println(dBconnection.getConnection());
    }
}

