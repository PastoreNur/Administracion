/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
