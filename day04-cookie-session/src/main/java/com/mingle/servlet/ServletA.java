package com.mingle.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author mingle
 * @date 2022/2/28 11:01
 * @description 存Cookie
 */
@WebServlet(urlPatterns = "/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //发送Cookie
        //1.创建Cookie对象
        Cookie cookie = new Cookie("username", "张三");
        //setMaxAge:设置维持时间
        cookie.setMaxAge(60*60*24*7);
        //2.通过response发送Cookie
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
