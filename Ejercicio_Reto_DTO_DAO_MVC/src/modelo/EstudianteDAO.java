package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements IEstudianteDAO {

    @Override
    public void guardar_estudiantes(List<EstudianteVO> estudiantes) {
        try {
            System.out.println("Guardando estudiantes");
            ObjectOutputStream objsalida = new ObjectOutputStream(new FileOutputStream("C:/Users/Luz Angela Melo/NetBeansProjects/estudiante.dat",false));
            //RECORRER PARA VARIOS
            int i = 0;
            while (i < estudiantes.size()) {
                objsalida.writeObject(estudiantes.get(i));
                i++;
            }
            objsalida.close();
            System.out.println("Estudiantes guardados");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public List<EstudianteVO> cargar_estudiante() {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();
            FileInputStream fis = new FileInputStream("C:/Users/Luz Angela Melo/NetBeansProjects/estudiante.dat");
            //ENCONTRAR O BUSCAR DENTRO DEL ARCHIVO
            ObjectInputStream objentrada = null;
            if (fis.available() > 0) {//SI TIENE INFORMACIÓN
                objentrada = new ObjectInputStream(fis);
            }
            while (fis.available() > 0) {//MIENTRAS HAYA DATOS
                EstudianteVO estudiante = (EstudianteVO) objentrada.readObject();//CASTEAR O CONVERTIR EN BYTES
                estudiantes.add(estudiante);
            }
            fis.close();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

}
