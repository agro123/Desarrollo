/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

/**
 *
 * @author nicol
 */
public class jPclienteRecepcionista extends javax.swing.JPanel {

    /**
     * Creates new form jPclienteRecepcionista
     */
    public jPclienteRecepcionista() {
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

        jLnumeroReserva = new javax.swing.JLabel();
        jLidCliente = new javax.swing.JLabel();
        jLidHabitacion = new javax.swing.JLabel();
        jLcantPersonas = new javax.swing.JLabel();
        jLfechaIngreso = new javax.swing.JLabel();
        jBeliminar = new javax.swing.JLabel();
        jBeditar = new javax.swing.JLabel();
        jBtodoPanel = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLnumeroReserva.setBackground(new java.awt.Color(112, 112, 112));
        jLnumeroReserva.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLnumeroReserva.setForeground(new java.awt.Color(112, 112, 112));
        jLnumeroReserva.setText("Número");
        add(jLnumeroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 28, 44, 13));

        jLidCliente.setBackground(new java.awt.Color(112, 112, 112));
        jLidCliente.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLidCliente.setForeground(new java.awt.Color(112, 112, 112));
        jLidCliente.setText("Nombre");
        add(jLidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 28, 44, 13));

        jLidHabitacion.setBackground(new java.awt.Color(112, 112, 112));
        jLidHabitacion.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLidHabitacion.setForeground(new java.awt.Color(112, 112, 112));
        jLidHabitacion.setText("Apellido");
        add(jLidHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 28, -1, -1));

        jLcantPersonas.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLcantPersonas.setForeground(new java.awt.Color(112, 112, 112));
        jLcantPersonas.setText("Telefono");
        add(jLcantPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 28, -1, -1));

        jLfechaIngreso.setBackground(new java.awt.Color(112, 112, 112));
        jLfechaIngreso.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLfechaIngreso.setForeground(new java.awt.Color(112, 112, 112));
        jLfechaIngreso.setText("correo");
        add(jLfechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 28, -1, -1));

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconEliminar.png"))); // NOI18N
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 25, 16, 16));

        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconEditar.png"))); // NOI18N
        jBeditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 25, 16, 16));

        jBtodoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CliSinSele.png"))); // NOI18N
        jBtodoPanel.setBorderPainted(false);
        jBtodoPanel.setContentAreaFilled(false);
        jBtodoPanel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CliSele.png"))); // NOI18N
        jBtodoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtodoPanelActionPerformed(evt);
            }
        });
        add(jBtodoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 819, 68));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtodoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtodoPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtodoPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBeditar;
    private javax.swing.JLabel jBeliminar;
    private javax.swing.JButton jBtodoPanel;
    private javax.swing.JLabel jLcantPersonas;
    private javax.swing.JLabel jLfechaIngreso;
    private javax.swing.JLabel jLidCliente;
    private javax.swing.JLabel jLidHabitacion;
    private javax.swing.JLabel jLnumeroReserva;
    // End of variables declaration//GEN-END:variables
}
