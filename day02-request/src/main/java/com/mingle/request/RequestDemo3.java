package com.mingle.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author mingle
 * @date 2022/2/26 19:00
 * @description Request对象获取请求头数据：user-agent
 */
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据:user-agent
        String agent = request.getHeader("user-agent");
        //判断--- 请求头数据 ---的浏览器版本
        //contains：包含
        if (agent.contains("Chrome")) {
            //谷歌
            System.out.println("谷歌浏览器...");
        } else if (agent.contains("Firefox")) {
            //火狐
            System.out.println("火狐浏览器...");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
