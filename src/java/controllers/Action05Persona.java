/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import forms.Form05Persona;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action05Persona extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Form05Persona formulario = (Form05Persona) form;
        String nombre = formulario.getNombre();
        String email = formulario.getEmail();
        int edad = formulario.getEdad();
        String html = "<h1 style='color:blue'>Su nombre es " + nombre + "</h1>";
        html += "<h2> Su email es " + email + "</h2>";
        html += "<h3> Su edad es " + edad + "</h3>";

        request.setAttribute("datospersona", html);

        return mapping.getInputForward();
    }
}
