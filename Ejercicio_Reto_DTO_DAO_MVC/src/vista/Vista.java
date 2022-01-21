package vista;

import controlador.EstudianteBO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import modelo.EstudianteVO;

public class Vista {

    public void menu() {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            int opcion = 1;
            //CREAR EL ARREGLO GENÉRICO(INSTANCIAR)
            EstudianteBO objEBO = new EstudianteBO();
            //CREAR EL MENÚ
            while (opcion >= 1 && opcion <= 6) {
                System.out.println("INSTITUTO TETERITO");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1.Ingrese estudiante");
                System.out.println("2.Buscar estudiante");
                System.out.println("3.Modificar estudiante");
                System.out.println("4.Eliminar estudiante");
                System.out.println("5.Ver directorio de estudiantes");
                System.out.println("6.Salir");
                System.out.println("Opción:");
                opcion = Integer.parseInt(leer.readLine());
                switch (opcion) {
                    case 1:
                        //INSTANCIAR LA CLASE EstudianteVO PARA AÑADIR
                        EstudianteVO nuevo = new EstudianteVO();
                        System.out.println("Ingresar estudiante");
                        System.out.println("Ingresar nombres:");
                        nuevo.setNombres(leer.readLine());
                        System.out.println("Ingresar apellidos:");
                        nuevo.setApellidos(leer.readLine());
                        System.out.println("Ingresar correo institucional:");
                        nuevo.setCinstitucional(leer.readLine());
                        //CARGAR LOS DATOS AL ARREGLO NUEVO
                        objEBO.insertarEstudiante(nuevo);
                        break;
                    case 2:
                        System.out.println("Buscar estudiante");
                        System.out.println("Ingresar correo institucional:");
                        String cinstitucional = leer.readLine();
                        EstudianteVO encontrado = objEBO.obtenerEstudiante(cinstitucional);
                        if (encontrado != null) {
                            System.out.println("Información del estudiante");
                            System.out.println("Nombres: " + encontrado.getNombres());
                            System.out.println("Apellidos: " + encontrado.getApellidos());
                            System.out.println("Correo institucional: " + encontrado.getCinstitucional());
                        } else {
                            System.out.println("El estudiante no existe");
                        }
                        break;
                    case 3:
                        //ACTUALIZAR ESTUDIANTE(INSTANCIAR CLASE)
                        EstudianteVO actualizar = new EstudianteVO();
                        System.out.println("Ingresar correo institucional:");
                        cinstitucional = leer.readLine();
                        actualizar = objEBO.obtenerEstudiante(cinstitucional);
                        System.out.println("Ingresar nombres:");
                        actualizar.setNombres(leer.readLine());
                        System.out.println("Ingresar apellidos:");
                        actualizar.setApellidos(leer.readLine());
                        objEBO.actualizarEstudiante(actualizar);
                        break;
                    case 4:
                        //BORRAR O ELIMINAR ESTUDIANTE(INSTANCIAR CLASE)
                        System.out.println("Eliminar estudiante");
                        System.out.println("Ingresar correo institucional:");
                        cinstitucional = leer.readLine();
                        EstudianteVO estudiante = objEBO.obtenerEstudiante(cinstitucional);
                        objEBO.eliminarEstudiante(estudiante);
                        break;
                    case 5:
                        //IMPRIMIR LISTA DE ESTUDIANTES
                        System.out.println("El directorio de los estudiantes");
                        for (EstudianteVO estudiantes : objEBO.obtenerEstudiantes()) {
                            System.out.println(estudiantes);
                        }
                        break;
                    case 6:
                        System.out.println("Hasta pronto");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error, la excepción: " + ex);
        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}

