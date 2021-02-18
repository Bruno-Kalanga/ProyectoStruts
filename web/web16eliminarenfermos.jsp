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
        <h1>Eliminar Enfermos</h1>
        <logic:present name="listaenfermos">
            <table border="5">
                <thead>
                    <tr>
                        <th>Inscripcion</th>
                        <th>Apellido</th>
                        <th>Direccion</th>
                        <th>NSS</th>
                    </tr>
                </thead>
                <tbody>
                <logic:iterate name="listaenfermos" id="enfermo">
                    <tr>
                        <td>
                            <bean:write name="enfermo" property="inscripcion"/>
                        </td>
                        <td>
                            <bean:write name="enfermo" property="apellido"/>
                        </td>
                        <td>
                            <bean:write name="enfermo" property="direccion"/>
                        </td>
                        <td>
                            <bean:write name="enfermo" property="nss"/>
                        </td>
                    </tr>
                </logic:iterate>
                </tbody>
            </table>
        </logic:present>
        <hr/>
        <html:form action="Action16EliminarEnfermo">
            <table border="4">
                <tr>
                    <td colspan="2">
                        Enfermo a eliminar 
                    </td>
                </tr>
                <tr>
                    <td>Numero inscripcion:</td>
                    <td>
                        <html:text property="inscripcion"/>
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
