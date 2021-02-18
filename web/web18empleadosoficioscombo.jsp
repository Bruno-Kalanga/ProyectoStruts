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
        <h1>Empleados por Oficios</h1>
        <html:form action="/Action18EmpleadosOficiosCombo">
            <logic:present name="listaoficios">  
                <html:select property="oficio">
                    <logic:iterate name="listaoficios" id="oficio">
                        <html:option value="${oficio}">
                            <bean:write name="oficio"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                <button type="submit">
                    Detalles
                </button>           
            </logic:present>
            <hr/>
            <logic:present name="listaempleadosoficio">
                <bean:write name="listaempleadosoficio" filter="false"/>
                <br/>
                <br/>    
                <table border="4">
                    <tr>
                        <td>Incremento</td>
                        <td>
                            <html:text property="incremento"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button type="submit" style="width: 100%">
                                Incrementar
                            </button>
                        </td>
                    </tr>
                </table>
            </logic:present>
        </html:form>
    </body>
</html>
