package ejercicio_docente_estudiante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_Docente_Estudiante {

    public static void main(String[] args) throws IOException {
        //Cargar el lector de datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Declarar variables
        String Cedula, Codigo, NombreDocente, NombreEstudiante, Profesion, Carrera;
        //Capturar los datos
        System.out.println("Ingrese la cédula del docente: ");
        Cedula = leer.readLine();
        System.out.println("Ingrese el nombre del docente: ");
        NombreDocente = leer.readLine();
        System.out.println("Ingrese la profesión del docente: ");
        Profesion = leer.readLine();
        System.out.println("Ingrese el código del estudiante: ");
        Codigo = leer.readLine();
        System.out.println("Ingrese el nombre del estudiante: ");
        NombreEstudiante = leer.readLine();
        System.out.println("Ingrese la carrera del estudiante: ");
        Carrera = leer.readLine();
        //Instanciar las clases
        Docente objdoc = new Docente();
        Estudiante objest = new Estudiante();
        //Enviar información a las clases a través de los métodos set
        objdoc.setCedula(Cedula);
        objdoc.setNombre(NombreDocente);
        objdoc.setProfesion(Profesion);
        objest.setCodigo(Codigo);
        objest.setNombre(NombreEstudiante);
        objest.setCarrera(Carrera);
        //Imprimir mensaje usando los get
        System.out.println("El docente " + objdoc.getNombre() + " identificado con C.C. No. " + objdoc.getCedula() + " de profesión " + objdoc.getProfesion()
                + " imparte la clase matemáticas al estudiante " + objest.getNombre() + " identificado con el código No. " + objest.getCodigo() + " quien cursa la carrera de " + objest.getCarrera());

    }

}
