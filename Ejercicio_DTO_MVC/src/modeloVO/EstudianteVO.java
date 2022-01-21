package modeloVO;

public class EstudianteVO {
    //atributos
    private String Nombres;
    private String Apellidos;
    private String Nacimiento;
    private String CorreoInst;    

    //Constructor vacio para añadir registros
    public EstudianteVO() {
    }   
    //Método constructor para generar objeto
    public EstudianteVO (String Nombres, String Apellidos, String Nacimiento, String CorreoInst){
        this.Nombres=Nombres;
        this.Apellidos=Apellidos;
        this.Nacimiento=Nacimiento;
        this.CorreoInst=CorreoInst;       
    }
    //Métodos setter y Getter
   
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public String getNacimiento() {
        return Nacimiento;
    }
    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    public String getCorreoInst() {
        return CorreoInst;
    }
    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }
    @Override
    public String toString(){
        return this.getNombres()+" "+this.getApellidos()+" "+this.getNacimiento()+
                " "+this.getCorreoInst();
    }
}
