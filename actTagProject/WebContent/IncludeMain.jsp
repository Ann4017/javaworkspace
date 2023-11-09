<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String outer_path1 = "./inc/OuterPage1.jsp";
	String outer_path2 = "./inc/OuterPage2.jsp";

	pageContext.setAttribute("pAttr", "동명왕");
	request.setAttribute("rAttr", "온조왕");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<!-- 1. 컴파일 시 하나의 파일로 합쳐진다. -->
	<!-- 2. 경로 정보를 변수로 처리 불가 -->
	<%@ include file="./inc/OuterPage1.jsp"%>
	<p>
		외부 페이지 1에 선언한 변수 :
		<%=new_var1%></p>

	<!-- 1. 런타임 시 하나의 파일로 합쳐진다. -->
	<!-- 2. 경로 정보를 변수로 처리 가능. -->
	<jsp:include page="<%=outer_path2%>"></jsp:include>
	<jsp:include page="./inc/OuterPage2.jsp"></jsp:include>
	<p>
		외부 페이지 2에 선언한 변수 :
		<%-- <%= new_var2 %> --%>
	</p>
</body>
</html>