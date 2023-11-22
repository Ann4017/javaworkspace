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
		$("#button_submit").on("click", function() {
		      $.ajax({
		          url: "./AjaxServer1.jsp", // 요청할 서버 url
		          type: "post", // 타입 get, post, put 등등
		          dataType: "json", // 데이터 타입 html, xml, json, text, 등등
		          success: function (data) {
		            // 결과 성공 콜백함수
		            console.log(data); // {nick_name: '홍길동', ph_number: '01011112222', address: '서울'}
		            $("#nick_name").text(data.nick_name);
		            $("#ph_number").text(data.ph_number);
		            $("#address").text(data.address);
		          },
		        });
		});
	});
</script>
</head>
<body>
	<input id="button_submit" type="button" value="제출">
	<p id="nick_name"></p>
	<p id="ph_number"></p>
	<p id="address"></p>
	
</body>
</html>