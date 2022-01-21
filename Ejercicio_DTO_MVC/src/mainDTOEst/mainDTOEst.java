package mainDTOEst;

import controladorBO.EstudianteBO;
import modeloVO.EstudianteVO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainDTOEst {

    public static void main(String[] args) throws IOException {
    try{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //variables
        int opcion=1;        
        //Crear un ArrayList genérico
        EstudianteBO objestBO = new EstudianteBO();        
        // uso del while para el menú      
        while (opcion >= 1 && opcion <= 6) {
            System.out.println("INSTITUTO LA FLORESTA");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6.Salir");
            System.out.println("Seleccione tarea a realizar: ");
            opcion = Integer.parseInt(leer.readLine());          
            switch (opcion) {
                case 1:                   
                    // Tamaño de arrayList antes de añadir elementos  
                    System.out.println("Tamaño actual de ArrayList: " + objestBO.obtenerEstudiantes().size());
                    // Instanciar la clase EstudianteVO para añadir 
                    EstudianteVO nuevo=new EstudianteVO();
                    System.out.println("Ingrese el nombre del estudiante");
                    nuevo.setNombres(leer.readLine());
                    System.out.println("Ingrese el apellido del estudiante");
                    nuevo.setApellidos(leer.readLine());
                    System.out.println("Ingrese fecha de nacimiento");
                    nuevo.setNacimiento(leer.readLine());
                    System.out.println("Ingrese correo institucional");
                    nuevo.setCorreoInst(leer.readLine());
                    //carga los datos a través de nuevo
                    objestBO.insertarEstudiante(nuevo);
                    //Verificar el tamaño actual del arreglo
                    System.out.println("Tamaño actual de ArrayList: " + objestBO.obtenerEstudiantes().size());
                    break;
               case 2:
                    //consultar un estudiante por el correo institucional                   
                    System.out.println("Ingrese el correo a consultar: ");
                    String CorreoInst= leer.readLine();
                    EstudianteVO encontrado=objestBO.obtenerEstudiante(CorreoInst);
                    if (encontrado!=null){
                        System.out.println("Información del estudiante");
                        System.out.println("Nombres: "+encontrado.getNombres());
                        System.out.println("Apellidos: "+encontrado.getApellidos());
                        System.out.println("Fecha de nacimiento:"+encontrado.getNacimiento());
                        System.out.println("Correo institucional:"+encontrado.getCorreoInst());
                    }
                    else{
                        System.out.println("El estudiante no existe");
                    }
                    break;
               case 3:
                    EstudianteVO actualizar=new EstudianteVO();
                    System.out.println("Ingrese el correo a consultar: ");
                    CorreoInst= leer.readLine();
                    actualizar=objestBO.obtenerEstudiante(CorreoInst);                    
                    System.out.println("Ingrese el nombre del estudiante");
                    actualizar.setNombres(leer.readLine());
                    System.out.println("Ingrese el apellido del estudiante");
                    actualizar.setApellidos(leer.readLine());
                    System.out.println("Ingrese fecha de nacimiento");
                    actualizar.setNacimiento(leer.readLine());
                    objestBO.actualizarEstudiante(actualizar);
                    break;
                case 4:
                    System.out.println("Ingrese el correo a consultar: ");
                    CorreoInst= leer.readLine();
                     EstudianteVO estudiante=objestBO.obtenerEstudiante(CorreoInst);
                    objestBO.eliminarEStudiante(estudiante);
                    System.out.println("El estudiante fue eliminado");
                    System.out.println("Tamaño actual de ArrayList: " + objestBO.obtenerEstudiantes().size());
                    break;
                case 5:
                    for (EstudianteVO estudiantes : objestBO.obtenerEstudiantes()) {
                        System.out.println(estudiantes);}
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
    catch (Exception e){
        System.out.println("Error, la excepcion es: "+e);
    }
    finally{
        System.out.println("Programa terminado...");
    }
 }
}
   
    
