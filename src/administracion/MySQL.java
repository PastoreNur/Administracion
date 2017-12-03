package administracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MySQL {
    private static Connection Conexion;
    String Query;
    
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
    public void validadUsuario(String usu, String contra){
        try{
            Query = "SELECT * FROM acceso where nombre_usu='"+ usu +"'"+" and contra_usu='"+ contra+"';";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            
            menu m = new menu();
            m.setVisible(true);
            
            if( rs.first() ){
            }
            else{
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA NO VALIDOS");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRROR EN EL PROCEDIMIENTO", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    //PARA INGRESAR EMPLEADO
    public void ingresarEmpleado(){
        
    }
    //PARA ELIMINAR EMPLEADO(){
    public void eliminarEmpleado(){
        
    }
    //PARA BUSCAR EMPLEADO
    public void buscarEmpleado(){
        
    }
    
}
