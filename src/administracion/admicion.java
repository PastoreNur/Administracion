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
public class admicion extends javax.swing.JPanel {

    /**
     * Creates new form admicion
     */
    public admicion() {
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
        jLabel12 = new javax.swing.JLabel();
        codigoTXT = new javax.swing.JTextField();
        jefeTXT = new javax.swing.JTextField();
        salarioTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contratoTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaTXT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cargoinicialTXT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        areaTXT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONTRATO LABORAL:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 180, 30));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CODIGO DE TRABAJADOR:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, -1));

        codigoTXT.setEditable(false);
        codigoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTXTActionPerformed(evt);
            }
        });
        add(codigoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 180, 40));

        jefeTXT.setEditable(false);
        add(jefeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 180, 40));

        salarioTXT.setEditable(false);
        salarioTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioTXTActionPerformed(evt);
            }
        });
        add(salarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SALARIO INICIAL:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 20));

        contratoTXT.setEditable(false);
        add(contratoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CARGO INICIAL:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA DE CONTRATO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 20));

        fechaTXT.setEditable(false);
        add(fechaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOMBRE DE JEFE:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, 30));

        cargoinicialTXT.setEditable(false);
        add(cargoinicialTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 180, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AREA ASIGNADA:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 160, 30));

        areaTXT.setEditable(false);
        add(areaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTXTActionPerformed

    private void salarioTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField areaTXT;
    public javax.swing.JTextField cargoinicialTXT;
    public javax.swing.JTextField codigoTXT;
    public javax.swing.JTextField contratoTXT;
    public static javax.swing.JTextField fechaTXT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jefeTXT;
    public javax.swing.JTextField salarioTXT;
    // End of variables declaration//GEN-END:variables
}
