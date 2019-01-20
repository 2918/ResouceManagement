<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<title>Department</title>
</head>
<body>
	<form id="deptForm" action="addDept" method="post">
		<div class="container">
			<input type="hidden" name="id" />
			<h4>Department</h4>
			<div class="form-group">
				<div class="form-group row">
					<div class="col-md-3">
						<label>Department Name </label>
					</div>
					<div class="col-md-6">
						<input type="text" name="deptName" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-md-3">Department Location</div>
					<div class="col-md-6">
						<input type="text" name="deptLocation" />
					</div>
				</div>
				<div class="form-group row">
					<input type="button" id="createDept" class="btn btn-primary"
						value="Create Department">
				</div>
			</div>
		</div>
	</form>
</body>
</html>