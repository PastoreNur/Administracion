/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import controlador.Database;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author je_pa
 */
public class Buscar extends javax.swing.JFrame {
    
    MySQL db = new MySQL();
    DefaultTableModel modelo = new DefaultTableModel();
    public Buscar() {
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
        ResultSet rs = Database.getTabla("SELECT a.id_usuario,dt.nombre,dt.sexo,des.nota,dt.edad,ad.salario,des.cargo_actual, dt.estado_civil FROM"
                + " acceso a, datospersonales dt, desempeño des,admision ad WHERE"
                + " a.id_usuario = dt.id_usuario AND a.id_usuario = des.id_usuario AND a.id_usuario = ad.id_usario ");
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre","Estado Civil","Edad","Sueldo","Nota","Cargo"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("id_usuario"), rs.getString("nombre"),rs.getString("estado_civil"),rs.getString("edad"),rs.getString("salario"),rs.getString("nota"),rs.getString("cargo_actual")});
            }            
            // asigna el modelo a la tabla
            mostrarTBL.setModel(modelo);          
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    private void mostrar_civil() {
        
        String sql = "SELECT a.id_usuario,dt.nombre,dt.sexo,des.nota,dt.edad,ad.salario,des.cargo_actual, dt.estado_civil FROM"
                + " acceso a, datospersonales dt, desempeño des,admision ad WHERE"
                + " a.id_usuario = dt.id_usuario AND a.id_usuario = des.id_usuario AND a.id_usuario = ad.id_usario ";
        
        if( !"Seleccionar".equals(sexoCB.getSelectedItem().toString()) ){
            sql = sql + " AND dt.sexo = '" + sexoCB.getSelectedItem().toString() + "'";
        }
        
        if(!"Seleccionar".equals(civilCB.getSelectedItem().toString())){
                sql = sql + " AND dt.estado_civil = '" + civilCB.getSelectedItem().toString() + "'";
                
            }
        
        if(!notaTXT.getText().isEmpty()){
                    
            sql = sql + " AND des.nota = '" + notaTXT.getText() + "'";
                    
                }
        
        if(!"Seleccionar".equals(cargoCB.getSelectedItem().toString())){
            sql = sql + " AND des.cargo_actual = '" + cargoCB.getSelectedItem().toString() + "'";            
                    }
        
        if(!"".equals(nombreTXT.getText())){
            sql = sql + " AND  dt.nombre LIKE '%" + nombreTXT.getText() + "%'";
                        }
        
        if(!"".equals(edadTXT.getText())){
        sql = sql + " AND dt.edad = '" + edadTXT.getText() + "'";
        }
        
        if(!"".equals(sueldoTXT.getText())){
            sql = sql + " AND ad.salario LIKE '%" + sueldoTXT.getText() + "%'";
        }
        
        if(!"".equals(codigoTXT.getText())){
            sql = sql + " AND a.id_usuario = '" + codigoTXT.getText() + "'";
        }
        
        ResultSet rs = Database.getTabla(sql);
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre","Estado Civil","Edad","Sueldo","Nota","Cargo"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("id_usuario"), rs.getString("nombre"),rs.getString("estado_civil"),rs.getString("edad"),rs.getString("salario"),rs.getString("nota"),rs.getString("cargo_actual")});
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

        buscarBTN = new javax.swing.JButton();
        codigoTXT = new javax.swing.JTextField();
        sexoCB = new javax.swing.JComboBox<>();
        civilCB = new javax.swing.JComboBox<>();
        cargoCB = new javax.swing.JComboBox<>();
        edadTXT = new javax.swing.JTextField();
        sueldoTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarTBL = new javax.swing.JTable();
        eliminarBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        notaTXT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        eliminarTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1005, 620));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarBTN.setText("BUSCAR");
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 100, 30));

        codigoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTXTActionPerformed(evt);
            }
        });
        getContentPane().add(codigoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 150, 30));

        sexoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(sexoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, 30));

        civilCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado", "Viudo", "Acompañado" }));
        getContentPane().add(civilCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

        cargoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Programador", "Supervisor de ventas", "Gerente de agencia", "Ventas" }));
        getContentPane().add(cargoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, 30));
        getContentPane().add(edadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 90, 30));
        getContentPane().add(sueldoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 110, 30));
        getContentPane().add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, 30));

        mostrarTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mostrarTBL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 950, 450));

        eliminarBTN.setText("Eliminar");
        eliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 90, 30));

        jLabel1.setText("Estado civil:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Sexo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setText("Nota:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel4.setText("Cargo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel6.setText("Edad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel7.setText("Sueldo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel8.setText("Codigo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        notaTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaTXTActionPerformed(evt);
            }
        });
        getContentPane().add(notaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 50, 30));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 90, 30));
        getContentPane().add(eliminarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 30));

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
        //cargaTicket();
    }
    
    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
        String codigo = codigoTXT.getText();
        String sueldo = sueldoTXT.getText();
        String sexo = sexoCB.getSelectedItem().toString();
        String civil = civilCB.getSelectedItem().toString();
        String cargo = codigoTXT.getText();
        String nota = notaTXT.getText();
        String nombre = nombreTXT.getText();
       //double nota = parseDouble(codigoTXT.getText());
        //db.buscarEmpleado(codigo);
        //db.buscarSexo(sexo);
        
        eliminar();
        
        mostrar_civil();
        //db.buscarCivil(civil);
        
        
        JOptionPane.showMessageDialog(null, "RESULTADOS DE LA BUSQUEDA" ,
            "INGRESADO", JOptionPane.INFORMATION_MESSAGE);
        //db.buscarCargo(cargo);
        
        //db.lista.clear();
        
        
        
    }//GEN-LAST:event_buscarBTNActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_formWindowOpened

    private void eliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBTNActionPerformed
    String sql = "DELETE * FROM acceso ac, admision ad, antecedentes ant, datospersonales dat, desempeño des WHERE ac.id_usuario = "+ eliminarTXT.getText() +" AND "
            + " ad.id_usuario = "+ eliminarTXT.getText() +" AND dat.id_usuario = "+ eliminarTXT.getText() +" AND des.id_usuario = "+ eliminarTXT.getText() +" AND ant.id_usuario = "+ eliminarTXT.getText() +"" ;
        
        
    }//GEN-LAST:event_eliminarBTNActionPerformed

    private void notaTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaTXTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        menu menu = new menu();    
        menu.setVisible(true);
        }catch(Exception e){
            
        }
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBTN;
    private javax.swing.JComboBox<String> cargoCB;
    private javax.swing.JComboBox<String> civilCB;
    private javax.swing.JTextField codigoTXT;
    private javax.swing.JTextField edadTXT;
    private javax.swing.JButton eliminarBTN;
    private javax.swing.JTextField eliminarTXT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mostrarTBL;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField notaTXT;
    private javax.swing.JComboBox<String> sexoCB;
    private javax.swing.JTextField sueldoTXT;
    // End of variables declaration//GEN-END:variables
}
