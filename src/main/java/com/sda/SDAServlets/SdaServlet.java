package com.sda.SDAServlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SdaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello <b>"+ userName + "</b></h1>");

    }
}