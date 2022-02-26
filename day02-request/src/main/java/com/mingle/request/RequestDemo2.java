package com.mingle.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * @author mingle
 * @date 2022/2/26 18:52
 * @description Request对象获取请求头
 */
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求头数据
        //1.获取所有请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        //2.遍历
        //hasMoreElements:拥有更多的元素
        while (headerNames.hasMoreElements()) {
            //name:头名称的下一个元素
            String name = headerNames.nextElement();
            //根据名称获取请求头的值
            String value = request.getHeader(name);
            //输出元素和对应的值
            System.out.println(name + "---" + value);
        }
    }
        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }

}
