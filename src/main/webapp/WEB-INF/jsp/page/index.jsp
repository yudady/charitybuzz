<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript" src='<c:url value="/resources/js/page/index.js" />'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/index.css"/>'/>
	<div id="HomePageOnly-top">
		<div id="sidebar">
			<jsp:include page="/sidebar" />
		</div>
		<div id="mainRight">mainRight</div>
	</div>
	<div style="clear: both;">&nbsp;</div>
	<div id="HomePageOnly-down">
		<div id="liveAuctions">liveAuctions</div>
		<div id="itemsClosing">itemsClosing</div>
	</div>
