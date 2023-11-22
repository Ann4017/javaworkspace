<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>서울시 광진구 약국</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- 지도를 표시할 div 입니다 -->
	<div id="map" style="width: 100%; height: 350px"></div>
	
	<h1>서울시 광진구 약국 정보</h1>
	
	<table border="1" width="60%">
		<tr>
			<th>명칭</th>
			<th>소재지(도로명)</th>
			<th>우편번호</th>
			<th>전화번호</th>
		</tr>
	</table>

	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=7948fa410b3a2b3fa6b908c43f5caf74"></script>
	<script>
		var mapContainer = document.getElementById("map"), // 지도를 표시할 div
		mapOption = {
			center : new kakao.maps.LatLng(37.4979291, 127.0279084), // 지도의 중심좌표
			level : 3, // 지도의 확대 레벨
		};

		// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
		var map = new kakao.maps.Map(mapContainer, mapOption);

		let url = "https://api.odcloud.kr/api/15052413/v1/uddi:816ab9e3-dafe-4701-839b-c0c4d53adffe_201902261655?page=1&perPage=10&serviceKey=afcT3VhbiojM0LplrhAMAcR5wycVlLG2bWLRHn2iczUfRuOluF0cj7l0sTVWErmGABGT7NLkU1HOW%2BUCxIqVrg%3D%3D";
		
		$.getJSON(url, function (data) {
			for(let i = 0; i < data.currentCount; i++) {
				let row = "<tr>" + 
							"<td>" + data.data[i].약국명칭 + "</td>" +
							"<td>" + data.data[i]["약국소재지(도로명)"] + "</td>" +
							"<td>" + data.data[i].약국우편번호 + "</td>" +
							"<td>" + data.data[i].약국전화번호 + "</td>" +
							"</tr>";
							console.log(data);
							$("table").append(row);
			}
		});
		

	</script>
</body>
</html>