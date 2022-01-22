package serializar_objetos_multiples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import programa.Docente;

public class Serializar_Objetos_Multiples {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //INSTANCIAR ARRAYLIST DE LA CLASE Docente
        ArrayList<Docente> lista_docentes = new ArrayList<Docente>();
        Docente objdoc = new Docente();
        //PRIMER DOCENTE
        objdoc.setNombre("Jorge Martinez");
        objdoc.setCargo("Ingeniero");
        objdoc.setArea("Sistema");
        objdoc.setEdad(42);
        lista_docentes.add(objdoc);
        //SEGUNDO DOCENTE
        objdoc = new Docente();//INSTANCIAR PARCIALMENTE LA CLASE Docente
        objdoc.setNombre("Pedro Gomez");
        objdoc.setCargo("Ingeniero");
        objdoc.setArea("Industrial");
        objdoc.setEdad(47);
        lista_docentes.add(objdoc);
        //TERCER DOCENTE
        objdoc = new Docente();//INSTANCIAR PARCIALMENTE LA CLASE Docente
        objdoc.setNombre("Ana Gonzalez");
        objdoc.setCargo("Ingeniero");
        objdoc.setArea("Electronica");
        objdoc.setEdad(40);
        lista_docentes.add(objdoc);
        //CUARTO DOCENTE
        objdoc = new Docente();//INSTANCIAR PARCIALMENTE LA CLASE Docente
        objdoc.setNombre("Adriana Perez");
        objdoc.setCargo("Contadora");
        objdoc.setArea("Economia");
        objdoc.setEdad(40);
        lista_docentes.add(objdoc);
        //QUINTO DOCENTE
        objdoc = new Docente();//INSTANCIAR PARCIALMENTE LA CLASE Docente
        objdoc.setNombre("Manuel Lozada");
        objdoc.setCargo("Quimico");
        objdoc.setArea("Produccion");
        objdoc.setEdad(49);
        lista_docentes.add(objdoc);
        try {
            //SERIALIZACIÓN
            ObjectOutputStream objsalida = new ObjectOutputStream(new FileOutputStream("C:/Users/Luz Angela Melo/NetBeansProjects/archivito.dat"));
            //RECORRER EL ARREGLO PARA CONVERTIRLO A BYTES
            int i = 0;
            while (i < lista_docentes.size()) {
                objsalida.writeObject(lista_docentes.get(i));
                i++;
            }
            objsalida.close();
            System.out.println("Objeto guardado satisfactoriamente");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            //DESERIALIZACIÓN Y MOSTRAR
            FileInputStream fis = new FileInputStream("C:/Users/Luz Angela Melo/NetBeansProjects/archivito.dat");
            ObjectInputStream objentrada = new ObjectInputStream(fis);
            //RECORRER EL ARREGLO PARA LEER Y MOSTRAR
            int i = 0;
            //DO-WHILE CASTEAR O CONVERTIR A DATOS LA CADENA DE BYTES
            do {
                Docente objdcin = (Docente) objentrada.readObject();//INSTANCIAR
                //MOSTRAR
                System.out.println(objdcin);
                System.out.println("Nombre: " + objdcin.getNombre());
                System.out.println("Cargo: " + objdcin.getCargo());
                System.out.println("Edad: " + objdcin.getEdad());
                System.out.println("Area: " + objdcin.getArea());
                System.out.println("********************************");
                i++;
            } while (fis.available() > 0);
            System.out.println("Finalizado satisfactoriamente");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
