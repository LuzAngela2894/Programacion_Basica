package implementar;

import controlador.DocenteInterface;
import java.util.ArrayList;
import java.util.List;
import modelo.DocenteVO;

public class DocenteImplementar implements DocenteInterface {

    //CREAR LA LISTA DE DOCENTES
    List<DocenteVO> docentes;

    //INICIALIZAR LOS OBJETOS DocenteVO Y AÑADIR A LA LISTA
    public DocenteImplementar() {
        docentes = new ArrayList<>();
        DocenteVO docente1 = new DocenteVO(0, "Jose", "Morales");
        DocenteVO docente2 = new DocenteVO(1, "Margarita", "Lopez");
        DocenteVO docente3 = new DocenteVO(2, "Ana", "Martínez");
        docentes.add(docente1);
        docentes.add(docente2);
        docentes.add(docente3);
    }

    //OBTENER TODOS LOS DOCENTES
    @Override
    public List<DocenteVO> obtenerDocentes() {
        return docentes;
    }

    //OBTENER UN DOCENTE POR ID(CONSULTAR)
    @Override
    public DocenteVO obtenerDocente(int id) {
        return docentes.get(id);
    }

    //ACTUALIZAR DOCENTE USANDO PARÁMETROS
    @Override
    public void actualizarDocente(DocenteVO docente) {
        docentes.get(docente.getId()).setNombre(docente.getNombre());
        docentes.get(docente.getId()).setApellido(docente.getApellido());
        System.out.println("El docente con ID: " + docente.getId() + " ha sido actualizado");
    }

    //ELIMINAR DOCENTE USANDO PARÁMETROS
    @Override
    public void eliminarDocente(DocenteVO docente) {
        docentes.remove(docente.getId());
        System.out.println("El docente con ID: " + docente.getId() + " ha sido eleminado");
    }

}
