package ejercicio_docente_estudiante;

public class Docente {
    private String Cedula;
    private String Nombre;
    private String Profesion;
    //Métodos de la clase docente
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getProfesion() {
        return Profesion;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
}
