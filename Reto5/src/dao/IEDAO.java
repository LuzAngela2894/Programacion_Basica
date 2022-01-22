package dao;

import java.util.List;
import modelo.EVO;

public interface IEDAO {

    //DATOS DE UN SOLO ESTUDIANTE
    public boolean ingresarEstudiante(EVO serhumano);
    //DATOS DE UN SOLO ESTUDIANTE
    public boolean modificarEstudiante(EVO serhumano);
    //DATOS DE UN SOLO ESTUDIANTE
    public boolean borrarEstudiante(String cinstitucional);
    //DATOS DE VARIOS ESTUDIANTES
    public List<EVO> mostrarDirectorio();
    //DATOS DE UN SOLO ESTUDIANTE
    public EVO buscarCorreo(String cinstitucional);
    //DATOS DE VARIOS ESTUDIANTES
    public List<EVO> buscarApellidos(String apellidos);
    //DATOS DE VARIOS ESTUDIANTES
    public List<EVO> buscarPrograma(String programa);
    //DATOS DE UN SOLO ESTUDIANTE
    public int buscarCantidad(String programa);
    //DATOS DE VARIOS ESTUDIANTES
    public List<EVO> buscarFnacimiento(String fnacimiento);
    //DATOS DE UN SOLO ESTUDIANTE
    public List<EVO> buscarCelular(Long ncelular);
}
