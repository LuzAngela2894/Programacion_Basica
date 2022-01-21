package constructorempleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstructorEmpleado {

    public static void main(String[] args) throws IOException {
        /*
        String cedula, nombre;
        double salario;        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese cedula:");
        cedula = leer.readLine();
        System.out.println("Ingrese nombre:");
        nombre = leer.readLine();
        System.out.println("Ingrese salario:");
        salario = Double.parseDouble(leer.readLine());
        //Instanciar la clase
        Empleado objemp = new Empleado(cedula, nombre, salario);
        //Imprimir mensaje
        System.out.println("El empleado " + objemp.getNombre() + " con C.C. " + objemp.getCedula() +
                " tiene un salario de " + objemp.getSalario());
         */
        //Instanciar la clase
        Empleado objemp = new Empleado("500", "Juan Martínez", 3400000);
        System.out.println("El empleado " + objemp.getNombre() + " con C.C. " + objemp.getCedula()
                + " tiene un salario de " + objemp.getSalario());
        //Actualizar datos del empleado
        objemp.setNombre("Rodrigo Linares");
        objemp.setSalario(2300000);
        System.out.println("El empleado " + objemp.getNombre() + " con C.C. " + objemp.getCedula()
                + " tiene un salario de " + objemp.getSalario());
    }

}
