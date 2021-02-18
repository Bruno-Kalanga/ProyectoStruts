package repositories;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Empleado;
import oracle.jdbc.OracleDriver;

//</editor-fold>
public class RepositoryEmpleados {

    private Connection getConection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Empleado> getEmpleados() throws SQLException {
        Connection cn = this.getConection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> listaempleados = new ArrayList<>();
        while (rs.next()) {
            int empno = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int dir = rs.getInt("DIR");
            String fecha = rs.getString("FECHA_ALT");
            int sal = rs.getInt("SALARIO");
            int com = rs.getInt("COMISION");
            int deptno = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(empno, ape, ofi, dir, fecha, sal,
                    com, deptno);
            listaempleados.add(emp);
        }
        rs.close();
        cn.close();
        return listaempleados;
    }

    public ArrayList<Empleado> getEmpleados(String oficio) throws SQLException {
        Connection cn = this.getConection();
        String sql = "select * from emp where lower(oficio) = lower(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, oficio);
        ResultSet rs = pst.executeQuery();
        ArrayList<Empleado> listaempleados = new ArrayList<>();
        while (rs.next()) {
            int empno = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int dir = rs.getInt("DIR");
            String fecha = rs.getString("FECHA_ALT");
            int sal = rs.getInt("SALARIO");
            int com = rs.getInt("COMISION");
            int deptno = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(empno, ape, ofi, dir, fecha, sal,
                    com, deptno);
            listaempleados.add(emp);
        }
        rs.close();
        cn.close();
        return listaempleados;
    }

    public ArrayList<String> getOficios() throws SQLException {
        Connection cn = this.getConection();
        String sql = "select distinct oficio from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> oficios = new ArrayList<>();
        while (rs.next()) {
            String ofi = rs.getString("OFICIO");
            oficios.add(ofi);
        }
        rs.close();
        cn.close();
        return oficios;
    }

    public ArrayList<String> getApellidos() throws SQLException {
        Connection cn = this.getConection();
        String sql = "select apellido from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> empleados = new ArrayList<>();
        while (rs.next()) {
            String ape = rs.getString("APELLIDO");
            empleados.add(ape);
        }
        rs.close();
        cn.close();
        return empleados;
    }

    public Empleado getEmpleado(String ape) throws SQLException {
        Connection cn = this.getConection();
        String sql = "select * from emp where lower(apellido) = lower(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, ape);
        ResultSet rs = pst.executeQuery();
        rs.next();
        int empno = rs.getInt("EMP_NO");
        String apellido = rs.getString("APELLIDO");
        String oficio = rs.getString("OFICIO");
        int dir = rs.getInt("DIR");
        String fecha = rs.getString("FECHA_ALT");
        int salario = rs.getInt("SALARIO");
        int comision = rs.getInt("COMISION");
        int deptno = rs.getInt("DEPT_NO");
        Empleado emp = new Empleado(empno, apellido, oficio, dir, fecha, salario, comision, deptno);
        rs.close();
        cn.close();
        return emp;
    }

    public Empleado getEmpleado(int numero) throws SQLException {
        Connection cn = this.getConection();
        String sql = "select * from emp where emp_no = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, numero);
        ResultSet rs = pst.executeQuery();
        rs.next();
        int empno = rs.getInt("EMP_NO");
        String apellido = rs.getString("APELLIDO");
        String oficio = rs.getString("OFICIO");
        int dir = rs.getInt("DIR");
        String fecha = rs.getString("FECHA_ALT");
        int salario = rs.getInt("SALARIO");
        int comision = rs.getInt("COMISION");
        int deptno = rs.getInt("DEPT_NO");
        Empleado emp = new Empleado(empno, apellido, oficio, dir, fecha, salario, comision, deptno);
        rs.close();
        cn.close();
        return emp;
    }

    public void subirSalario(String ape) throws SQLException {
        Connection cn = this.getConection();
        String sql = "update emp set salario = salario + 1 where lower(apellido) = lower(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, ape);
        pst.executeUpdate();
        cn.close();
    }

    public void subirSalario(int incremento, String oficio) throws SQLException {
        Connection cn = this.getConection();
        String sql = "update emp set salario = salario + ? where lower(oficio) = lower(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, incremento);
        pst.setString(2, oficio);
        pst.executeUpdate();
        cn.close();
    }

    public ArrayList<Empleado> getEmpleadosDepartamentos(String[] datos) throws SQLException {
        Connection cn = this.getConection();
        String deptnos = "";
        for (String d : datos) {
            deptnos += d + ",";
        }
        deptnos = deptnos.substring(0, deptnos.length() - 1);
        String sql = "select * from emp where dept_no in(" + deptnos + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int empno = rs.getInt("EMP_NO");
            String apellido = rs.getString("APELLIDO");
            String oficio = rs.getString("OFICIO");
            int dir = rs.getInt("DIR");
            String fecha = rs.getString("FECHA_ALT");
            int salario = rs.getInt("SALARIO");
            int comision = rs.getInt("COMISION");
            int deptno = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(empno, apellido, oficio, dir, fecha, salario, comision, deptno);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Empleado> getEmpleadosOficios(String[] datos) throws SQLException {
        Connection cn = this.getConection();
        String oficios = "";
        for (String d : datos) {
            oficios += "'" + d + "',";
        }
        oficios = oficios.substring(0, oficios.length() - 1);
        String sql = "select * from emp where oficio in(" + oficios + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int empno = rs.getInt("EMP_NO");
            String apellido = rs.getString("APELLIDO");
            String oficio = rs.getString("OFICIO");
            int dir = rs.getInt("DIR");
            String fecha = rs.getString("FECHA_ALT");
            int salario = rs.getInt("SALARIO");
            int comision = rs.getInt("COMISION");
            int deptno = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(empno, apellido, oficio, dir, fecha, salario, comision, deptno);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }
}
