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
		if (charitybuzz.isBidderLogin()){
			$.log("login");
			
			var itemId = $("#bid_itemId").val();
			var currentBid = $("#bid_amount").val() ;
			if(currentBid == ""){
				charitybuzz.openAlertDialog(charitybuzz.itemNoMoney);
				return;
			}
			
			var bid_minNextBid = $("#bid_minNextBid").val() || 0;
			if((parseInt(bid_minNextBid) - parseInt(bid_amount)) > 0){
				charitybuzz.openAlertDialog("not enough");
				return;
			}
			
			$.ajax({
				type: "POST",
				dataType :"json",
				url: charitybuzz.getSafeUrl("bid"),
				data: {
					itemId : itemId,
					currentBid : currentBid
				},
				success: function(data){
					$.log(data);
					if(!data.errorCode){
						window.location.href = window.location.href;
					}
				}
			});
		}else{
			charitybuzz.openAlertDialog(charitybuzz.itemNoLogin);
		}
		
	});
	
	$("#watch").click(function(){
		
		
		var bidderId = charitybuzz.getBidderId();
		if(!bidderId){
			charitybuzz.openAlertDialog(charitybuzz.itemNoLogin);
			return ;
		}
		
		
		var itemId = $("#bid_itemId").val() ;
		var watchStatus = "";
		
		if ($("#watchBox").prop("checked")){
			watchStatus = "0";
			$("#watchBox").prop("checked", false);
		}else{
			$("#watchBox").prop("checked", true);
			watchStatus = "1";
		}
		
		watch.item( itemId , watchStatus , {
			callback : function(data){
				$.log(data);
			},
			errorHandler : function(){
				charitybuzz.openAlertDialog("We can't add those values!");
			}
		});
	});
	
});