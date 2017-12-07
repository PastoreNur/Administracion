/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import administracion.MySQL;
import entidades.Admision;
import entidades.Antecedentes;
import entidades.Datos_personales;
import entidades.Desempeño;
import entidades.acceso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author je_pa
 */
public class consulta{

    private conexion conectar(){
        conexion con = null;
        try{

        }catch(Exception e){

        }
        return con;
    }

    private static Connection Conexion;
    String Query;
    public static int tam;

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
    public void tam(){
        try{
            int i = 0;

            Query = "SELECT * FROM `acceso`";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            while( rs.next()){
                i++;
            }
            tam = i;
            System.out.println(i);
        }
        catch(Exception e){

        }
    }


    //PARA ANTECEDENTES
    public void agregar_ant(String empresa, String cargo, String jefe, String sueldo, String rem){
        try{
            CallableStatement proc = Conexion.prepareCall("CALL agregar_antecedentes(?,?,?,?,?,?)");
            proc.setInt("id", tam);
            proc.setString("empresaU", empresa);
            proc.setString("cargoU", cargo);
            proc.setString("jefeU", jefe);
            proc.setString("sueldoU", sueldo);
            proc.setString("remU", rem);
            proc.execute();
            JOptionPane.showMessageDialog(null, "SE INGRESO EL ANTECEDENTE",
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR EN INGRESO DE DATOS", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


    //PARA DESEMPEÑO
    public void agregar_des(String habi, String remu, String cargo, String fecha, String nota){
        try{
            CallableStatement proc = Conexion.prepareCall("CALL agregar_dese(?,?,?,?,?,?)");
            proc.setInt("id", tam);
            proc.setString("habi", habi);
            proc.setString("remu", remu);
            proc.setString("cargo", cargo);
            proc.setString("Ufecha", fecha);
            proc.setString("nota", nota);
            proc.execute();
            JOptionPane.showMessageDialog(null, "SE INGRESO EL DESEMPEÑO", "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR EN INGRESO DE DATOS", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    //PARA AGREGAR ADMISION
    public void agregar_admision(String fecha, String cargo, String salario, String jefe, String area, String contrato){
        try{
            CallableStatement proc = Conexion.prepareCall("CALL agregar_ad(?,?,?,?,?,?,?)");
            proc.setString("fecha", fecha);
            proc.setString("cargo", cargo);
            proc.setString("salario", salario);
            proc.setInt("id", tam);
            proc.setString("jefe", jefe);
            proc.setString("area", area);
            proc.setString("contrato", contrato);
            proc.execute();
            JOptionPane.showMessageDialog(null, "SE INGRESO INGRESARON TODOS LOS DATOS \n POR FAVOR VUELVA A INICIAR SESION PARA \n CONFIRMAR LOS CAMBIOS",
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR EN INGRESO DE DATOS", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    //PARA DATOS PERSONALES
    public void agregar_dp(String nombre, String apellido, String sexo,String edad,String DUI, String NIT,
            String direc,String nacion,String tel,String civil,String sangre){
        try{
            CallableStatement proc = Conexion.prepareCall("CALL agregar_datos(?,?,?,?,?,?,?,?,?,?,?,?)");
            proc.setInt("id", tam);
            proc.setString("nombre", nombre);
            proc.setString("apellido", apellido);
            proc.setString("sexo", sexo);
            proc.setString("edad", edad);
            proc.setString("DUI", DUI);
            proc.setString("NIT", NIT);
            proc.setString("direccion", direc);
            proc.setString("nacion", nacion);
            proc.setString("tel", tel);
            proc.setString("civil", civil);
            proc.setString("sangre", sangre);
            proc.execute();
            JOptionPane.showMessageDialog(null, "SE INGRESARON LOS DATOS PERSONALES",
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR EN INGRESO DE DATOS", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    //PARA AGREGAR ACCESO
    public void agregar_acceso(String acceso, String usu, String contra){
        try{
            CallableStatement proc = Conexion.prepareCall("CALL agregar_acceso(?,?,?)");
            proc.setString("acceso", acceso);
            proc.setString("usuario", usu);
            proc.setString("contra", contra);
            proc.execute();
            JOptionPane.showMessageDialog(null, "SE INGRESO EL ACCESO",
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR EN INGRESO DE DATOS", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}