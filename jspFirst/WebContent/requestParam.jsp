<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: gray">
<form action="./RequestParamResult.jsp" method="post">
	성별  : <input type="radio" name="gender" value="m">남성
	<input type="radio" name="gender" value="f">여성
	
	<br><br>
	
	관심사항 : <input type="checkbox" name="hobby" value="enco">경제
	<input type="checkbox" name="hobby" value="poly">정치
	<input type="checkbox" name="hobby" value="musi">문화
	
	<select name="job">
		<option value="student">학생</option>
		<option value="doctor">의사</option>
		<option value="teacher">선생님</option>
	</select>
	<input type="submit" value="전송">
</form>
</body>
</html>