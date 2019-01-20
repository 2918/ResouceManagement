<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department</title>
</head>
<body>
<form action="addAllocation" method="post">
Employee Name : <select name="employee">
	<c:forEach items="${empList}" var="emp">
	 	<option value="${emp.id}">${emp.empName}</option>
	 </c:forEach>
</select><br>
Project : 
<select name="project">
	<c:forEach items="${projectList}" var="proj">
	 	<option value="${proj.id}">${proj.projectName}</option>
	 </c:forEach>
</select><br>

Role :
<select name="role">
	<c:forEach items="${roleList}" var="eachRole">
	 	<option value="${eachRole.id}">${eachRole.roleTitle}</option>
	 </c:forEach>
</select><br>

From Date :  <input type="date" name="fromDate"/><br>
To Date :  <input type="date" name="toDate"/><br>
amountPerDay : <input type="text" name="amountPerDay"/><br>

<input type="submit" value="Submit">
</form>
</body>
</html>