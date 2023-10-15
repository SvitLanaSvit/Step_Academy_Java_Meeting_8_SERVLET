package com.example.meeting_8_servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "quoteServlet", value = "/quote-servlet")
public class QuoteServlet extends HelloServlet{
    private String quote;

    @Override
    public void init() {
        quote = "Any fool can write code that a computer can understand. Good programmers write code that humans can \n" +
                "understand\n";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head>" +
                "<title>Цитата у Мартіна Фаулера</title>" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                "</head><body>");
        out.println("<div class='container'>");
        out.println("<h1>Цитата Мартіна Фаулера:</h1>");
        out.println("<p>" + quote + "</p>");
        out.println("</div>");
        out.println("</body></header></html>");
    }
}
