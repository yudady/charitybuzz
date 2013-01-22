<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/categories.css"/>'/>
<script type="text/javascript" src='<c:url value="/resources/js/page/categories.js" />'></script>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar"></div>
		<div id="mainRight">




<c:forEach items="${articles}" var="article">
			<div class="lotDetail clearfix">
				<div class="lotPhoto">
					<a href='<c:url value="/article/${article.id}" />'><img
						src="${article.mainPictureLocation}"
						alt="Large_list" />
					</a>
				</div>
				<!-- /lotPhoto -->
				<h3>
					<a href='<c:url value="/article/${article.id}" />'>${article.title}</a>
				</h3>
				<table cellspacing="0" cellpadding="0" border="0">
					<tbody>
						<tr>
							<th>Current Bid:</th>
							<td>${article.currentBid}</td>
						</tr>
						<tr>
							<th>Number of Bids:</th>
							<td>${article.articleHistorySize}</td>
						</tr>
						<tr>
							<th>Minimum Next Bid:</th>
							<td>${article.minNextBid}</td>
						</tr>
						<tr>
							<th>Estimated Value:</th>
							<td>${article.estimatedValue}</td>
						</tr>
						<tr>
							<th>Lot Number:</th>
							<td>${article.id}</td>
						</tr>
						<tr>
							<th>Lot Closes:</th>
							<td>${article.endDate}</td>
						</tr>
					</tbody>
				</table>
				<a class="cssButton btnBidNow"
					href="/categories/14/catalog_items/314327"> <span>Bid
						now</span>
				</a>
			</div>
</c:forEach>








		</div>
	</div>
</body>
</html>