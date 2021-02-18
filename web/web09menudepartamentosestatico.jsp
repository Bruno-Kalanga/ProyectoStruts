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
        <h1>Menu esstatico de departamentos</h1>
        <ul>
            <li>
                <html:link action="/Action09DetallesDepartamento?deptno=10">
                    Contabilidad
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?deptno=20">
                    Investigacion
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?deptno=30">
                    Ventas
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?deptno=50">
                    Produccion
                </html:link>
            </li>
        </ul>
    </body>
</html>
