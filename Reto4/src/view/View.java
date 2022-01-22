package view;

import controller.EBO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import modelo.EVO;

public class View {

    public void menu() throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            int opcion = 1;
            //CREAR UN ARREGLO GENÉRICO(INSTANCIAR)
            EBO objetoEBO = new EBO();
            while (opcion >= 1 && opcion <= 6) {
                System.out.println("\nINSTITUTO LA FLORESTA");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1. Ingresar estudiante");
                System.out.println("2. Consultas");
                System.out.println("3. Modificar estudiante");
                System.out.println("4. Eliminar estudiante");
                System.out.println("5. Ver directorio de estudiantes");
                System.out.println("6. Salir");
                System.out.println("Opción:");
                opcion = Integer.parseInt(leer.readLine());
                switch (opcion) {
                    case 1:
                        //INSTANCIAR LA CLASE EVO PARA AÑADIR REGISTROS
                        EVO registro = new EVO();
                        System.out.println("\nIngresar estudiante");
                        System.out.println("Ingresar nombres:");
                        registro.setNombres(leer.readLine());
                        System.out.println("\nIngresar apellidos:");
                        registro.setApellidos(leer.readLine());
                        System.out.println("\nIngresar fecha de nacimiento (YYYY-MM-DD):");
                        registro.setFnacimiento(leer.readLine());
                        System.out.println("\nIngresar correo institucional:");
                        registro.setCinstitucional(leer.readLine());
                        System.out.println("\nIngresar correo personal:");
                        registro.setCpersonal(leer.readLine());
                        try {
                            System.out.println("\nIngresar número de celular:");
                            registro.setNcelular(Long.parseLong(leer.readLine()));
                        } catch (NumberFormatException exc) {
                            registro.setNcelular(0);
                            System.out.println("El dato ingresado no es un número");
                        }
                        try {
                            System.out.println("\nIngresar número fijo:");
                            registro.setNfijo(Long.parseLong(leer.readLine()));
                        } catch (NumberFormatException exc) {
                            registro.setNfijo(0);
                            System.out.println("El dato ingresado no es un número");
                        }
                        System.out.println("\nIngresar programa:");
                        registro.setPrograma(leer.readLine());
                        //CARGA LOS DATOS A TRAVÉS DE REGISTRO
                        objetoEBO.ingresarEstudiante(registro);
                        break;
                    case 2:
                        try {
                        //BUSCAR ESTUDIANTE(S) POR CONSULTAS EN SQL
                        int consulta = 1;
                        while (consulta >= 1 & consulta <= 6) {
                            System.out.println("\nConsultas");
                            System.out.println("\nSeleccione consulta a realizar:");
                            System.out.println("1. Buscar estudiante por correo electrónico");
                            System.out.println("2. Buscar estudiante por apellidos");
                            System.out.println("3. Buscar por programa");
                            System.out.println("4. Buscar cantidad de estudiantes por programa");
                            System.out.println("5. Buscar por fecha de nacimiento");
                            System.out.println("6. Buscar por número de celular");
                            System.out.println("Opción (0 para salir)");
                            consulta = Integer.parseInt(leer.readLine());
                            switch (consulta) {
                                case 1:
                                    EVO encontrado = new EVO();
                                    System.out.println("1. Buscar estudiante por correo");
                                    System.out.println("Ingresar correo institucional:");
                                    String cinstitucional = leer.readLine();
                                    encontrado = objetoEBO.buscarCorreo(cinstitucional);
                                    if (encontrado != null) {
                                        System.out.println("\nInformación del estudiante");
                                        System.out.println("\nNombres: " + encontrado.getNombres());
                                        System.out.println("Apellidos: " + encontrado.getApellidos());
                                        System.out.println("Fecha nacimiento: " + encontrado.getFnacimiento());
                                        System.out.println("Correo institucional: " + encontrado.getCinstitucional());
                                        System.out.println("Correo personal:" + encontrado.getCpersonal());
                                        System.out.println("Número de teléfono celular: " + encontrado.getNcelular());
                                        System.out.println("Número de teléfono fijo: " + encontrado.getNfijo());
                                        System.out.println("Programa académico: " + encontrado.getPrograma());
                                    } else {
                                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                                    }
                                    break;
                                case 2:
                                    System.out.println("2. Buscar estudiante por apellidos");
                                    System.out.println("Ingresar apellido:");
                                    String apellidos = leer.readLine();
                                    List<EVO> estudiantes = objetoEBO.buscarApellidos(apellidos);
                                    if (estudiantes.isEmpty()) {
                                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                                    } else {
                                        System.out.println("\nInformación del estudiante");
                                        for (EVO estudiante : estudiantes) {
                                            System.out.println("\nNombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                            System.out.println("Fecha nacimiento: " + estudiante.getFnacimiento());
                                            System.out.println("Correo institucional: " + estudiante.getCinstitucional());
                                            System.out.println("Correo personal:" + estudiante.getCpersonal());
                                            System.out.println("Número de teléfono celular: " + estudiante.getNcelular());
                                            System.out.println("Número de teléfono fijo: " + estudiante.getNfijo());
                                            System.out.println("Programa académico: " + estudiante.getPrograma());
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("3. Buscar por programa");
                                    System.out.println("Ingresar programa:");
                                    String programa = leer.readLine();
                                    estudiantes = objetoEBO.buscarPrograma(programa);
                                    if (estudiantes.isEmpty()) {
                                        System.out.println("No hay resultados para esa consulta");
                                    } else {
                                        System.out.println("\nInformación del estudiante");
                                        for (EVO estudiante : estudiantes) {
                                            System.out.println("\nNombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("4. Buscar cantidad de estudiantes por programa");
                                    System.out.println("Ingresar programa:");
                                    programa = leer.readLine();
                                    Integer cantidad = objetoEBO.buscarCantidad(programa);
                                    System.out.println("Cantidad estudiantes del programa " + programa + ": " + cantidad);
                                    break;
                                case 5:
                                    System.out.println("5. Buscar por fecha de nacimiento");
                                    System.out.println("Ingresar fecha de nacimiento:");
                                    String fnacimiento = leer.readLine();
                                    estudiantes = objetoEBO.buscarFnacimiento(fnacimiento);
                                    if (estudiantes.isEmpty()) {
                                        System.out.println("No hay resultados para esa consulta");
                                    } else {
                                        System.out.println("\nInformación del estudiante");
                                        for (EVO estudiante : estudiantes) {
                                            System.out.println("\nNombres: " + estudiante.getNombres());
                                            System.out.println("Apellidos: " + estudiante.getApellidos());
                                            System.out.println("Fecha nacimiento: " + estudiante.getFnacimiento());
                                            System.out.println("Correo institucional: " + estudiante.getCinstitucional());
                                            System.out.println("Correo personal:" + estudiante.getCpersonal());
                                            System.out.println("Número de teléfono celular: " + estudiante.getNcelular());
                                            System.out.println("Número de teléfono fijo: " + estudiante.getNfijo());
                                            System.out.println("Programa académico: " + estudiante.getPrograma());
                                        }
                                    }
                                    break;
                                case 6:
                                    EVO hallado = new EVO();
                                    System.out.println("6. Buscar por número de celular");
                                    System.out.println("Ingresar celular:");
                                    long ncelular = Long.parseLong(leer.readLine());
                                    hallado = objetoEBO.buscarCelular(ncelular);
                                    if (hallado != null) {
                                        System.out.println("\nInformación del estudiante");
                                        System.out.println("\nNombres: " + hallado.getNombres());
                                        System.out.println("Programa académico: " + hallado.getPrograma());
                                    } else {
                                        System.out.println("No hay resultados para esa consulta");
                                    }
                                    break;
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    case 3:
                        //ACTUALIZAR ESTUDIANTE(INSTANCIAR CLASE)
                        EVO modificar = new EVO();
                        System.out.println("\nModificar estudiante");
                        System.out.println("Ingresar correo institucional:");
                        String cinstitucional = leer.readLine();
                        modificar = objetoEBO.buscarEstudiante(cinstitucional);
                        if (modificar != null) {
                            System.out.println("\nIngresar correo personal:");
                            modificar.setCpersonal(leer.readLine());
                            try {
                                System.out.println("\nIngresar número de celular:");
                                modificar.setNcelular(Long.parseLong(leer.readLine()));
                            } catch (NumberFormatException exc) {
                                modificar.setNcelular(0);
                            }
                            try {
                                System.out.println("\nIngresar número fijo:");
                                modificar.setNfijo(Long.parseLong(leer.readLine()));
                            } catch (NumberFormatException exc) {
                                modificar.setNfijo(0);
                            }
                            System.out.println("\nIngresar programa:");
                            modificar.setPrograma(leer.readLine());
                            objetoEBO.modificarEstudiante(modificar);
                        } else {
                            System.out.println("El estudiante no se encuentra registrado en el instituto");
                        }
                        break;
                    case 4:
                        //BORRAR O ELIMINAR ESTUDIANTE(INSTANCIAR CLASE)
                        System.out.println("\nEliminar estudiante");
                        System.out.println("Ingresar correo institucional:");
                        cinstitucional = leer.readLine();
                        EVO estudiante = objetoEBO.buscarEstudiante(cinstitucional);
                        if (estudiante != null) {
                            objetoEBO.borrarEstudiante(estudiante);
                        } else {
                            System.out.println("El estudiante no se encuentra registrado en el instituto");
                        }
                        break;
                    case 5:
                        //IMPRIMIR LISTA DE ESTUDIANTES
                        System.out.println("\nEl directorio de los estudiantes");
                        for (EVO estudiantes : objetoEBO.mostrarDirectorio()) {
                            System.out.println("\nNombres: " + estudiantes.getNombres());
                            System.out.println("Apellidos: " + estudiantes.getApellidos());
                            System.out.println("Fecha nacimiento: " + estudiantes.getFnacimiento());
                            System.out.println("Correo institucional: " + estudiantes.getCinstitucional());
                            System.out.println("Correo personal: " + estudiantes.getCpersonal());
                            System.out.println("Número de teléfono celular: " + estudiantes.getNcelular());
                            System.out.println("Número de teléfono fijo: " + estudiantes.getNfijo());
                            System.out.println("Programa académico: " + estudiantes.getPrograma());
                        }
                        break;
                    case 6:
                        System.out.println("\nHasta pronto");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
