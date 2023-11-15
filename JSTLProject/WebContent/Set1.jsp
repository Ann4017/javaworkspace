<%@page import="common.Person"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
</script>
<body>
	<!-- 변수 선언 (영역 객체 : pageContext)-->
	<c:set var="directVar" value="100"></c:set>
	<c:set var="expVar" value="<%= new Date() %>"></c:set>
	<c:set var="elVar" value="${directVar mod 5 }"></c:set>
	<c:set var="betweenVar">100</c:set>
	
	<p>directVar : ${pageScope.directVar }</p>
	<p>elVar : ${elVar }</p>
	
	<hr>
	
	<c:set var="personVar1" value='<%=new Person("이름", 55) %>' scope="request"></c:set>
	<p>${requestScope.personVar1.name }</p>
</body>
</html>