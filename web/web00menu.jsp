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
        <h1>Web Menu de Struts</h1>
        <ul>
            <li>
                <html:link href="web02sumarnumeros.jsp">
                    Sumar numeros
                </html:link>
            </li>
            <li>
                <html:link action="/Action06Departamentos">
                    Departamentos
                </html:link>
            </li>
            <li>
                <html:link href="web09menudepartamentosestatico.jsp">
                    Menu estatico
                </html:link>
            </li>
            <li>
                <html:link href="web10menuoficios.jsp">
                    Menu estatico
                </html:link>
            </li>
            <li>
                <html:link action="/Action11MenuOficiosDinamicos">
                    Menu dinamico oficios
                </html:link>
            </li>
            <li>
                <html:link action="/Action12MenuDinamicoDepartamentos">
                    Menu dinamico departamentos
                </html:link>
            </li>
            <li>
                <html:link action="/Action13EliminarDepartamento">
                    Eliminar Departamentos
                </html:link>
            </li>
            <li>
                <html:link action="/Action14ListaEmpleados">
                    Lista Empleados
                </html:link>
            </li>
        </ul>    
    </body>
</html>
