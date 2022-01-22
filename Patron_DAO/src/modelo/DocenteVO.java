package modelo;

public class DocenteVO {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private String apellido;

    //CONSTRUCTOR VACÍO PARA AÑADIR A LISTA
    public DocenteVO() {
        super();
    }

    //CONSTRUCTOR DE LA CLASE DocenteVO
    public DocenteVO(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellido();
    }
}
