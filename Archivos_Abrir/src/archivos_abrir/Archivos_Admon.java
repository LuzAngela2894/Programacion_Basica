package archivos_abrir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Archivos_Admon {

    public ArrayList<String> abrir() {
        try {
            ArrayList<String> lineas = new ArrayList<String>();
            FileReader fr = new FileReader("C:/Users/Luz Angela Melo/NetBeansProjects/Ejercicio.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();//LEE LA LINEA Y PASA A LA VARIABLE LINEA
            while (linea != null) {
                System.out.println(linea);
                lineas.add(linea);//AÑADE LINEA AL ARREGLO
                linea = br.readLine();//LLAMO LA LINEA LEIDA
            }
            br.close();
            return lineas;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
