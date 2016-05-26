package com.osadmin.servlet.user;

import com.osadmin.bean.user;
import com.osadmin.servlet.common;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by RandolfJay on 16/5/25.
 */
@WebServlet(name = "list")
public class list extends common {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<user> list = null;
        try {
            list = new user().getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("allUser", list);
        request.getRequestDispatcher("/admin/user/user_list.jsp").forward(request,response);
    }
}
