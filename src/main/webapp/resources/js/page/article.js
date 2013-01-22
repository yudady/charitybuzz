$(function() {
	$("#tabs").tabs();

	$("#more-details a").click(function(){
		$("#more-details dl").toggle("slow");
		return false;
	});
	
	
	
});