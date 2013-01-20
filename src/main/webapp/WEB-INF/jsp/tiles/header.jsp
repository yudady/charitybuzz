<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<span id="logo"> <a href='<c:url value="/"/>'><img
			width="470" height="67"
			src='<c:url value="/resources/pic/logo-high-res-retina.png"/>'
			alt="Charitybuzz Logo" /></a>
	</span>
	<span id="logIn"> <input type="button" id="btnLogin"
		value="btnLogin" /> <input type="button" id="Register"
		value="Register" /> <input type="text" id="Search" value="Search" />
	</span>
</body>
</html>