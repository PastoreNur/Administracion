
package administracion;

import static administracion.MySQL.nombre;

/**
 *
 * @author RM-PC
 */
public class datosPersonales extends javax.swing.JPanel {
    MySQL db = new MySQL();
    /**
     * Creates new form datosPersonales
     */
    public datosPersonales() {
        try{
            db.informacion();
            
        }
        catch(Exception e){
            
        }
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

        telTXT = new javax.swing.JTextField();
        tipoTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        estadoTXT = new javax.swing.JTextField();
        nitTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        duiTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sexoTXT = new javax.swing.JTextField();
        apellidoTXT = new javax.swing.JTextField();
        direccionTXT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edadTXT = new javax.swing.JTextField();
        nacionTXT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telTXT.setEditable(false);
        add(telTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, 40));

        tipoTXT.setEditable(false);
        add(tipoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 170, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPO DE SANGRE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 140, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TELEFONO:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ESTADO CIVIL:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 120, 30));

        estadoTXT.setEditable(false);
        add(estadoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 170, 40));

        nitTXT.setEditable(false);
        add(nitTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 170, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIT:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 40, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DUI:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 40, 30));

        duiTXT.setEditable(false);
        duiTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duiTXTActionPerformed(evt);
            }
        });
        add(duiTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 170, 40));

        nombreTXT.setEditable(false);
        add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRES:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDOS:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 20));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXO:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 20));

        sexoTXT.setEditable(false);
        sexoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTXTActionPerformed(evt);
            }
        });
        add(sexoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, 40));

        apellidoTXT.setEditable(false);
        add(apellidoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 40));

        direccionTXT.setEditable(false);
        direccionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTXTActionPerformed(evt);
            }
        });
        add(direccionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 40));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DIRECCION:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NACIONALIDAD:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EDAD:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 50, -1));

        edadTXT.setEditable(false);
        add(edadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 40));

        nacionTXT.setEditable(false);
        add(nacionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void sexoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTXTActionPerformed

    private void direccionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTXTActionPerformed

    private void duiTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duiTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duiTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField apellidoTXT;
    public javax.swing.JTextField direccionTXT;
    public javax.swing.JTextField duiTXT;
    public javax.swing.JTextField edadTXT;
    public javax.swing.JTextField estadoTXT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField nacionTXT;
    public javax.swing.JTextField nitTXT;
    public javax.swing.JTextField nombreTXT;
    public javax.swing.JTextField sexoTXT;
    public javax.swing.JTextField telTXT;
    public javax.swing.JTextField tipoTXT;
    // End of variables declaration//GEN-END:variables
}
