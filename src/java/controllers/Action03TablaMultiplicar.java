package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action03TablaMultiplicar extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        DynaActionForm formulario = (DynaActionForm) form;

        String datonumero = formulario.get("numero").toString();
        int num = Integer.parseInt(datonumero);

        String html = "<table border='6'>";
        for (int i = 1; i < 11; i++) {
            html += "<tr>";
            html += "<td>" + num + "</td>";
            html += "<td>X</td>";
            html += "<td>" + i + "</td>";
            html += "<td>=</td>";
            html += "<td>" + (num * i) + "</td>";
            html += "</tr>";
        }
        html += "</table>";

        request.setAttribute("tabla", html);

        return mapping.getInputForward();
    }
}
