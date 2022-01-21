package modelo;

import java.util.List;

public interface IEstudianteDAO {

    public void guardar_estudiantes(List<EstudianteVO> estudiantes);

    public List<EstudianteVO> cargar_estudiante();
}
