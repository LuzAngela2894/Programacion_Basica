package herenciadocente;

public class DocenteCatedra extends Docente {

    private int numHora;
    private double valHora;

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
    
    public double total(){
        return numHora*valHora;
    }
}
