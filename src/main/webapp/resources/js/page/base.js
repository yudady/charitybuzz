;$(function() {
	/**
	 * sidebar
	 */
	$.ajax({
		type : "POST",
		url : charitybuzz.url + "sidebar",
		data : {}
	}).done(function(categories) {
		
		//TODO fix
		
		var sidebarHtml = $("<dl />");
		$(categories).each(function(){
			//$.log(this);
			var sidebarCategory = $("<dd/>").addClass("sidebarCategory").data("catalogItems",this.catalogItems.length).wrapInner("<a href='"+charitybuzz.url+"categories/"+this.id+"'>" + this.name +"("+this.count+")("+this.catalogItems.length+")</a>");
			sidebarHtml.wrapInner(sidebarCategory);
			
//			var catalogItems = this.catalogItems;
//			var secoundsHtml = $("<dl />");
//			$(catalogItems).each(function(){
//				secoundsHtml.wrapInner("<dd>" + this.name +"("+this.count+")</dd>"); 
//				//+= "-----"+this.name+"("+this.count+")" ;
//			});
//			secoundsHtml.html();
			//sidebarHtml.wrapInner("<dd class='sidebarCategory'><a href=''>" + this.name +"("+this.count+")</a></dd>");
		});
		$("#sidebar").empty().html(sidebarHtml);
//		$(".sidebarCategory").click(function(){
//			var catalogItems = $(this).data("catalogItems");
//			$.log(catalogItems);
//			return false;
//		});
	});
	

	
	
	
});