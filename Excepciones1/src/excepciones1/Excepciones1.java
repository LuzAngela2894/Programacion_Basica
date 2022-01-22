package excepciones1;

public class Excepciones1 {

    public static void main(String[] args) {
        try {
            int numerador = 10;
            int denominador = 0;
            int division = numerador / denominador;
            System.out.println("Dentro de try el resultado es: " + division);
        } catch (Exception e) {
            System.out.println("Dentro de catch el resultado es: " + e);
        } finally {
            System.out.println("Programa Finalizado - dentro de finally");
        }
    }
}
