/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Modelo.Habitacion;
import Servicios.Fecha;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class RealizarReservaGUI extends javax.swing.JPanel {

    /**
     * Creates new form RealizarReservaGUI
     */
    public RealizarReservaGUI() {
        initComponents();
        jdFechaIngreso.setDate(Fecha.crearFechaTimeStamp());
        jdFechaSalida.setDate(Fecha.dateTomorrow(Fecha.crearFechaTimeStamp()));
        
        jdFechaIngreso.setMinSelectableDate(Fecha.crearFechaTimeStamp());
        jdFechaSalida.setMinSelectableDate(Fecha.crearFechaTimeStamp());
        
        jTidHabitacion.setEditable(false);
        /*jTidHabitacion.setEnabled(false);
        jTnumPersonas.setEnabled(false);
        jdFechaIngreso.setEnabled(false);
        jdFechaSalida.setEnabled(false);*/
         

    }

    
    public void setearCampos() {
        
        jTidCliente.setText("Cliente");
        jTidHabitacion.setText("Número de habitación");
        jTnumPersonas.setText("Cantidad de personas");
       
        
        jdFechaIngreso.setDate(Fecha.crearFechaTimeStamp());
        
        jdFechaSalida.setDate(Fecha.dateTomorrow(Fecha.crearFechaTimeStamp()));
        
        
        
        
    }
    
    
     public int validarCampos() {
        int rtdo = 1;

        if (jTidCliente.getText().equals("")
                ||jTidCliente.getText().equalsIgnoreCase("Cliente"))
        {

            rtdo = 0;
            JOptionPane.showMessageDialog(this,"Hay Campos Vacios");

        }else
        if (jTidHabitacion.getText().equals("") 
            || jTidHabitacion.getText().equalsIgnoreCase("Número de habitación"))
        {
            rtdo = 0;
            JOptionPane.showMessageDialog(this,"Seleccione una Habitación");
        }else
        if(jTnumPersonas.getText().equals("") || 
                jTnumPersonas.getText().equalsIgnoreCase("Cantidad de personas"))
        {
            rtdo = 0;
            JOptionPane.showMessageDialog(this,"Hay Campos Vacios");
            
        }else
        if(jdFechaIngreso.getDate().getTime() >= jdFechaSalida.getDate().getTime()){
            JOptionPane.showMessageDialog(this,"No coinciden las fechas");
            rtdo = 0;
        }
        
        
        return rtdo;
    }
    
    public void mostrarCamposVacios(JTextField jt) {
        jt.setForeground(Color.blue);
        jt.setText("****");
    }
    
    
    
    public void agregarHabitaciones(ArrayList<Habitacion> lista) {
         
        
        jPcontenido.removeAll();
        for (int i = 0; i < lista.size(); i++) {
            
            int num = lista.get(i).getId_habitacion();
            String Tipo = lista.get(i).getTipo_habitacion();
            int prec = lista.get(i).getPrecio_hab();
            int capac = lista.get(i).getCantidadPersonas();
            System.err.println(Tipo+"  "+prec+"  "+capac+"   "+num);
            if(jComboBox1.getSelectedItem().equals(Tipo)){
            
            jPhabitacionCheckIn jp = new jPhabitacionCheckIn(num,Tipo,prec,capac);
            jp.setjThabitacion(jTidHabitacion);
            
            jPcontenido.add(jp);  
              
            }
        }
        
        jPcontenido.revalidate();
        jPcontenido.repaint();
         
    }
    
    
    
    

    public JComboBox getjComboBox1() {
        return jComboBox1;
    }

    public JButton getjBbuscar() {
        return jBbuscar;
    }

    public JButton getjBcancelar() {
        return jBcancelar;
    }

    public JButton getjBguardar() {
        return jBguardar;
    }

    public JTextField getjTnumPersonas() {
        return jTnumPersonas;
    }

 

    public JTextField getjTidCliente() {
        return jTidCliente;
    }

    public JTextField getjTidHabitacion() {
        return jTidHabitacion;
    }

    public JDateChooser getJdFechaIngreso() {
        return jdFechaIngreso;
    }

    public JDateChooser getJdFechaSalida() {
        return jdFechaSalida;
    }
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jdFechaIngreso = new com.toedter.calendar.JDateChooser();
        jBcancelar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jTidCliente = new javax.swing.JTextField();
        jTnumPersonas = new javax.swing.JTextField();
        jTidHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPcontenido = new javax.swing.JPanel();
        jBbuscar = new javax.swing.JButton();
        jLformulario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 191, 191));
        jLabel4.setText("Fecha Salida:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 203, 110, 23));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 191, 191));
        jLabel3.setText("Fecha ingreso:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 152, 110, 23));

        jdFechaSalida.setBackground(new java.awt.Color(255, 255, 255));
        jdFechaSalida.setForeground(new java.awt.Color(191, 191, 191));
        jdFechaSalida.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jdFechaSalidaInputMethodTextChanged(evt);
            }
        });
        jdFechaSalida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaSalidaPropertyChange(evt);
            }
        });
        add(jdFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 203, 160, 25));
        jdFechaSalida.getAccessibleContext().setAccessibleName("");

        jdFechaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jdFechaIngreso.setForeground(new java.awt.Color(191, 191, 191));
        jdFechaIngreso.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        jdFechaIngreso.setMinSelectableDate(new java.util.Date(-62135747907000L));
        jdFechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaIngresoPropertyChange(evt);
            }
        });
        add(jdFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 152, 160, 25));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-sinSeleccion.png"))); // NOI18N
        jBcancelar.setBorder(null);
        jBcancelar.setBorderPainted(false);
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 395, 125, 40));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-SinSele.png"))); // NOI18N
        jBguardar.setBorder(null);
        jBguardar.setContentAreaFilled(false);
        jBguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarSele.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 395, 125, 40));

        jTidCliente.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTidCliente.setForeground(new java.awt.Color(191, 191, 191));
        jTidCliente.setText("Cliente");
        jTidCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));
        jTidCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTidClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTidClienteFocusLost(evt);
            }
        });
        jTidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidClienteActionPerformed(evt);
            }
        });
        jTidCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTidClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidClienteKeyTyped(evt);
            }
        });
        add(jTidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 252, 276, 25));

        jTnumPersonas.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTnumPersonas.setForeground(new java.awt.Color(191, 191, 191));
        jTnumPersonas.setText("Cantidad de personas");
        jTnumPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));
        jTnumPersonas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnumPersonasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnumPersonasFocusLost(evt);
            }
        });
        jTnumPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumPersonasActionPerformed(evt);
            }
        });
        jTnumPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnumPersonasKeyTyped(evt);
            }
        });
        add(jTnumPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 345, 276, 25));

        jTidHabitacion.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTidHabitacion.setForeground(new java.awt.Color(191, 191, 191));
        jTidHabitacion.setText("Número de habitación");
        jTidHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));
        jTidHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTidHabitacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTidHabitacionFocusLost(evt);
            }
        });
        jTidHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTidHabitacionMouseClicked(evt);
            }
        });
        jTidHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidHabitacionActionPerformed(evt);
            }
        });
        jTidHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidHabitacionKeyTyped(evt);
            }
        });
        add(jTidHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 300, 276, 25));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setOpaque(false);

        jPcontenido.setBackground(new java.awt.Color(255, 255, 255));
        jPcontenido.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        jScrollPane1.setViewportView(jPcontenido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 119, 300, 360));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 252, 24, 24));

        jLformulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MarcoReserva.png"))); // NOI18N
        add(jLformulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 85, 575, 397));

        jLabel1.setBackground(new java.awt.Color(112, 112, 112));
        jLabel1.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("Número    Tipo     Precio   Capacidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 89, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIMPLE", "DOBLE", "MATRIMONIAL", "SUITES" }));
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

    private void jTidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidClienteActionPerformed

    private void jTnumPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnumPersonasActionPerformed

    private void jTidHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidHabitacionActionPerformed

    private void jTidClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidClienteKeyPressed
        
    }//GEN-LAST:event_jTidClienteKeyPressed

    private void jTidClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidClienteKeyTyped
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTidClienteKeyTyped

    private void jTnumPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnumPersonasKeyTyped
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTnumPersonasKeyTyped

    private void jTidClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidClienteFocusGained
        if(jTidCliente.getText().equalsIgnoreCase("Cliente")){
            jTidCliente.setText(""); 
        }
        
    }//GEN-LAST:event_jTidClienteFocusGained

    private void jTnumPersonasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumPersonasFocusGained
        if(jTnumPersonas.getText().equalsIgnoreCase("Cantidad de personas")){
        
            jTnumPersonas.setText("");
        }
    }//GEN-LAST:event_jTnumPersonasFocusGained

    private void jTidClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidClienteFocusLost
       
        if(jTidCliente.getText().equals(""))
        {
            jTidCliente.setText("Cliente");
        }
    }//GEN-LAST:event_jTidClienteFocusLost

    private void jTnumPersonasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumPersonasFocusLost
        if(jTnumPersonas.getText().equals("")){
            jTnumPersonas.setText("Cantidad de personas");
        }
    }//GEN-LAST:event_jTnumPersonasFocusLost

    private void jTidHabitacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidHabitacionFocusGained
        /*if(jTidHabitacion.getText().equalsIgnoreCase("Número de habitación")){
            jTidHabitacion.setText("");
            JOptionPane.showMessageDialog(null,"Seleccione una Habitacion de la lista");
        }*/
        
    }//GEN-LAST:event_jTidHabitacionFocusGained

    private void jTidHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidHabitacionFocusLost
        if(jTidHabitacion.getText().equals("")){
            
            jTidHabitacion.setText("Número de Habitación");
        }
    }//GEN-LAST:event_jTidHabitacionFocusLost

    private void jTidHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidHabitacionKeyTyped
         validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTidHabitacionKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jdFechaSalidaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaSalidaPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jdFechaSalidaPropertyChange

    private void jdFechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaIngresoPropertyChange
        if(jdFechaIngreso.getDate() != null){
            
            Date f = Fecha.dateTomorrow(jdFechaIngreso.getDate());
            jdFechaSalida.setMinSelectableDate(f); 
        }  
    }//GEN-LAST:event_jdFechaIngresoPropertyChange

    private void jdFechaSalidaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jdFechaSalidaInputMethodTextChanged
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "kxkxxkxkxkxkxkxk");
    }//GEN-LAST:event_jdFechaSalidaInputMethodTextChanged

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTidHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTidHabitacionMouseClicked
       
        if(jTidHabitacion.getText().equalsIgnoreCase("Número de habitación")){
            JOptionPane.showMessageDialog
                (null,"Seleccione una Habitacion de la lista");
        }
    }//GEN-LAST:event_jTidHabitacionMouseClicked

    public void validaNumeroMenor(char c, KeyEvent evt) {
       
    }
    
    public void validaNumero(char c, KeyEvent evt) {
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLformulario;
    private javax.swing.JPanel jPcontenido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTidCliente;
    private javax.swing.JTextField jTidHabitacion;
    private javax.swing.JTextField jTnumPersonas;
    private com.toedter.calendar.JDateChooser jdFechaIngreso;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    // End of variables declaration//GEN-END:variables
}
