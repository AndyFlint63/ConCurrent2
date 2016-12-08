<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
}
</style>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Servlet example</title>
</head>
<body>

<div align"left" style="margin-left 50px;">

 The time is now <%= new java.util.Date() %>
 
</div>
 
    <div align="center" style="margin-top: 50px;">
    <p> First example of stateless factorization</p>
    <p> see page # for example </p>
    <p> now need to work out how to return to this page after calling Servlet</p>
 
        <form action="statelessfactorizer" method="get">
        <input type="submit" value="submit">
        </form>
        
        <%
    // This scriptlet declares and initializes "date"
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
%>

<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>

    </div>
 <button type="button" onClick="refreshPage()">Refresh Page</button>

<script>
function refreshPage(){
    window.location.reload();
} 
</script>
</body>
</html>