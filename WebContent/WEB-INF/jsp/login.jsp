<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<form:form modelAttribute="usuario" method="post" cssClass="form-horizontal">
		${message}
		<div class="form-group">
			<label>Correo</label>
			<form:input path="correo" cssClass="form-control"/>
		</div>
		
		<div class="form-group">
			<label>Contraseña</label>
			<form:input path="contrasena" cssClass="form-control"/>
		</div>

		<div class="form-group">
			<form:button class="btn btn-primary">Ingresar</form:button>
		</div>
		
		
	</form:form>

</body>
</html>