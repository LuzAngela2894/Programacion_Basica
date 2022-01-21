package ejercicio_docente_estudiante;

public class Estudiante {
    private String Codigo;
    private String Nombre;
    private String Carrera;
    //Métodos de la clase estudiante
    public void setCodigo(String Codigo){
        this.Codigo=Codigo;
    }
    public String getCodigo(){
        return Codigo;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setCarrera(String Carrera){
        this.Carrera=Carrera;
    }
    public String getCarrera(){
        return Carrera;
    }
}
