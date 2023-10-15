<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    session = request.getSession();
    session.setAttribute("low", 0);
    session.setAttribute("high", 100);
%>