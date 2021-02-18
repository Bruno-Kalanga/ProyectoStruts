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
        <h1>Tabla Multiplicar</h1>
        <html:form action="Action03TablaMultiplicar">
            <table border="1">
                <tr>
                    <td>Numero de tabla   :</td>
                    <td><html:text property="numero"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" style="width: 100%">
                            Mostrar
                        </button> 
                    </td>
                </tr>
            </table>        
            <br/>           
        </html:form>
        <hr/>
        <logic:present name="tabla">
            <bean:write name="tabla" filter="false"/>
        </logic:present>
    </body>
</html>
