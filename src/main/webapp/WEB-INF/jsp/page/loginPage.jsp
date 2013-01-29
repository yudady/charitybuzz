<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:if test="${param.error != null}">
	<h2>Username or password wrong!</h2>
</c:if>
<form method="post" action="j_spring_security_check">
	<label> username: </label> <input type="text" name="j_username" /> <br />
	<label> password: </label> <input type="password" name="j_password" />
	<br /> <input type="checkbox" name="_spring_security_remember_me" />remember
	me <br /> <input type="submit" />
</form>
