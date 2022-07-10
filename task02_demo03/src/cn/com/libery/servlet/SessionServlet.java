package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/10
 * @version: 1.0.0
 * @description:
 */
@WebServlet(name = "SessionServlet", urlPatterns = "/session")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("session.isNew() = " + session.isNew());
        System.out.println("session.getId() = " + session.getId());

        session.setAttribute("name","session");
        System.out.println("session.getAttribute(\"name\") = " + session.getAttribute("name"));
        session.removeAttribute("name");
        System.out.println("session.getAttribute(\"name\") = " + session.getAttribute("name"));

        System.out.println("默认失效时间 session.getMaxInactiveInterval() = " + session.getMaxInactiveInterval()); // 1800s
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
