package models;
//<editor-fold defaultstate="collapsed" desc="Imports">

//</editor-fold>
public class Empleado {

    //<editor-fold defaultstate="collapsed" desc="Properties">
    private int empno;
    private String apellido;
    private String oficio;
    private int dir;
    private String fecha;
    private int salario;
    private int comision;
    private int deptno;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Empleado() {

    }

    public Empleado(int empno, String apellido, String oficio, int dir,
             String fecha, int salario, int comision, int deptno) {
        this.empno = empno;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.fecha = fecha;
        this.salario = salario;
        this.comision = comision;
        this.deptno = deptno;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    //</editor-fold>
}
