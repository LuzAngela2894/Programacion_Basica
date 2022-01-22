package conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

    public static final String URL = "jdbc:mariadb://camiloc2.czo3ixoe3xoe.us-east-1.rsd.amazonaws.com/grupo18_equipo5";
    public static final String USER = "admin";
    public static final String CLAVE = "Admin123$";
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
