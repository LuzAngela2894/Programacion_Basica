package abstracto_estudiante;

public class MatriculaCreditos extends Estudiante {
    
    private int NC;
    private double VC;
    double total;
    
    public MatriculaCreditos(String codigo, String nombre, String cedula, int edad, int NC, double VC){
        super(codigo, nombre, cedula, edad);
        this.NC = NC;
        this.VC = VC;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }

    public double getVC() {
        return VC;
    }

    public void setVC(double VC) {
        this.VC = VC;
    }
    
    @Override
    public double CalcularTotal(){
        total = NC * VC;
        return total;
    }
}
