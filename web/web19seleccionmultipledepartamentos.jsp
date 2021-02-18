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
        <h1>Seleccion multiple departamentos</h1>
        <html:form action="/Action19SeleccionMultipleDepartamentos">
            <ul>
                <logic:iterate name="listadepartamentos" id="dept">
                    <li>
                        <html:multibox property="departamentos">
                            <bean:write name="dept" property="deptno"/>
                        </html:multibox>
                        <bean:write name="dept" property="nombre"/>
                    </li>
                </logic:iterate>
            </ul>
            <button type="submit">
                Mostrar
            </button>
        </html:form>
        <hr/>
        <logic:present name="listaempleados">
            <table border="4">
                <thead>
                    <tr>
                        <th>Apellido</th>
                        <th>Oficio</th>
                        <th>Salario</th>
                        <th>Departamento</th> 
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="listaempleados" id="emp">
                        <tr>
                            <td>
                                <bean:write name="emp" property="apellido"/>
                            </td>
                            <td>
                                <bean:write name="emp" property="oficio"/>
                            </td>
                            <td>
                                <bean:write name="emp" property="salario"/>
                            </td>
                            <td>
                                <bean:write name="emp" property="deptno"/>
                            </td>
                        </tr>
                    </logic:iterate>
                </tbody>
            </table>
        </logic:present>
    </body>
</html>
