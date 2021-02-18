<%-- 
    Document   : web01pregunta
    Created on : 08-feb-2021, 17:09:55
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
        <h1>Pregunta</h1>
        <html:form action="/Action01VistaController">
            <p>
                Dos mas dos?
            </p>
            <html:text property="respuesta"/>
            <html:submit value="comprobacion"/>
        </html:form>
    </body>
</html>
