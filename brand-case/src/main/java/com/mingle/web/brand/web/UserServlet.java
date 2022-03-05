package com.mingle.web.brand.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {

    public void selectAll(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
        System.out.println("user selectAll..........");
    }
    public void add(HttpServletRequest request,HttpServletResponse response ) throws ServletException,IOException {
        System.out.println("user add.........");
    }
}
