package abstracto_estudiante;

public class MatriculaCompleta extends Estudiante {
    
    private double matricula;
    double total;
    
    public MatriculaCompleta(String codigo, String nombre, String cedula, int edad, double matricula) {
        super(codigo, nombre, cedula, edad);
        this.matricula = matricula;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public double CalcularTotal() {
        total = matricula;
        return total;
    }
}
