function update() {
	var id = $("#txt_id").val();
	var chinese = $("#txt_chinese").val();
	var math = $("#txt_math").val();
	var english = $("#txt_english").val();
	var params = {
		"id" : id,
		"chinese" : chinese,
		"math" : math,
		"english" : english
	};
	$.get("/card/go_update", params, function(resp) {
		alert(resp);
		window.location.href = '/card/list';
	});
}
$(document).ready(function() {
	$("#btn_update").click(update);
});