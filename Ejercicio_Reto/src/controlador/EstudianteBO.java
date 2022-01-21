package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.EstudianteVO;

public class EstudianteBO {

    //CREAR LA LISTA DE ESTUDIANTES
    List<EstudianteVO> estudiantes;

    //LLENAR EL ARREGLO (CONSTRUCTOR)
    public EstudianteBO() {
        estudiantes = new ArrayList<>();
    }

    //INSERTAR ESTUDIANTE PASANDO POR PARÁMETRO
    public void insertarEstudiante(EstudianteVO estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Se agregó el estudiante");
    }

    //OBTENER UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public EstudianteVO obtenerEstudiante(String cinstitucional) {
        for (EstudianteVO estudiante : estudiantes) {
            if (estudiante.getCinstitucional().equals(cinstitucional)) {
                return estudiante;
            }
        }
        return null;
    }

    //ACTUALIZAR UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public void actualizarEstudiante(EstudianteVO estudiante) {
        int i = 0;
        while (i < estudiantes.size()) {
            if (estudiantes.get(i).getCinstitucional().equals(estudiante.getCinstitucional())) {
                estudiantes.set(i, estudiante);
                System.out.println("Se modificó el estudiante");
                break;
            }
            i++;
        }
    }

    //BORRAR UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public void eliminarEstudiante(EstudianteVO estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("Se eliminó el estudiante");
    }

    //OBTENER O IMPRIMIR TODA LA LISTA
    public List<EstudianteVO> obtenerEstudiantes() {
        return estudiantes;
    }
}
