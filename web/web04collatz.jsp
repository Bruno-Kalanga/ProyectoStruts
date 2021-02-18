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
        <h1>Progresion Collatz</h1>
        <html:form action="Action04Collatz">
            <table border="1">
                <tr>
                    <td>Numero :</td>
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
        <logic:present name="collatz">
            <bean:write name="collatz" filter="false"/>
        </logic:present>
    </body>
</html>
