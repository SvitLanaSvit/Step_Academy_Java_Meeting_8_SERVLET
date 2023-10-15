<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="guess-number-servlet" method="POST">
            <p>Think of a number between 0 and 100, and I will try to guess it!</p>

            <% if (request.getAttribute("message") != null) { %>
            <p><%= request.getAttribute("message") %></p>
            <% } else { %>
            <p>Is greater or less than 50?</p>
            <% } %>
            
            <div class="mb-3 w-25">
                <label>Select answer:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="response" id="greater" value="greater" checked>
                    <label class="form-check-label" for="greater">Greater than</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="response" id="lesser" value="lesser">
                    <label class="form-check-label" for="lesser">Lesser than</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="response" id="equal" value="equal">
                    <label class="form-check-label" for="equal">Equal</label>
                </div>
            </div>

            <div class="btn-group" style="margin-top: 20px">
                <button type="submit" name="submit" class="btn btn-primary">Send</button>
                <a href="index.jsp" class="btn btn-secondary" onclick="resetSessionAttributes()">Back</a>
            </div>

        </form>
    </div>
</body>
</html>
<script>
    function resetSessionAttributes() {
        fetch('reset-session.jsp')
            .then(response => {
                if (response.status === 200) {
                    console.log('Session attributes reset successfully.');
                } else {
                    console.error('Failed to reset session attributes.');
                }
            })
            .catch(error => {
                console.error('Error:', error);
            });
    }
</script>
