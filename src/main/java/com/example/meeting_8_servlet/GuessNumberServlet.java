package com.example.meeting_8_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "guessNumberServlet", value = "/guess-number-servlet")
public class GuessNumberServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/guessNumber.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String responseFromUser = request.getParameter("response");
        HttpSession session = request.getSession();

        if (session.getAttribute("low") == null || session.getAttribute("high") == null) {
            session.setAttribute("low", 0);
            session.setAttribute("high", 100);
        }

        int low = (int) session.getAttribute("low");
        int high = (int) session.getAttribute("high");

        int guess = (low + high) / 2;
        String message0 = "Is greater or less than " + guess + "?";
        request.setAttribute("message", message0);

        if (low <= high){
            if("equal".equals(responseFromUser)){
                String message = "Yay! I guessed it! It's " + guess + ".";
                request.setAttribute("message", message);
            }else if("greater".equals(responseFromUser)){
                session.setAttribute("low", guess + 1);
            }else if("lesser".equals(responseFromUser)){
                session.setAttribute("high", guess - 1);
            }

            request.getRequestDispatcher("/guessNumber.jsp").forward(request,response);
        }else{
            String message = "I couldn't guess the number. Please start over.";
            request.setAttribute("message", message);
            session.invalidate();
            request.getRequestDispatcher("guessNumber.jsp").forward(request, response);
        }
    }
}
