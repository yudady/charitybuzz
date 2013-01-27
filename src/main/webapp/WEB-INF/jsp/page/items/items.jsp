<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/items.css"/>' />
<script type="text/javascript" src='<c:url value="/resources/js/page/items.js" />'></script>
	<div id="HomePageOnly-top">
		<div id="sidebar">
			<jsp:include page="/sidebar" />
		</div>
		<div id="mainRight">

			<c:forEach items="${items}" var="item">
				<div class="mainRightItem">
					<span>
						<a href='<c:url value="/item/${item.id}" />'>
							<img class="mainPictureLocation" src='<c:url value="/resources/upload/mainpic/${item.mainPictureLocation}" />' />
						</a>
					</span>
					<span class="itemsDetail" >
						<a href='<c:url value="/item/${item.id}" />'>${item.title}</a>
						<table>
							<tr>
								<th>Current Bid:</th><td>${item.currentBid}1</td>
							</tr>
							<tr>
								<th>Number of Bids:</th><td>????</td>
							</tr>
							<tr>
								<th>Minimum Next Bid:</th><td>${item.minNextBid}</td>
							</tr>
							<tr>
								<th>Estimated Value:</th><td>${item.estimatedValue}</td>
							</tr>
							<tr>
								<th>Lot Number:</th><td>${item.id}</td>
							</tr>
							<tr>
								<th>Lot Closes:</th><td>${item.lotClose}</td>
							</tr>
						</table>
						<a class="itemsDetailBidNow" href="#" ><span>Bid now</span></a>
					</span>
				</div>
			</c:forEach>
		</div>
	</div>