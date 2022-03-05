package com.mingle.exercise.web;

import com.mingle.exercise.entity.Brand;
import com.mingle.exercise.service.BrandService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@WebServlet(urlPatterns = "/deleteBrand")
@Slf4j
public class DeleteBrandServlet extends HttpServlet {
    private final BrandService brandService=new BrandService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受表单提交的数据，封装为一个Brand对象
        String id= req.getParameter("id");
        brandService.delete(Integer.parseInt(id));

        //重定向到查询所有Servlet
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/index");

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
