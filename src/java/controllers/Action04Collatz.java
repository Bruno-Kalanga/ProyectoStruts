/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

/**
 *
 * @author Kuro
 */
public class Action04Collatz extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("numero").toString();
        int num = Integer.parseInt(dato);
        String html = "<ul>";
        html += "<li>" + num + "</li>";

        while (num != 1) {
            if (num % 2 == 0) {
                num = (num / 2);
            } else {
                num = ((num * 3) + 1);
            }
            html += "<li>" + num + "</li>";
        }

        html += "</ul>";

        request.setAttribute("collatz", html);
        return mapping.getInputForward();
    }
}
