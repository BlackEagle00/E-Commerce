package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andrés Bonilla
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/bdcarritocompras";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
}
