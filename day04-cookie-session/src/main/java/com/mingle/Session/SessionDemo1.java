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
 * @date 2022/3/1 11:32
 * @description 获取Session对象、存储数据
 */
@WebServlet("/demo1")
@Slf4j
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info="zhangsan";
        //1.获取Session对象
        HttpSession session = req.getSession();
        //打印session
        log.info(String.valueOf(session));
        //2.存储数据
        session.setAttribute("username",info);
        resp.getWriter().write(info);
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
