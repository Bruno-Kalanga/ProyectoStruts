package plugins;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Empleado;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEmpleados;

//</editor-fold>
public class PlugInEmpleadosOficiosCombo implements PlugIn {

    RepositoryEmpleados repo;

    public PlugInEmpleadosOficiosCombo() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<String> listaoficios = this.repo.getOficios();
            servlet.getServletContext().setAttribute("listaoficios", listaoficios);
        } catch (SQLException ex) {
            System.out.println("Error : " + ex);
            throw new ServletException("Error SQL " + ex);
        }
    }

}
