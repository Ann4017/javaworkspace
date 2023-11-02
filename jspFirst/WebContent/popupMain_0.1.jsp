<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	String popup_mode = "on";
	
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for(Cookie c : cookies) {
			String cookie_name = c.getName();
			String cookie_value = c.getValue();
			if(cookie_name.equals("popup_close")) {
				popup_mode = cookie_value;
			}
		}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    div#popup{
        position: absolute; top:100px; left:200px; color:yellow;  
        width:300px; height:100px; background-color:gray;
    }
    div#popup>div{
        position: relative; background-color:#ffffff; top:0px;
        border:1px solid gray; padding:10px; color:black;
    }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
$(function() {
    $('#close_btn').click(function() {
        $('#popup').hide();
        var chkVal = $("input:checkbox[id=inactive_today]:checked").val();
        $.ajax({
            url : './popupCookie.jsp',
            type : 'get',
            data : {inactive_today : chkVal},
            dataType : "text",
            success : function(resData) {
                if (resData != '') {
                	location.reload();
					console.log(resData);
                }
            }
        });
    });
});
</script>
</head>
<body>
	<h2>팝업 메인 페이지</h2>
	
	<% 
		for(int i = 0; i < 10; i++) {
			out.print("현재 팝업창 상태 : " + popup_mode + "<br>");
		}
	
		if (popup_mode.equals("on")) {
	%>

	<div id="popup">
		<h2 align="center">공지사항 팝업</h2>
		<div align="right">
			<form action="" name="pop_frm">
				<input type="checkbox" id="inactive_today" value="1">
				하루동안 열지 않음
				<input type="button" value="닫기" id="close_btn">
			</form>
		</div>
	</div>
	
	<% } %>
</body>
</html>