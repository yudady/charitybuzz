<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<ul id="menu">
	<li><a href='<c:url value="/admin/adminCategory" />'>category</a></li>
	<li><a href='<c:url value="/admin/adminSubcategory" />'>subcategory</a></li>
	<li><a href='<c:url value="/admin/adminItem" />'>item</a></li>
	<li><a href='<c:url value="/admin/adminAuctionRule" />'>adminAuctionRule</a></li>
</ul>

