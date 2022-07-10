package cn.com.libery.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/6
 * @version: 1.0.0
 * @description:
 */
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig()");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet.service()");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");

    }
}
