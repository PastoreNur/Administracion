/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package administracion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RM-PC
 */
public class login extends javax.swing.JFrame {
    
    MySQL db = new MySQL();
    
    /** Creates new form login */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarBTN = new javax.swing.JButton();
        contraTXT = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        usuarioTXT = new javax.swing.JTextField();
        salirLB = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(400, 340));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarBTN.setBackground(new java.awt.Color(255, 255, 255));
        ingresarBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ingresarBTN.setText("INGRESAR");
        ingresarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ingresarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, 50));

        contraTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        contraTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contraTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 260, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        usuarioTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(usuarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 260, 50));

        salirLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar X.png"))); // NOI18N
        salirLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLBMouseClicked(evt);
            }
        });
        jPanel1.add(salirLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTRASEÑA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBTNActionPerformed
        String usuario = usuarioTXT.getText();
        String contra = contraTXT.getText();
        boolean inicio;
        try {
            db.MySQLConnection();
            inicio = db.validadUsuario(usuario, contra);
            if(inicio){
            this.dispose();
            }else{
            contraTXT.setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ingresarBTNActionPerformed

    private void salirLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirLBMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraTXT;
    private javax.swing.JButton ingresarBTN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel salirLB;
    private javax.swing.JTextField usuarioTXT;
    // End of variables declaration//GEN-END:variables

}
