package com.mingle.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author mingle
 * @date 2022/2/28 11:01
 * @description ServletC——URL编码
 */
@Slf4j
@WebServlet(urlPatterns = "/servletC")
public class ServletC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = "你好";
        value = URLEncoder.encode(value, StandardCharsets.UTF_8);
        log.info(value);
        request.setAttribute("name", value);
        request.getRequestDispatcher("/servletD").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
