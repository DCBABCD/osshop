package com.osshop.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RandolfJay on 16/5/20.
 */
@WebServlet(name = "publicServlet")
public class publicServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * servlet页面跳转成功方法
     * 用于页面的转发
     * @param request
     * @param response
     * @param message 跳转显示信息
     * @param url     跳转的url
     * @throws ServletException
     * @throws IOException
     */
    public void success(HttpServletRequest request, HttpServletResponse response,String message,String url)  throws ServletException, IOException {
        request.setAttribute("url",url);
        request.setAttribute("message",message);
        request.getRequestDispatcher("success.jsp").forward(request,response);
    }

    /**
     *
     * @param request
     * @param response
     * @param message   跳转显示信息
     * @param url       跳转的url
     * @throws ServletException
     * @throws IOException
     */
    public void error(HttpServletRequest request, HttpServletResponse response,String message,String url)  throws ServletException, IOException {
        request.setAttribute("url",url);
        request.setAttribute("message",message);
        request.getRequestDispatcher("error.jsp").forward(request,response);
    }
}
