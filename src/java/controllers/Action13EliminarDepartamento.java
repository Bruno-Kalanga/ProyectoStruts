package controllers;

import beans.BeansDepartamentos;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action13EliminarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeansDepartamentos bean;

    public Action13EliminarDepartamento() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeansDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("deptno").toString();

        if (dato.length() > 0) {
            int deptno = Integer.parseInt(dato);
            this.repo.eliminarDepartamento(deptno);
        }

        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabla", html);
        return mapping.findForward("web13eliminar");
    }
}
