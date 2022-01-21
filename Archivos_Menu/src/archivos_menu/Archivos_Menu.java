package archivos_menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Archivos_Menu {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            //INSTANCIAR LA CLASE Archivos_Admon
            Archivos_Admon archivo = new Archivos_Admon();
            //INSTANCIAR OBJETO TIPO ARREGLO
            ArrayList<String> renglones = new ArrayList<String>();
            int opcion = 1;
            while (opcion >= 1 && opcion <= 3) {
                System.out.println("\nM E N U");
                System.out.println("1.Guardar Archivo");
                System.out.println("2.Abrir Archivo");
                System.out.println("3.Salir");
                System.out.println("Opción:");
                opcion = Integer.parseInt(leer.readLine());
                switch (opcion) {
                    case 1:
                        /*ADICIONAR LÍNEAS AL ARCHIVO
                        renglones.add("1.Un archivo es un conjunto de datos estructurados guardados en algún elemento o dispositivo.");
                        renglones.add("2.FileWriter: permite es especificar el archivo en el que se va a escribir.");
                        renglones.add("3.BufferedWriter: se encarga de escribir en el archivo.");
                        renglones.add("4.FileReader: lee los caracteres del archivo o fichero.");
                        renglones.add("5.BufferedReader: nos permite guardarlo en Buffer para seguridad.");
                        */
                        System.out.println("Ingrese el renglón a añadir:");
                        renglones.clear();
                        renglones.add(leer.readLine());//AÑADE EL ELEMENTO O RENGLÓN
                        archivo.guardar(renglones);//CARGA O GUARDA EL ARCHIVO
                        System.out.println("***Se ha añadido la información***");
                        int i = 0;
                        while (i < renglones.size()) {
                            System.out.println(renglones.get(i));
                            i++;
                        }
                        break;
                    case 2:
                        archivo.abrir();
                        break;
                    case 3:
                        System.out.println("Hasta pronto");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
