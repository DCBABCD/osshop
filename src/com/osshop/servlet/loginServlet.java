package com.osshop.servlet;

import com.osshop.bean.User;
import com.osshop.util.MyMD5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by RandolfJay on 16/5/19.
 */
@WebServlet(name = "Servlet")
public class loginServlet extends publicServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new User();
        boolean flag = false;
        try {//对用户输入的账户密码进行验证
            flag = user.login(name,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //判断登陆结果
        if (flag){
            HttpSession session = request.getSession();
            session.setAttribute("uid",user.getUserID());
            session.setAttribute("name",user.getName());
            session.setAttribute("tel",user.getTel());
            this.success(request,response,"登陆成功!","user_list.jsp");
        }else{
            this.error(request,response,"登陆失败!","login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request,response);
    }
}
