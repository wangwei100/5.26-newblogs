function deletes() {
	var id = $("#txt_id").val();
	var params = {
		"id" : id
	};
	$.get("/card/go_delete", params, function(resp) {
		alert(resp);
		window.location.href = '/card/list';
	});
}
$(document).ready(function() {
	$("#btn_deletes").click(deletes);
});