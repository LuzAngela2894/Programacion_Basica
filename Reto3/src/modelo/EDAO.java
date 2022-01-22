package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EDAO implements IEDAO {

    @Override
    public void guardarEstudiante(List<EVO> estudiantes) {
        //datos_estudiantes.dat 
        try {
            ObjectOutputStream objwrite = new ObjectOutputStream(new FileOutputStream("datos_estudiantes.dat"));
            //RECORRER PARA VARIOS
            int i = 0;
            while (i < estudiantes.size()) {
                objwrite.writeObject(estudiantes.get(i));
                i++;
            }
            objwrite.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public List<EVO> cargarEstudiante() {
        //datos_estudiantes.dat
        try {
            List<EVO> estudiantes = new ArrayList();
            FileInputStream fread = new FileInputStream("datos_estudiantes.dat");
            //ENCONTRAR O BUSCAR DENTRO DEL ARCHIVO
            ObjectInputStream objinput = null;
            if (fread.available() > 0) {//SI TIENE INFORMACIÓN
                objinput = new ObjectInputStream(fread);
            }
            while (fread.available() > 0) {//MIENTRAS HAYA DATOS
                EVO estudiante = (EVO) objinput.readObject();//CASTEAR O CONVERTIR EN BYTES
                estudiantes.add(estudiante);
            }
            fread.close();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
