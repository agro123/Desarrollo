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
public class jPempleado extends javax.swing.JPanel {
    
    private int id,cedula;
    private String nombre,cargo;
    /**
     * Creates new form jPempleado
     */
    public jPempleado(int id_,int cedula_,String nombre_, String cargo_) {
        
        this.id = id_;
        this.cedula = cedula_;
        this.nombre = nombre_;
        this.cargo = cargo_;
        initComponents();
        
        jLid.setText(String.valueOf(id_));
        jLcedula.setText(String.valueOf(cedula_));
        jLnombre.setText(nombre_);
        jLcargo.setText(cargo_);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLcargo = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLcedula = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLcargo.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 81, 100, 10));

        jLnombre.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 65, 90, 10));

        jLcedula.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 48, 90, 10));

        jLid.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 30, 60, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado-jpanel.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 240, 130));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcargo;
    private javax.swing.JLabel jLcedula;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnombre;
    // End of variables declaration//GEN-END:variables
}