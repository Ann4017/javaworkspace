<%@page import="common.Person"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Person> pList = new ArrayList<>();
		pList.add(new Person("홍길동", 55));
		pList.add(new Person("아무개", 60));
	%>

	<!-- set으로 이름 나이 출력 -->
	<c:set var="personVar1" value='<%=pList%>'></c:set>
	<p>personVar1 : ${personVar1[0].name  } : ${personVar1[0].age  }, ${personVar1[1].name  } : ${personVar1[1].age  }</p>

	<%
		Map<String, Person> pMap = new HashMap<>();
		pMap.put("personArgs1", new Person("홍길동2", 50));
		pMap.put("personArgs2", new Person("아무개2", 45));
	%>
	<c:set var="personVar2" value="<%=pMap%>" scope="request"></c:set>
	<p>personVar2 : ${requestScope.personVar2.personArgs1.name } : ${requestScope.personVar2.personArgs1.age }</p>
	<p>personVar2 : ${requestScope.personVar2.personArgs2.name } : ${requestScope.personVar2.personArgs2.age }</p>

	<c:remove var="personVar2" scope="request" /> <!-- 변수 삭제 -->
	<p>personVar2 : ${requestScope.personVar2.personArgs1.name } : ${requestScope.personVar2.personArgs1.age }</p>
	<p>personVar2 : ${requestScope.personVar2.personArgs2.name } : ${requestScope.personVar2.personArgs2.age }</p>
</body>
</html>