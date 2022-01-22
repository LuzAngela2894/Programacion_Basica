package modelodto;

import BO.EmpleadoBO;
import VO.EmpleadoVO;

public class ModeloDTO {

    public static void main(String[] args) {
        //INSTANCIAR EL OBJETO BO
        EmpleadoBO objBO = new EmpleadoBO();
        //MOSTRAR U OBTENER TODOS LOS EMPLEADOS
        objBO.obtenerEmpleados().forEach(System.out::println);
        //ACTUALIZAR EMPLEADO
        System.out.println("***A C T U A L I Z A R***");
        EmpleadoVO empleado = objBO.obtenerEmpleado(3);
        empleado.setNombre("Felipe");
        empleado.setApellido("Herrera");
        objBO.actualizarEmpleado(empleado);
        //MOSTRAR LA LISTA ACTUAL DE EMPLEADOS
        objBO.obtenerEmpleados().forEach(System.out::println);
        //ELIMINAR EMPLEADO
        System.out.println("***B O R R A R***");
        empleado = objBO.obtenerEmpleado(2);
        objBO.eliminarEmpleado(empleado);
        //MOSTRAR LA LISTA ACTUAL DE EMPLEADOS
        objBO.obtenerEmpleados().forEach(System.out::println);
        //CONSULTAR EMPLEADO
        System.out.println("***C O N S U L T A R***");
        empleado = objBO.obtenerEmpleado(1);
        System.out.println(empleado);
    }
}
