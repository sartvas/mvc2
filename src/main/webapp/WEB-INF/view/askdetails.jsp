<%-- 
    Document   : askdetails
    Created on : 27 авг. 2021 г., 15:14:38
    Author     : sartv
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ask details</title>
    </head>
    <body>
        <h1>Dear, employee! Inter yor details, please!</h1>
<!--        <form action="showdetails" method="get">
            <input type="text" name="empoyeeName" placeholder="Write your name">
            <input type="submit">
        </form>-->

    <form:form action="showdetails" modelAttribute="employee">
        
        Name<form:input path="name"/>
        <br><br>
        Surname<form:input path="surname"/>
        <br><br>
        Salary<form:input path="salary"/>
        <br><br>
        Department
        <form:select path="department">
        <form:option value="IT" lable="IT"/>
        <form:option value="HR" lable="HR"/>      
        <form:option value="Sales" lable="HR"/> 
        </form:select>
        <br><br>
        Which cars do you want?
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>
        <input type="submit" value="ok">
        
    </form:form>
    </body>
</html>
