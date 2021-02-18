package forms;

//<editor-fold defaultstate="collapsed" desc="Imports">
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
//</editor-fold>

public class Form20SeleccionMultipleOficios extends org.apache.struts.action.ActionForm {

    private String[] oficios;

    public String[] getOficios() {
        return oficios;
    }

    public void setOficios(String[] oficios) {
        this.oficios = oficios;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        return errors;
    }
}
