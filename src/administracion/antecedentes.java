/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

/**
 *
 * @author RM-PC
 */
public class antecedentes extends javax.swing.JPanel {

    /**
     * Creates new form antecedentes
     */
    public antecedentes() {
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

        jLabel9 = new javax.swing.JLabel();
        remuneracionTXT = new javax.swing.JTextField();
        ultimoSueldoTXT = new javax.swing.JTextField();
        antiguoJefeTXT = new javax.swing.JTextField();
        ultimocargoTXT = new javax.swing.JTextField();
        empresaTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REMUNERACION:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 160, 30));

        remuneracionTXT.setEditable(false);
        add(remuneracionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 270, 40));

        ultimoSueldoTXT.setEditable(false);
        ultimoSueldoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoSueldoTXTActionPerformed(evt);
            }
        });
        add(ultimoSueldoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 270, 40));

        antiguoJefeTXT.setEditable(false);
        antiguoJefeTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguoJefeTXTActionPerformed(evt);
            }
        });
        add(antiguoJefeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 270, 40));

        ultimocargoTXT.setEditable(false);
        add(ultimocargoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 270, 40));

        empresaTXT.setEditable(false);
        add(empresaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 270, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ULTIMA EMPRESA DONDE LABORO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 280, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ULTIMO CARGO DESEMPEÑADO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, 20));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE DEL ULTIMO JEFE:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 20));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ULTIMO SUELDO DEVENGADO:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void antiguoJefeTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguoJefeTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antiguoJefeTXTActionPerformed

    private void ultimoSueldoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoSueldoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ultimoSueldoTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField antiguoJefeTXT;
    public javax.swing.JTextField empresaTXT;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField remuneracionTXT;
    public javax.swing.JTextField ultimoSueldoTXT;
    public javax.swing.JTextField ultimocargoTXT;
    // End of variables declaration//GEN-END:variables
}