package herenciadocente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HerenciaDocente {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cedula, nombre, profesion;
        int edad, numHora, opcion = 1;
        double salario, valHora;
        System.out.println("Ingrese cedula:");
        cedula = leer.readLine();
        System.out.println("Ingrese nombre:");
        nombre = leer.readLine();
        System.out.println("Ingrese profesion:");
        profesion = leer.readLine();
        System.out.println("Ingrese edad:");
        edad = Integer.parseInt(leer.readLine());
        //Menú
        while (opcion >= 1 && opcion <= 3) {
            System.out.println("M E N U  D O C E N T E S");
            System.out.println("1.Tiempo completo");
            System.out.println("2.Catedra");
            System.out.println("3.Salir");
            System.out.println("Elija una opción:");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese salario:");
                    salario = Double.parseDouble(leer.readLine());
                    DocenteTC objdtc = new DocenteTC();
                    objdtc.setCedula(cedula);
                    objdtc.setNombre(nombre);
                    objdtc.setProfesion(profesion);
                    objdtc.setEdad(edad);
                    objdtc.setSalario(salario);
                    System.out.println("El docente " + objdtc.getNombre() + " con C.C. " + objdtc.getCedula()
                            + " de profesion " + objdtc.getProfesion() + " de edad " + objdtc.getEdad()
                            + " tiene un salario de " + objdtc.getSalario());
                    break;
                case 2:
                    System.out.println("Ingrese numero horas trabajadas:");
                    numHora = Integer.parseInt(leer.readLine());
                    System.out.println("Ingese valor horas trabajadas:");
                    valHora = Double.parseDouble(leer.readLine());
                    DocenteCatedra objdc = new DocenteCatedra();
                    objdc.setCedula(cedula);
                    objdc.setNombre(nombre);
                    objdc.setProfesion(profesion);
                    objdc.setEdad(edad);
                    objdc.setNumHora(numHora);
                    objdc.setValHora(valHora);
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
