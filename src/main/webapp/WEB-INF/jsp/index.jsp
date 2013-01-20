<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.9.0.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.log.js"/>'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/base.css"/>'/>
<script type="text/javascript">
	$(function(){
		$.log("222");
	});

</script>
<title>charitybuzz</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<span id="logo">
				<a href="<c:url value="/"/>"><img width="470" height="67" src='<c:url value="/resources/pic/logo-high-res-retina.png"/>' alt="Charitybuzz Logo"/></a>
			</span>
			<span id="logIn">
				<input type="button" id="btnLogin" value="btnLogin"/>
				<input type="button" id="Register" value="Register"/>
				<input type="text" id="Search" value="Search"/>
			</span>
		</div>
		<div id="page">
			<div id="boxContent">
				<div id="nav">
					<ul>
						<li>Home</li>
						<li>Auctions</li>
						<li>Blog</li>
						<li>Testimonials</li>
						<li>Contact Us</li>
						<li>Dream Big NEW</li>
					</ul>
				</div>
				<div id="social">
					<ul>
						<li>F</li>
						<li>T</li>
						<li>F</li>
						<li>T</li>
						<li>F</li>
						<li>T</li>
					</ul>
				</div>
				<div id="HomePageOnly-top">
					<div id="sidebar">sidebar</div>
					<div id="mainRight">mainRight</div>
				</div>
				<div id="HomePageOnly-down">
					<div id="liveAuctions">liveAuctions</div>
					<div id="itemsClosing">itemsClosing</div>
				</div>
			</div>
			<div id="footer">footer</div>
		</div>
	</div>
</body>
</html>