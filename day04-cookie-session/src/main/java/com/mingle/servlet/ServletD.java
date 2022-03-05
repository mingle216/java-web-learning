package com.mingle.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author mingle
 * @date 2022/2/28 11:01
 * @description  ServletD——URL解码
 */
@Slf4j
@WebServlet(urlPatterns = "/servletD")
public class ServletD extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = (String) req.getAttribute("name");
        value= URLDecoder.decode(value,StandardCharsets.UTF_8);
        log.info(value);
        resp.setContentType("text/plain;charset=utf-8");
        resp.getWriter().write(value);
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
