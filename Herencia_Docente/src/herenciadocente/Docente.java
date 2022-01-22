package herenciadocente;

public class Docente {

    //Las superclase no pueden ser instanciadas y los atributos deben estar protegidos
    
    protected String cedula;
    protected String nombre;
    protected String profesion;
    protected int edad;
    
    //Métodos set y get

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
