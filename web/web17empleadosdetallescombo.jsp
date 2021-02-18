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
        <h1>Empleados detalles combo</h1>
        <html:form action="/Action17DetallesEmpleadosCombo">
            <label>Seleccione empleado</label>
            <html:select property="empno">
                <logic:iterate name="listaempleados" id="emp">
                    <html:option value="${emp.empno}">
                        <bean:write name="emp" property="apellido"/>
                    </html:option>
                </logic:iterate>
            </html:select>
            <button type="submit">
                Detalles
            </button>
        </html:form>
        <hr/>
        <logic:present name="empleado">
            <h1 style="color:blueviolet">
                <bean:write name="empleado" property="empno"/>
                <bean:write name="empleado" property="apellido"/>
                <bean:write name="empleado" property="oficio"/>
            </h1>
        </logic:present>
    </body>
</html>
