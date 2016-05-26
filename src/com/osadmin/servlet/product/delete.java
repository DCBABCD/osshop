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

/**
 * Created by RandolfJay on 16/5/25.
 */
@WebServlet(name = "delete")
public class delete extends common {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productID = (String) request.getParameter("id");
        product pu = new product();
        int flag = 0;
        try {
            flag = pu.delete(productID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(flag>0){
            this.success(request,response,"删除成功!","/admin/product/list.do");
        }else{
            this.error(request,response,"删除失败!","/admin/product/edit.do?id="+productID);
        }
    }
}
