package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14DetallesEmpleado extends org.apache.struts.action.Action {

    BeanEmpleados bean;
    RepositoryEmpleados repo;

    public Action14DetallesEmpleado() {
        this.bean = new BeanEmpleados();
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String ape = request.getParameter("empleados");
        String incrementar = request.getParameter("incrementar");
        String apellido;
        if (incrementar != null) {
            if (!incrementar.isEmpty()) {
                this.repo.subirSalario(incrementar);
            }
            apellido = incrementar;
        } else {
            apellido = ape;
        }
        String html = this.bean.getDetallesEmpeado(apellido);
        Empleado empleado = this.repo.getEmpleado(apellido);
        request.setAttribute("EMPLEADO", empleado);
        request.setAttribute("empleado", html);
        return mapping.findForward("detallesempleado");
    }
}
