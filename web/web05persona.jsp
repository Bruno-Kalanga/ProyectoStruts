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
        <h1>Action Form Persona</h1>
            <html:form action="/Action05Persona">
                <table border="1">
                <tr>
                    <td>Nombre :</td>
                    <td><html:text property="nombre"/>
                    <span style="color:red">
                        <html:errors property="nombre"/>
                    </span>
                    </td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td><html:text property="email"/>
                        <html:errors property="email"/>
                    </td>
                </tr>
                <tr>
                    <td>Edad :</td>
                    <td><html:text property="edad"/>
                        <html:errors property="edad"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" style="width: 100%">
                            Send
                        </button> 
                    </td>
                </tr>
            </table>          
            </html:form>
            <hr/>
            <logic:present name="datospersona">
                <bean:write name="datospersona" filter="false"/>
            </logic:present>
    </body>
</html>
