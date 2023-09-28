
package universidad.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadg5";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;

    private Conexion() {
    }
    
    public static Connection getConexion(){
        
        if (connection == null){
            try {
                
                //Carga el driver
                Class.forName("org.mariadb.jdbc.Driver");
                
                //Crea la conexion
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error al conectarse");
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error al cargar los drivers");
            }
        }
        
        return connection;
        
    }
    
}
