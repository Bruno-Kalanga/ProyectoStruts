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
        <h1>Prueba PlugIn</h1>
        <table border="4">
            <thead>
                <tr>
                    <th>Numero</th>
                    <th>Nombre</th>
                    <th>Localidad</th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="listadepartamentos" id="departamento">
                    <tr>
                        <td>
                            <bean:write name="departamento" property="deptno"/>
                        </td>
                        <td>
                            <bean:write name="departamento" property="nombre"/>
                        </td>
                        <td>
                            <bean:write name="departamento" property="localidad"/>
                        </td>
                    </tr>
                </logic:iterate>
            </tbody>
        </table>
    </body>
</html>
