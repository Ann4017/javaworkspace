<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 	<h4>국,영,수 점수를 입력하면 평균을 내어 학점 출력</h4>
<!--  	action 속성이 없다면 현재 페이지로 새로고침 -->
    <form>  <!-- 점수 입력 폼 -->
        국어 : <input type="text" name="kor" /> <br />
        영어 : <input type="text" name="eng" /> <br />
        수학 : <input type="text" name="math" /> <br />
        <input type="submit" value="학점 구하기" />
    </form>
    <c:if test="${not(empty param.kor or empty param.eng or empty param.math) }" >
   	 	<c:set var="avg" value="${(param.kor + param.eng + param.math) / 3}"></c:set>
   	 	<c:choose>
   	 		<c:when test="${avg >= 90 }">A 학점</c:when>
   	 		<c:when test="${avg >= 70 }">B 학점</c:when>
   	 		<c:when test="${avg >= 50 }">C 학점</c:when>
   	 		<c:otherwise>F 학점</c:otherwise>
   	 	</c:choose>
    </c:if>
    
</body>
</html>