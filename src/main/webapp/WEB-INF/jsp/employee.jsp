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
<form action="addEmployee" method="post">
<input type="hidden" name="id" id="employeeId"/>
Employee Name : <input type="text" name="empName"/>
Department : 
<select name="department">
	<c:forEach items="${deptList}" var="dept">
	 	<option value="${dept.id}">${dept.deptName}</option>
	 </c:forEach>
</select>
Hire Date :  <input type="date" name="hireDate"/>
Salary : <input type="text" name="salary"/>
Manager : <input type="text" name="managerId"/>
<input type="submit" value="Submit">
</form>
</body>
</html>