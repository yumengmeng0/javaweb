package cn.com.libery.servlet;

import cn.com.libery.dao.UserDao;
import cn.com.libery.model.User;

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
 * @description:
 */
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println("userName = " + userName + ",password = " + password);

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        UserDao userDao = new UserDao();
        int r = userDao.createUser(user);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        if (r > 0) {
            System.out.println("注册成功");
            writer.write("注册成功");
        } else {
            System.out.println("注册失败");
            writer.write("注册失败");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
