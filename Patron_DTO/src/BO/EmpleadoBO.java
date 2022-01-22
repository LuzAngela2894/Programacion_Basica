package BO;

import VO.EmpleadoVO;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoBO {

    //LISTA DE TIPO EMPLEADO
    List<EmpleadoVO> empleados;

    //CONSTRUCTOR DE LA CLASE EMPLEADO BO
    public EmpleadoBO() {
        empleados = new ArrayList<>();
        //LLENAR CON EMPLEADOS
        EmpleadoVO empleado1 = new EmpleadoVO(0, "Juan", "Lopez");
        EmpleadoVO empleado2 = new EmpleadoVO(1, "Ana", "Martinez");
        EmpleadoVO empleado3 = new EmpleadoVO(2, "Pedro", "Perez");
        EmpleadoVO empleado4 = new EmpleadoVO(3, "Adriana", "Gonzalez");
        EmpleadoVO empleado5 = new EmpleadoVO(4, "Luz", "Gomez");
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
    }

    //MOSTRAR LA LISTA DE EMPLEADOS
    public List<EmpleadoVO> obtenerEmpleados() {
        return empleados;
    }

    //OBTENER O MOSTRAR UN EMPLEADO USANDO PARÁMETROS
    public EmpleadoVO obtenerEmpleado(int id) {
        return empleados.get(id);
    }

    //ACTUALIZAR UN EMPLEADO USANDO PARÁMETROS
    public void actualizarEmpleado(EmpleadoVO empleado) {
        empleados.get(empleado.getId()).setNombre(empleado.getNombre());
        empleados.get(empleado.getId()).setApellido(empleado.getApellido());
        System.out.println("El empleado con ID: " + empleado.getId()
                + " se actualizó satisfactoriamente");
    }

    //BORRAR O ELIMINAR UN EMPLEADO USANDO PARÁMETROS
    public void eliminarEmpleado(EmpleadoVO empleado) {
        empleados.remove(empleado.getId());
        System.out.println("El empleado con ID: " + empleado.getId()
                + " se eliminó satisfactoriamente");
    }
}
