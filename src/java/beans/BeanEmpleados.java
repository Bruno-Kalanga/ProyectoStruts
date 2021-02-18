package beans;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.SQLException;
import java.util.ArrayList;
import models.Empleado;
import repositories.RepositoryEmpleados;

//</editor-fold>
public class BeanEmpleados {

    RepositoryEmpleados repo;

    public BeanEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    public String getEmpleadosOficio(String oficio) throws SQLException {
        ArrayList<Empleado> listaempleados = this.repo.getEmpleados(oficio);
        String html;
        if (!listaempleados.isEmpty()) {
            html = "<table border='5'>";
            html += "<thead>";
            html += "<tr><th>Numero Emp</th><th>Apellido</th><th>Salario</th>";
            html += "</thead>";
            html += "<tbody>";
            for (Empleado e : listaempleados) {
                html += "<tr>";
                html += "<td>" + e.getEmpno() + "</td>";
                html += "<td>" + e.getApellido() + "</td>";
                html += "<td>" + e.getSalario() + "</td>";
                html += "</tr>";
            }
            html += "</tbody>";
            html += "</table>";
        } else {
            html = "<h1 style='color:red'>";
            html += "El oficio " + oficio + " no existe";
            html += "</h1>";
        }
        return html;
    }

    public String getDetallesEmpeado(String ape) throws SQLException {
        Empleado emp = this.repo.getEmpleado(ape);
        String html = "<table border='8'>";
        html += "<thead>";
        html += "<tr><th colspan='2'>Empleado : " + emp.getApellido() + "</th></tr>";
        html += "<thead>";
        html += "<tbody>";
        html += "<tr><td>Numero : </td><td>" + emp.getEmpno() + "</td></tr>";
        html += "<tr><td>Oficio : </td><td>" + emp.getOficio() + "</td></tr>";
        html += "<tr><td>Salario : </td><td>" + emp.getSalario() + "</td></tr>";
        html += "<tr><td>Fecha Alta : </td><td>" + emp.getFecha() + "</td></tr>";
        html += "</tbody>";
        html += "</table>";
        return html;
    }
}
