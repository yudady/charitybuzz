$(function() {
	$("#tabs").tabs();

	$("#more-details a").click(function(){
		$("#more-details dl").toggle("slow");
		return false;
	});
	
	$("#link-currency").click(function(){
		$("#popup-currency").toggle();
		return false;
	});
	
	$("#closingTimePopDialog").dialog({
		autoOpen : false,
	});
	$("#closingTimePop").click(function() {
		$("#closingTimePopDialog").dialog("open");
		return false;
	});
	
	$("#maxBidAndBidIncrementsPopDialog").dialog({
		autoOpen : false,
	});
	$("#maxBidAndBidIncrementsPop").click(function() {
		$("#maxBidAndBidIncrementsPopDialog").dialog("open");
		return false;
	});
	

});