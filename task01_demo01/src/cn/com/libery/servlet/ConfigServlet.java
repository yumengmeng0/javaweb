package cn.com.libery.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/7
 * @version: 1.0.0
 * @description:
 */
public class ConfigServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("执行初始化操作");
        System.out.println("Servlet别名：" + servletConfig.getServletName());
        System.out.println("初始化参数password的值：" + servletConfig.getInitParameter("password"));

        ServletContext servletContext = servletConfig.getServletContext();

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
