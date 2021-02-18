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
        <h1>Eliminar Departamento</h1>
        <logic:present name="tabla">
            <bean:write name="tabla" filter="false"/>
        </logic:present>
        <hr/>
        <html:form action="Action13EliminarDepartamento">
            <table border="4">
                <tr>
                    <td colspan="2">
                        Departamento a eliminar 
                    </td>
                </tr>
                <tr>
                    <td>Numero :</td>
                    <td>
                        <html:text property="deptno"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" style="width:100%">
                            Eliminar
                        </button>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
