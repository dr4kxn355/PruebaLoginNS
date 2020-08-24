<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="padding: 10px; border: 1px solid gray;">
	    <a href="?lang=es">Spanish</a>
	    <a href="?lang=en">English</a>
	</div>
	<spring:message code="form.welcome"/> ${usuario.nombre }
</body>
</html>