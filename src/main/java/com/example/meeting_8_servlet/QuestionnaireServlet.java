package com.example.meeting_8_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "questionnaireServlet", value = "/questionnaire-servlet")
public class QuestionnaireServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/questionnaire.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String subscribeToNewsletter = request.getParameter("subscribe");
        String gender = request.getParameter("gender");

        out.println("<html><head>" +
                "<title>Max number</title>" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                "</head><body>");
        out.println("<div class='container'>");
        out.println("<table class=\"table table-striped table-hover\">");
        out.println("<thead>");

        out.println("<tr>");
        out.println("<th>Firstname</th>");
        out.println("<th>Lastname</th>");
        out.println("<th>Phone number</th>");
        out.println("<th>E-mail</th>");
        out.println("<th>Age</th>");
        out.println("<th>Gender</th>");
        out.println("<th>Subscribe to our newsletter?</th>");

        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<td>" + firstname + "</td>");
        out.println("<td>" + lastname + "</td>");
        out.println("<td>" + phone + "</td>");
        out.println("<td>" + email + "</td>");
        out.println("<td>" + age + "</td>");
        out.println("<td>" + gender + "</td>");
        if("on".equals(subscribeToNewsletter)){
            out.println("<td>Yes</td>");
        }else {
            out.println("<td>No</td>");
        }
        out.println("</tr>");
        out.println("</tbody>");
        out.println("</table>");
        out.println("</div></body></html>");
    }
}
