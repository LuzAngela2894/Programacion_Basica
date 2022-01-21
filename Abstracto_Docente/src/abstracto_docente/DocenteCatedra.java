package abstracto_docente;

public class DocenteCatedra extends Docente {

    private int numHora;
    private double valHora;
    double total;

    public DocenteCatedra(String cedula, String nombre, String profesion, int edad, int numHora, double valHora) {
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

    //Método abstracto de la superclase Docente
    @Override
    public double CalcularTotal() {
        total = numHora * valHora;
        return total;
    }

}
