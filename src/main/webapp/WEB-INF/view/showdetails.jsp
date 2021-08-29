
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ask details</title>
    </head>
    <body>
        <h1>Dear, ${employee.name} ${employee.surname}, your welcome in department 
            ${employee.department}!</h1>
        <h2>Now your salary is ${employee.salary}!</h2>
        <h2>Good choice, your car is ${employee.carBrand}! Work hard!</h2>
        <h2>Now we will speak with you on:
            <ul>
                <c:forEach var="langs" items="${employee.langs}">
                    <li>${langs}</li>
                </c:forEach>
            </ul>
            
        </form>
    </body>
</html>
