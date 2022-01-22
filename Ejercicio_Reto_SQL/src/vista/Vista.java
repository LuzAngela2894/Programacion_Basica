package vista;

import controlador.EstudianteBO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import modelo.EstudianteVO;

public class Vista {

    public void menu() throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            int opcion = 1;
            //CREAR EL ARREGLO GENÉRICO(INSTANCIAR)
            EstudianteBO objEBO = new EstudianteBO();
            //CREAR EL MENÚ
            while (opcion >= 1 && opcion <= 6) {
                System.out.println("\nINSTITUTO TETERITO");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1.Ingrese estudiante");
                System.out.println("2.Consultas");
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
                        System.out.println("Ingresar fecha de nacimiento:");
                        nuevo.setNacimiento(leer.readLine());
                        System.out.println("Ingresar programa:");
                        nuevo.setPrograma(leer.readLine());
                        System.out.println("Ingresar celular:");
                        nuevo.setCelular(Long.parseLong(leer.readLine()));
                        System.out.println("Ingresar correo institucional:");
                        nuevo.setCinstitucional(leer.readLine());
                        //CARGAR LOS DATOS AL ARREGLO NUEVO
                        objEBO.insertarEstudiante(nuevo);
                        break;
                    case 2:
                        try{
                        //BUSCAR UN ESTUDIANTE POR CONSULTAS EN SQL
                        int consulta = 1;
                        while (consulta >= 1 & consulta <= 6) {
                            System.out.println("\nConsultas");
                            System.out.println("Seleccione consulta a realizar:");
                            System.out.println("1. Buscar estudiante por correo electrónico");
                            System.out.println("2. Buscar estudiante por apellidos");
                            System.out.println("3. Buscar por programa");
                            System.out.println("4. Buscar cantidad de estudiantes por programa");
                            System.out.println("5. Buscar por fecha de nacimiento");
                            System.out.println("6. Buscar por número de celular");
                            System.out.println("Opción");
                            consulta = Integer.parseInt(leer.readLine());
                            switch (consulta) {
                                case 1:
                                    EstudianteVO encontrado = new EstudianteVO();
                                    System.out.println("1. Buscar estudiante por correo");
                                    System.out.println("Ingresar correo institucional:");
                                    String cinstitucional = leer.readLine();
                                    encontrado = objEBO.consultar_por_correo(cinstitucional);
                                    if (encontrado != null) {
                                        System.out.println("Información del estudiante");
                                        System.out.println("Nombres: " + encontrado.getNombres());
                                        System.out.println("Apellidos: " + encontrado.getApellidos());
                                        System.out.println("Fecha nacimiento: " + encontrado.getNacimiento());
                                        System.out.println("Programa: " + encontrado.getPrograma());
                                        System.out.println("Número celular: " + encontrado.getCelular());
                                        System.out.println("Correo institucional: " + encontrado.getCinstitucional());
                                    } else {
                                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                                    }
                                    break;
                                case 2:
                                    System.out.println("2. Buscar estudiante por apellidos");
                                    System.out.println("Ingresar apellido:");
                                    String apellidos = leer.readLine();
                                    List<EstudianteVO> estudiantes = objEBO.consultar_por_apellido(apellidos);
                                    if (estudiantes.isEmpty()) {
                                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                                    } else {
                                        for (EstudianteVO estudiante : estudiantes) {
                                            System.out.println("Información del estudiante");
                                            System.out.println("Nombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                            System.out.println("Fecha nacimiento: " + estudiante.getNacimiento());
                                            System.out.println("Programa: " + estudiante.getPrograma());
                                            System.out.println("Número celular: " + estudiante.getCelular());
                                            System.out.println("Correo institucional: " + estudiante.getCinstitucional());
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("3. Buscar por programa");
                                    System.out.println("Ingresar programa:");
                                    String programa = leer.readLine();
                                    estudiantes = objEBO.consultar_por_programa(programa);
                                    if (estudiantes != null) {
                                        for (EstudianteVO estudiante : estudiantes) {
                                            System.out.println("Información del estudiante");
                                            System.out.println("Nombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                        }
                                    } else {
                                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                                    }
                                    break;
                                case 4:
                                    System.out.println("4. Buscar cantidad de estudiantes por programa");
                                    System.out.println("Ingresar programa:");
                                    programa = leer.readLine();
                                    Integer cantidad = objEBO.consultar_cantidad_estudiantes(programa);
                                    System.out.println(cantidad);
                                    break;
                                case 5:
                                    System.out.println("5. Buscar por fecha de nacimiento");
                                    System.out.println("Ingresar fecha de nacimiento:");
                                    String nacimiento = leer.readLine();
                                    estudiantes = objEBO.consultar_por_fecha_nacimiento(nacimiento);
                                    if (estudiantes != null) {
                                        for (EstudianteVO estudiante : estudiantes) {
                                            System.out.println("Información del estudiante");
                                            System.out.println("Nombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                            System.out.println("Fecha nacimiento: " + estudiante.getNacimiento());
                                            System.out.println("Programa: " + estudiante.getPrograma());
                                            System.out.println("Número celular: " + estudiante.getCelular());
                                            System.out.println("Correo institucional: " + estudiante.getCinstitucional());
                                        }
                                    } else {
                                        System.out.println("No hay resultados para esa consulta");
                                    }
                                    break;
                                case 6:
                                    EstudianteVO hallado = new EstudianteVO();
                                    System.out.println("6. Buscar por número de ceular");
                                    System.out.println("Ingresar celular:");
                                    long celular = Long.parseLong(leer.readLine());
                                    hallado = objEBO.consultar_por_celular(celular);
                                    if (hallado != null) {
                                        System.out.println("Información del estudiante");
                                        System.out.println("Nombres: " + hallado.getNombres());
                                        //System.out.println("Apellidos: " + hallado.getApellidos());
                                        //System.out.println("Fecha nacimiento: " + hallado.getNacimiento());
                                        System.out.println("Programa: " + hallado.getPrograma());
                                        //System.out.println("Número celular: " + hallado.getCelular());
                                        //System.out.println("Correo institucional: " + hallado.getCinstitucional());
                                    } else {
                                        System.out.println("No hay resultados para esa consulta");
                                    }
                                    break;
                            }
                        }
                        }catch(NumberFormatException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        //ACTUALIZAR ESTUDIANTE(INSTANCIAR CLASE)
                        EstudianteVO actualizar = new EstudianteVO();
                        System.out.println("Ingresar correo institucional:");
                        String cinstitucional = leer.readLine();
                        actualizar = objEBO.obtenerEstudiante(cinstitucional);
                        System.out.println("Ingresar nombres:");
                        actualizar.setNombres(leer.readLine());
                        System.out.println("Ingresar apellidos:");
                        actualizar.setApellidos(leer.readLine());
                        System.out.println("Ingresar fecha de nacimiento:");
                        actualizar.setNacimiento(leer.readLine());
                        System.out.println("Ingresar programa:");
                        actualizar.setPrograma(leer.readLine());
                        System.out.println("Ingresar celular:");
                        actualizar.setCelular(Long.parseLong(leer.readLine()));
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
        } catch (NumberFormatException e) {
            System.out.println("Error, la excepción: " + e);
        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}
