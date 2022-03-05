package com.mingle.exercise.web;

import com.mingle.exercise.util.VerifyCodeUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
/**
 * @author mingle
 * @date 2022/3/1 19:08
 * @description 验证码生成逻辑
 */
@WebServlet(urlPatterns = "/verifyCode")
public class VerifyCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 生成验证码
        ServletOutputStream os = response.getOutputStream();
        String verifyCode = VerifyCodeUtil.outputVerifyImage(100, 50, os, 4);
        // 2. 存入Session
        HttpSession session = request.getSession();
        session.setAttribute("verifyCode", verifyCode);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}