package models;

public class Enfermo {

    private int inscripcion;
    private String apellido;
    private String direccion;
    private String fecha;
    private String sexo;
    private int nss;

    public Enfermo() {
    }

    public Enfermo(int ins, String ape, String dir, String fecha, String sexo, int nss) {
        this.apellido = ape;
        this.direccion = dir;
        this.fecha = fecha;
        this.inscripcion = ins;
        this.nss = nss;
        this.sexo = sexo;
    }

    public Enfermo(int ins, String ape, String dir, int nss) {
        this.apellido = ape;
        this.direccion = dir;
        this.inscripcion = ins;
        this.nss = nss;
    }

    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

}
