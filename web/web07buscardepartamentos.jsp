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
        <h1>Buscar Departamentos</h1>
        <html:form action="/Action07BuscarDepartamentos">
            <table border="4">
                <tr>
                    <td>Numero departamento</td>
                    <td><html:text property="id"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit">
                            Buscar
                        </button>
                    </td>
                </tr>
            </table>
        </html:form>
        <hr/>
        <logic:present name="dept">
            <bean:write name="dept" filter="false"/>
        </logic:present>
    </body>
</html>
