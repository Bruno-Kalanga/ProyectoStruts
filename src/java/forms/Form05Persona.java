package forms;
//<editor-fold defaultstate="collapsed" desc="Imports">

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
//</editor-fold>

public class Form05Persona extends org.apache.struts.action.ActionForm {

    private String nombre;
    private String email;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        //Si errors esta vacio llegara hasta el action
        //Si tiene contenido no permite que la vista llegueal action
        if (getNombre() == null || getNombre().equals("")) {
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));
        } else if (getEmail() == null || getEmail().equals("")) {
            errors.add("email", new ActionMessage("error.email.obligatorio"));
        } else if (getEdad() < 18) {
            errors.add("edad", new ActionMessage("error.edad.rango"));
        }
        return errors;
    }
}
