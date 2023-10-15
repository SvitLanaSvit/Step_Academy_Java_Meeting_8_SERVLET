<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <h1><%= "Hello World!" %></h1>
    <br/>
    <div class="alert alert-primary">
        <a href="hello-servlet">Hello Servlet</a>
    </div>

    <div class="alert alert-primary">
        <a href="quote-servlet">Quote Servlet</a>
    </div>

    <div class="alert alert-primary">
        <a href="multiplication-servlet">Multiplication Table</a>
    </div>

    <div class="alert alert-primary">
        <a href="guess-number-servlet">Guess Number Game</a>
    </div>

    <div class="alert alert-primary">
        <a href="questionnaire-servlet">Questionnaire</a>
    </div>
</body>
</html>