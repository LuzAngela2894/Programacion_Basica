package ejercicio_empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_Empleado {

    public static void main(String[] args) throws IOException {
        //Declarando Variables
        String nombre;
        int ht, vh, total;
        //BufferedReader para leer desde consola datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite el nombre del empleado");
        nombre = leer.readLine();
        System.out.println("Digite el número de horas trabajadas");
        ht = Integer.parseInt(leer.readLine());
        System.out.println("Digite el valor de la hora");
        vh = Integer.parseInt(leer.readLine());
        total = ht * vh;
        System.out.println("El nombre del empleado es: " + nombre + " y el total a pagar es: " + total);
    }
}
