package beans;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Departamento;
import repositories.RepositoryDepartamentos;

public class BeansDepartamentos {
    //Hemos repetido varias veces la tabla departamentos
    //Llamada desde varios action y siendo presentaciones estaticas
    //Es mas efectivo con una clase especifica

    RepositoryDepartamentos repo;

    public BeansDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    public String getTablaDepartamentos() throws SQLException {
        ArrayList<Departamento> lista = this.repo.getDepartamentos();

        String html = "<table border='5'>";
        html += "<tr><td>Numero</td><td>Nombre</td><td>Localidad</td></tr>";
        for (Departamento d : lista) {
            html += "<tr>";
            html += "<td>" + d.getDeptno() + "</td>";
            html += "<td>" + d.getNombre() + "</td>";
            html += "<td>" + d.getLocalidad() + "</td>";
            html += "</tr>";
        }
        html += "</table>";

        return html;
    }

    public String getDetallesDepartamento(int deptno) throws SQLException {
        Departamento dept
                = this.repo.buscarDepartamento(deptno);

        String html = "<h1>Nombre : " + dept.getNombre() + "</h1>";
        html += "<h2>Localidad : " + dept.getLocalidad() + "</h2>";
        html += "<h3>Numero : " + dept.getDeptno() + "</h3>";

        return html;
    }

    public String getDetallesDepartamento(String dnom) throws SQLException {
        Departamento dept
                = this.repo.buscarDepartamento(dnom);

        String html = "<h1>Nombre : " + dept.getNombre() + "</h1>";
        html += "<h2>Localidad : " + dept.getLocalidad() + "</h2>";
        html += "<h3>Numero : " + dept.getDeptno() + "</h3>";

        return html;
    }
}
