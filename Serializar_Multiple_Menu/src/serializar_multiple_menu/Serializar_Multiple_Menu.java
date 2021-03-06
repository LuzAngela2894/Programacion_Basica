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
            int opcion = 1;
            while (opcion >= 1 && opcion <= 3) {
                System.out.println("\nM E N U");
                System.out.println("1.Serializar");
                System.out.println("2.Deserializar");
                System.out.println("3.Salir");
                System.out.println("Opci??n:");
                opcion = Integer.parseInt(leer.readLine());
                switch (opcion) {
                    case 1:
                        try {
                            //SERIALIZACI??N
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
                            //DESERIALIZACI??N Y MOSTRAR
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
                        System.out.println("Opci??n no v??lida");
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
