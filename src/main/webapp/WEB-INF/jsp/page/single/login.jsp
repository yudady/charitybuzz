<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript" src='<c:url value="/resources/js/page/login.js"/>'></script>
	<c:choose>
		<c:when test="${bidder == null}">
			
				<span>Email Address:</span>
				<input type="text" id="email" /> 
				<br /> 
				<span>Password:</span>
				<input type="password" id="passWord"/> <br />
				<input type="button" value="btnLogin" id="btnLogin"/>
			
			
			
			<span>${loginFail}</span>
			<input type="button" id="Register" value="Register" />
		</c:when>
		<c:otherwise>
			<span>${bidder.screenName} ${bidder.email}| Account info |</span>
			<form action='<c:url value="/login/logout" />' method="post">
			</form>
			<input type="hidden" id="bidderId" value="${bidder.id}"/>
			<input type="submit" id="logout" value="Logout" />
		</c:otherwise>
	</c:choose>
	<input type="text" id="Search" value="Search" />