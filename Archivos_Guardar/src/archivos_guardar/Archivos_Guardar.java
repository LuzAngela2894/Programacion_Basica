package archivos_guardar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos_Guardar {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            //INSTANCIAR LA CLASE Archivos_Admon
            Archivos_Admon archivo = new Archivos_Admon();
            //INSTANCIAR OBJETO TIPO ARREGLO
            ArrayList<String> renglones = new ArrayList<String>();
            FileWriter fw = new FileWriter("C:/Users/Luz Angela Melo/NetBeansProjects/Ejercicio.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            //ADICIONAR LÍNEAS AL ARCHIVO
            renglones.add("1.Un archivo es un conjunto de datos estructurados guardados en algún elemento o dispositivo.");
            renglones.add("2.FileWriter: permite es especificar el archivo en el que se va a escribir.");
            renglones.add("3.BufferedWriter: se encarga de escribir en el archivo.");
            renglones.add("4.FileReader: lee los caracteres del archivo o fichero.");
            renglones.add("5.BufferedReader: nos permite guardarlo en Buffer para seguridad.");
            //CARGAR AL ARCHIVO
            archivo.guardar(renglones);
            //IMPRIMIR EN CONSOLA LO GUARDADO
            int i = 0;
            while (i < renglones.size()) {
                System.out.println(renglones.get(i));
                i++;
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

}
