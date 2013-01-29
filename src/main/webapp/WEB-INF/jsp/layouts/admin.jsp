<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.9.0.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery-ui-1.10.0.custom.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.log.js"/>'></script>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
<tiles:insertAttribute name="body" />
</body>
</html>