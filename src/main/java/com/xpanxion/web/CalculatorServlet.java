package com.xpanxion.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdorsey on 6/30/2015.
 */
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("guest");

        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<title>Personalized Calculator</title>");
        resp.getWriter().write("</head>");

        resp.getWriter().write("<body>");
        resp.getWriter().write("<h1>Hi " + name + "</h1>");
        resp.getWriter().write("</body>");

        resp.getWriter().write("</html>");

        //super.doPost(req, resp);
    }


}
