<%-- 
    Document   : web02sumarnumeros
    Created on : 08-feb-2021, 19:11:25
    Author     : Kuro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sumar numeros</h1>
        <html:form action="/Action02SumarNumeros">
            <label>Numero 1 :</label>
            <html:text property="num1"/>
            <br/>
            <label>Numero 2 :</label>
            <html:text property="num2"/>
            <br/>
            <button type="submit">
                Mostrar suma
            </button>
        </html:form>
        <hr/>    
        <logic:present name="suma">         
            <bean:write name="suma" filter="false"/> 
        </logic:present>   
    </body>
</html>
