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
		$("#check").click(function() {
			if ($("#user_id").val() == 0) {
				$("#result").text("아이디를 입력하세요");
				return;
			}

			$.ajax({
				url : "./AjaxServerGson1.jsp", // 요청할 서버 url
				type : "post", // 타입 get, post, put 등등
				data : {
					user_id : $("#user_id").val()
				},
				dataType : "json", // 데이터 타입 html, xml, json, text, 등등
				success : function(data) {
					// 결과 성공 콜백함수
					$("#result").text(data.login_id + data.login_success);
				},
			});
		});
	});
</script>
</head>
<body>
	<input type="text" id="user_id">
	<button type="button" id="check">Check</button>
	<p id="result"></p>
</body>
</html>