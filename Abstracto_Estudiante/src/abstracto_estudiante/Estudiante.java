package abstracto_estudiante;

public abstract class Estudiante {

    protected String codigo;
    protected String nombre;
    protected String cedula;
    protected int edad;

    public Estudiante(String codigo, String nombre, String cedula, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract double CalcularTotal();

}
