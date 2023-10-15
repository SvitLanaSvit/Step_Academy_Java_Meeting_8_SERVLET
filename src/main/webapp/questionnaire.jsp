<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="questionnaire-servlet" method="POST">
            <div class="mb-3 w-25">
                <label for="firstname">Firstname:</label>
                <input type="text" class="form-control" id="firstname" name="firstname" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="lastname">Lastname:</label>
                <input type="text" class="form-control" id="lastname" name="lastname" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="phone">Phone number:</label>
                <input type="tel" class="form-control" id="phone" name="phone" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="email">E-mail:</label>
                <input type="email" class="form-control" id="email" name="email" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="age">Age:</label>
                <input type="number" class="form-control" id="age" name="age" min="0" max="150" required/>
            </div>

            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="subscribe" name="subscribe">
                <label class="form-check-label" for="subscribe">Subscribe to our newsletter?</label>
            </div>

            <div class="mb-3 w-25">
                <label>Select gender:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="man" value="man" checked>
                    <label class="form-check-label" for="man">Man</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="woman" value="woman">
                    <label class="form-check-label" for="woman">Woman</label>
                </div>
            </div>

            <div class="btn-group" style="margin-top: 20px">
                <button type="submit" name="submit" class="btn btn-primary">Send</button>
            </div>
        </form>
    </div>
</body>
</html>
