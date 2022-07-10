package cn.com.libery.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/7
 * @version: 1.0.0
 * @description:
 */
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取配置参数
        ServletContext servletContext = this.getServletContext();

        String username = servletContext.getInitParameter("username");
        System.out.println("username = " + username);
        // 获取相关路径
        System.out.println("---------------------------------");

        System.out.println("上下文关联的路径信息：" + servletContext.getContextPath()); // 工程路径 /task01_demo01
        System.out.println("实际路径：" + servletContext.getRealPath("/")); // E:\lagou\javaweb\out\artifacts\task01_demo01_war_exploded\

        System.out.println("---------------------------------");
        // 设置和获取属性信息
        servletContext.setAttribute("key", "value");

        Object key = servletContext.getAttribute("key");
        System.out.println("key = " + key);

        servletContext.removeAttribute("key");
        key = servletContext.getAttribute("key");
        System.out.println("key = " + key);


    }
}
