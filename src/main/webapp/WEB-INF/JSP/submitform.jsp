<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
${heading}
<form method="post" action="/student/student.html">
    <label>Username</label>
    <input name="username" type="text">
    <label>lastname</label>
    <input name="lastname" type="text">
    <input type="submit">
</form>

</body>
</html>