package com.springweb.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 纯Servlet API实现的Controller方式！！！
 */
public class HelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应内容类型
        resp.setContentType("text/html");

        String msg = "something return by Servlet";
        // 实际的逻辑是在这里
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + msg + "</h1>");
    }
}
