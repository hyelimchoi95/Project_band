<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<hr width="90%" color="green">
	<h3>	<a href="<%=request.getContextPath()%>/bandlist.do">홈으로</a></h3>
	<hr width="90%" color="green">
		<c:set var="list" value="${bandlist }"></c:set>
			<a href="<%=request.getContextPath() %>/bandlistadd.do">밴드 리스츠 추가 </a>
			
			<br><br>
		<table>
		<c:if test="${!empty list }">
		 
		 <c:forEach items="${list }" var="i">
				<tr>
					<td>${i.getBandcode() } </td>
					<td>${i.getBandname() } </td>
					<td>${i.getIntro() } </td>
				</tr>
						  
		</c:forEach>
		</c:if>
		
		<c:if test="${empty list }">
		<tr>
					<td>현재 가입하신 밴드가 없습니다.</td>
					
		</tr>
		</c:if>
		</table>
		
		</div>
</body>
</html>