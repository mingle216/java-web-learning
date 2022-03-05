package com.mingle.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author mingle
 * @date 2022/3/1 11:35
 * @description 获取Session对象、获取数据
 */
@WebServlet("/demo2")
@Slf4j
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取session对象
        HttpSession session = req.getSession();
        log.info(String.valueOf(session));
        //2.获取数据
        String  username = (String) session.getAttribute("username");
        //3.销毁session
        //session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
