/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import javax.swing.JOptionPane;

/**
 *
 * @author RM-PC
 */
public class aceso extends javax.swing.JFrame {

    /**
     * Creates new form aceso
     */
    public aceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuarioTXT = new javax.swing.JTextField();
        contraTXT = new javax.swing.JTextField();
        codigoTXT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nivelCB = new javax.swing.JComboBox<>();
        siguienteBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIVEL DE ACCESO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DE USUARIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 180, 20));
        jPanel1.add(usuarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, 40));

        contraTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraTXTActionPerformed(evt);
            }
        });
        jPanel1.add(contraTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 40));

        codigoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTXTActionPerformed(evt);
            }
        });
        jPanel1.add(codigoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 180, 40));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CODIGO DE TRABAJADOR:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 20));

        nivelCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel de acceso: 1", "Nivel de acceso: 2" }));
        jPanel1.add(nivelCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 180, 40));

        siguienteBTN.setText("SIGUIENTE");
        siguienteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(siguienteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contraTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraTXTActionPerformed

    private void codigoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTXTActionPerformed

    private void siguienteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBTNActionPerformed
        String nivel = nivelCB.getSelectedItem().toString();
        if("Nivel de acceso: 1".equals(nivel)){
            nivel = "1";
        }else{
            nivel = "2";
        }
            
        if(this.usuarioTXT.getText().isEmpty() || this.contraTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);    
        }else{
            
            Agregar a = new Agregar();
            a.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_siguienteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(aceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField codigoTXT;
    public javax.swing.JTextField contraTXT;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nivelCB;
    private javax.swing.JButton siguienteBTN;
    public javax.swing.JTextField usuarioTXT;
    // End of variables declaration//GEN-END:variables
}
