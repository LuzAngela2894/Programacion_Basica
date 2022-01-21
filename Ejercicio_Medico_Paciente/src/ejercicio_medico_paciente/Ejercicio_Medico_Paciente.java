package ejercicio_medico_paciente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_Medico_Paciente {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String CedulaMedico, NombreMedico, CedulaPaciente, NombrePaciente, Direccion;
        Double Salario;
        System.out.println("Ingrese la cédula del médico: ");
        CedulaMedico = leer.readLine();
        System.out.println("Ingrese el nombre del médico: ");
        NombreMedico = leer.readLine();
        System.out.println("Ingrese el salario del médico: ");
        Salario = Double.parseDouble(leer.readLine());
        System.out.println("Ingrese la cédula del paciente: ");
        CedulaPaciente = leer.readLine();
        System.out.println("Ingrese el nombre del paciente: ");
        NombrePaciente = leer.readLine();
        System.out.println("Ingrese la dirección del paciente: ");
        Direccion = leer.readLine();
        Medico objmed = new Medico();
        Paciente objpac = new Paciente();
        objmed.setCedula(CedulaMedico);
        objmed.setNombre(NombreMedico);
        objmed.setSalario(Salario);
        objpac.setCedula(CedulaPaciente);
        objpac.setNombre(NombrePaciente);
        objpac.setDireccion(Direccion);
        System.out.println("El médico " + objmed.getNombre() + " con C.C. No. " + objmed.getCedula() + " obtiene un salario de " + objmed.getSalario()
                + " y su paciente " + objpac.getNombre() + " con C.C. No. " + objpac.getCedula() + " vive en " + objpac.getDireccion());
    }

}
