<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript">
	var charitybuzz = (function(){
		var obj = {
			url : '<c:url value="/"/>'
		};
		return obj;
	})();
	
	function getSafeUrl(path){
		return "" + '<c:url value="/"/>' + path ;
	}
</script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.9.0.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.log.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/page/base.js"/>'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/base.css"/>'/>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/sidebar.css"/>'/>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="page">
			<div id="boxContent">
				<tiles:insertAttribute name="menu" />
				<tiles:insertAttribute name="body" />
			</div>
			<div id="footer">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>
</body>
</html>