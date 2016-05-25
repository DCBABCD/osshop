package com.osadmin.servlet.product;

import com.osadmin.bean.product;
import com.osadmin.servlet.common;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RandolfJay on 16/5/25.
 */
@WebServlet(name = "list")
public class list extends common {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<product> list = null;
        try {
            list = new product().getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("allProduct", list);
        request.getRequestDispatcher("/admin/product/product_list.jsp").forward(request,response);
    }
}
