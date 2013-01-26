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
		if (isBidderLogin()){
			$.log("login");
			
			var itemId = $("#bid_itemId").val();
			var currentBid = $("#bid_amount").val() ;
			if(currentBid == ""){
				alert(' 請先輸入金額');
				return;
			}
			
			var bid_minNextBid = $("#bid_minNextBid").val() || 0;
			if((parseInt(bid_minNextBid) - parseInt(bid_amount)) > 0){
				alert("not enough");
				return;
			}
			
			$.ajax({
				type: "POST",
				url: charitybuzz.getSafeUrl("bid"),
				data: {
					itemId : itemId,
					currentBid : currentBid
				},
				success: function(data){
					$.log(data);
					alert(data.msg);
				}
			});
		}else{
			//window.location.href = getSafeUrl("login/bidLogin");
			alert(charitybuzz.welcome);
			alert(' 請先登入');
		}
		
	});
	
	
	$("#watch").click(function(){
		var itemId = $("#bid_itemId").val() ;
		watch.item( itemId , {
			callback : function(data){
				alert(data);
			},
			errorHandler : function(){
				alert("We can't add those values!");
			}
		});
	});
});