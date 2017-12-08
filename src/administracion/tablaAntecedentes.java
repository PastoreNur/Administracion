/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import controlador.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author RM-PC
 */
public class tablaAntecedentes extends javax.swing.JFrame {

    /**
     * Creates new form tablaAntecedentes
     */
    MySQL db = new MySQL();
    DefaultTableModel modelo = new DefaultTableModel();
    public tablaAntecedentes() {
        try{
            db.MySQLConnection();
        }
        catch(Exception e){
            System.out.println("nel");
        }
        initComponents();
        this.setLocationRelativeTo(null);   
    }
    
     private void mostrar() {
        ResultSet rs = Database.getTabla("SELECT a.id_usuario,dt.nombre,a.ultima_empresa,a.ultimo_cargo,a.jefe_inmediato,a.ultimo_sueldo, a.remuneracion FROM"
                + " antecedentes a, datospersonales dt WHERE"
                + " a.id_usuario = dt.id_usuario ");
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre","Ultima Empresa","Ultimo Cargo","Ultimo Jefe","Ultimo Sueldo","Remuneracion"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("id_usuario"), rs.getString("nombre"),rs.getString("ultima_empresa"),rs.getString("ultimo_cargo"),rs.getString("jefe_inmediato"),rs.getString("ultimo_sueldo"),rs.getString("remuneracion")});
            }            
            // asigna el modelo a la tabla
            mostrarTBL.setModel(modelo);          
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     
     private void mostrar_id() {
         String sql = "SELECT a.id_usuario,dt.nombre,a.ultima_empresa,a.ultimo_cargo,a.jefe_inmediato,a.ultimo_sueldo, a.remuneracion FROM"
                + " antecedentes a, datospersonales dt WHERE"
                + " a.id_usuario = dt.id_usuario ";
         if(!"".equals(codigoTXT.getText())){
             sql = sql + " AND a.id_usuario = '"+ codigoTXT.getText()+ "'";
         }
         
         ResultSet rs = Database.getTabla(sql);
         modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre","Ultima Empresa","Ultimo Cargo","Ultimo Jefe","Ultimo Sueldo","Remuneracion"});
         try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("id_usuario"), rs.getString("nombre"),rs.getString("ultima_empresa"),rs.getString("ultimo_cargo"),rs.getString("jefe_inmediato"),rs.getString("ultimo_sueldo"),rs.getString("remuneracion")});
            }            
            // asigna el modelo a la tabla
            mostrarTBL.setModel(modelo);          
        } catch (SQLException e) {
            System.out.println(e);
        }
     }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigoTXT = new javax.swing.JTextField();
        buscarBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarTBL = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ANTECEDENTES DE LOS EMPLEADOS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, 30));

        codigoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTXTActionPerformed(evt);
            }
        });
        getContentPane().add(codigoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 150, 30));

        buscarBTN.setText("BUSCAR");
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CODIGO DE EMPLEADO(ID):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        mostrarTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mostrarTBL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 800, 440));

        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTXTActionPerformed

    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) mostrarTBL.getModel();
        int a = mostrarTBL.getRowCount() -1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
    }
    
    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
        mostrar_id();
        eliminar();
        JOptionPane.showMessageDialog(null, "RESULTADOS DE LA BUSQUEDA" ,
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        

    }//GEN-LAST:event_buscarBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            menu menu = new menu();
            menu.setVisible(true);
        }catch(Exception e){

        }

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       mostrar();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tablaAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaAntecedentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBTN;
    private javax.swing.JTextField codigoTXT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mostrarTBL;
    // End of variables declaration//GEN-END:variables
}
