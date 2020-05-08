/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Controladores.*;
import Modelo.ReservaDAO;


/**
 *
 * @author nicol
 */

public class Recepcionista extends javax.swing.JFrame {

    /**
     * Creates new form Recepcionista
     */
    Reservas JframeReservas;
    
    public Recepcionista() {
        initComponents();
        seleccionarPrimero();
 
       
    }

     public void seleccionarPrimero(){
        jBclientes.setSelected(false);
        jBcheckOut.setSelected(false);
        jBclientes.setSelected(false);
        jBreservar.setSelected(false);
        jBservicios.setSelected(false);
        jBcheckIn.setSelected(true);
        CheckIn check = new CheckIn();
        jPcontenedor.removeAll();
        jPcontenedor.add(check);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
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
        jBreservar = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBcheckIn = new javax.swing.JButton();
        jBcheckOut = new javax.swing.JButton();
        jBservicios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPcontenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1118, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(72, 159, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBreservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservarBoton.png"))); // NOI18N
        jBreservar.setToolTipText("");
        jBreservar.setBorder(null);
        jBreservar.setContentAreaFilled(false);
        jBreservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBreservar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservarBotonSele.png"))); // NOI18N
        jBreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreservarActionPerformed(evt);
            }
        });
        jPanel1.add(jBreservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 396, -1, -1));

        jBclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ClienteBoton.png"))); // NOI18N
        jBclientes.setBorder(null);
        jBclientes.setContentAreaFilled(false);
        jBclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBclientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ClienteBotonSele.png"))); // NOI18N
        jPanel1.add(jBclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 121, -1, -1));

        jBcheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CheckInBoton.png"))); // NOI18N
        jBcheckIn.setBorder(null);
        jBcheckIn.setContentAreaFilled(false);
        jBcheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheckIn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CheckInBotonSele.png"))); // NOI18N
        jBcheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckInActionPerformed(evt);
            }
        });
        jPanel1.add(jBcheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, -1, -1));

        jBcheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CheckoutBoton.png"))); // NOI18N
        jBcheckOut.setBorder(null);
        jBcheckOut.setContentAreaFilled(false);
        jBcheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheckOut.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CheckoutBotonSele.png"))); // NOI18N
        jPanel1.add(jBcheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 301, -1, -1));

        jBservicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/serviciosBoton.png"))); // NOI18N
        jBservicios.setBorder(null);
        jBservicios.setContentAreaFilled(false);
        jBservicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBservicios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/serviciosBotonSele.png"))); // NOI18N
        jPanel1.add(jBservicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 468, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 97, 680));

        jPanel2.setMinimumSize(new java.awt.Dimension(1118, 680));
        jPanel2.setPreferredSize(new java.awt.Dimension(1118, 680));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPcontenedor.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, 1021, 680));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1118, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckInActionPerformed
        // TODO add your handling code here:
        seleccionarPrimero();
        /*jPcontenedor.setVisible(false);
        CheckIn check = new CheckIn();
        jPcontenedor.removeAll();
        jPcontenedor.add(check);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);*/
    }//GEN-LAST:event_jBcheckInActionPerformed

    private void jBreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreservarActionPerformed
        // TODO add your handling code here:
             
        jBclientes.setSelected(false);
        jBcheckOut.setSelected(false);
        jBclientes.setSelected(false);       
        jBservicios.setSelected(false);
        jBcheckIn.setSelected(false);
        jBreservar.setSelected(true);
        
        jPcontenedor.setVisible(false);
        Reservas reser_ = new Reservas();
        jPcontenedor.removeAll();
        jPcontenedor.add(reser_);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
        
        ReservaDAO modelo = new ReservaDAO();
        JframeReservas = new Reservas();
        ControllerReserva controlador = new ControllerReserva(JframeReservas,modelo);
    }//GEN-LAST:event_jBreservarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcheckIn;
    private javax.swing.JButton jBcheckOut;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBreservar;
    private javax.swing.JButton jBservicios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPcontenedor;
    // End of variables declaration//GEN-END:variables
}
