package edao;

import java.util.List;
import modelo.EstudianteVO;

public interface IEstudianteDAO {
    public boolean insertar_estudiante(EstudianteVO estudiante);
    public boolean actualizar_estudiante(EstudianteVO estudiante);
    public boolean eliminar_estudiante(String cinstitucinal);
    public List<EstudianteVO> consultar_todos();
    public EstudianteVO consultar_por_correo(String cinstitucional);
    public List<EstudianteVO> consultar_por_apellido(String apellidos);
    public List<EstudianteVO> consultar_por_programa(String programa);
    public int consultar_cantidad_estudiantes(String programa);
    public List<EstudianteVO> consultar_por_fecha_nacimiento(String nacimiento);
    public EstudianteVO consultar_por_celular(Long celular);    
}
