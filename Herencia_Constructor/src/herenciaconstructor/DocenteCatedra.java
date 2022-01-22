package herenciaconstructor;

public class DocenteCatedra extends Docente {

    private int numHora;
    private double valHora;
    
    public DocenteCatedra(String cedula, String nombre, String profesion, int edad, int numHora, double valHora){
        //Usar la cláusula super de java para enviar los datos de la superclase
        super(cedula, nombre, profesion, edad);
        this.numHora = numHora;
        this.valHora = valHora;
    }

    public int getNumHora() {
        return numHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }

    public double getValHora() {
        return valHora;
    }

    public void setValHora(double valHora) {
        this.valHora = valHora;
    }

    //Defino el método de cálculo del salario
    public double total() {
        return numHora * valHora;
    }
}
