package excepciones2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones2 {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int num;
        try {
            System.out.println("Ingrese un número entero:");
            num = Integer.parseInt(leer.readLine());
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
        } catch (IOException | NumberFormatException exc) {
            System.out.println("Debe ingresar obligatoriamente un número entero");
            System.out.println("El error generado es: " + exc);
        }
        finally{
            System.out.println("Programa Finalizado");
        }
    }

}
