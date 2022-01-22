package modelo;

public class EstudianteVO {

    private String nombres;
    private String apellidos;
    private String nacimiento;
    private String programa;
    private long celular;
    private String cinstitucional;

    //CONSTRUCTOR VACÍO PARA AÑADIR A LA LISTA
    public EstudianteVO() {
    }

    //CONSTRUCTOR DE EstudianteVO PARA GENERAR OBJETO
    public EstudianteVO(String nombres, String apellidos, String nacimiento, String programa, long celular, String cinstitucional) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.programa = programa;
        this.celular = celular;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCinstitucional() {
        return cinstitucional;
    }

    public void setCinstitucional(String cinstitucional) {
        this.cinstitucional = cinstitucional;
    }
}
