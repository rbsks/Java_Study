<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<html>
<head>
<title>산정보</title>
<meta charset="utf-8">
<style type="text/css">

html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}
</style>
</head>

<body>
	<form id="xml">
		<input type="text" class="form-control form-join" id="address" name="address">
	</form>
	<button name="subject" class="btn button-success" id="btn-mapchange" value="trans">산 정보</button>
	<table>
		<td id="jsontest">
			
		</td>
	</table>
	<script>
		$("#btn-mapchange").click(function(){
			let adress_text = $("#address").val();
			let xml = $("#xml").serialize();
			
			$.ajax({
				url : "./xmltest",
				type : "POST",
				data : xml,
				dataType :"text",
				success : function(retVal){
					$("#jsontest").html(retVal);
					let jsonn = JSON.parse(retVal);
					console.log(jsonn.response.body.items.item.mntnattchimageseq);
					console.log(jsonn.response.body.items.item.crcmrsghtngetcimageseq);
					console.log(jsonn.response.body.items.item.crcmrsghtnginfodscrt);
					console.log(jsonn.response.body.items.item.crcmrsghtnginfoetcdscrt);
					console.log(jsonn.response.body.items.item.pbtrninfodscrt);
					console.log(jsonn.response.body.items.item.mntninfodtlinfocont);
				},
				error : function(retVal){
					alert("error");
				}
					
			});
		});
	</script>
</body>
</html>
