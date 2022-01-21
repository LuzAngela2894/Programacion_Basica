package modelo;

public class EstudianteVO {

    private String nombres;
    private String apellidos;
    private String cinstitucional;

    //CONSTRUCTOR VACÍO PARA AÑADIR A LA LISTA
    public EstudianteVO() {
    }

    //CONSTRUCTOR DE EstudianteVO PARA GENERAR OBJETO
    public EstudianteVO(String nombres, String apellidos, String cinstitucional) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cinstitucional = cinstitucional;
    }

    //GETTERS & SETTERS
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCinstitucional() {
        return cinstitucional;
    }

    public void setCinstitucional(String cinstitucional) {
        this.cinstitucional = cinstitucional;
    }

    @Override
    public String toString() {
        return this.getNombres() + " " + this.getApellidos() + " " + this.getCinstitucional();
    }
}
