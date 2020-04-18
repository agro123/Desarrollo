/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Vistas.Jpanel.EmpleadoFormulario;
import Vistas.Jpanel.ServiciosAgregarModificarGUI;
import Vistas.Jpanel.ServiciosListaGUI;
import Vistas.Jpanel.jPservicio;

/**
 *
 * @author nicol
 */
public class Servicios extends javax.swing.JPanel {

    /**
     * Creates new form Servicios
     */
    public Servicios() {
        initComponents();
        seleccionarPrimero();
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
        jBagregar.setSelected(false);
        jBeliminar.setSelected(false);
        jBmodificar.setSelected(true);
        
        jPcontenedor.setVisible(false);
        jPcontenedor.setVisible(false);
        ServiciosListaGUI panelE = new ServiciosListaGUI();

        jPcontenedor.removeAll();
        jPcontenedor.add(panelE);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
        jPservicio ser = new jPservicio();
       // habi.setEleccion("modificar");
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        jBagregar.setSelected(false);
        jBmodificar.setSelected(false);
        jBeliminar.setSelected(true);
        
        jPcontenedor.setVisible(false);
        jPcontenedor.setVisible(true);
        ServiciosListaGUI panelE = new ServiciosListaGUI();
        jPcontenedor.removeAll();
        jPcontenedor.add(panelE);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();

        jPservicio ser = new jPservicio();
       // habi.setEleccion("eliminar");

    }//GEN-LAST:event_jBeliminarActionPerformed

    public void seleccionarPrimero(){
        jBeliminar.setSelected(false);
        jBmodificar.setSelected(false);
        jBagregar.setSelected(true); 
        ServiciosAgregarModificarGUI panelE = new ServiciosAgregarModificarGUI();
        jPcontenedor.removeAll();
        jPcontenedor.add(panelE);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }
        
    
    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        // TODO add your handling code here:
    
        
        jPcontenedor.removeAll();
        seleccionarPrimero();
    }//GEN-LAST:event_jBagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLmenuCrud;
    private javax.swing.JPanel jPcontenedor;
    // End of variables declaration//GEN-END:variables
}
