package Servlet;

import DAO.UserDAO;
import DTO.UserDTO;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Pxjw on 2015/6/21.
 */
@javax.servlet.annotation.WebServlet(name = "RegServlet")
public class RegServlet extends HttpServlet {
    /**
     * 注册
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //响应客户端的请求
        response.setCharacterEncoding("utf-8");

        //接收页面传递过来的值     request 封装客户端的请求
        String  name=request.getParameter("username");
        String  pass=request.getParameter("password");

        //把页面上接收到的值   封装成一个对象
        UserDTO  udto=new UserDTO(0, name, pass, 0);
        //所谓的注册 就是把这个封装的对象存到数据库表中
        UserDAO udao=new  UserDAO();
        boolean  b= false;
        try {
            b = udao.register(udto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(b){
            //封装提示信息
            request.setAttribute("msg", "注册成功");
            //页面跳转
            request.getRequestDispatcher("reg.jsp").forward(request, response);

        }else{
            //封装提示信息
            request.setAttribute("msg", "失败");
            //页面跳转
            request.getRequestDispatcher("reg.jsp").forward(request, response);

        }


    }

}






