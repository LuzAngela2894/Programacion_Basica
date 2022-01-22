package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.EVO;

public class EDAO extends Conexion implements IEDAO {

    @Override
    public boolean ingresarEstudiante(EVO serhumano) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("insert into estudiantes(nombres, apellidos, fnacimiento, cpersonal, ncelular, nfijo, programa, cinstitucional) values (?,?,?,?,?,?,?,?)");
            consulta.setString(1, serhumano.getNombres());
            consulta.setString(2, serhumano.getApellidos());
            consulta.setString(3, serhumano.getFnacimiento());
            consulta.setString(4, serhumano.getCpersonal());
            consulta.setLong(5, serhumano.getNcelular());
            consulta.setLong(6, serhumano.getNfijo());
            consulta.setString(7, serhumano.getPrograma());
            consulta.setString(8, serhumano.getCinstitucional());
            consulta.executeUpdate();
            closeConexion();
            System.out.println("\nSe agregó el estudiante");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificarEstudiante(EVO serhumano) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("UPDATE estudiantes set cpersonal=?, ncelular=?, nfijo=?, programa=? where cinstitucional=?");
            consulta.setString(1, serhumano.getCpersonal());
            consulta.setLong(2, serhumano.getNcelular());
            consulta.setLong(3, serhumano.getNfijo());
            consulta.setString(4, serhumano.getPrograma());
            consulta.setString(5, serhumano.getCinstitucional());
            consulta.executeUpdate();
            closeConexion();
            System.out.println("\nSe modificó el estudiante");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean borrarEstudiante(String cinstitucional) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("delete from estudiantes where cinstitucional=?");
            consulta.setString(1, cinstitucional);
            consulta.executeUpdate();
            closeConexion();
            System.out.println("\nSe eliminó el estudiante");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<EVO> mostrarDirectorio() {
        try {
            //INSTANCIAR LA LISTA
            List<EVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select * from estudiantes");
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setApellidos(data.getString("apellidos"));
                estudiante.setFnacimiento(data.getString("fnacimiento"));
                estudiante.setCinstitucional(data.getString("cinstitucional"));
                estudiante.setCpersonal(data.getString("cpersonal"));
                estudiante.setNcelular(data.getLong("ncelular"));
                estudiante.setNfijo(data.getLong("nfijo"));
                estudiante.setPrograma(data.getString("programa"));
                estudiantes.add(estudiante);
            }
            closeConexion();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public EVO buscarCorreo(String cinstitucional) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select * from estudiantes where cinstitucional=?");
            consulta.setString(1, cinstitucional);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            if (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setApellidos(data.getString("apellidos"));
                estudiante.setFnacimiento(data.getString("fnacimiento"));
                estudiante.setCinstitucional(data.getString("cinstitucional"));
                estudiante.setCpersonal(data.getString("cpersonal"));
                estudiante.setNcelular(data.getLong("ncelular"));
                estudiante.setNfijo(data.getLong("nfijo"));
                estudiante.setPrograma(data.getString("programa"));
                closeConexion();
                return estudiante;
            } else {
                closeConexion();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<EVO> buscarApellidos(String apellidos) {
        try {
            //INSTANCIAR LA LISTA
            List<EVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select * from estudiantes where apellidos=?");
            consulta.setString(1, apellidos);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setApellidos(data.getString("apellidos"));
                estudiante.setFnacimiento(data.getString("fnacimiento"));
                estudiante.setCinstitucional(data.getString("cinstitucional"));
                estudiante.setCpersonal(data.getString("cpersonal"));
                estudiante.setNcelular(data.getLong("ncelular"));
                estudiante.setNfijo(data.getLong("nfijo"));
                estudiante.setPrograma(data.getString("programa"));
                estudiantes.add(estudiante);
            }
            closeConexion();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<EVO> buscarPrograma(String programa) {
        try {
            //INSTANCIAR LA LISTA
            List<EVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select nombres, apellidos from estudiantes where programa=?");
            consulta.setString(1, programa);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setApellidos(data.getString("apellidos"));
                estudiantes.add(estudiante);
            }
            closeConexion();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public int buscarCantidad(String programa) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select count(nombres) from estudiantes where programa=?");
            consulta.setString(1, programa);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            if (data.next()) {
                int result = data.getInt(1);
                closeConexion();
                return result;
            } else {
                closeConexion();
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }

    }

    @Override
    public List<EVO> buscarFnacimiento(String fnacimiento) {
        try {
            //INSTANCIAR LA LISTA
            List<EVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select * from estudiantes where fnacimiento=?");
            consulta.setString(1, fnacimiento);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setApellidos(data.getString("apellidos"));
                estudiante.setFnacimiento(data.getString("fnacimiento"));
                estudiante.setCinstitucional(data.getString("cinstitucional"));
                estudiante.setCpersonal(data.getString("cpersonal"));
                estudiante.setNcelular(data.getLong("ncelular"));
                estudiante.setNfijo(data.getLong("nfijo"));
                estudiante.setPrograma(data.getString("programa"));
                estudiantes.add(estudiante);
            }
            closeConexion();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public EVO buscarCelular(Long ncelular) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("select nombres, programa from estudiantes where ncelular=?");
            consulta.setLong(1, ncelular);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            if (data.next()) {
                EVO estudiante = new EVO();
                estudiante.setNombres(data.getString("nombres"));
                estudiante.setPrograma(data.getString("programa"));
                closeConexion();
                return estudiante;
            } else {
                closeConexion();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
