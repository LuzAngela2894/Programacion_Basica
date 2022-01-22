package controlador;

import modelo.EstudianteVO;
import java.util.List;
import edao.EstudianteDAO;
import edao.IEstudianteDAO;

public class EstudianteBO {

    private IEstudianteDAO edao;

    //LLENAR EL ARREGLO (CONSTRUCTOR)
    public EstudianteBO() {
        edao = new EstudianteDAO();
    }

    //INSERTAR ESTUDIANTE PASANDO POR PARÁMETRO
    public void insertarEstudiante(EstudianteVO estudiante) {
        edao.insertar_estudiante(estudiante);
        System.out.println("Se agregó el estudiante");
    }

    //OBTENER UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public EstudianteVO obtenerEstudiante(String cinstitucional) {
        return edao.consultar_por_correo(cinstitucional);
    }

    //ACTUALIZAR UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public void actualizarEstudiante(EstudianteVO estudiante) {
        edao.actualizar_estudiante(estudiante);
    }

    //BORRAR UN ESTUDIANTE POR PARÁMETRO(CORREO)
    public void eliminarEstudiante(EstudianteVO estudiante) {
        edao.eliminar_estudiante(estudiante.getCinstitucional());
    }

    //OBTENER O IMPRIMIR TODA LA LISTA
    public List<EstudianteVO> obtenerEstudiantes() {
        return edao.consultar_todos();
    }

    //CONSULTAS EN SQL
    public EstudianteVO consultar_por_correo(String cinstitucional) {
        return edao.consultar_por_correo(cinstitucional);
    }

    public List<EstudianteVO> consultar_por_apellido(String apellidos) {
        return edao.consultar_por_apellido(apellidos);
    }

    public List<EstudianteVO> consultar_por_programa(String programa) {
        return edao.consultar_por_programa(programa);
    }

    public int consultar_cantidad_estudiantes(String programa) {
        return edao.consultar_cantidad_estudiantes(programa);
    }

    public List<EstudianteVO> consultar_por_fecha_nacimiento(String nacimiento) {
        return edao.consultar_por_fecha_nacimiento(nacimiento);
    }

    public EstudianteVO consultar_por_celular(Long celular) {
        return edao.consultar_por_celular(celular);
    }
}
