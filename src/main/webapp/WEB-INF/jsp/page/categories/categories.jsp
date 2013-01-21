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
		<h1>categories.jsp</h1>

<%
for(int i = 0 ; i < 3 ; i ++){
%>

			<div class="lotDetail clearfix">
				<div class="lotPhoto">
					<a href="/categories/14/catalog_items/314327?ref=14"> <img
						src="https://s3.amazonaws.com/images.charitybuzz.com/images/85732/large_list.jpeg?1358201435"
						alt="Large_list" />
					</a>
				</div>
				<!-- /lotPhoto -->
				<h3>
					<a href="/categories/14/catalog_items/314327?ref=14"> Sit In on
						<i>The Howard Stern Show</i> in NYC and Meet the Staff!
					</a>
				</h3>
				<table cellspacing="0" cellpadding="0" border="0">
					<tbody>
						<tr>
							<th>Current Bid:</th>
							<td>$5,250</td>
						</tr>
						<tr>
							<th>Number of Bids:</th>
							<td>2</td>
						</tr>
						<tr>
							<th>Minimum Next Bid:</th>
							<td>$5,750</td>
						</tr>
						<tr>
							<th>Estimated Value:</th>
							<td>$25,000</td>
						</tr>
						<tr>
							<th>Lot Number:</th>
							<td>314327</td>
						</tr>
						<tr>
							<th>Lot Closes:</th>
							<td>Fri, 8 Feb 2013 1:12:00 PM EST</td>
						</tr>
					</tbody>
				</table>
				<a class="cssButton btnBidNow"
					href="/categories/14/catalog_items/314327"> <span>Bid
						now</span>
				</a>
				<div class="clear">
					<!-- -->
				</div>
				<!-- HORIZONTAL SOCIAL BUTTON CALL -->
				<!-- /SOCIAL BUTTON CALL -->
				<div class="clear">
					<!-- -->
				</div>
			</div>
<%
} 
%>


		</div>
	</div>
</body>
</html>