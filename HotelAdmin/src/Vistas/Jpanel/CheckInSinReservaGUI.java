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
public class CheckInSinReservaGUI extends javax.swing.JPanel {

    /**
     * Creates new form CheckInSinReserva
     */
    public CheckInSinReservaGUI() {
        initComponents();
        agregarHabitaciones();
    }
    
    private void agregarHabitaciones(){
        
        // jPcontenido.removeAll();
        for (int i=0;i<9;i++){
        jPhabitacionCheckIn jp = new jPhabitacionCheckIn(05,"Simple",56,02);
        jPcontenido.add(jp);
          
       }
        jPcontenido.revalidate();
        jPcontenido.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTidCliente = new javax.swing.JTextField();
        jTfechaIngreso = new javax.swing.JTextField();
        jTfechaSalida = new javax.swing.JTextField();
        jTcantidadPersonas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPcontenido = new javax.swing.JPanel();
        jBbuscar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBcheckIn = new javax.swing.JButton();
        jLformulario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTidCliente.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTidCliente.setForeground(new java.awt.Color(191, 191, 191));
        jTidCliente.setText("Cliente");
        jTidCliente.setBorder(null);
        add(jTidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 172, 240, 23));

        jTfechaIngreso.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTfechaIngreso.setForeground(new java.awt.Color(191, 191, 191));
        jTfechaIngreso.setText("Fecha de ingreso");
        jTfechaIngreso.setBorder(null);
        add(jTfechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 223, 240, 23));

        jTfechaSalida.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTfechaSalida.setForeground(new java.awt.Color(191, 191, 191));
        jTfechaSalida.setText("Fecha de salida");
        jTfechaSalida.setBorder(null);
        add(jTfechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 272, 240, 23));

        jTcantidadPersonas.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTcantidadPersonas.setForeground(new java.awt.Color(191, 191, 191));
        jTcantidadPersonas.setText("Cantidad de personas");
        jTcantidadPersonas.setBorder(null);
        add(jTcantidadPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 321, 240, 23));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setOpaque(false);

        jPcontenido.setBackground(new java.awt.Color(255, 255, 255));
        jPcontenido.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        jScrollPane1.setViewportView(jPcontenido);
        jPcontenido.getAccessibleContext().setAccessibleDescription("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 119, 300, 360));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 174, 24, 24));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-sinSeleccion.png"))); // NOI18N
        jBcancelar.setBorder(null);
        jBcancelar.setBorderPainted(false);
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 395, 125, 40));

        jBcheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check-inBoton.png"))); // NOI18N
        jBcheckIn.setBorder(null);
        jBcheckIn.setContentAreaFilled(false);
        jBcheckIn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check-in-seleccionado.png"))); // NOI18N
        add(jBcheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 395, 125, 40));

        jLformulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CheckInSinReserva.png"))); // NOI18N
        add(jLformulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 85, 575, 397));

        jLabel1.setBackground(new java.awt.Color(112, 112, 112));
        jLabel1.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("Número    Tipo     Precio   Capacidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 89, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Simple" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 37, 122, 20));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(165, 165, 165));
        jLabel2.setText("Habitaciones :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 37, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBcheckIn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLformulario;
    private javax.swing.JPanel jPcontenido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantidadPersonas;
    private javax.swing.JTextField jTfechaIngreso;
    private javax.swing.JTextField jTfechaSalida;
    private javax.swing.JTextField jTidCliente;
    // End of variables declaration//GEN-END:variables
}
