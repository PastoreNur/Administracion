/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import static administracion.MySQL.acceso;
import static administracion.MySQL.apellido;
import static administracion.MySQL.area;
import static administracion.MySQL.cargo;
import static administracion.MySQL.cargoActual;
import static administracion.MySQL.codigo;
import static administracion.MySQL.contrato;
import static administracion.MySQL.direccion;
import static administracion.MySQL.dui;
import static administracion.MySQL.edad;
import static administracion.MySQL.estado;
import static administracion.MySQL.fecha;
import static administracion.MySQL.fechaContrato;
import static administracion.MySQL.habilidades;
import static administracion.MySQL.jefe;
import static administracion.MySQL.nacio;
import static administracion.MySQL.nit;
import static administracion.MySQL.nombre;
import static administracion.MySQL.nota;
import static administracion.MySQL.remuneracion;
import static administracion.MySQL.remuneracionD;
import static administracion.MySQL.salario;
import static administracion.MySQL.sexo;
import static administracion.MySQL.tel;
import static administracion.MySQL.tipo;
import static administracion.MySQL.ultimaEmpresa;
import static administracion.MySQL.ultimoCargo;
import static administracion.MySQL.ultimoJefe;
import static administracion.MySQL.ultimoSueldo;
import java.awt.BorderLayout;

/**
 *
 * @author RM-PC
 */
public class menu extends javax.swing.JFrame {
    MySQL db = new MySQL();
    
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        int a = acceso;
        
        buscarBTN.setVisible(false);
        eliminarBTN.setVisible(false);
        agregarBTN.setVisible(false);
        
        if(a == 2){
            buscarBTN.setVisible(true);
            eliminarBTN.setVisible(true);
            agregarBTN.setVisible(true);
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

        datosBTN = new javax.swing.JButton();
        salirLB = new javax.swing.JLabel();
        antecedentesBTN = new javax.swing.JButton();
        desempeñoBTN = new javax.swing.JButton();
        admisionBTN = new javax.swing.JButton();
        buscarBTN = new javax.swing.JButton();
        agregarBTN = new javax.swing.JButton();
        eliminarBTN = new javax.swing.JButton();
        datosPN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(932, 535));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosBTN.setBackground(new java.awt.Color(102, 102, 102));
        datosBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        datosBTN.setForeground(new java.awt.Color(255, 255, 255));
        datosBTN.setText("DATOS PERSONALES");
        datosBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        datosBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datosBTN.setFocusable(false);
        datosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(datosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 130, 70));

        salirLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar X.png"))); // NOI18N
        salirLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLBMouseClicked(evt);
            }
        });
        getContentPane().add(salirLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        antecedentesBTN.setBackground(new java.awt.Color(102, 102, 102));
        antecedentesBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        antecedentesBTN.setForeground(new java.awt.Color(255, 255, 255));
        antecedentesBTN.setText("ANTECEDENTES");
        antecedentesBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        antecedentesBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        antecedentesBTN.setFocusable(false);
        antecedentesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antecedentesBTNActionPerformed(evt);
            }
        });
        getContentPane().add(antecedentesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, 70));

        desempeñoBTN.setBackground(new java.awt.Color(102, 102, 102));
        desempeñoBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        desempeñoBTN.setForeground(new java.awt.Color(255, 255, 255));
        desempeñoBTN.setText("DESEMPEÑO");
        desempeñoBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        desempeñoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desempeñoBTN.setFocusable(false);
        desempeñoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desempeñoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(desempeñoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 130, 70));

        admisionBTN.setBackground(new java.awt.Color(102, 102, 102));
        admisionBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        admisionBTN.setForeground(new java.awt.Color(255, 255, 255));
        admisionBTN.setText("DATOS DE ADMISION");
        admisionBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        admisionBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admisionBTN.setFocusable(false);
        admisionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admisionBTNActionPerformed(evt);
            }
        });
        getContentPane().add(admisionBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 130, 70));

        buscarBTN.setBackground(new java.awt.Color(204, 204, 204));
        buscarBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        buscarBTN.setText("BUSCAR");
        buscarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        buscarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBTN.setFocusable(false);
        buscarBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 80, 60));

        agregarBTN.setBackground(new java.awt.Color(204, 204, 204));
        agregarBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        agregarBTN.setText("AGREGAR");
        agregarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        agregarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarBTN.setFocusable(false);
        agregarBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 80, 60));

        eliminarBTN.setBackground(new java.awt.Color(204, 204, 204));
        eliminarBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        eliminarBTN.setText("ELIMINAR");
        eliminarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        eliminarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBTN.setFocusable(false);
        eliminarBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 80, 60));

        datosPN.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout datosPNLayout = new javax.swing.GroupLayout(datosPN);
        datosPN.setLayout(datosPNLayout);
        datosPNLayout.setHorizontalGroup(
            datosPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        datosPNLayout.setVerticalGroup(
            datosPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(datosPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 710, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 930, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admisionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admisionBTNActionPerformed
        admicion a = new admicion();
        a.setSize(700,370);
        datosPN.removeAll();
        datosPN.add(a, BorderLayout.CENTER);
        datosPN.revalidate();
        datosPN.repaint();
        
        a.fechaTXT.setText(fechaContrato);
        a.cargoinicialTXT.setText(cargo);
        a.salarioTXT.setText("$ " + String.valueOf(salario));
        a.codigoTXT.setText(String.valueOf(codigo));
        a.jefeTXT.setText(jefe);
        a.areaTXT.setText(area);
        a.contratoTXT.setText(contrato);
        
    }//GEN-LAST:event_admisionBTNActionPerformed

    private void salirLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirLBMouseClicked

    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
        Buscar b = new Buscar();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buscarBTNActionPerformed

    private void agregarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBTNActionPerformed
        // TODO add your handling code here:
        aceso a = new aceso();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarBTNActionPerformed

    private void eliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBTNActionPerformed

    private void antecedentesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antecedentesBTNActionPerformed
        antecedentes a = new antecedentes();
        a.setSize(700,370);
        datosPN.removeAll();
        datosPN.add(a, BorderLayout.CENTER);
        datosPN.revalidate();
        datosPN.repaint();
        
        a.antiguoJefeTXT.setText(ultimoJefe);
        a.remuneracionTXT.setText(String.valueOf(remuneracion));
        a.empresaTXT.setText(ultimaEmpresa);
        a.ultimocargoTXT.setText(ultimoCargo);
        a.ultimoSueldoTXT.setText("$ "+String.valueOf(ultimoSueldo));
        
        
    }//GEN-LAST:event_antecedentesBTNActionPerformed

    private void datosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosBTNActionPerformed
        datosPersonales d = new datosPersonales();
        d.setSize(700,370);
        datosPN.removeAll();
        datosPN.add(d, BorderLayout.CENTER);
        datosPN.revalidate();
        datosPN.repaint();
        
        d.nombreTXT.setText(nombre);
        d.apellidoTXT.setText(apellido);
        d.sexoTXT.setText(sexo);
        d.edadTXT.setText(edad);
        d.duiTXT.setText(dui);
        d.nitTXT.setText(nit);
        d.direccionTXT.setText(direccion);
        d.nacionTXT.setText(nacio);
        d.telTXT.setText(tel);
        d.estadoTXT.setText(estado);
        d.tipoTXT.setText(tipo);
    }//GEN-LAST:event_datosBTNActionPerformed

    private void desempeñoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desempeñoBTNActionPerformed
        desempeño d = new desempeño();
        d.setSize(700,370);
        datosPN.removeAll();
        datosPN.add(d, BorderLayout.CENTER);
        datosPN.revalidate();
        datosPN.repaint();
        
        d.habilidadesTXT.setText(habilidades);
        d.cargoActualTXT.setText(cargoActual);
        d.ultimafechaTXT.setText(fecha);
        d.notaTXT.setText(String.valueOf(nota));
        d.remuneracionTXT.setText("$ " + String.valueOf(remuneracionD));
        
    }//GEN-LAST:event_desempeñoBTNActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admisionBTN;
    private javax.swing.JButton agregarBTN;
    private javax.swing.JButton antecedentesBTN;
    private javax.swing.JButton buscarBTN;
    private javax.swing.JButton datosBTN;
    public static javax.swing.JPanel datosPN;
    private javax.swing.JButton desempeñoBTN;
    private javax.swing.JButton eliminarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel salirLB;
    // End of variables declaration//GEN-END:variables
}
