<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript" src='<c:url value="/resources/js/page/sidebar.js"/>'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/sidebar.css"/>'/>
<ul id="menu">
	<c:forEach items="${categories}" var="category">
		<li><a href='<c:url value="/categories/${category.id}" />'>${category.name}(${category.count})</a>
			<c:if test="${not empty category.subCategories}">
				<ul>
					<c:forEach items="${category.subCategories}" var="subCategory">
						<li><a
							href='<c:url value="/categories/${category.id}/subcategories/${subCategory.id}" />'>${subCategory.name}(${subCategory.count})</a></li>
					</c:forEach>
				</ul>
			</c:if>
		</li>
	</c:forEach>
</ul>
