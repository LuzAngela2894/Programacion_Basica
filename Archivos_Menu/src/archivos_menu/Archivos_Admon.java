package archivos_menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos_Admon {

    public void guardar(ArrayList<String> lineas) throws IOException {
        try {
            //INSTANCIAR (BUSCAR EL ARCHIVO CON LA UBICACIÓN EXACTA)
            FileWriter fw = new FileWriter("C:/Users/Luz Angela Melo/NetBeansProjects/Completo.txt", true);
            //INSTANCIAR EL OBJETO PARA GUARDAR EN FILEWRITER
            BufferedWriter bw = new BufferedWriter(fw);
            //RECORRE EL ARCHIVO LÍNEA A LÍNEA
            int i = 0;
            while (i < lineas.size()) {
                bw.append(lineas.get(i));
                bw.newLine();
                i++;
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public ArrayList<String> abrir() {
        try {
            ArrayList<String> lineas = new ArrayList<String>();
            FileReader fr = new FileReader("C:/Users/Luz Angela Melo/NetBeansProjects/Completo.txt");
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
