package repositories;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Departamento;
import oracle.jdbc.OracleDriver;

//</editor-fold>
public class RepositoryDepartamentos {

    private Connection getConection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Departamento> getDepartamentos() throws SQLException {

        Connection cn = this.getConection();
        String sql = "select * from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Departamento> lista = new ArrayList<>();
        while (rs.next()) {
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento();
            dept.setDeptno(num);
            dept.setNombre(nom);
            dept.setLocalidad(loc);
            lista.add(dept);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public Departamento buscarDepartamento(int iddept) throws SQLException {

        Connection cn = this.getConection();
        String sql = "select * from dept where dept_no = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, iddept);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(num, nom, loc);
            rs.close();
            cn.close();
            return dept;
        } else {
            rs.close();
            cn.close();
            return null;
        }
    }

    public Departamento buscarDepartamento(String dnom) throws SQLException {

        Connection cn = this.getConection();
        String sql = "select * from dept where lower(dnombre) = lower(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, dnom);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(num, nom, loc);
            rs.close();
            cn.close();
            return dept;
        } else {
            rs.close();
            cn.close();
            return null;
        }
    }

    public void insertarDepartamento(int deptno, String nombre, String loc) throws SQLException {

        Connection cn = this.getConection();
        String sql = "insert into dept values (?,?,?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, deptno);
        pst.setString(2, nombre);
        pst.setString(3, loc);
        pst.executeUpdate();
        cn.close();
    }

    public ArrayList<String> getNombresDepartamento() throws SQLException {
        Connection cn = this.getConection();
        String sql = "select distinct dnombre from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> listadepts = new ArrayList<>();
        while (rs.next()) {
            String dnom = rs.getString("DNOMBRE");
            listadepts.add(dnom);
        }
        return listadepts;
    }

    public void eliminarDepartamento(int deptno) throws SQLException {
        Connection cn = this.getConection();
        String sql = "delete from dept where dept_no = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, deptno);
        pst.executeUpdate();
        cn.close();
    }
}
