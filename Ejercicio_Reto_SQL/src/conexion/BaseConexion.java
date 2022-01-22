package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseConexion {

    public static final String URL = "jdbc:mysql://localhost:3306/universidad";
    public static final String USER = "root";
    public static final String CLAVE = "root";

    protected Connection conexion;

    protected void getConexion() throws ClassNotFoundException {
        try {
            //INDICAR LA RUTA DEL DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Cargado");
            //IDENTIFICAR LA BASE, USUARIO Y CLAVE
            conexion = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    protected void closeConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
