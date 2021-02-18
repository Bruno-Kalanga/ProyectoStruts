package controllers;

import beans.BeansDepartamentos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action06Departamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeansDepartamentos bean;

    public Action06Departamentos() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeansDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String html = this.bean.getTablaDepartamentos();

        request.setAttribute("dept", html);
        return mapping.getInputForward();
    }
}
