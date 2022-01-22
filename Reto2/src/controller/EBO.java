package controller;

import modelo.EVO;
import java.util.ArrayList;
import java.util.List;

public class EBO {

    //LISTA DE TIPO ESTUDIANTES
    List<EVO> estudiantes;

    //LLENAR EL ARREGLO
    public EBO() {
        estudiantes = new ArrayList<>();
    }

    //INGRESAR ESTUDIANTE PASANDO POR PARÁMETRO
    public void ingresarEstudiante(EVO serhumano) {
        estudiantes.add(serhumano);
        System.out.println("\nSe agregó el estudiante");
    }

    //BUSCAR ESTUDIANTE USANDO PARÁMETROS(CORREO INSTITUCIONAL)
    public EVO buscarEstudiante(String cinstitucional) {
        for (EVO serhumano : estudiantes) {
            if (serhumano.getCinstitucional().equals(cinstitucional)) {
                return serhumano;
            }
        }
        return null;
    }

    //MODIFICAR ESTUDIANTE USANDO PARÁMETROS(CORREO INSTITUCIONAL)
    public void modificarEstudiante(EVO serhumano) {
        //r ITERADOR
        int r = 0;
        while (r < estudiantes.size()) {
            if (estudiantes.get(r).getCinstitucional().equals(serhumano.getCinstitucional())) {
                estudiantes.set(r, serhumano);
                System.out.println("Se modificó el estudiante");
                break;
            }
            //++ ES UN OPERADOR UNARIO QUE INCREMENTA EL VALOR DE SU OPERANDO EN UNO
            r++;
        }
    }

    //BORRAR ESTUDIANTE USANDO PARÁMETROS(CORREO INSTITUCIONAL)
    public void borrarEstudiante(EVO serhumano) {
        estudiantes.remove(serhumano);
        System.out.println("\nSe eliminó el estudiante");
    }

    //MOSTRAR DIRECTORIO DE ESTUDIANTES
    public List<EVO> mostrarDirectorio() {
        return estudiantes;
    }
}
