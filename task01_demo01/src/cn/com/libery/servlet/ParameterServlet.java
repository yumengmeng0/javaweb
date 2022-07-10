package cn.com.libery.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @author: ymm
 * @date: 2022/7/7
 * @version: 1.0.0
 * @description: 获取请求参数和值的2种方式
 */
@WebServlet(name = "ParameterServlet", urlPatterns = "/parameterServlet")  // urlPatterns必须加 /
public class ParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 方式一
        // 设置请求信息中的编码
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        System.out.println("name：" + name);
        String[] hobbies = request.getParameterValues("hobby");
        System.out.print("hobbies：");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }

        System.out.println();
        // 获取所有参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        System.out.print("parameterNames：");
        while (parameterNames.hasMoreElements()) {
            System.out.print(parameterNames.nextElement() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        // 方式二
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();

        for (Map.Entry<String, String[]> me : entries) {
            System.out.print(me.getKey() + "：");
            for (String ts : me.getValue()) {
                System.out.print(ts + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------------------------------");
        // 获取客户端请求的其他信息
        System.out.println("客户端ip：" + request.getRemoteAddr());
        System.out.println("客户端端口号：" + request.getRemotePort());
        System.out.println("请求资源的路径：" + request.getRequestURI()); // /task01_demo01/parameterServlet
        System.out.println("请求资源的完整路径：" + request.getRequestURL()); // http://localhost:8080/task01_demo01/parameterServlet
        System.out.println("请求方式：" + request.getMethod());
        System.out.println("请求附带的参数：" + request.getQueryString()); // get请求时的参数
        System.out.println("请求的servlet：" + request.getServletPath()); // /parameterServlet
/*
        客户端ip：127.0.0.1
        客户端端口号：58713
        请求资源的路径：/task01_demo01/parameterServlet
        请求资源的完整路径：http://127.0.0.1:8080/task01_demo01/parameterServlet
        请求方式：POST
        请求附带的参数：null
        请求的servlet：/parameterServlet
  */



        // 向浏览器发出响应属性
        System.out.println("服务器响应数据的默认编码方式：" + response.getCharacterEncoding()); // ISO-8859-1
        // 设置服务和浏览器的编码方式及文本类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("你好！");
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
