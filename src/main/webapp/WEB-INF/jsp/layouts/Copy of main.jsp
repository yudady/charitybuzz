<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<div id="header-tiles" class="ui-layout-north">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="body-tiles" class="outer-center" style="background-color:#003366">
		<div id="menu-tiles" class="inner-west" style="background-color:red">
			<tiles:insertAttribute name="menu" />
		</div>
		<div id="content-tiles" class="inner-center">
			<c:url value="/" />
			<br />
			<spring:theme code="css" />
			<br />
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<div id="footer-tiles" class="ui-layout-south">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>