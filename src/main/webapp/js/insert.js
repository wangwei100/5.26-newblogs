function insert() {
	var chinese = $("#txt_chinese").val();
	var math = $("#txt_math").val();
	var english = $("#txt_english").val();

	var params = {
		"chinese" : chinese,
		"math" : math,
		"english" : english
	};
	$.get("/card/do_insert", params, function(resp) {
		alert(resp);
		window.location.href = '/card/list';
	});
}

$(document).ready(function() {

	$("#btn_insert").click(insert);

});