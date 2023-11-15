<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="common.Person"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<c:forEach begin="1" end="10" var="i" step="1"> --%>
	<%-- 		<p>${i }</p> --%>
	<%-- 	</c:forEach> --%>

	<%-- 	<c:forEach begin="5" end="10" var="i" varStatus="loop"> --%>
	<%-- 		<p>count : ${loop.count }</p> --%>
	<%-- 		<p>index : ${loop.index }</p> --%>
	<%-- 		<p>current : ${loop.current }</p> --%>
	<%-- 		<p>first : ${loop.first }</p> --%>
	<%-- 		<p>last : ${loop.last }</p> --%>
	<%-- 	</c:forEach> --%>


	<c:forEach begin="1" end="100" var="i" step="1">
		<c:if test="${i mod 2 ne 0 }">
			<c:set var="sum" value="${sum + i }"></c:set>
		</c:if>
	</c:forEach>
	<p>1 ~ 100 까지 정수 중 홀수의 합 : ${sum }</p>


	<%
		String[] rgba = { "red", "green", "blue", "pink" };
	%>

	<c:forEach items="<%=rgba%>" var="c">
		<span style="color: ${c }">${c }</span>
	</c:forEach>
	
	
	<%
		LinkedList<Person> lists = new LinkedList<>();
		lists.add(new Person("아무개1", 11));
		lists.add(new Person("아무개2", 22));
		lists.add(new Person("아무개3", 33));
		lists.add(new Person("아무개4", 44));
	%>
	<c:set var="lists" value="<%=lists %>"></c:set>
	<c:forEach items="${lists }" var="list">
		<p>이름 : ${list.name }, 나이 : ${list.age }</p>
	</c:forEach>
	
	
	<%
		Map<String, Person> maps = new HashMap<>();
		maps.put("1st", new Person("아무개1", 11));
		maps.put("2st", new Person("아무개2", 22));
		maps.put("3st", new Person("아무개3", 33));
	%>
	<c:set var="maps" value="<%=maps %>"></c:set>
	<c:forEach items="${maps}" var="map">
		<p>이름 : ${map.value.name }, 나이 : ${map.value.age }</p>
	</c:forEach>
	

</body>
</html>