/**
 * all page init do
 */
;
function isBidderLogin(){
	var bool = ($('#logIn').contents().find("#logout").is(":visible")  == true);
	$.log('111111111111111');
	return bool ;
}
function getBidderId(){
	var val = $('#logIn').contents().find("#bidderId").val();
	return val ;
}




