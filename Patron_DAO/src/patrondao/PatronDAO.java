package patrondao;

import controlador.DocenteInterface;
import implementar.DocenteImplementar;
import modelo.DocenteVO;

public class PatronDAO {

    public static void main(String[] args) {
        //INSTANCIAR EL OBJETO A MANIPULAR
        DocenteInterface docenteDAO = new DocenteImplementar();
        //IMPRIMIR O MOSTRAR LA LISTA DE DOCENTES
        docenteDAO.obtenerDocentes().forEach(System.out::println);
        //OBTENER UN DOCENTE PARA ACTUALIZAR
        DocenteVO docente = docenteDAO.obtenerDocente(2);
        docente.setApellido("Gonzalez");
        //ACTUALIZAR DOCENTE
        docenteDAO.actualizarDocente(docente);
        //IMPRIMIR PARA VERIFICAR SI DOCENTE FUE ACTUALIZADO
        System.out.println("A C T U A L I Z A D O");
        docenteDAO.obtenerDocentes().forEach(System.out::println);
        //OBTENER UN DOCENTE PARA BORRAR O ELIMINAR
        docente = docenteDAO.obtenerDocente(1);
        //BORRAR O ELIMINAR POR PARAMETRO
        docenteDAO.eliminarDocente(docente);
        //IMPRIMIR PARA VERIFICAR SI DOCENTE FUE BORRADO
        System.out.println("B O R R A D O");
        docenteDAO.obtenerDocentes().forEach(System.out::println);
    }

}
