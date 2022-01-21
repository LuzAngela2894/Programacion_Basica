package abstracto_estudiante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstracto_Estudiante {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        while (opcion >= 1 && opcion <= 3) {
            System.out.println("M E N U   E S T U D I A N T E S");
            System.out.println("1.Matrícula Completa");
            System.out.println("2.Matrícula por Créditos");
            System.out.println("3.Salir");
            System.out.println("Elija una opción:");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    Estudiante objmca = new MatriculaCompleta("121569", "Santiago Gamboa", "500", 26, 6000000);
                    System.out.println("El estudiante " + objmca.getNombre() +
                            " con código No. " + objmca.getCodigo() +
                            " con C.C. No. " + objmca.getCedula() + 
                            " de edad " + objmca.getEdad() + " años" +
                            " paga matrícula por valor de " + objmca.CalcularTotal());    
                    break;
                case 2:
                    MatriculaCreditos objmcr = new MatriculaCreditos("159753", "Samuel Rodríguez", "800", 25, 10, 300000);
                    System.out.println("El estudiante " + objmcr.getNombre() +
                            " con código No. " + objmcr.getCodigo() +
                            " con C.C. No. " + objmcr.getCedula() + 
                            " de edad " + objmcr.getEdad() + " años" +
                            " paga matrícula por valor de " + objmcr.CalcularTotal());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
