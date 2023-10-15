<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiplication Table</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="multiplication-servlet" method="POST">
            <div class="mb-3 w-25">
                <label for="num">Enter number:</label>
                <input type="number" class="form-control" id="num" name="num" required/>
            </div>

            <div class="btn-group">
                <button type="submit" name="submit" class="btn btn-primary">Calculate</button>
            </div>
        </form>
    </div>
</body>
</html>
