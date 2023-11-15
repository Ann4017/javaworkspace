<%@page import="common.Person"%>
<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="num" value="100"></c:set>
	<c:set var="string" value="JSP"></c:set>

	<c:if test="${num mod 2 eq 0}" var="result">
		${num }는 짝수 입니다.
	</c:if>
	<br> result : ${result }
	<br>
	<c:if test="${string eq 'java'}" var="result2">
		문자열은 java 입니다
	</c:if>
	 <br>result : ${result2 }
	 
	 <br>
	 
	 <c:set var="num2" value="99"></c:set>
	 <c:choose>
	 	<c:when test="${num2 mod 2 eq 0}">${num2 }는 짝수 입니다.</c:when>
	 	<c:when test="${num2 mod 2 ne 0}">${num2 }는 홀수 입니다.</c:when>
	 	<c:otherwise>입력 오류 </c:otherwise>
	 </c:choose>
</body>
</html>