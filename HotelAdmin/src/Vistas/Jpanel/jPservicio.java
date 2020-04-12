/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControllerServicios;
import Modelo.RoomServicesDAO;
import Vistas.Jframe.Services;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class jPservicio extends javax.swing.JPanel {

    private int cantidad;
    private String id, nombre;
    private double precio;
    String validadorPanel; 
   
    Services frame_servicios;

    /**
     * Creates new form jPservicio
     */
    public jPservicio() {

    }

    public jPservicio(String id_, String nombre_, double precio_, int cantidad_, Services s) {
        /*this.id = id_;
        this.nombre = nombre_;
        this.precio = precio_;
        this.cantidad = cantidad_;*/
        
        id = id_;

        initComponents();
        jLid.setText(String.valueOf(id_));
        jLnombre.setText(nombre_);
        jLprecio.setText(String.valueOf(precio_));
        jLcantidad.setText(String.valueOf(cantidad_));
        frame_servicios = s;
    }

    public void setValidadorPanel(String validadorPanel) {
        this.validadorPanel = validadorPanel;
    }

    
    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void cambiarPanel() {
        frame_servicios.mostrarPanelAgregar();
        frame_servicios.getControladorServicios().leerServicio_porID(id);
    }
    
    public void deleteOfPanel()
    {
        frame_servicios.getControladorServicios().eliminarServicio(id);
        frame_servicios.mostrarPanelEliminar();
        frame_servicios.getControladorServicios().leerServicios();          
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnombre = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLcantidad = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLnombre.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 50, 58, 10));

        jLid.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 32, 48, 10));

        jLcantidad.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 80, 60, 10));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 65, 70, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Servicio-jpanel.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 220, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Eliminar", dialog);
        if (result == 0) {
            if(validadorPanel == "actualizar"){
                cambiarPanel();
            } else if(validadorPanel == "eliminar") {
                deleteOfPanel();
            }
        }

    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcantidad;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLprecio;
    // End of variables declaration//GEN-END:variables
}
