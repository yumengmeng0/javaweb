package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/7
 * @version: 1.0.0
 * @description: 使用注解的方式创建servlet
 */
@WebServlet(name = "AnnoServlet", urlPatterns = "/hello4")
public class AnnoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("AnnoServlet.doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("AnnoServlet.doGet");
        this.doPost(request, response);
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        System.out.println("使用注解的方式创建servlet");
//        String method = req.getMethod();
//        System.out.println("请求方法：" + method);
//        if (method.equals("GET")) {
//            doGet(req, resp);
//        }
//        if (method.equals("POST")) {
//            doPost(req, resp);
//        }
//    }
}
