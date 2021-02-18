package controllers;

import beans.BeansDepartamentos;
import forms.Form08InsertarDepartamentos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryDepartamentos;

public class Action08InsertarDepartamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeansDepartamentos bean;

    public Action08InsertarDepartamentos() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeansDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form08InsertarDepartamentos formulario = (Form08InsertarDepartamentos) form;

        int deptno = formulario.getDeptno();
        String nom = formulario.getNombre();
        String loc = formulario.getLocalidad();
        this.repo.insertarDepartamento(deptno, nom, loc);

        String html = this.bean.getTablaDepartamentos();

        request.setAttribute("dept", html);
        return mapping.findForward("insertado");
    }
}
