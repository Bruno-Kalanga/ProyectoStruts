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
        <h1>Departamentos</h1>
        <html:form action="Action06Departamentos">
            <button type="submit">
                Mostrar
            </button>
        </html:form>
        <hr/>
        <logic:present name="dept">
            <bean:write name="dept" filter="false"/>
        </logic:present>
    </body>
</html>
