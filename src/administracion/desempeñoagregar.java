/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import entidades.Antecedentes;
import entidades.Datos_personales;
import entidades.Desempeño;
import javax.swing.JOptionPane;

/**
 *
 * @author je_pa
 */
public class desempeñoagregar extends javax.swing.JFrame {

    /**
     * Creates new form desempeñoagregar
     */
    static Datos_personales dp;
    static Antecedentes ant;
    
    
    public desempeñoagregar(Datos_personales dpp, Antecedentes antp) {
    this.ant = antp;
    this.dp = dpp;
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        notaTXT = new javax.swing.JTextField();
        remuneracionTXT = new javax.swing.JTextField();
        ultimafechaTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cargoActualTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        habilidadesTXT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REMUNERACION:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 160, 30));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOTA ALCANZADA:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 160, -1));

        notaTXT.setEditable(false);
        notaTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaTXTActionPerformed(evt);
            }
        });
        jPanel1.add(notaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 270, 40));

        remuneracionTXT.setEditable(false);
        jPanel1.add(remuneracionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 270, 40));

        ultimafechaTXT.setEditable(false);
        ultimafechaTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimafechaTXTActionPerformed(evt);
            }
        });
        jPanel1.add(ultimafechaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 270, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE LA ULTIMA EVALUACION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 290, 20));

        cargoActualTXT.setEditable(false);
        jPanel1.add(cargoActualTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 270, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CARGO ACTUALMENTE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HABILIDADES TECNICAS Y MANUALES:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 310, 20));

        habilidadesTXT.setEditable(false);
        jPanel1.add(habilidadesTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 270, 40));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notaTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaTXTActionPerformed

    private void ultimafechaTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimafechaTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ultimafechaTXTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.habilidadesTXT.getText().isEmpty() || this.cargoActualTXT.getText().isEmpty() ||
                                         this.ultimafechaTXT.getText().isEmpty() || this.notaTXT.getText().isEmpty() || this.remuneracionTXT.getText().isEmpty()){
                                JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);    

        }else{
        Desempeño desemp = new Desempeño(this.habilidadesTXT.getText(), this.cargoActualTXT.getText(),
                                         this.ultimafechaTXT.getText(), this.notaTXT.getText(), this.remuneracionTXT.getText());
        
        
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(desempeñoagregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desempeñoagregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desempeñoagregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desempeñoagregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desempeñoagregar(dp, ant).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cargoActualTXT;
    public static javax.swing.JTextField habilidadesTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField notaTXT;
    public javax.swing.JTextField remuneracionTXT;
    public javax.swing.JTextField ultimafechaTXT;
    // End of variables declaration//GEN-END:variables
}
