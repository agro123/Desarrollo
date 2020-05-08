/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Controladores.LoginControlador;
import Modelo.LoginModelo;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        super("Login");
        initComponents();
        this.setLocationRelativeTo(null);
        jPRegistro.setVisible(false);

        setIconImage(Toolkit.getDefaultToolkit().
                getImage(this.getClass().getResource("/imagenes/Logo.png")));
        setResizable(false);
    }

    public void ingresar() { //-------------------------------------------------- Verifica los campos para procionar el acceso dependiendo del tipo de usuario
        try {
            boolean found = false;

            String usuario = jTusername.getText();
            String contrasena = jPcontraseña.getText();
            if (usuario.equalsIgnoreCase("Usuario")
                    || contrasena.equalsIgnoreCase("Contraseña")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios!");
                
            }else if (usuario.equalsIgnoreCase("re")
                    && contrasena.equalsIgnoreCase("re")) {
                found = true;
                Recepcionista rec = new Recepcionista();
                rec.setVisible(true);
                dispose();
            }else if (usuario.equalsIgnoreCase("admin")
                    && contrasena.equalsIgnoreCase("admin")) {
                found = true;
                Principal pri = new Principal();
                pri.setVisible(true);
                dispose();
                
            } else {
                LoginControlador login = new LoginControlador();

                ArrayList<LoginModelo> usuarios = new ArrayList<>();

                usuarios = login.listadoLogin(0);

                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).getUsuario().equalsIgnoreCase(usuario)
                            && usuarios.get(i).getContrasena()
                                    .equalsIgnoreCase(contrasena)) {

                        // LoginModelo usu = usuarios.get(i);
                        // Principal c= new Principal(uau);    
                        //Principal pri = new Principal();
                        //pri.setVisible(true);
                        Recepcionista recep = new Recepcionista();
                        recep.setVisible(true);
                        dispose();
                        found = true;
                        break;

                    }
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null, "Ha ocurrido un error durante la verificacion "
                    + "\nError :" + ex.getMessage());
               
        }
    }

    public void registrar() {//-------------------------------------------------- PERMITE REGISTRAR UN NUEVO USUARIO DE LA BASE DE DATOS
        try {
            String usuario = jTusuario.getText();
            String contraseña = jPcontraseñaRe.getText();
            String telefono = jTtelefono.getText();
            String nombre = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String correo = jTcorreo.getText();
            String cedula = jTcedula.getText();
            String cargo = jTcargo.getText();

            if (usuario.equalsIgnoreCase("Usuario")
                    || contraseña.equalsIgnoreCase("Contraseña")
                    || telefono.equalsIgnoreCase("Telefono")
                    || nombre.equalsIgnoreCase("Nombre")
                    || direccion.equalsIgnoreCase("Direccion")
                    || correo.equalsIgnoreCase("Correo")
                    || cedula.equalsIgnoreCase("Cedula")
                    || cargo.equalsIgnoreCase("Cargo")) {

                JOptionPane.showMessageDialog(null, "Hay campos vacios!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Se ha registrado con exito!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                     "Ah ocurrido un error durante la verificacion " + "\nError :"
                    + ex.getMessage());

        }
    }

    public void enter(KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            ingresar();
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

        jPanel1 = new javax.swing.JPanel();
        jBinicia = new javax.swing.JButton();
        jBregistrar = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        jLlogo = new javax.swing.JLabel();
        jPRegistro = new javax.swing.JPanel();
        jTdireccion = new javax.swing.JTextField();
        jTcedula = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTcargo = new javax.swing.JTextField();
        jTusuario = new javax.swing.JTextField();
        jPcontraseñaRe = new javax.swing.JPasswordField();
        jBrgistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLfondo1 = new javax.swing.JLabel();
        jPiniciarSesion = new javax.swing.JPanel();
        jPcontraseña = new javax.swing.JPasswordField();
        jTusername = new javax.swing.JTextField();
        jLinput = new javax.swing.JLabel();
        jBiniciarSesion = new javax.swing.JButton();
        jLfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1118, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 170, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(1118, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBinicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iniciar-sinselect.png"))); // NOI18N
        jBinicia.setBorder(null);
        jBinicia.setContentAreaFilled(false);
        jBinicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBinicia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iniciar-select.png"))); // NOI18N
        jBinicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiniciaActionPerformed(evt);
            }
        });
        jPanel1.add(jBinicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 253, -1, -1));

        jBregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar-sinselect.png"))); // NOI18N
        jBregistrar.setBorder(null);
        jBregistrar.setContentAreaFilled(false);
        jBregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBregistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar-select.png"))); // NOI18N
        jBregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 253, -1, -1));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu-Inicio.png"))); // NOI18N
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 60));

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 59, -1, -1));

        jPRegistro.setBackground(new java.awt.Color(69, 170, 242));
        jPRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTdireccion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTdireccion.setForeground(new java.awt.Color(204, 204, 204));
        jTdireccion.setText("Dirección");
        jTdireccion.setBorder(null);
        jTdireccion.setOpaque(false);
        jTdireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTdireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTdireccionFocusLost(evt);
            }
        });
        jTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdireccionActionPerformed(evt);
            }
        });
        jPRegistro.add(jTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 190, 30));

        jTcedula.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcedula.setForeground(new java.awt.Color(204, 204, 204));
        jTcedula.setText("Cédula");
        jTcedula.setBorder(null);
        jTcedula.setOpaque(false);
        jTcedula.setSelectedTextColor(new java.awt.Color(69, 170, 242));
        jTcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTcedulaFocusLost(evt);
            }
        });
        jTcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcedulaActionPerformed(evt);
            }
        });
        jPRegistro.add(jTcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 30));

        jTtelefono.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTtelefono.setForeground(new java.awt.Color(204, 204, 204));
        jTtelefono.setText("Télefono");
        jTtelefono.setBorder(null);
        jTtelefono.setOpaque(false);
        jTtelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTtelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTtelefonoFocusLost(evt);
            }
        });
        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });
        jPRegistro.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 30));

        jTcorreo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcorreo.setForeground(new java.awt.Color(204, 204, 204));
        jTcorreo.setText("Correo");
        jTcorreo.setBorder(null);
        jTcorreo.setOpaque(false);
        jTcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTcorreoFocusLost(evt);
            }
        });
        jPRegistro.add(jTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 30));

        jTnombre.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTnombre.setForeground(new java.awt.Color(204, 204, 204));
        jTnombre.setText("Nombre");
        jTnombre.setBorder(null);
        jTnombre.setOpaque(false);
        jTnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnombreFocusLost(evt);
            }
        });
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jPRegistro.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 190, 30));

        jTcargo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcargo.setForeground(new java.awt.Color(204, 204, 204));
        jTcargo.setText("Cargo");
        jTcargo.setBorder(null);
        jTcargo.setOpaque(false);
        jTcargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcargoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTcargoFocusLost(evt);
            }
        });
        jTcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcargoActionPerformed(evt);
            }
        });
        jPRegistro.add(jTcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 190, 30));

        jTusuario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTusuario.setForeground(new java.awt.Color(204, 204, 204));
        jTusuario.setText("Usuario");
        jTusuario.setBorder(null);
        jTusuario.setOpaque(false);
        jTusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTusuarioFocusLost(evt);
            }
        });
        jPRegistro.add(jTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 30));

        jPcontraseñaRe.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jPcontraseñaRe.setForeground(new java.awt.Color(204, 204, 204));
        jPcontraseñaRe.setText("Contraseña");
        jPcontraseñaRe.setBorder(null);
        jPcontraseñaRe.setOpaque(false);
        jPcontraseñaRe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPcontraseñaReFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPcontraseñaReFocusLost(evt);
            }
        });
        jPcontraseñaRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPcontraseñaReActionPerformed(evt);
            }
        });
        jPcontraseñaRe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPcontraseñaReKeyPressed(evt);
            }
        });
        jPRegistro.add(jPcontraseñaRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 200, 30));

        jBrgistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro-select.png"))); // NOI18N
        jBrgistrar.setBorder(null);
        jBrgistrar.setContentAreaFilled(false);
        jBrgistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBrgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrgistrarActionPerformed(evt);
            }
        });
        jPRegistro.add(jBrgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inputText.png"))); // NOI18N
        jPRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLfondo1.setBackground(new java.awt.Color(69, 170, 242));
        jLfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-registro.png"))); // NOI18N
        jLfondo1.setAlignmentX(327.0F);
        jLfondo1.setAlignmentY(208.0F);
        jLfondo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPRegistro.add(jLfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, -1));

        jPanel1.add(jPRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 208, 680, 440));

        jPiniciarSesion.setBackground(new java.awt.Color(69, 170, 242));
        jPiniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPcontraseña.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jPcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        jPcontraseña.setText("Contraseña");
        jPcontraseña.setBorder(null);
        jPcontraseña.setCaretColor(new java.awt.Color(204, 204, 204));
        jPcontraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPcontraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPcontraseñaFocusLost(evt);
            }
        });
        jPcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPcontraseñaActionPerformed(evt);
            }
        });
        jPcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPcontraseñaKeyPressed(evt);
            }
        });
        jPiniciarSesion.add(jPcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 260, 20));

        jTusername.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTusername.setForeground(new java.awt.Color(204, 204, 204));
        jTusername.setText("Usuario");
        jTusername.setBorder(null);
        jTusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTusernameFocusLost(evt);
            }
        });
        jTusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTusernameKeyPressed(evt);
            }
        });
        jPiniciarSesion.add(jTusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 270, 20));

        jLinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Input.png"))); // NOI18N
        jPiniciarSesion.add(jLinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jBiniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesión-select.png"))); // NOI18N
        jBiniciarSesion.setBorder(null);
        jBiniciarSesion.setContentAreaFilled(false);
        jBiniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBiniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiniciarSesionActionPerformed(evt);
            }
        });
        jPiniciarSesion.add(jBiniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLfondo.setBackground(new java.awt.Color(69, 170, 242));
        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-login.png"))); // NOI18N
        jLfondo.setAlignmentX(327.0F);
        jLfondo.setAlignmentY(208.0F);
        jLfondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPiniciarSesion.add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPiniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 208, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPcontraseñaActionPerformed
        // TODO add your handling code here:
        jPcontraseña.selectAll();
    }//GEN-LAST:event_jPcontraseñaActionPerformed

    private void jBiniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiniciaActionPerformed
        // TODO add your handling code here:
        jBregistrar.setSelected(false);
        jBinicia.setSelected(true);

        jPRegistro.setVisible(false);
        jPiniciarSesion.setVisible(true);
    }//GEN-LAST:event_jBiniciaActionPerformed

    private void jBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarActionPerformed
        // TODO add your handling code here:
        jBinicia.setSelected(false);
        jBregistrar.setSelected(true);

        jPiniciarSesion.setVisible(false);
        jPRegistro.setVisible(true);

    }//GEN-LAST:event_jBregistrarActionPerformed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
        jTtelefono.selectAll();
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTcedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcedulaFocusGained
        // TODO add your handling code here:
        jTcedula.setText("");
    }//GEN-LAST:event_jTcedulaFocusGained

    private void jTtelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTtelefonoFocusGained
        // TODO add your handling code here:
        jTtelefono.setText("");
    }//GEN-LAST:event_jTtelefonoFocusGained

    private void jTcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcorreoFocusGained
        // TODO add your handling code here:
        jTcorreo.setText("");
    }//GEN-LAST:event_jTcorreoFocusGained

    private void jTnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnombreFocusGained
        // TODO add your handling code here:
        jTnombre.setText("");
    }//GEN-LAST:event_jTnombreFocusGained

    private void jTcargoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcargoFocusGained
        // TODO add your handling code here:
        jTcargo.setText("");
    }//GEN-LAST:event_jTcargoFocusGained

    private void jTdireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdireccionFocusGained
        // TODO add your handling code here:
        jTdireccion.setText("");
    }//GEN-LAST:event_jTdireccionFocusGained

    private void jTcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcedulaFocusLost
        // TODO add your handling code here:
        if (jTcedula.getText().equalsIgnoreCase("")) {
            jTcedula.setText("Cédula");
        }
    }//GEN-LAST:event_jTcedulaFocusLost

    private void jTtelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTtelefonoFocusLost
        // TODO add your handling code here:
        if (jTtelefono.getText().equalsIgnoreCase("")) {
            jTtelefono.setText("Teléfono");
        }
    }//GEN-LAST:event_jTtelefonoFocusLost

    private void jTcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcorreoFocusLost
        // TODO add your handling code here:
        if (jTcorreo.getText().equalsIgnoreCase("")) {
            jTcorreo.setText("Correo eléctronico");
        }
    }//GEN-LAST:event_jTcorreoFocusLost

    private void jTnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnombreFocusLost
        // TODO add your handling code here:
        if (jTnombre.getText().equalsIgnoreCase("")) {
            jTnombre.setText("Nombre");
        }
    }//GEN-LAST:event_jTnombreFocusLost

    private void jTcargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcargoFocusLost
        // TODO add your handling code here:
        if (jTcargo.getText().equalsIgnoreCase("")) {
            jTcargo.setText("Cargo");
        }
    }//GEN-LAST:event_jTcargoFocusLost

    private void jTdireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdireccionFocusLost
        // TODO add your handling code here:
        if (jTdireccion.getText().equalsIgnoreCase("")) {
            jTdireccion.setText("Dirección");
        }
    }//GEN-LAST:event_jTdireccionFocusLost

    private void jBrgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrgistrarActionPerformed

        // --> FALTA AQUÍ EL LLAMADO A LAS VALIDACIONES
        registrar();
        jPRegistro.setVisible(false);
        jPiniciarSesion.setVisible(true);

    }//GEN-LAST:event_jBrgistrarActionPerformed

    private void jTusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTusernameFocusGained
        // TODO add your handling code here:
        jTusername.setText("");
    }//GEN-LAST:event_jTusernameFocusGained

    private void jTusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTusernameFocusLost
        // TODO add your handling code here:
        if (jTusername.getText().equalsIgnoreCase("")) {
            jTusername.setText("Usuario");
        }
    }//GEN-LAST:event_jTusernameFocusLost

    private void jPcontraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPcontraseñaFocusGained
        // TODO add your handling code here:
        jPcontraseña.setText("");
        jPcontraseña.setEchoChar((char) 1);
    }//GEN-LAST:event_jPcontraseñaFocusGained

    private void jPcontraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPcontraseñaFocusLost
        // TODO add your handling code here:
        if (jPcontraseña.getText().equalsIgnoreCase("")) {
            jPcontraseña.setText("Contraseña");
            jPcontraseña.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jPcontraseñaFocusLost

    private void jBiniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiniciarSesionActionPerformed

        //--> FALTA VALIDACIONES
        if (jTusuario.getText().equalsIgnoreCase("")
                || jTcargo.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {

            ingresar();
        }

    }//GEN-LAST:event_jBiniciarSesionActionPerformed

    private void jTusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTusuarioFocusGained
        // TODO add your handling code here:         
        jTusuario.setText("");
    }//GEN-LAST:event_jTusuarioFocusGained

    private void jTusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTusuarioFocusLost
        // TODO add your handling code here:
        if (jTusuario.getText().equalsIgnoreCase("")) {
            jTusuario.setText("Usuario");
        }

    }//GEN-LAST:event_jTusuarioFocusLost

    private void jPcontraseñaReFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPcontraseñaReFocusGained
        // TODO add your handling code here:
        jPcontraseñaRe.setText("");
        jPcontraseñaRe.setEchoChar((char) 1);
    }//GEN-LAST:event_jPcontraseñaReFocusGained

    private void jPcontraseñaReFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPcontraseñaReFocusLost
        // TODO add your handling code here:
        if (jPcontraseñaRe.getText().equalsIgnoreCase("")) {
            jPcontraseñaRe.setText("Contraseña");
            jPcontraseñaRe.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jPcontraseñaReFocusLost

    private void jTcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcedulaActionPerformed
        // TODO add your handling code here:
        jTcedula.selectAll();
    }//GEN-LAST:event_jTcedulaActionPerformed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
        jTnombre.selectAll();
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcargoActionPerformed
        // TODO add your handling code here:
        jTcargo.selectAll();
    }//GEN-LAST:event_jTcargoActionPerformed

    private void jTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdireccionActionPerformed
        // TODO add your handling code here:
        jTdireccion.selectAll();
    }//GEN-LAST:event_jTdireccionActionPerformed

    private void jPcontraseñaReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPcontraseñaReActionPerformed
        // TODO add your handling code here:
        jPcontraseña.selectAll();
    }//GEN-LAST:event_jPcontraseñaReActionPerformed

    private void jPcontraseñaReKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPcontraseñaReKeyPressed
        // TODO add your handling code here:
        enter(evt);
    }//GEN-LAST:event_jPcontraseñaReKeyPressed

    private void jPcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPcontraseñaKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            ingresar();
        }
    }//GEN-LAST:event_jPcontraseñaKeyPressed

    private void jTusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTusernameKeyPressed

    }//GEN-LAST:event_jTusernameKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JButton jBinicia;
    private javax.swing.JButton jBiniciarSesion;
    private javax.swing.JButton jBregistrar;
    private javax.swing.JButton jBrgistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JLabel jLfondo1;
    private javax.swing.JLabel jLinput;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JPanel jPRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPcontraseña;
    private javax.swing.JPasswordField jPcontraseñaRe;
    private javax.swing.JPanel jPiniciarSesion;
    private javax.swing.JTextField jTcargo;
    private javax.swing.JTextField jTcedula;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jTusername;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
