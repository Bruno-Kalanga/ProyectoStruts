package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action07BuscarDepartamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action07BuscarDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.getString("id").toString();
        int id = Integer.parseInt(dato);
        String html = "";
        Departamento dept = this.repo.buscarDepartamento(id);

        if (dept != null) {
            html = "<h2> Numero : " + dept.getDeptno() + "</h2>";
            html += "<h1> Nombre : " + dept.getNombre() + "</h1>";
            html += "<h2> Localidad : " + dept.getLocalidad() + "</h2>";
        } else {
            html += "<h1 style='color:red'>No existe el departamento "
                    + dato + "</h1>";
        }

        request.setAttribute("dept", html);
        return mapping.findForward("buscardepartamentos");
    }
}
