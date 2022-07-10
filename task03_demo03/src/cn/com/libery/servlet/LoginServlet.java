package cn.com.libery.servlet;

import cn.com.libery.model.User;
import cn.com.libery.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ymm
 * @date: 2022/7/10
 * @version: 1.0.0
 * @description:
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        User user = new User(request.getParameter("userName"), request.getParameter("password"));
        UserService userService = new UserService();
        User user1 = userService.userLogin(user);
        if (user1 == null) {
            System.out.println("用户名或密码错误，登录失败！");
            request.setAttribute("error","用户名或密码错误，登录失败！");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
        } else {
            System.out.println("登录成功！");
            request.getSession().setAttribute("user", user);
            response.sendRedirect("main.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
