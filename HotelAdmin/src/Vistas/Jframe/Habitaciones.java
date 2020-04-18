/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Vistas.Jpanel.HabitacionAgregarModificarGUI;
import Vistas.Jpanel.HabitacionListaGUI;
import Vistas.Jpanel.jPhabitacion;
import javax.swing.Icon;
import Controladores.*;
import Modelo.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class Habitaciones extends javax.swing.JPanel {

    /**
     * Creates new form HabitacionGUI
     */
    HabitacionAgregarModificarGUI panelAgregar;
    HabitacionListaGUI panelModificar;
    HabitacionListaGUI panelEliminar; 
    ControllerHabitacion controladorHabitacion;
    
    public Habitaciones() {
        initComponents();
        panelAgregar = new HabitacionAgregarModificarGUI();
        panelModificar = new HabitacionListaGUI(this);
        panelEliminar = new HabitacionListaGUI(this);
        mostrarPanelAgregar();
        
    }

    public HabitacionAgregarModificarGUI getPanelAgregar() {
        return panelAgregar;
    }

    public HabitacionListaGUI getPanelModificar() {
        return panelModificar;
    }

    public HabitacionListaGUI getPanelEliminar() {
        return panelEliminar;
    }
    
    public JButton getjBeliminar() {
        return jBeliminar;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }

    public JButton getjBagregar() {
        return jBagregar;
    }

    public JPanel getjPcontenedor() {
        return jPcontenedor;
    }

    public void setControladorHabitacion(ControllerHabitacion controladorHabitacion) {
        this.controladorHabitacion = controladorHabitacion;
    }

    public ControllerHabitacion getControladorHabitacion() {
        return controladorHabitacion;
    }
    
    
    
    public void mostrarPanelModificar()
    {
        jBagregar.setSelected(false);
        jBeliminar.setSelected(false);
        jBmodificar.setSelected(true);
        jPcontenedor.removeAll();
        jPcontenedor.add(panelModificar);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);       
    }
    
    
    public void mostrarPanelAgregar(){
        jBeliminar.setSelected(false);
        jBmodificar.setSelected(false);
        jBagregar.setSelected(true); 
        jPcontenedor.removeAll();
        jPcontenedor.add(panelAgregar);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }
    
    public void mostrarPanelEliminar()
    {
        jBeliminar.setSelected(true);
        jBmodificar.setSelected(false);
        jBagregar.setSelected(false); 
        jPcontenedor.removeAll();
        jPcontenedor.add(panelEliminar);
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

        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jLmenuCrud = new javax.swing.JLabel();
        jPcontenedor = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-modificarGris.png"))); // NOI18N
        jBmodificar.setBorder(null);
        jBmodificar.setBorderPainted(false);
        jBmodificar.setContentAreaFilled(false);
        jBmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBmodificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-modificar.png"))); // NOI18N
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, -1));

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-eliminarGris.png"))); // NOI18N
        jBeliminar.setBorder(null);
        jBeliminar.setBorderPainted(false);
        jBeliminar.setContentAreaFilled(false);
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccion-eliminar.png"))); // NOI18N
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 100, 40));

        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-agregarGris.png"))); // NOI18N
        jBagregar.setBorder(null);
        jBagregar.setBorderPainted(false);
        jBagregar.setContentAreaFilled(false);
        jBagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBagregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-agregar.png"))); // NOI18N
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 30, -1, -1));

        jLmenuCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu-crud.png"))); // NOI18N
        add(jLmenuCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 23, -1, -1));

        jPcontenedor.setOpaque(false);
        jPcontenedor.setLayout(new java.awt.BorderLayout());
        add(jPcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 770, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
//        jBagregar.setSelected(false);
//        jBeliminar.setSelected(false);
//        jBmodificar.setSelected(true);       
//        jPcontenedor.setVisible(false);
//        jPcontenedor.setVisible(true);
//        panelM = new HabitacionListaGUI();
//        jPcontenedor.removeAll();
//        jPcontenedor.add(panelM);
//        jPcontenedor.revalidate();
//        jPcontenedor.repaint();
//        jPhabitacion habi = new jPhabitacion("modificar");
       
//        HabitacionesDAO modelohabitacion = new HabitacionesDAO();
//        ControllerHabitacion controladorHabitacion = new ControllerHabitacion(this, modelohabitacion);
//        controladorHabitacion.leerHabitaciones();
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
//        jBagregar.setSelected(false);
//        jBmodificar.setSelected(false);
//        jBeliminar.setSelected(true);       
//        jPcontenedor.setVisible(false);
//        jPcontenedor.setVisible(true);        
//        panelM = new HabitacionListaGUI();
//        jPcontenedor.removeAll();
//        jPcontenedor.add(panelM);
//        jPcontenedor.revalidate();
//        jPcontenedor.repaint();
//
//        jPhabitacion habi = new jPhabitacion("eliminar");
//     
//        HabitacionesDAO modelohabitacion = new HabitacionesDAO();
//        ControllerHabitacion controladorHabitacion = new ControllerHabitacion(this, modelohabitacion); 
//        controladorHabitacion.leerHabitaciones();
    }//GEN-LAST:event_jBeliminarActionPerformed

//    public void MostrarPanelAgregar(){
//        jBeliminar.setSelected(false);
//        jBmodificar.setSelected(false);
//        jBagregar.setSelected(true); 
//        jPcontenedor.removeAll();
//        jPcontenedor.add(panelA);
//        jPcontenedor.revalidate();
//        jPcontenedor.repaint();
//        jPcontenedor.setVisible(true);
//    }
    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        // TODO add your handling code here:
       
//        jPcontenedor.removeAll();
//        seleccionarPrimero();
        
  
    }//GEN-LAST:event_jBagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLmenuCrud;
    private javax.swing.JPanel jPcontenedor;
    // End of variables declaration//GEN-END:variables
}