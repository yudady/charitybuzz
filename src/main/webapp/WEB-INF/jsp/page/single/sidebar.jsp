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

<script>
	$(function() {
		$("#menu").menu();
	});
</script>
<style>
.ui-menu {
	width: 150px;
}
</style>

</head>
<body>
	<ul id="menu">
		<c:forEach items="${categories}" var="category">
			<li><a href='<c:url value="/categories/${category.id}" />'>${category.name}</a></li>
		</c:forEach>
		<li><a href="#">Delphi</a>
			<ul>
				<li><a href="#">Ada</a></li>
				<li><a href="#">Saarland</a></li>
				<li><a href="#">Salzburg</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>