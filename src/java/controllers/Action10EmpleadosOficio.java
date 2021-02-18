package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Kuro
 */
public class Action10EmpleadosOficio extends org.apache.struts.action.Action {

    BeanEmpleados bean;

    public Action10EmpleadosOficio() {
        this.bean = new BeanEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String ofi = request.getParameter("oficio");
        String html = this.bean.getEmpleadosOficio(ofi);

        request.setAttribute("empleadosoficio", html);
        return mapping.findForward("empleadosoficio");
    }
}
