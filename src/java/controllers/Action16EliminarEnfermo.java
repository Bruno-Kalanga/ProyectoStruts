package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Enfermo;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEnfermos;

public class Action16EliminarEnfermo extends org.apache.struts.action.Action {

    RepositoryEnfermos repo;

    public Action16EliminarEnfermo() {
        this.repo = new RepositoryEnfermos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("inscripcion").toString();
        if (dato != null) {
            int ins = Integer.parseInt(dato);
            this.repo.eliminarEnfermo(ins);
        }
        ArrayList<Enfermo> listaenfermos = this.repo.getEnfermos();
        request.setAttribute("listaenfermos", listaenfermos);
        return mapping.findForward("web16eliminarenfermos");
    }
}
