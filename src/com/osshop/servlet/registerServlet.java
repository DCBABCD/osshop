package com.osshop.servlet;

import com.osshop.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 用户注册类
 * Created by RandolfJay on 16/5/20.
 */
@WebServlet(name = "registerServlet")
public class registerServlet extends publicServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("name");
        String password = request.getParameter("password");
        String tel      = request.getParameter("tel");
        if(username.length()<1){
            this.error(request,response,"您的用户名过短!","/register.jsp");
        }
        if(password.length()<6){
            this.error(request,response,"您的密码长度过短!","/register.jsp");
        }
        if(tel.length()<6){
            this.error(request,response,"您的手机号码输入有误!","/register.jsp");
        }

        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setTel(tel);

        try {
            boolean rs = user.add();
            if (rs){
                this.success(request,response,"注册成功!","lo");
            }else{

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //非post访问将转发到注册的视图中
        request.getRequestDispatcher("register.jsp").forward(request,response);
    }   
}
