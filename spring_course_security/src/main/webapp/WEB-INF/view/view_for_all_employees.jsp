<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Information for all employees</title>
</head>
<body>

<h3>Information for all employees</h3>
<br>
<security:authorize access="hasRole('HR')">
<input type="button" value="salary" onclick="window.location.href = 'hr_info'">
Only for HR staff
</security:authorize>
<br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="performance" onclick="window.location.href = 'manager_info'">
Only for managers
</security:authorize>

</body>
</html>