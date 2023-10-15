package com.example.meeting_8_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "multiplicationServlet", value = "/multiplication-servlet")
public class MultiplicationTableServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/multiplicationTable.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String num = request.getParameter("num");
        int numInt = Integer.parseInt(num);

        out.println("<html><head>" +
                "<title>Цитата у Мартіна Фаулера</title>" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                "</head><body>");
        out.println("<div class='container'>");
        for (int i = 1; i <= 10; i++) {
            out.println("<p>" + numInt + " * " + i + "=" + (numInt * i) + "</p>");
        }
        out.println("</div></body></html>");
    }
}
