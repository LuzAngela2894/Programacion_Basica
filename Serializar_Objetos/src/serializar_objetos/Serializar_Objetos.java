package serializar_objetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import programa.Docente;

public class Serializar_Objetos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            //INSTANCIAR LA CLASE Docente
            Docente objdoc = new Docente();
            objdoc.setNombre("Juan Perez");
            objdoc.setCargo("Ingeniero");
            objdoc.setArea("Sistemas");
            objdoc.setEdad(42);
            //SERIALIZACIÓN
            //HACER O ABRIR CONEXIÓN PARA SERIALIZAR O CONVERTIR A BYTES (INSTANCIAR LA CLASE JAVA)
            ObjectOutputStream objsalida = new ObjectOutputStream(new FileOutputStream("C:/Users/Luz Angela Melo/NetBeansProjects/archivito.dat"));
            objsalida.writeObject(objdoc);//TOMANDO EL OBJETO Y ENVIARLO AL ARCHIVO
            objsalida.flush();//VACIA EL OBJETO EN EL ARCHIVO PARA ESCRIBIR LOS BYTES
            objsalida.close();
            System.out.println("Objeto guardado satisfactoriamente");
            //DESERIALIZACIÓN
            //LEER EL ARCHIVO DE BYTE Y CONVERTIR A DATOS PARA MOSTRAR
            ObjectInputStream objentrada = new ObjectInputStream(new FileInputStream("C:/Users/Luz Angela Melo/NetBeansProjects/archivito.dat"));
            Object objpro = objentrada.readObject();//TRAER EL OBJETO DISPONIBLE DEL ARCHIVO
            Docente d1 = (Docente) objpro;//CASTEAR O CONVERTIR LA CADENA DE BYTES EN CARACTERES
            System.out.println("Nombre: " + d1.getNombre());
            System.out.println("Edad: " + d1.getEdad());
            System.out.println("Cargo: " + d1.getCargo());
            System.out.println("Area: " + d1.getArea());
            objentrada.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
