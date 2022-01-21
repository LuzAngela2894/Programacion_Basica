package archivos_guardar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos_Admon {

    public void guardar(ArrayList<String> lineas) throws IOException {
        try {
            //INSTANCIAR (BUSCAR EL ARCHIVO CON LA UBICACIÓN EXACTA)
            FileWriter fw = new FileWriter("C:/Users/Luz Angela Melo/NetBeansProjects/Ejercicio.txt", true);
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
}
