/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_f;

import Metodos_BD.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class RecuperarPassword extends javax.swing.JFrame {

    Metodos metodos = new Metodos();
    public RecuperarPassword() {
        initComponents();
        setLocationRelativeTo(null);
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
        img_Recover = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();
        lbl_Bienvenido = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        btn_Recuperar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(146, 197, 245));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 350));

        img_Recover.setBackground(new java.awt.Color(0, 204, 204));
        img_Recover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_f/zyro-image-removebg-preview (1).png"))); // NOI18N

        lbl_Correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Correo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Correo.setText("Correo:");

        lbl_Bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Bienvenido.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Bienvenido.setText("Bienvenido");

        lbl_info.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_info.setForeground(new java.awt.Color(0, 0, 0));
        lbl_info.setText("Para recuperar su contraseña por favor ingrese su correo electronico");

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));

        btn_Recuperar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Recuperar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Recuperar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Recuperar.setText("¡Recuperar!");
        btn_Recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RecuperarActionPerformed(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(255, 255, 255));
        btn_regresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_info)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lbl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_regresar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Recuperar))
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(img_Recover, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Bienvenido))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_Bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img_Recover, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_info)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Recuperar)
                    .addComponent(btn_regresar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RecuperarActionPerformed
        
        String busqueda_name = metodos.buscarNombre(txt_correo.getText());
        if(!"".equals(busqueda_name)){
            JOptionPane.showMessageDialog(this,"Correo encontrado, su contraseña es: " + busqueda_name);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Correo incorrecto o no se encuentra registrado");
           
        }
        
    }//GEN-LAST:event_btn_RecuperarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       Menu ventana = new Menu();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Recuperar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel img_Recover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Bienvenido;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
}