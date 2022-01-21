package arregloslistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArreglosListas {

    public static void main(String[] args) throws IOException {
        //Crear una lista tipo arreglo usando la clase de JAVA ArrayList(Instanciar)
        ArrayList objarreglo = new ArrayList();
        //Ver de que tamaño se crea
        System.out.println("El tamaño inicial del arreglo es: " + objarreglo.size());
        //Llenar el arreglo
        objarreglo.add("Juan Perez");
        objarreglo.add("Ana Molina");
        objarreglo.add("Luis Diaz");
        objarreglo.add("Martha Pinto");
        objarreglo.add("Adriana Lopez");
        //Verificar el nuevo tamaño
        System.out.println("El tamaño actual del arreglo es: " + objarreglo.size());
        //Mostrar el contenido del arreglo
        System.out.println("La lista de elementos es: " + objarreglo);
        //Borrar un elemento del arreglo por nombre de elemento
        System.out.println("El arreglo tiene luego de eliminar: " + objarreglo.remove("Ana Molina"));
        //Borrar un elemento del arreglo por indice
        System.out.println("¿Cuál elemento borró? " + objarreglo.remove(2));
        //Verificar el nuevo tamaño y mostrar el contenido del arreglo
        System.out.println("El tamaño actual del arreglo es: " + objarreglo.size());
        System.out.println("La lista de elementos es: " + objarreglo);
        //Consultar un elemento del arreglo
        System.out.println("La lista contiene: " + objarreglo.get(1) + " = " + objarreglo.contains("Luis Diaz"));
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String nombre, continuar = "S";
        int opcion = 1, posicion;
        while (opcion >= 1 && opcion <= 5) {
            System.out.println("M E N U");
            System.out.println("1.Añadir");
            System.out.println("2.Leer");
            System.out.println("3.Modificar");
            System.out.println("4.Borrar");
            System.out.println("5.Salir");
            System.out.println("Elija una opción:");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    while (continuar.equalsIgnoreCase("S")) {
                        System.out.println("Ingrese el nombre a añadir:");
                        nombre = leer.readLine();
                        objarreglo.add(nombre);
                        System.out.println("Dese añadir más elementos S/N");
                        continuar = leer.readLine();
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la posición del elemento a consultar:");
                    posicion = Integer.parseInt(leer.readLine());
                    System.out.println("La lista contiene a: " + objarreglo.get(posicion));
                    System.out.println("La lista de elementos es: " + objarreglo);
                    break;
                case 3:
                    System.out.println("Ingrese la posición del elemento a modificar:");
                    posicion = Integer.parseInt(leer.readLine());
                    System.out.println("Ingrese el nombre a modificar:");
                    nombre = leer.readLine();
                    objarreglo.set(posicion, nombre);
                    System.out.println("La lista de elementos es: " + objarreglo);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre a eliminar:");
                    nombre = leer.readLine();
                    objarreglo.remove(nombre);
                    System.out.println("La lista de elementos es: " + objarreglo);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
