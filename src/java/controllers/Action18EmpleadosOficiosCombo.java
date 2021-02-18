package controllers;

import beans.BeanEmpleados;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEmpleados;

public class Action18EmpleadosOficiosCombo extends org.apache.struts.action.Action {

    BeanEmpleados bean;
    RepositoryEmpleados repo;

    public Action18EmpleadosOficiosCombo() {
        this.bean = new BeanEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;

        String oficio = formulario.get("oficio").toString();
        String dato = formulario.get("incremento").toString();

        if (dato != null) {
            if (dato.length() != 0) {
                int incremento = Integer.parseInt(dato);
                this.repo.subirSalario(incremento, oficio);
            }
        }

        String html = this.bean.getEmpleadosOficio(oficio);
        ArrayList<String> listaoficios = this.repo.getOficios();
        request.setAttribute("listaoficios", listaoficios);
        request.setAttribute("listaempleadosoficio", html);
        return mapping.findForward("web18empleadosoficioscombo");
    }
}
