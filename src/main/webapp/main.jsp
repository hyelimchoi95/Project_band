<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		
		<hr width="50%" color ="blue">
		<h3>로그인 성공 ... 밴드 리스트 보여주기 id를 가지고  id=1234</h3>
		<hr width="50%" color ="blue">
		
		<form action="<%=request.getContextPath() %>/bandlist.do" method="post">
			<table>
             	<tr>
             		<th>아이디</th>
             		<td> <input name="userId" > </td>
             	</tr>
             	<tr>
             		<th>비번</th>
             		<td> <input type="password" name="userpwd"> </td>
             	</tr>
             	</table> 
             	
             	<div id="aIndex_menu">
             		<input type="submit" value="로그인">
             		<input type="reset" value="취소">
             	</div> 
		</form>
		
	</div>
</body>
</html>