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
	

	
	/**
	 * bidding
	 */
	$("#bid_submit").click(function(){
		if ($('#logIn').contents().find("#logout").is(":visible") == true){
			$.log("login");
			
			var bid_articleId = $("#bid_articleId").val();
			var bid_amount = $("#bid_amount").val() || 0;
			var bid_minNextBid = $("#bid_minNextBid").val() || 0;
			if((parseInt(bid_minNextBid) - parseInt(bid_amount)) > 0){
				alert("not enough");
				return;
			}
			
			$.ajax({
				type: "POST",
				url: getSafeUrl("bid"),
				data: {
					articleId : bid_articleId,
					amount : bid_amount
				},
				success: function(data){
					alert("bid ok");
				}
			});
		}else{
			window.location.href = getSafeUrl("login/bidLogin");
		}
		
	});
	
});