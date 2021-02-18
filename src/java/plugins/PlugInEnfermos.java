package plugins;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Enfermo;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEnfermos;

//</editor-fold>
public class PlugInEnfermos implements PlugIn {

    RepositoryEnfermos repo;

    public PlugInEnfermos() {
        this.repo = new RepositoryEnfermos();
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {

        try {
            ArrayList<Enfermo> listaenfermos = this.repo.getEnfermos();
            servlet.getServletContext().setAttribute("listaenfermos", listaenfermos);
        } catch (SQLException ex) {
            System.out.println("Excepcion SQL : " + ex);
            throw new ServletException(ex.toString());
        }

    }

}
