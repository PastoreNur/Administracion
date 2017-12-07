package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    private static String db="db_a2ee9e_admin";
    private static String user="a2ee9e_admin";
    private static String pass="rmjp1234";
    private static String host="mysql7001.site4now.net";
    private static String server="jdbc:mysql://"+host+"/"+db;
    
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(server,user,pass);         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }    
}