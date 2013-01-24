/**
 * all page init do
 */
;$(function() {

	/**
	 * sidebar
	 */
	$.ajax({
		type : "POST",
		url : getSafeUrl("sidebar"),
		data : {}
	}).done(function(categories) {
		
		//TODO fix
		
		var sidebarHtml = $("<dl />");
		$(categories).each(function(){
			//$.log(this);
			var sidebarCategory = $("<dd/>").addClass("sidebarItem").wrapInner("<a href='"+getSafeUrl("categories") +"/"+ this.id+"'>" + this.name +"</a>");
			sidebarHtml.wrapInner(sidebarCategory);
		});
		$("#sidebar").empty().html(sidebarHtml);
	});
	
	
	
});