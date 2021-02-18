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
        <h1>Lista Empleados</h1>
        <logic:present name="empleados">
            <ul>
                <logic:iterate name="empleados" id="ape">
                    <li>
                        <html:link action="/Action14DetallesEmpleado" paramId="empleados"
                            paramName="ape">
                            <bean:write name="ape"/>
                        </html:link>
                    </li>
                </logic:iterate>
            </ul>
        </logic:present>
    </body>
</html>
