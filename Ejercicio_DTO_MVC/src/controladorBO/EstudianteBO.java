package controladorBO;

import modeloVO.EstudianteVO;
import java.util.ArrayList;
import java.util.List;

public class EstudianteBO {
    //lista de tipo estudiante   
    List<EstudianteVO> estudiantes;

    //Llenar el arreglo
    public EstudianteBO() {
        estudiantes = new ArrayList<>();
    }

    //inserta estudiante que se le pasa como parámetro
    public void insertarEstudiante(EstudianteVO estudiante) {
        estudiantes.add(estudiante);
    }
    
    //obtiene un estudiante de acuerdo al correo pasado como parámetro    
    public EstudianteVO obtenerEstudiante(String CorreoInst) {
        for (EstudianteVO estudiante : estudiantes) {
            if (estudiante.getCorreoInst().equals(CorreoInst)) {
                return estudiante;
            }
        }
        return null;
    }

    // actualiza un estudiante que se le pasa como parámetro
    public void actualizarEstudiante(EstudianteVO estudiante) {
        int i = 0;
        while (i < estudiantes.size()) {
            if (estudiantes.get(i).getCorreoInst().equals(estudiante.getCorreoInst())) {
                estudiantes.set(i, estudiante);
                break;
            }
            i++;
        }
    }

    //elimina estudiante que se le pasa como parámetro
    public void eliminarEStudiante(EstudianteVO estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("estudiante " + estudiante.getNombres() + " eliminado satisfactoriamente");
    }

    //obtiene toda la lista de estudiantes
    public List<EstudianteVO> obtenerEstudiantes() {
        return estudiantes;
    }
}
