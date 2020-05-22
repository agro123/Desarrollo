/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControladorHospedaje;
import Modelo.Hospedaje;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class ListaHospedajesGUI extends javax.swing.JPanel {

    /**
     * Creates new form ListaHospedajesGUI
     */
    private boolean first;
    private ArrayList<Hospedaje>h;
    private int nElementos;
    public ListaHospedajesGUI() {
        initComponents();
        ControladorHospedaje ch = new ControladorHospedaje();
        h = ch.listadoHospedaje(1);
        first = false;
        AgregarLista();
       first = true;
    }

    
    public void AgregarLista(){
       nElementos=0;
       jPcontenido.removeAll();
       for (int i=0;i<h.size();i++){
         int idhospedaje = h.get(i).getIdHospedaje();
         int idcliente = h.get(i).getIdCliente();
         int idhabitacion = h.get(i).getIdHabitacion();
         int piso = h.get(i).getPiso();
         jPhospedaje jp = new jPhospedaje(idhospedaje,idcliente,
                idhabitacion,piso);
         nElementos++;
         jPcontenido.add(jp);
       }
       if(first){
       verficarNumeroElementos(0);
       }
       jPcontenido.revalidate();
       jPcontenido.repaint();   
    }
    
    private void filtrarBusqueda(){
        if(jTextField1.getText().trim().length()>10){
        JOptionPane.showMessageDialog(null,
               "La identificación no debe de tener mas de 10 caracateres.");
         jTextField1.setText("");
       }else {
          int cliente = Integer.parseInt(jTextField1.getText().trim());   
          nElementos=0;
          jPcontenido.removeAll();
          for (int i=0;i<h.size();i++){
              if(cliente==h.get(i).getIdCliente()){
                  int idhospedaje = h.get(i).getIdHospedaje();
                  int idcliente = h.get(i).getIdCliente();
                  int idhabitacion = h.get(i).getIdHabitacion();
                  int piso = h.get(i).getPiso();
                  jPhospedaje jp = new jPhospedaje(idhospedaje,idcliente,
                  idhabitacion,piso);
                  nElementos++;
                  jPcontenido.add(jp);
                }        
           }
          verficarNumeroElementos(1);
          jPcontenido.revalidate();
          jPcontenido.repaint();
       }
    }
    private boolean verificarCampoBuscar(){
        if(jTextField1.getText().trim().equalsIgnoreCase("")||
                jTextField1.getText()
                        .trim()
                        .equalsIgnoreCase("Buscar hospedaje por ID de cliente"))
        {
            JOptionPane.showMessageDialog(null,
                 "Debe ingresar el id de un cliente");
             AgregarLista();
            return false;
        }else {
            return true;
        }
    }
    private void verficarNumeroElementos(int n){
        if(nElementos==0){
            JOptionPane.showMessageDialog(null,
                 "No se encontraron resultados");
            if(n==1){
                AgregarLista();
            }
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPcontenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(191, 191, 191));
        jTextField1.setText("Buscar hospedaje por ID de cliente");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 44, 24, 24));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jPcontenido.setBackground(new java.awt.Color(255, 255, 255));
        jPcontenido.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        jScrollPane2.setViewportView(jPcontenido);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 125, 725, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MarcoListaHospe.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 77, 750, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(verificarCampoBuscar()){
            filtrarBusqueda();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equalsIgnoreCase("")){ 
        jTextField1.setText("Buscar hospedaje por ID de cliente");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER){
          if(verificarCampoBuscar()){
            filtrarBusqueda();
          }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPcontenido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
