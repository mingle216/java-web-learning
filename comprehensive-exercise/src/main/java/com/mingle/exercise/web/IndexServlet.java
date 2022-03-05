package com.mingle.exercise.web;

import com.mingle.exercise.entity.Brand;
import com.mingle.exercise.service.BrandService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author mingle
 * @date 2022/3/1 18:17
 * @description 首页，查询所有品牌
 */
@WebServlet(urlPatterns ="/index")
public class IndexServlet extends HttpServlet {
    private final BrandService brandService = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用BrandService完成查询
        List<Brand> brands = brandService.selectAll();
        //存入request域中
        request.setAttribute("brands", brands);
        //转发到brand.jsp
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req, resp);
    }
}
