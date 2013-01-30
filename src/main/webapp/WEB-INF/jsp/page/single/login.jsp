<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<script type="text/javascript" src='<c:url value="/resources/js/page/login.js"/>'></script>
<sec:authorize access="hasRole('loginBidder')">
普通使用者
<a href="<c:url value="j_spring_security_logout" />" ><input type="button" value=" Logout"/></a>
</sec:authorize>
<sec:authorize access="hasRole('loginAdmin')">
後臺管理者
<a href="<c:url value="j_spring_security_logout" />" ><input type="button" value=" Logout"/></a>
</sec:authorize>


<sec:authorize access="!hasRole('loginBidder') AND !hasRole('loginAdmin')">
	<h3>Login with email and Password</h3>

	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>

	<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>

		<table>
			<tr>
				<td>email:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="reset" /></td>
			</tr>
		</table>

	</form>
</sec:authorize>