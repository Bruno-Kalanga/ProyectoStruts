package controllers;

import beans.BeansDepartamentos;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action09DetallesDepartamento extends org.apache.struts.action.Action {

    BeansDepartamentos bean;

    public Action09DetallesDepartamento() {
        this.bean = new BeansDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("deptno");
        String dnom = request.getParameter("dnombre");
        String html = "";
        if (dato != null) {
            int deptno = Integer.parseInt(dato);
            html = this.bean.getDetallesDepartamento(deptno);
        } else if (dnom != null) {
            html = this.bean.getDetallesDepartamento(dnom);
        }
        request.setAttribute("detallesdepartamento", html);
        return mapping.findForward("detallesdepartamento");
    }
}
