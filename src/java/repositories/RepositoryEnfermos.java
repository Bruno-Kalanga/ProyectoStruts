package repositories;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Enfermo;
import oracle.jdbc.OracleDriver;

//</editor-fold>
public class RepositoryEnfermos {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Enfermo> getEnfermos() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Enfermo> listaenfermos = new ArrayList<>();
        while (rs.next()) {
            int ins = rs.getInt("INSCRIPCION");
            String ape = rs.getString("APELLIDO");
            String dir = rs.getString("DIRECCION");
            int nss = rs.getInt("NSS");
            Enfermo ill = new Enfermo(ins, ape, dir, nss);
            listaenfermos.add(ill);
        }
        rs.close();
        cn.close();
        return listaenfermos;
    }

    public void eliminarEnfermo(int ins) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "delete from enfermo where inscripcion = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, ins);
        pst.executeUpdate();
        cn.close();
    }
}
