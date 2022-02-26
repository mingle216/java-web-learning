package com.mingle.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author mingle
 * @date 2022/2/26 17:30
 * @description     Servlet路径配置 , urlPatterns
 */
@WebServlet("*.do")
public class ServletDemo4 extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("domo4......");
        System.out.println(request);
    }
}
