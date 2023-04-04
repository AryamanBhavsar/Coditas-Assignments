<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>Result Page</h1>

<%




	        String a = request.getParameter("no1");
    		String b = request.getParameter("no2");

    		int c = Integer.parseInt(a);
    		int d = Integer.parseInt(b);

    		int sum = c+d;

    		String result = String.valueOf(sum);

    		out.println("<hr><h1>Sum is::"+result+"</h1>");

%>

<h2>Addition is:<%= result %></h2>
</body>
</html>
