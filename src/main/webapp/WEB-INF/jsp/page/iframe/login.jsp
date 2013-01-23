<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<c:choose>
		<c:when test="${user == null }">
			<form action="<c:url value="/login/iframe" />" method="post">
				<span>Email Address:</span>
				<input type="text" name="email" /> 
				<br /> 
				<span>Password:</span>
				<input type="password" name="passWord" /> <br />
				<input type="submit" value="btnLogin" />
			</form>

			<input type="button" id="Register" value="Register" />
		</c:when>
		<c:otherwise>
			<span>${user.screenName } ${user.email }| Account info |</span>
			<form action='<c:url value="/login/logout" />' method="post">
				<input type="submit" name="submit" id="logout" value="Logout" />
			</form>
		</c:otherwise>
	</c:choose>
	<input type="text" id="Search" value="Search" />
</body>
</html>