<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="common.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="	text/javascript">
</script>
</head>
<body>
	<h2>List 컬렉션</h2>
	<%
		List<Object> aList = new ArrayList<>();
		aList.add("청해진");
		aList.add(new Person("장보고", 28));
		pageContext.setAttribute("Ocean", aList);
	%>

	<ul>
		<li>${Ocean.get(0) }</li>
		<li>${Ocean[1].name }${Ocean[1].age }</li>
		<li></li>
	</ul>

	<h2>Map 컬렉션</h2>

	<%
		Map<String, String> map = new HashMap<>();
		map.put("한글", "훈민정음");
		map.put("eng", "english");
		pageContext.setAttribute("king", map);
		
	%>

	<ul>
		<li>${king.get("한글") }</li>
		<li>${king["한글"] }</li>
		<li>${king.eng }</li>
	</ul>


</body>
</html>