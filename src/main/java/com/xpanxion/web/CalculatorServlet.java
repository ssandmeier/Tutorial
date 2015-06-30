package com.xpanxion.web;

import com.xpanxion.Calculation;
import com.xpanxion.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by cdorsey on 6/30/2015.
 */
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String guestName = req.getParameter("guest");
        session.setAttribute("guest", guestName);
        req.getRequestDispatcher("calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operands = req.getParameter("operands");
        Scanner keyboard = new Scanner(operands);

        HttpSession session = req.getSession();
        String guestName = (String)session.getAttribute("guest");

        Calculator calculator = new Calculator();
        Calculation results = calculator.Calculator(Calculator.ADDITION, guestName, keyboard);

        req.setAttribute("resultText", results.getTextResult());
        req.getRequestDispatcher("calculator.jsp").forward(req, resp);
    }
}
