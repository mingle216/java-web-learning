package com.mingle.servlet;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author mingle
 * @date 2022/2/26 17:13
 * @description Servlet快速入门——xml方式配置Servlet
 */
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
  /**
   * 提供服务的方法
   *
   * @param servletRequest  请求对象
   * @param servletResponse 响应对象
   * @throws ServletException Servlet异常
   * @throws IOException      IO异常
   */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
