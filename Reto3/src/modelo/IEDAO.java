package modelo;

import java.util.List;

public interface IEDAO {

    public void guardarEstudiante(List<EVO> estudiantes);

    public List<EVO> cargarEstudiante();
}
