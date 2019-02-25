<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login_Page</title>

</head>
<body>

	<h1 >LOGIN</h1>
     <form action="LoginServlet1" method="Post">
          Userid:<br> <input type="text" name="userId" ><br><br>
          Password:<br><input type="password" name="password" ><br><br>
          UserType: <input type="radio" name="userType" value="A" >Admin 
                    <input type="radio" name="userType" value="V" >Vendor
                    <input type="radio" name="userType" value="U" >User<br><br>
          Status: <input type="text" name="status" ><br><br>
          <input type="submit" value="submit">
           <input type="reset" value="reset" ><br><br>
          
      <a href="EmpRegistration.html">SIGNUP</a>
      </form>
	
</body>
</html>

