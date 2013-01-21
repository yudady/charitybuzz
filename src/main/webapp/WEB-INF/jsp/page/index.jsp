<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src='<c:url value="/resources/js/page/index.js" />'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/index.css"/>'/>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar">sidebar</div>
		<div id="mainRight">mainRight</div>
	</div>
	<div style="clear: both;">&nbsp;</div>
	<div id="HomePageOnly-down">
		<div id="liveAuctions">liveAuctions</div>
		<div id="itemsClosing">itemsClosing</div>
	</div>
</body>
</html>