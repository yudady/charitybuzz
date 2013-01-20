<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript"
	src='<c:url value="/resources/js/jquery-1.9.0.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/jquery.log.js"/>'></script>
<link type="text/css" rel="stylesheet"
	href='<c:url value="/resources/css/base.css"/>' />
<script type="text/javascript">
	$(function() {
		$.log("222");
	});
</script>
<title>charitybuzz</title>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar">sidebar</div>
		<div id="mainRight">mainRight</div>
	</div>
	<div id="HomePageOnly-down">
		<div id="liveAuctions">liveAuctions</div>
		<div id="itemsClosing">itemsClosing</div>
	</div>
</body>
</html>