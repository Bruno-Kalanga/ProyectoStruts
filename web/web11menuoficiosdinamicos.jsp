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
        <h1>Menu Dinamico</h1>
        <logic:present name="oficios">
            <ul>
                <logic:iterate name="oficios" id="ofi">
                    <li>
                        <html:link action="/Action10EmpleadosOficio" paramId="oficio"
                            paramName="ofi">
                            <bean:write name="ofi"/>
                        </html:link>
                    </li>
                </logic:iterate>
            </ul>
        </logic:present>
    </body>
</html>
