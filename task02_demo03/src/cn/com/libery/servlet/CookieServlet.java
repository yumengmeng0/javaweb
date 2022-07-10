package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/9
 * @version: 1.0.0
 * @description:
 */
@WebServlet(name = "CookieServlet", urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CookieServlet");
        Cookie cookie = new Cookie("name", "value");

        // cookie默认使用期限
        int maxAge = cookie.getMaxAge();
        System.out.println("maxAge = " + maxAge); // -1
        // 正数表示在指定的秒数后失效，负数浏览器关闭后失效，0马上失效
        cookie.setMaxAge(1000);
        String contextPath = request.getContextPath(); // /task02_demo03
        System.out.println("contextPath = " + contextPath);
        response.addCookie(cookie);
        System.out.println("创建cookie成功");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
