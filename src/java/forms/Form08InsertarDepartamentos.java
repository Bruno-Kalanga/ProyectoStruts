package forms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import repositories.RepositoryDepartamentos;

public class Form08InsertarDepartamentos extends org.apache.struts.action.ActionForm {

    private int deptno;
    private String nombre;
    private String localidad;
    RepositoryDepartamentos repo;

    public Form08InsertarDepartamentos() {
        super();
        this.repo = new RepositoryDepartamentos();
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        //Si errors esta vacio llegara hasta el action
        //Si tiene contenido no permite que la vista llegue al action
        if (getNombre() == null || getNombre().equals("")) {
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));
        } else if (getLocalidad() == null || getLocalidad().equals("")) {
            errors.add("localidad", new ActionMessage("error.localidad.obligatorio"));
        }

        int id = this.getDeptno();
        try {
            if (repo.buscarDepartamento(id) != null) {
                errors.add("deptno", new ActionMessage("error.deptno.existente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form08InsertarDepartamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return errors;
    }
}
