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
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=7948fa410b3a2b3fa6b908c43f5caf74&libraries=services"></script>
<script>
	function select_road_view(_this) {
		let addr = _this.textContent;
		console.log(addr);

		var geocoder = new kakao.maps.services.Geocoder();
		var position = null;

		geocoder.addressSearch(addr, function(result, status) {

			// 정상적으로 검색이 완료됐으면 
			if (status === kakao.maps.services.Status.OK) {
				position = new kakao.maps.LatLng(result[0].y, result[0].x);

				var roadviewContainer = document.getElementById('roadview'); //로드뷰를 표시할 div
				var roadview = new kakao.maps.Roadview(roadviewContainer); //로드뷰 객체
				var roadviewClient = new kakao.maps.RoadviewClient(); //좌표로부터 로드뷰 파노ID를 가져올 로드뷰 helper객체

				roadviewClient.getNearestPanoId(position, 50, function(panoId) {
					roadview.setPanoId(panoId, position); //panoId와 중심좌표를 통해 로드뷰 실행

				});

			}
		});
	}

	let url = "https://api.odcloud.kr/api/15052413/v1/uddi:816ab9e3-dafe-4701-839b-c0c4d53adffe_201902261655?page=1&perPage=10&serviceKey=afcT3VhbiojM0LplrhAMAcR5wycVlLG2bWLRHn2iczUfRuOluF0cj7l0sTVWErmGABGT7NLkU1HOW%2BUCxIqVrg%3D%3D";

	$.getJSON(url, function(data) {
		for (let i = 0; i < data.currentCount; i++) {
			let row = "<tr>" + "<td>" + data.data[i].약국명칭 + "</td>"

			+ "<td onclick='select_road_view(this)'>"
					+ data.data[i]["약국소재지(도로명)"] + "</td>" + "<td>"
					+ data.data[i].약국우편번호 + "</td>" + "<td>"
					+ data.data[i].약국전화번호 + "</td>" + "</tr>";
			console.log(data);
			$("table").append(row);
		}

	});
</script>
</head>
<body>

	<div id="roadview" style="width: 100%; height: 300px;"></div>

	<h1>서울시 광진구 약국 정보</h1>

	<table border="1" width="60%">
		<tr>
			<th>명칭</th>
			<th>소재지(도로명)</th>
			<th>우편번호</th>
			<th>전화번호</th>
		</tr>
	</table>

	<script type="text/javascript">
		var roadviewContainer = document.getElementById('roadview'); //로드뷰를 표시할 div
		var roadview = new kakao.maps.Roadview(roadviewContainer); //로드뷰 객체
		var roadviewClient = new kakao.maps.RoadviewClient(); //좌표로부터 로드뷰 파노ID를 가져올 로드뷰 helper객체

		var position = new kakao.maps.LatLng(33.450701, 126.570667);

		// 특정 위치의 좌표와 가까운 로드뷰의 panoId를 추출하여 로드뷰를 띄운다.
		roadviewClient.getNearestPanoId(position, 50, function(panoId) {
			roadview.setPanoId(panoId, position); //panoId와 중심좌표를 통해 로드뷰 실행
		});
	</script>

</body>

</html>