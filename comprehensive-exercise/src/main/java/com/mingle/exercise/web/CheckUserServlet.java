package com.mingle.exercise.web;

import com.mingle.exercise.entity.User;
import com.mingle.exercise.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import javax.lang.model.element.VariableElement;
import java.io.IOException;

/**
 * @author mingle
 * @date 2022/3/2 10:32
 * @description 验证用户名是否可用
 */
@WebServlet(urlPatterns = "/check")
@Slf4j
public class CheckUserServlet extends HttpServlet {
    private  final UserService  userService=new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        User user = User.builder().username(username).build();
        boolean flag=userService.register(user);
        resp.getWriter().write(String.valueOf(flag));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
