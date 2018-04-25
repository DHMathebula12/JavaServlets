<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello from JSP</title>
</head>
<body>
<% out.print("<h1>My Addition Application</h1>"); %>
<hr>
Welcome to my Servlet. It Uses JSP & the JBoss Application Server<br>
Current Time is : <%=new java.util.Date()%>

<form id=fr_add name=fr_add method=get action="AddNumbers">
A : <input type=text value="" name=a><br>
B : <input type=text value="" name=b><br>
<input type=submit name=sb value="Add A+B">
</form>

</body>
</html>