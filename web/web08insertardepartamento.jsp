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
        <h1>Insertar Departamento</h1>
        <html:form action="/Action08InsertarDepartamentos">
            <table border="5">
                <tr>
                    <td>Numero    :</td>
                    <td>
                    <html:text property="deptno"/>
                    <html:errors property="deptno"/>
                    </td>
                </tr>
                <tr>
                    <td>Nombre    :</td>
                    <td>
                    <html:text property="nombre"/>
                    <html:errors property="nombre"/>
                    </td>
                </tr>
                <tr>
                    <td>Localidad :</td>
                    <td>
                    <html:text property="localidad"/>
                    <html:errors property="localidad"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" style="width: 100%">
                            Insertar
                        </button>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
