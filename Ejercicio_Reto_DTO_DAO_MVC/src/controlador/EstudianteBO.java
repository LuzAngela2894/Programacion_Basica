package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.EstudianteDAO;
import modelo.EstudianteVO;
import modelo.IEstudianteDAO;

public class EstudianteBO {

    //CREAR LA LISTA DE ESTUDIANTES
    List<EstudianteVO> estudiantes;
    private IEstudianteDAO edao;

    //LLENAR EL ARREGLO (CONSTRUCTOR)
    public EstudianteBO() {
        edao = new EstudianteDAO();
        estudiantes = new ArrayList<>();
    }

    //INSERTAR ESTUDIANTE PASANDO POR PARÁMETRO
    public void insertarEstudiante(EstudianteVO estudiante) {
        estudiantes.add(estudiante);
        edao.guardar_estudiantes(estudiantes);
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
        edao.guardar_estudiantes(estudiantes);
    }

    //BORRAR UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public void eliminarEstudiante(EstudianteVO estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("Se eliminó el estudiante");
        edao.guardar_estudiantes(estudiantes);
    }

    //OBTENER O IMPRIMIR TODA LA LISTA
    public List<EstudianteVO> obtenerEstudiantes() {
        return estudiantes;
    }
}
