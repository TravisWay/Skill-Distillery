<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Winners</title>
</head>
<body>
Winners are

		
			<c:forEach var="Integer" items="${ballsy}">

  ${Integer}

</c:forEach>
	

			
	
</body>
</html>