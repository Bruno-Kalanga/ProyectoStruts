package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryDepartamentos;

public class Action12MenuDinamicoDepartamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action12MenuDinamicoDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ArrayList<String> listadepts = this.repo.getNombresDepartamento();

        request.setAttribute("menudepartamentos", listadepts);
        return mapping.findForward("menudepartamentos");
    }
}
