package switchclases;

public class ParImpar {

    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void par_impar() {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
    }
}
