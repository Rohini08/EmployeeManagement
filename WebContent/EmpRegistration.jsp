<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
Welcome ${userName};
<h1 >REGISTRATION PAGE </h1>
    <form action="RegistrationServlet" method="post">
        EmpId:     <input type="text" name="employeeID" ><br><br>
        FirstName: <input type="text" name="firstName"><br><br>
        LastName:  <input type="text" name="lastName"><br><br>
        Salary: <input type="text" name="salary"><br><br><br>
        <input type="submit" value="Submit"><br>
        </form>
</body>
</html>