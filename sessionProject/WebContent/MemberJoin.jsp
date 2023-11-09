<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validation_form(_form) {
		// 각 항목의 값 입력 유무 체크
		if (!_form.id.value) {
			alert("아이디를 입력하세요.")
			_form.id.focus();
			return false;
		} else if (!_form.pwd.value) {
			alert("비밀번호를 입력하세요.")
			_form.pwd.focus();
			return false;
		} else if(!_form.addr1.value) {
			alert("주소를 입력하세요.")
			_form.addr[0].focus();
			return false;
		}else if(!_form.addr2.value) {
			alert("나머지 주소를 입력하세요.")
			_form.addr[1].focus();
			return false;
		} else if(!_form.gender[0].checked && !_form.gender[1].checked) {
			alert("성별을 선택하세요.")
			return false;
		} else if(!_form.hobby[0].checked && !_form.hobby[1].checked && !_form.hobby[2].checked) {
			alert("취미를 선택하세요.")
			return false;
		} else if(!_form.phone1.value || !_form.phone2.value || !_form.phone3.value) {
			alert("핸드폰 번호를 입력하세요.")
			_form.phon1.focus();
		} else if (!_form.job.value) {
			alert("직업을 선택하세요.")
			_form.job.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form action="JoinProcess.jsp" onsubmit="return validation_form(this)">
		아이디 : <input name="id"><br>
		비밀번호 : <input type="password" name="pwd"><br>
		주소 :<input name="addr1" placeholder="주소"><br>
		<input name="addr2" placeholder="나머지 주소"><br>
		성별 : <input type="radio" name="gender" value="m">남자
		<input type="radio" name="gender" value="f">여자<br>
		취미 : <input type="checkbox" name="hobby" value="m">독서
		<input type="checkbox" name="hobby" value="m">운동
		<input type="checkbox" name="hobby" value="m">낚시<br>
		연락처 : <input name="phone1" value="010">-<input name="phone2">-<input name="phone3"><br>
		직업 : <select name="job">
		<option value="">--선택--</option>
		<option value="학생">--학생--</option>
		<option value="교사">--교사--</option>
		<option value="의사">--의사--</option>
		</select><br>
		자기소개 : <textarea placeholder="자기소개" name="content"></textarea><br>
		<input type="submit" value="회원가입"> <input type="reset" value="취소">
	</form>
</body>
</html>