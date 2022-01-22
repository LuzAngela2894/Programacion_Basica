package herenciaconstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HerenciaConstructor {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        while (opcion >= 1 && opcion <= 3) {
            System.out.println("M E N U  D O C E N T E S");
            System.out.println("1.Tiempo completo");
            System.out.println("2.Catedra");
            System.out.println("3.Salir");
            System.out.println("Elija una opción:");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    DocenteTC objdtc = new DocenteTC("100","Ana Ramírez","Médico",26,5300000);
                    System.out.println("El docente " + objdtc.getNombre() + " con C.C. " + objdtc.getCedula()
                            + " de profesion " + objdtc.getProfesion() + " de edad " + objdtc.getEdad()
                            + " tiene un salario de " + objdtc.getSalario());
                    break;
                case 2:
                    DocenteCatedra objdc = new DocenteCatedra("200","Song Lin","Software",28,16,50000);
                    System.out.println("El docente " + objdc.getNombre() + " con C.C. " + objdc.getCedula()
                            + " de profesion " + objdc.getProfesion() + " de edad " + objdc.getEdad()
                            + " trabajo " + objdc.getNumHora() + " horas " + "a un valor de " + objdc.getValHora()
                            + " y recibe en total " + objdc.total());
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
