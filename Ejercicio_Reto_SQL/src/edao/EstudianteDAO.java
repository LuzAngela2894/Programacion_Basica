package edao;

import conexion.BaseConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.EstudianteVO;

public class EstudianteDAO extends BaseConexion implements IEstudianteDAO {

    @Override
    public boolean insertar_estudiante(EstudianteVO estudiante) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("insert into students (nombres, apellidos, nacimiento, programa, celular, cinstitucional) values (?,?,?,?,?,?)");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getPrograma());
            sentencia.setLong(5, estudiante.getCelular());
            sentencia.setString(6, estudiante.getCinstitucional());
            sentencia.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar_estudiante(EstudianteVO estudiante) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("UPDATE students set nombres=?, apellidos=?, nacimiento=?, programa=?, celular=? where cinstitucional=?");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getPrograma());
            sentencia.setLong(5, estudiante.getCelular());
            sentencia.setString(6, estudiante.getCinstitucional());
            sentencia.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar_estudiante(String cinstitucional) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("delete from students where cinstitucional=?");
            sentencia.setString(1, cinstitucional);
            sentencia.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<EstudianteVO> consultar_todos() {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();//INSTANCIAR LA LISTA
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select * from students");
            ResultSet datos = sentencia.executeQuery();//GUARDAR EN VARIABLE LOS DATOS
            while (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setApellidos(datos.getString("apellidos"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
    public EstudianteVO consultar_por_correo(String cinstitucional) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select * from students where cinstitucional=?");
            sentencia.setString(1, cinstitucional);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setApellidos(datos.getString("apellidos"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
    public List<EstudianteVO> consultar_por_apellido(String apellidos) {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select * from students where apellidos=?");
            sentencia.setString(1, apellidos);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setApellidos(datos.getString("apellidos"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
    public List<EstudianteVO> consultar_por_programa(String programa) {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select nombres,apellidos from students where programa=?");
            sentencia.setString(1, programa);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setApellidos(datos.getString("apellidos"));
                //estudiante.setNacimiento(datos.getString("nacimiento"));
                //estudiante.setPrograma(datos.getString("programa"));
                //estudiante.setCelular(datos.getLong("celular"));
                //estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
    public int consultar_cantidad_estudiantes(String programa) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select count(nombres) from students where programa=?");
            sentencia.setString(1, programa);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                int resultado = datos.getInt(1);
                closeConexion();
                return resultado;
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
    public List<EstudianteVO> consultar_por_fecha_nacimiento(String nacimiento) {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select * from students where nacimiento=?");
            sentencia.setString(1, nacimiento);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setApellidos(datos.getString("apellidos"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
    public EstudianteVO consultar_por_celular(Long celular) {
        try {
            getConexion();
            PreparedStatement sentencia = conexion.prepareStatement("select nombres,programa from students where celular=?");
            sentencia.setLong(1, celular);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setNombres(datos.getString("nombres"));
                //estudiante.setApellidos(datos.getString("apellidos"));
                //estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                //estudiante.setCelular(datos.getLong("celular"));
                //estudiante.setCinstitucional(datos.getString("cinstitucional"));
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
