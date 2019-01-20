<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project</title>
</head>
<body>
<form action="addProject" method="post">
<input type="hidden" id="projectId" name="id"/>
Project Name : <input type="text" name="projectName"/>
Client Name : <input type="text" name="clientName"/>
DeadLine :  <input type="date" name="endDate"/>
<input type="submit" value="Submit">
</form>
</body>
</html>