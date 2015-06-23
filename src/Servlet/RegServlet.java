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
     * ע��
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //��Ӧ�ͻ��˵�����
        response.setCharacterEncoding("utf-8");

        //����ҳ�洫�ݹ�����ֵ     request ��װ�ͻ��˵�����
        String  name=request.getParameter("username");
        String  pass=request.getParameter("password");

        //��ҳ���Ͻ��յ���ֵ   ��װ��һ������
        UserDTO  udto=new UserDTO(0, name, pass, 0);
        //��ν��ע�� ���ǰ������װ�Ķ���浽���ݿ����
        UserDAO udao=new  UserDAO();
        boolean  b= false;
        try {
            b = udao.register(udto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(b){
            //��װ��ʾ��Ϣ
            request.setAttribute("msg", "ע��ɹ�");
            //ҳ����ת
            request.getRequestDispatcher("reg.jsp").forward(request, response);

        }else{
            //��װ��ʾ��Ϣ
            request.setAttribute("msg", "ʧ��");
            //ҳ����ת
            request.getRequestDispatcher("reg.jsp").forward(request, response);

        }


    }

}






