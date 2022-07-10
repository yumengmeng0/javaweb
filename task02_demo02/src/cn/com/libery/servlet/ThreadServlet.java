package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: ymm
 * @date: 2022/7/8
 * @version: 1.0.0
 * @description: 线程
 */
public class ThreadServlet extends HttpServlet {

    private String name; // 成员变量作为共享资源

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        synchronized (this) {
            name = request.getParameter("name");

            System.out.println("name = " + name);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            PrintWriter writer = response.getWriter();
            writer.write(name);
            writer.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
