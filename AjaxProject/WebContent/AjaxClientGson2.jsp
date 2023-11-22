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
		$("#data_load").click(
				function() {

					$.ajax({
						url : "./ex02Gson", // 요청할 서버 url
						type : "get", // 타입 get, post, put 등등
						dataType : "json", // 데이터 타입 html, xml, json, text, 등등
						success : function(data) {
							// 결과 성공 콜백함수
							console.log(data);
							$("#tbody").empty()
							data.forEach(function(item) {
								let row = "<tr>" + "<td>" + item.email
										+ "</td>" + "<td>" + item.tel + "</td>"
										+ "<td>" + item.address + "</td>"
										+ "</tr>";

								$("#tbody").append(row);

							})
						},
					});
				});
	});
</script>
</head>
<body>

	<button id="data_load">데이터 가져오기</button>
	<table border="1">
		<thead>
			<tr>
				<td>이메일</td>
				<td>전화번호</td>
				<td>주소</td>
			</tr>

		</thead>
		<tbody id="tbody">
		</tbody>
	</table>

</body>
</html>