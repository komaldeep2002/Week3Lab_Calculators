<%-- 
    Document   : ageCalculator
    Created on : Sep 25, 2022, 8:25:57 PM
    Author     : Komaldeep Kaur Virk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
       
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            
            Enter your age: <input type="number" name="age" value=""><br>
            
            <input type="submit" value="Age next birthday">
            
        </form>  
        <p>${ageIntVal}</p>
        <p>${age1}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
