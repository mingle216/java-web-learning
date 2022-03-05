package com.mingle.web.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author mingle
 * @date 2022/3/4 8:31
 * @description 过滤器domo
 */
//@WebFilter(urlPatterns = "/*")
public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器1初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("11111");
        //放行，放请求访问其本该访问的资源
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("33333");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器1销毁");
    }
}