;$(function() {
	/**
	 * sidebar
	 */
	$.ajax({
		type : "POST",
		url : "sidebar",
		data : {}
	}).done(function(categories) {
		$.log(categories);
		var sidebarHtml = $("<dl />");
		$(categories).each(function(){
			sidebarHtml.wrapInner("<dd>" + this.title +"("+this.count+")</dd>");
		});
		$("#sidebar").empty().html(sidebarHtml);
	});
	
	
	
	
});