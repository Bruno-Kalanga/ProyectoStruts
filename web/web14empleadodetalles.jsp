<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detalles Empleado</h1>
        <logic:present name="empleado">
            <bean:write name="empleado" filter="false"/>
        </logic:present>
        <hr/>
        <html:link action="/Action14DetallesEmpleado" 
                   paramId="incrementar"
                   paramName="EMPLEADO"
                   paramProperty="apellido">
            Incrementar
        </html:link>
    </body>
</html>
