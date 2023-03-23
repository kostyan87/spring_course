<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show</title>
</head>
<body>

<h2>Dear Employee, you are welcome!</h2>

<br>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your salary: ${employee.phoneNumber}
<br>
Your email: ${employee.email}

<br>

<a href="askDetails">Write new details</a>

</body>
</html>