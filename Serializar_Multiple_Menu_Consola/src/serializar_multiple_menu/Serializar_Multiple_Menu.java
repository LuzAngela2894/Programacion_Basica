package serializar_multiple_menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import programa.Docente;

public class Serializar_Multiple_Menu {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            //INSTANCIAR ARRAYLIST DE LA CLASE Docente
            ArrayList<Docente> lista_docentes = new ArrayList<Docente>();            
            int opcion = 1;
            while (opcion >= 1 && opcion <= 3) {
                System.out.println("\nM E N U");
                System.out.println("1.Serializar");
                System.out.println("2.Deserializar");
                System.out.println("3.Salir");
                System.out.println("Opción:");
                opcion = Integer.parseInt(leer.readLine());
                switch (opcion) {
                    case 1:
                        Docente objdoc = new Docente(); 
                        System.out.println("Ingresar Nombre: ");
                        objdoc.setNombre(leer.readLine());
                        System.out.println("Ingresar Cargo: ");
                        objdoc.setCargo(leer.readLine());
                        System.out.println("Ingresar Area: ");
                        objdoc.setArea(leer.readLine());
                        System.out.println("Ingresar Edad: ");
                        objdoc.setEdad(Integer.parseInt(leer.readLine()));
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
                        break;
                    case 2:
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
