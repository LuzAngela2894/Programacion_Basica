package controller;

import modelo.EVO;
import java.util.List;
import dao.EDAO;
import dao.IEDAO;

public class EBO {

    private IEDAO interfaz;

    //LLENAR EL ARREGLO (CONSTRUCTOR)
    public EBO() {
        interfaz = new EDAO();
    }

    //INGRESAR ESTUDIANTE PASANDO POR PARÁMETRO
    public boolean ingresarEstudiante(EVO serhumano) {
        return interfaz.ingresarEstudiante(serhumano);
    }

    //BUSCAR ESTUDIANTE POR PARÁMETRO(CORREO INSTITUCIONAL)
    public EVO buscarEstudiante(String cinstitucional) {
        return interfaz.buscarCorreo(cinstitucional);
    }

    //MODIFICAR ESTUDIANTE POR PARÁMETRO(CORREO INSTITUCIONAL)
    public boolean modificarEstudiante(EVO serhumano) {
        return interfaz.modificarEstudiante(serhumano);
    }

    //BORRAR ESTUDIANTE POR PARÁMETRO(CORREO INSTITUCIONAL)
    public boolean borrarEstudiante(EVO serhumano) {
        return interfaz.borrarEstudiante(serhumano.getCinstitucional());
    }

    //MOSTRAR DIRECTORIO DE ESTUDIANTES
    public List<EVO> mostrarDirectorio() {
        return interfaz.mostrarDirectorio();
    }

    //CONSULTAS SQL
    public EVO buscarCorreo(String cinstitucional) {
        return interfaz.buscarCorreo(cinstitucional);
    }

    public List<EVO> buscarApellidos(String apellidos) {
        return interfaz.buscarApellidos(apellidos);
    }

    public List<EVO> buscarPrograma(String programa) {
        return interfaz.buscarPrograma(programa);
    }

    public int buscarCantidad(String programa) {
        return interfaz.buscarCantidad(programa);
    }

    public List<EVO> buscarFnacimiento(String fnacimiento) {
        return interfaz.buscarFnacimiento(fnacimiento);
    }

    public EVO buscarCelular(Long ncelular) {
        return interfaz.buscarCelular(ncelular);
    }
}
