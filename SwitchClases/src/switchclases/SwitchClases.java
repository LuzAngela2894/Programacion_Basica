package switchclases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchClases {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1, numero, cantidad;
        double beca = 0;
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
                    ParImpar objpi = new ParImpar();
                    objpi.setNumero(numero);
                    objpi.par_impar();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de manzanas compradas");
                    cantidad = Integer.parseInt(leer.readLine());
                    Manzanas objman = new Manzanas();
                    objman.setCantidad(cantidad);
                    System.out.println("El total a pagar es: " + objman.total_pagar());
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
                    Notas objnota = new Notas();
                    objnota.setNombre(nombre);
                    objnota.setCarrera(carrera);
                    objnota.setNota1(nota1);
                    objnota.setNota2(nota2);
                    objnota.setNota3(nota3);
                    objnota.calcular_beca();
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
