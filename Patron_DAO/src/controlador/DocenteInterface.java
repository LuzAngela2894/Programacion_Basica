package controlador;

import java.util.List;
import modelo.DocenteVO;

public interface DocenteInterface {
    //DECLARACIÓN MÉTODOS CRUD PARA EL ACCESO A LOS DATOS

    public List<DocenteVO> obtenerDocentes();

    public DocenteVO obtenerDocente(int id);

    public void actualizarDocente(DocenteVO docente);

    public void eliminarDocente(DocenteVO docente);
}
