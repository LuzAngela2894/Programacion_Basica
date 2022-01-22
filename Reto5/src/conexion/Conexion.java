package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/bd_estudiantes";
    public static final String USER = "root";
    public static final String CLAVE = "root";

    protected Connection enlace;

    protected void getConexion() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            enlace = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    protected void closeConexion() {
        try {
            enlace.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
