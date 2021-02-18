package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action11MenuOficiosDinamicos extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;

    public Action11MenuOficiosDinamicos() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //En el Action se deben cargar los objetos a mostrar
        ArrayList<String> oficios = this.repo.getOficios();
        request.setAttribute("oficios", oficios);
        return mapping.findForward("menuoficiosdinamicos");
    }
}
