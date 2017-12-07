package administracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MySQL {
    private static Connection Conexion;
    String Query;
    String Query1;
    String Query2;
    String Query3;
    
    //NIVEL DE ACCESO
    public static int acceso;
    
    public ArrayList<String> lista = new ArrayList<>();
    
    //PARA DATOS PERSONALES
    public static int ID;
    public static String nombre = "";
    public static String apellido = "";
    public static String sexo = "";
    public static String direccion = "";
    public static String nacio = "";
    public static String edad = "";
    public static String dui = "";
    public static String nit = "";
    public static String estado = "";
    public static String tipo = "";
    public static String tel = "";
    
    //PARA ANTECEDENTES
    public static String ultimaEmpresa = "";
    public static String ultimoCargo = "";
    public static String ultimoJefe = "";
    public static double ultimoSueldo;
    public static double remuneracion;
    
    //PARA ADMICION
    public static String fechaContrato = "";
    public static String cargo = "";
    public static double salario;
    public static String codigo = "";
    public static String jefe = "";
    public static String area = "";
    public static String contrato = "";
    
    //PARA DESEMPEÑO
    public static String habilidades = "";
    public static String cargoActual = "";
    public static String fecha = "";
    public static double nota;
    public static double remuneracionD;
    
    
    //PARA ABRIR LA CONEXION
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
    //PARA CERRAR LA CONEXION
    public void cerrarConnection(){
        try {
            Conexion.close();           
        }
        catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex  );
        }
    }
    
    //PARA VALIDAR EL USARIO
    public boolean validadUsuario(String usu, String contra){
        boolean corr = false;
        try{
            Query = "SELECT * FROM acceso where nombre_usu='"+ usu +"'"+" and contra_usu='"+ contra+"';";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            if( rs.first() ){
                ID = rs.getInt("id_usuario");
                acceso = rs.getInt("nivel_acceso");
                menu m = new menu();
                m.setVisible(true);
                corr = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA NO VALIDOS");
                 corr = false;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRROR EN EL PROCEDIMIENTO", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return corr;
    }
    //PARA TODOS LOS CAMPOS DE LOS FORMULARIO
    public void informacion() throws SQLException{
        try{
            //PARA DATOS PERSONALES
            Query = "SELECT * FROM datospersonales WHERE id_usuario='" + ID +"'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            if(rs.first()){
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                sexo = rs.getString("sexo");
                edad = rs.getString("edad");
                dui = rs.getString("DUI");
                nit = rs.getString("NIT");
                direccion = rs.getString("direccion");
                nacio = rs.getString("nacionalidad");
                tel = rs.getString("telefono");
                estado = rs.getString("estado_civil");
                tipo = rs.getString("tipo_sangre");
                System.out.println(nombre + apellido + sexo+edad+dui+nit+direccion+nacio+tel+estado+tipo);
            }
            
            //PARA ANTECEDENTES
            Query1 = "SELECT * FROM antecedentes WHERE id_usuario='" + ID +"'";
            Statement st1 = Conexion.createStatement();
            java.sql.ResultSet rs1;
            rs1 = st1.executeQuery(Query1);
            if(rs1.first()){
                ultimaEmpresa = rs1.getString("ultima_empresa");
                ultimoCargo = rs1.getString("ultimo_cargo");
                ultimoJefe = rs1.getString("jefe_inmediato");
                ultimoSueldo = rs1.getDouble("ultimo_sueldo");
                remuneracion = rs1.getDouble("remuneracion");
                System.out.println(ultimaEmpresa+ultimoCargo+jefe+ultimoSueldo+remuneracion);
            }
            
            //PARA ADMISION
            Query2 = "SELECT * FROM admision WHERE id_usario='" + ID +"'";
            Statement st2 = Conexion.createStatement();
            java.sql.ResultSet rs2;
            rs2 = st2.executeQuery(Query2);
            if(rs2.first()){
                fechaContrato = rs2.getString("fecha_contrato");
                cargo = rs2.getString("cargo_inicial");
                salario = rs2.getDouble("salario");
                codigo = String.valueOf(ID);
                jefe = rs2.getString("jefe");
                area = rs2.getString("area");
                contrato =  rs2.getString("contrato");
                System.out.println(fechaContrato + cargo + salario + codigo + jefe + area + contrato);
            }
            //PARA DESEMPEÑO
            Query3 = "SELECT * FROM desempeño WHERE id_usuario='" + ID +"'";
            Statement st3 = Conexion.createStatement();
            java.sql.ResultSet rs3;
            rs3 = st3.executeQuery(Query3);
            if(rs3.first()){
                habilidades = rs3.getString("habilidades");
                cargoActual = rs3.getString("cargo_actual");
                fecha = rs3.getString("ultima_fecha");
                nota = rs3.getDouble("nota");
                remuneracionD = rs3.getDouble("remuneracion");
                System.out.println(habilidades + cargoActual + fecha +nota + remuneracionD);
            }
            
        }
        catch(Exception e){
            
        }
    }
    //PARA BUSCAR ID
    public void buscarEmpleado(int codigo){
        try{
            Query = "SELECT * FROM `datospersonales` WHERE id_usuario = " + codigo + "";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            if( rs.first() ){
                lista.add("NOMBRE: " + rs.getString("nombre") + " " + rs.getString("apellido") + "\n" +
                        "EDAD:  " + rs.getString("edad") + "  NACIONALIDAD: " +  rs.getString("nacionalidad"));
            }else{
                JOptionPane.showMessageDialog(null, "EMPLEADO/S NO ENCONTRADO/S", "BUSQUEDA FALLIFA", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
        }
        catch(Exception e){
            
        }
    }
    //PARA BUSCAR POR SEXO
    public void buscarSexo(String sexo){
        try{
            Query = "SELECT * FROM `datospersonales` WHERE sexo = '" + sexo + "'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            
            while( rs.next() ){
                lista.add("\n NOMBRE: " + rs.getString("nombre") + " " + rs.getString("apellido") + "\n" +
                        " NACIONALIDAD: " + rs.getString("nacionalidad") + " EDAD: " + rs.getInt("edad") + "\n\n");
            }
            for(int i = 0; i<lista.size();i++){
                lista.get(i);
            }
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S ", "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            
        }
    }
    //PARA BUSCAR POR ESTADO CIVIL
    public void buscarCivil(String civil){
        try{
            Query = "SELECT * FROM `datospersonales` WHERE estado_civil = '" + civil + "'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            
            while( rs.next() ){
                lista.add("\n NOMBRE: " + rs.getString("nombre") + " " + rs.getString("apellido") + "\n" +
                        " NACIONALIDAD: " + rs.getString("nacionalidad") + " EDAD: " + rs.getString("edad") + "\n\n");
            }
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
        }
        catch(Exception e){
            
        }
    }
    //BUSQUEDA POR NOTA ALCANZADA
    public void buscarNota(String nota){
        try{
            // PARA NOTA
            String ID = "";
            Query = "SELECT * FROM `desempeño` WHERE nota = " + nota + "";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            
            if(rs.first()){
                lista.add("\n NOTA ALCANZADA: " + rs.getString("nota"));
                ID = rs.getString("id_usuario");
            }
            
            Query1 = "SELECT * FROM `datospersonales` WHERE id_usuario = '" + ID + "'";
            Statement st1 = Conexion.createStatement();
            java.sql.ResultSet rs1;
            rs1 = st1.executeQuery(Query1);
            if(rs1.first()){
                lista.add("NOMBRE: " + rs1.getString("nombre") + " " + rs1.getString("apellido") + "\n");
            }
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
        }
        catch(Exception e){   
        }
    }
    //PARA BUSCAR POR EDAD
    public void buscaEdad(String edad){
            try{
                Query = "SELECT * FROM `datospersonales` WHERE edad = " + edad + "";
                Statement st = Conexion.createStatement();
                java.sql.ResultSet rs;
                rs = st.executeQuery(Query);
                while( rs.next()){
                    lista.add("\n NOMBRE: " + rs.getString("nombre") + " " + rs.getString("apellido") + "\n" +
                        " NACIONALIDAD: " + rs.getString("nacionalidad") + " EDAD: " + rs.getString("edad") + "\n\n");
                }
                JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
                lista.clear();
            }
            catch(Exception e){
            }
    }
    //PARA BUSCAR POR CARGO ACTUAL
    public void buscarCargo(String cargo){
        try{
            String ID = "";
            Query = "SELECT * FROM `desempeño` WHERE cargo_actual = '" + cargo + "'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet rs;
            rs = st.executeQuery(Query);
            if( rs.first() ){
                ID = rs.getString("id_usuario");
                lista.add("\n CARGO ACTUAL: " + rs.getString("cargo_actual") + ID);
            }
            
            Query1 = "SELECT * FROM `datospersonales` WHERE id_usuario = '" + ID + "'";
            Statement st1 = Conexion.createStatement();
            java.sql.ResultSet rs1;
            rs1 = st1.executeQuery(Query1);
            if(rs1.first()){
                lista.add("NOMBRE: " + rs1.getString("nombre") + " " + rs1.getString("apellido") + "\n");
            }
            JOptionPane.showMessageDialog(null, "EMPLEADO/S ENCONTRADO/S \n" + lista , "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            lista.clear();
        }
        catch(Exception e){
        }
    }
    
}
