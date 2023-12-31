<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validate_form(form) {
		if (form.name.value == "") {
			alert("작성자를 입력하세요.");
			form.name.focus();
			return false;
		}
		if (form.title.value == "") {
			alert("제목을 입력하세요.");
			form.title.focus();
			return false;
		}
		if (form.content.value == "") {
			alert("내용을 입력하세요.");
			form.content.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form action="./edit.do" name="write_frm" method="post"
		enctype="multipart/form-data" onsubmit="return validate_form(this)">
		<input type="hidden" name="idx" value="${dto.idx }"> <input
			type="hidden" name="prev_ofile" value="${dto.ofile }"> <input
			type="hidden" name="prev_sfile" value="${dto.sfile }">
		<table border="1" width="90%">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="name" style="width: 150px;"
					value="${ dto.name } " /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" style="width: 90%;"
					value="${ dto.title }" /></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" style="width: 90%; height: 100px;">${ dto.content }</textarea>
				</td>
			</tr>
			<tr>
				<td>첨부 파일</td>
				<td><input type="file" name="ofile" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<button type="submit">수정하기</button>
					<button type="reset">Reset</button>
					<button type="button" onclick="location.href='./list.do'">목록가기</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>