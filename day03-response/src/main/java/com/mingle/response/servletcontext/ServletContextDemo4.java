package com.mingle.response.servletcontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
/**
 * @author mingle
 * @date 2022/2/26 22:14
 * @description ServletContext功能 ：域对象：共享数据
 */
@WebServlet("/servletContextDemo4")
public class ServletContextDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 通过HttpServlet获取
        ServletContext context = this.getServletContext();
        //获取数据
        Object msg = context.getAttribute("msg");
        System.out.println(msg);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}