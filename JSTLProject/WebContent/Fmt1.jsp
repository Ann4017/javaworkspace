<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="today" value="<%=new Date() %>"></c:set>
	full_both : <fmt:formatDate value="${today }" type="both" dateStyle="full" timeStyle="full" />
	<br>
	full_date : <fmt:formatDate value="${today }" type="date" timeStyle="full" />
	<br>
	full_time : <fmt:formatDate value="${today }" type="time" dateStyle="full" />
	
</body>
</html>