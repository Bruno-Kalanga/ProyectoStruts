package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14ListaEmpleados extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;

    public Action14ListaEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList<String> empleados = this.repo.getApellidos();
        request.setAttribute("empleados", empleados);
        return mapping.findForward("listaempleados");
    }
}
