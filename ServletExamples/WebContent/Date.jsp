<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Date date = new Date();


%>
Today's Date <%=date%>

<%
out.println( String.valueOf( date ));
out.println( "<BR>Your machine's address is " );
out.println( request.getRemoteHost());

%>
<Br>
<%@ include file="hello.jsp" %>
</body>
</html>