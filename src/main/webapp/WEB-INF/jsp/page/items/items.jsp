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
<link type="text/css" rel="stylesheet"
	href='<c:url value="/resources/css/items.css"/>' />
<script type="text/javascript"
	src='<c:url value="/resources/js/page/items.js" />'></script>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar">
			<jsp:include page="/sidebar" />
		</div>
		<div id="mainRight">

			<c:forEach items="${items}" var="item">
				<div>
					<a href='<c:url value="/item/${item.id}" />'><img
						class="mainPictureLocation"
						src='<c:url value="/resources/upload/mainpic/${item.mainPictureLocation}" />' /></a>
					<!-- /lotPhoto -->
					<h3>
						<a href='<c:url value="/item/${item.id}" />'>${item.title}</a>
					</h3>
					<dl>
						<dt>Current Bid:</dt>
						<dd>${item.currentBid}</dd>
						<dt>Number of Bids:</dt>
						<dd>????</dd>
						<dt>Minimum Next Bid:</dt>
						<dd>${item.minNextBid}</dd>
						<dt>Estimated Value:</dt>
						<dd>${item.estimatedValue}</dd>
						<dt>Lot Number:</dt>
						<dd>${item.id}</dd>
						<dt>Lot Closes:</dt>
						<dd>${item.lotClose}</dd>
					</dl>
					<a href="#"><span>Bid now</span></a>
				</div>
				<hr />
			</c:forEach>
		</div>
	</div>
</body>
</html>