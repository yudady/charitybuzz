<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/admin/adminIndex.css"/>' />
<script type="text/javascript" src='<c:url value="/resources/js/page/admin/adminIndex.js" />'></script>
<ul id="menu">
	<li><a href='<c:url value="/admin/category" />'>category</a></li>
	<li><a href='<c:url value="/admin/category" />'>subcategory</a></li>
	<li><a href='<c:url value="/admin/category" />'>item</a></li>
</ul>
