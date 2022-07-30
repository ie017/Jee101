package com.jee101;

import java.io.*;
import javax.servlet.ServletException;
import javax .servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="HelloServlet",urlPatterns={"/HelloServlet"})
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String message = "Hello and welcome with our first Servlet";
        int result = a+b;
        request.setAttribute("number1",a);
        request.setAttribute("number2",b);
        request.setAttribute("sum",result);
        request.setAttribute("message",message);

        request.getRequestDispatcher("Result.jsp").forward(request, response);
    }
}