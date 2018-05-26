function insert() {
	var chinese = $("#txt_chinese").val();
	var math = $("#txt_math").val();
	var english = $("#txt_english").val();

	var params = {
		"chinese" : chinese,
		"math" : math,
		"english" : english
	};
	$.get("/card/insert", params, function(resp) {
		alert(resp);
	});
}

$(document).ready(function() {

	$("#btn_insert").click(insert);

});