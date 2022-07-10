package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/6
 * @version: 1.0.0
 * @description:
 */
public class HelloHttpServlet extends HttpServlet {
    public HelloHttpServlet() {
        System.out.println("构造方法");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("HelloHttpServlet.service");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("HelloHttpServlet.init");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("HelloHttpServlet.destroy");
    }
}
