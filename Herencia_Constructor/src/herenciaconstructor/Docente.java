package herenciaconstructor;

public class Docente {

    protected String cedula;
    protected String nombre;
    protected String profesion;
    protected int edad;
    
    public Docente(String cedula, String nombre, String profesion, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
