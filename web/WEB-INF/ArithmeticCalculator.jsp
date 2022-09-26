<%-- 
    Document   : ArithmeticCalculator
    Created on : Sep 25, 2022, 9:29:08 PM
    Author     : Komaldeep Kaur Virk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first" value="" name="first" id="fist"> <br>
            Second: <input type="number" name="second" id="first" value=""><br>
            <input type="submit" value="+" name="calc">
            <input type="submit" value="-" name="calc">
            <input type="submit" value="*" name="calc">
            <input type="submit" value="%" name="calc">
        </form>
        <p> Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
