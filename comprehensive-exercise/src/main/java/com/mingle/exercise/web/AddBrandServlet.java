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

/**
 * @author mingle
 * @date 2022/3/1 18:09
 * @description 新增品牌逻辑处理
 */
@WebServlet(urlPatterns = "/addBrand")
@Slf4j
public class AddBrandServlet extends HttpServlet {
    private final BrandService brandService=new BrandService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受表单提交的数据，封装为一个Brand对象
        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        String ordered = req.getParameter("ordered");
        String description = req.getParameter("description");
        String status = req.getParameter("status");
        //封装为一个Brand对象
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.parseInt(ordered));
        brand.setDescription(description);
        brand.setStatus(Integer.parseInt(status));

        //调用service完成添加
        brandService.add(brand);
        //重定向到查询所有Servlet
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/index");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
