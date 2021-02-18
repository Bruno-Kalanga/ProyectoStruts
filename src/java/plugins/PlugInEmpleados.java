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
public class PlugInEmpleados implements PlugIn {

    RepositoryEmpleados repo;

    public PlugInEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<Empleado> empleados = this.repo.getEmpleados();
            servlet.getServletContext().setAttribute("listaempleados", empleados);
        } catch (SQLException ex) {
            System.out.println("Error : " + ex);
            throw new ServletException("Error SQL " + ex);
        }
    }

}
