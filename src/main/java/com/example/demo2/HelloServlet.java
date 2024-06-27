package com.example.demo2;

import java.io.*;

import com.example.demo2.bean.Calculator;
import com.example.demo2.bean.Converter;
import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @EJB
    Converter converter;

    @EJB
    Calculator calculator;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        calculator.add(1,2);


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + calculator.getTotal() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}