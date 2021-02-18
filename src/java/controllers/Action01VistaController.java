package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action01VistaController extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return return mapping.findForward(SUCCESS);
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //La informacion viene mediante un formulario de tipo DynaActionForm
        DynaActionForm formulario = (DynaActionForm) form;
        //En este formulario viene un atributo llamado respuesta
        String respuesta = formulario.get("respuesta").toString();
        int valor = Integer.parseInt(respuesta);
        if (valor == 4) {
            return mapping.findForward("respuestacorrecta");
        } else {
            return mapping.getInputForward();
        }

    }
}
