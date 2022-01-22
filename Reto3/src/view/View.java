package view;

import controller.EBO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import modelo.EVO;

public class View {

    public void menu() throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        //CREAR UN ARREGLO GENÉRICO(INSTANCIAR)
        EBO objetoEBO = new EBO();
        while (opcion >= 1 && opcion <= 6) {
            System.out.println("\nINSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar:");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6. Salir");
            try {
            System.out.println("Opción:");
            opcion = Integer.parseInt(leer.readLine());
            } catch (IOException | NumberFormatException exc){
                System.out.println("El dato ingresado no es un número");
                System.out.println("Error: opción no válida");
                System.out.println("\nINSTITUTO LA FLORESTA");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1. Ingresar estudiante");
                System.out.println("2. Buscar estudiante");
                System.out.println("3. Modificar estudiante");
                System.out.println("4. Eliminar estudiante");
                System.out.println("5. Ver directorio de estudiantes");
                System.out.println("6. Salir");
                System.out.println("Opción:");
                opcion = Integer.parseInt(leer.readLine());
            }
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
                    } catch (IOException | NumberFormatException exc) {
                        registro.setNcelular(0);
                        System.out.println("El dato ingresado no es un número");
                    }
                    try {
                        System.out.println("\nIngresar número fijo:");
                        registro.setNfijo(Long.parseLong(leer.readLine()));
                    } catch (IOException | NumberFormatException exc) {
                        registro.setNfijo(0);
                        System.out.println("El dato ingresao no es un número");
                    }
                    System.out.println("\nIngresar programa:");
                    registro.setPrograma(leer.readLine());
                    //CARGA LOS DATOS A TRAVÉS DE REGISTRO
                    objetoEBO.ingresarEstudiante(registro);
                    break;
                case 2:
                    //BUSCAR UN ESTUDIANTE POR PARÁMETRO(CORREO INSTITUCIONAL)
                    System.out.println("\nBuscar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    String cinstitucional = leer.readLine();
                    EVO hallado = objetoEBO.buscarEstudiante(cinstitucional);
                    if (hallado != null) {
                        System.out.println("\nInformación del estudiante");
                        System.out.println("Nombres: " + hallado.getNombres());
                        System.out.println("Apellidos: " + hallado.getApellidos());
                        System.out.println("Fecha nacimiento: " + hallado.getFnacimiento());
                        System.out.println("Correo institucional: " + hallado.getCinstitucional());
                        System.out.println("Correo personal: " + hallado.getCpersonal());
                        System.out.println("Número de teléfono celular: " + hallado.getNcelular());
                        System.out.println("Número de teléfono fijo: " + hallado.getNfijo());
                        System.out.println("Programa académico: " + hallado.getPrograma());
                    } else {
                        System.out.println("El estudiante no se encuentra registrado en el instituto");
                    }
                    break;
                case 3:
                    EVO modificar = new EVO();
                    System.out.println("\nModificar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    cinstitucional = leer.readLine();
                    modificar = objetoEBO.buscarEstudiante(cinstitucional);
                    System.out.println("\nIngresar correo personal:");
                    modificar.setCpersonal(leer.readLine());
                    try {
                        System.out.println("\nIngresar número de celular:");
                        modificar.setNcelular(Long.parseLong(leer.readLine()));
                    } catch (IOException | NumberFormatException exc) {
                        modificar.setNcelular(0);
                    }
                    try {
                        System.out.println("\nIngresar número fijo:");
                        modificar.setNfijo(Long.parseLong(leer.readLine()));
                    } catch (IOException | NumberFormatException exc) {
                        modificar.setNfijo(0);
                    }

                    System.out.println("Ingresar programa:");
                    modificar.setPrograma(leer.readLine());
                    objetoEBO.modificarEstudiante(modificar);
                    break;
                case 4:
                    System.out.println("\nEliminar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    cinstitucional = leer.readLine();
                    EVO serhumano = objetoEBO.buscarEstudiante(cinstitucional);
                    objetoEBO.borrarEstudiante(serhumano);
                    break;
                case 5:
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
    }
}
