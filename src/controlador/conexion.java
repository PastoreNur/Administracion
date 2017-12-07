/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import administracion.MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author je_pa
 */
public class conexion {
    String user = "a2ee9e_admin";
    String contra = "rmjp1234";
    String host = "mysql7001.site4now.net";
    String port = "3306";
    String db = "db_a2ee9e_admin";
    String driver = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://" + host + ":" + port + "/" + db;
    Connection con;
    
    private static Connection Conexion;
    String Query;
    
    public conexion () throws SQLException{
    try{
    Class.forName(driver);
    con = DriverManager.getConnection(URL,user,contra);
    }catch(ClassNotFoundException e){
    System.err.print("Error " + e);
    }catch(SQLException e){
    System.err.print("Error " + e);
    }
    }
    
    public Connection getconexion(){
    return con;
    }
    
    public void MySQLConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://mysql7001.site4now.net:3306/db_a2ee9e_admin", "a2ee9e_admin", "rmjp1234");
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
