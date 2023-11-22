<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function() {
		$("#button_submit").click(function() {

			$.ajax({
				url : "./AjaxServer3.jsp", // 요청할 서버 url
				type : "post", // 타입 get, post, put 등등
				data : $("#write_frm").serialize(),
				dataType : "json", // 데이터 타입 html, xml, json, text, 등등
				success : function(data) {
					// 결과 성공 콜백함수
					console.log(data);
					$("#result_name").text(data.name);
					$("#result_ph_number").text(data.ph_number);
					$("#result_address").text(data.address);
					
				},
			});
		});
	});
</script>
</head>
<body>
	<form id="write_frm">
		<table border="1" width="60%">
			<tr>
				<th>이름</th>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<th>번호</th>
				<td><input type="text" id="ph_number" name="ph_number"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" id="address" name="address"></td>
			</tr>
		</table>
		<input id="button_submit" type="button" value="제출">
	</form>

	<table border="1" width="60%">
		<tr>
			<th>[확인] 이름</th>
			<td style="width: 200px;"><span id="result_name"></span></td>
		</tr>
		<tr>
			<th>[확인] 번호</th>
			<td><span id="result_ph_number"></span></td>
		</tr>
		<th>[확인] 주소</th>
		<td><span id="result_address"></span></td>
	</table>
</body>
</html>