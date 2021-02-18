package models;
//<editor-fold defaultstate="collapsed" desc="Imports">

//</editor-fold>
public class Departamento {

    private int deptno;
    private String nombre;
    private String localidad;

    public Departamento() {

    }

    public Departamento(int num, String nom, String loc) {
        this.deptno = num;
        this.nombre = nom;
        this.localidad = loc;
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
}
