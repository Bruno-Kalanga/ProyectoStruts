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
        <h1>Menu Oficios</h1>
        <ul>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=presidente">
                    Presidente
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=vendedor">
                    Vendedores
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=empleado">
                    Empleados
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=analista">
                    Analistas
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=director">
                    Directores
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficio?oficio=informatico">
                    Informaticos
                </html:link>
            </li>
        </ul>
    </body>
</html>
