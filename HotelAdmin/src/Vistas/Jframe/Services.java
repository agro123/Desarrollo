/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Controladores.ControllerServicios;
import Modelo.RoomServicesDAO;
import Vistas.Jpanel.EmpleadoFormulario;
import Vistas.Jpanel.panelAgregarServicio;
import Vistas.Jpanel.panelModificarServicio;
import Vistas.Jpanel.jPservicio;
import Vistas.Jframe.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author nicol
 */
public class Services extends javax.swing.JPanel {

    /**
     * Creates new form Servicios
     */
    
    panelAgregarServicio panelAgregar;
    panelModificarServicio panelModificar;
    panelModificarServicio panelEliminar;
    ControllerServicios controladorServicios;
   
     
    public Services() {
        initComponents();
        panelAgregar = new panelAgregarServicio();
        panelModificar = new panelModificarServicio(this);
        panelEliminar = new panelModificarServicio(this);
        mostrarPanelAgregar();
    }

    public void setControladorServicios(ControllerServicios controladorServicios) {
        this.controladorServicios = controladorServicios;
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
        add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLmenuCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu-crud.png"))); // NOI18N
        add(jLmenuCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 23, -1, -1));

        jPcontenedor.setOpaque(false);
        jPcontenedor.setLayout(new java.awt.BorderLayout());
        add(jPcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 770, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed

    }//GEN-LAST:event_jBmodificarActionPerformed

    public JPanel getjPcontenedor() {
        return jPcontenedor;
    }

    public JButton getjBagregar() {
        return jBagregar;
    }

    
    

    public ControllerServicios getControladorServicios() {
        return controladorServicios;
    }
   

    
    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here 
    }//GEN-LAST:event_jBeliminarActionPerformed

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
        
    
    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBagregarActionPerformed

    

    public panelAgregarServicio getPanelAgregar() {
        return panelAgregar;
    }

    public panelModificarServicio getPanelModificar() {
        return panelModificar;
    }
    
    public panelModificarServicio getPanelEliminar() {
        return panelEliminar;
    }

    public JButton getjBeliminar() {
        return jBeliminar;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }
    
    
    
    
    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }
      
      
      
    

  

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLmenuCrud;
    private javax.swing.JPanel jPcontenedor;
    // End of variables declaration//GEN-END:variables
}
