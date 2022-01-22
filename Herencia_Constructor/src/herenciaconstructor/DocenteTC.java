package herenciaconstructor;

public class DocenteTC extends Docente{

    private double salario;
    
    public DocenteTC(String cedula, String nombre, String profesion, int edad, double salario){
        //Usar la cláusula super de java para enviar los datos de la superclase
        super(cedula, nombre, profesion, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
