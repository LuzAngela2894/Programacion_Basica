package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1, numero, cantidad;
        double precio = 2000, total = 0, beca = 0;
        String nombre, carrera;
        float nota1, nota2, nota3, definitiva;
        while (opcion >= 1 && opcion <= 4) {
            System.out.println("M E N Ú");
            System.out.println("1. Par o Impar");
            System.out.println("2. Manzanas");
            System.out.println("3. Notas");
            System.out.println("4. Salir");
            System.out.println("Elija la opción deseada: ");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número");
                    numero = Integer.parseInt(leer.readLine());
                    if (numero % 2 == 0) {
                        System.out.println("El número " + numero + " es par");
                    } else {
                        System.out.println("El número " + numero + " es impar");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de manzanas compradas");
                    cantidad = Integer.parseInt(leer.readLine());
                    if (cantidad >= 0 && cantidad <= 2) {
                        total = (precio * cantidad) - (precio * cantidad * 0);
                    } else if (cantidad >= 3 && cantidad <= 5) {
                        total = (precio * cantidad) - (precio * cantidad * 0.10);
                    } else if (cantidad >= 6 && cantidad <= 10) {
                        total = (precio * cantidad) - (precio * cantidad * 0.15);
                    } else if (cantidad >= 11) {
                        total = (precio * cantidad) - (precio * cantidad * 0.20);
                    } else {
                        System.out.println("Error en la cantidad ingresada");
                    }
                    System.out.println("El total a pagar es: " + total);
                    break;
                case 3:
                    System.out.println("Digite el nombre del estudiante");
                    nombre = leer.readLine();
                    System.out.println("Ingrese la Carrera");
                    carrera = leer.readLine();
                    System.out.println("Ingrese la nota 1");
                    nota1 = Float.parseFloat(leer.readLine());
                    System.out.println("Ingrese la nota 2");
                    nota2 = Float.parseFloat(leer.readLine());
                    System.out.println("Ingrese la nota 3");
                    nota3 = Float.parseFloat(leer.readLine());
                    definitiva = (nota1 + nota2 + nota3) / 3;
                    if ((definitiva >= 4.0 && definitiva <= 5.0) && (carrera.equals("Sistemas") || carrera.equals("sistemas"))) {
                        beca = 1450000;
                    } else if ((definitiva >= 4.2 && definitiva <= 5.0) && (carrera.equals("Electronica") || carrera.equals("electronica"))) {
                        beca = 1480000;
                    } else if ((definitiva >= 4.5 && definitiva <= 5.0) && (carrera.equals("Contaduria") || carrera.equals("contaduria"))) {
                        beca = 1500000;
                    } else if ((definitiva == 5.0) && (carrera.equals("Arquitectura") || carrera.equals("arquitectura"))) {
                        beca = 1700000;
                    } else {
                        beca = 0;
                    }
                    System.out.println("El/La estudiante " + nombre + " de la carrera " + carrera
                            + " obtuvo una definitiva de " + definitiva + " y se le otorga una beca de " + beca);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
