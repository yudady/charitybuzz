;$(function() {
	/**
	 * sidebar
	 */
	$.ajax({
		type : "POST",
		url : "sidebar",
		data : {}
	}).done(function(msg) {
		var sidebarHtml = $("<dl />");
		$(msg.headlines).each(function(){
			sidebarHtml.wrapInner("<dd>" + this.title +"("+this.count+")</dd>");
		});
		$("#sidebar").empty().html(sidebarHtml);
	});
	
	
	
	
});