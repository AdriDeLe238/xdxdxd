/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import veterinaria.Circuito;

/**
 *
 * @author Adriana
 */
public class Frm_retro extends javax.swing.JPanel {

    /**
     * Creates new form Frm_retro
     */
    public Frm_retro() {
        initComponents();
    }
    
    public double rb;
    public double vcc;
    public double rc;
    public double vbb; 
    public double b;
    public double r1;  
    public double r2; 
    public double re; 
    final double vbe=0.7;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        In_vcc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        In_R1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        In_R2 = new javax.swing.JTextField();
        In_RE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        In_RC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        In_B = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        label_ib = new javax.swing.JLabel();
        label_ic = new javax.swing.JLabel();
        label_ie = new javax.swing.JLabel();
        label_vce = new javax.swing.JLabel();
        label_vrc = new javax.swing.JLabel();
        label_vrb = new javax.swing.JLabel();
        label_vre = new javax.swing.JLabel();
        label_vb = new javax.swing.JLabel();
        label_vc = new javax.swing.JLabel();
        label_ve = new javax.swing.JLabel();
        label_icsat = new javax.swing.JLabel();
        label_vceq = new javax.swing.JLabel();
        label_icq = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Polarización con Realimentación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 500, 53));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserte Datos del Circuito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        btn_guardar.setToolTipText("");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardarMousePressed(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 78, 64));

        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btn_borrar.setToolTipText("");
        btn_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_borrarMouseClicked(evt);
            }
        });
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 84, 64));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PolRea.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 24, 426, 411));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("VCC: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 26, -1, -1));

        In_vcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_vccActionPerformed(evt);
            }
        });
        jPanel2.add(In_vcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 24, 30, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("R1: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 53, -1, -1));
        jPanel2.add(In_R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 51, 30, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("R2: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 79, -1, -1));

        In_R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_R2ActionPerformed(evt);
            }
        });
        jPanel2.add(In_R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 77, 30, -1));

        In_RE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_REActionPerformed(evt);
            }
        });
        jPanel2.add(In_RE, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 106, 30, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("RE: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 109, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("RC: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 139, -1, -1));
        jPanel2.add(In_RC, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 137, 30, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("B: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 168, -1, -1));
        jPanel2.add(In_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 168, 30, -1));

        jLabel9.setText("Ib=");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 199, -1, -1));

        jLabel10.setText("Ic=");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 219, -1, -1));

        jLabel11.setText("Ie=");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 239, -1, -1));

        jLabel12.setText("Vce=");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 259, -1, -1));

        jLabel13.setText("Vrc=");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 279, -1, -1));

        jLabel14.setText("Vrb=");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 299, -1, -1));

        jLabel15.setText("Vre=");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 319, -1, -1));

        jLabel16.setText("Vb=");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 206, -1, -1));

        jLabel17.setText("Vc=");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 226, -1, -1));

        jLabel18.setText("Ve=");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 246, -1, -1));

        jLabel19.setText("Icsat=");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 289, -1, -1));

        jLabel20.setText("Vceq=");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 309, -1, -1));

        jLabel21.setText("Icq=");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        label_ib.setText(".");
        jPanel2.add(label_ib, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 199, -1, -1));

        label_ic.setText(".");
        jPanel2.add(label_ic, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 219, -1, -1));

        label_ie.setText(".");
        jPanel2.add(label_ie, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 239, -1, -1));

        label_vce.setText(".");
        jPanel2.add(label_vce, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 259, -1, -1));

        label_vrc.setText(".");
        jPanel2.add(label_vrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 279, -1, -1));

        label_vrb.setText(".");
        jPanel2.add(label_vrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 299, -1, -1));

        label_vre.setText(".");
        jPanel2.add(label_vre, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 319, -1, -1));

        label_vb.setText(".");
        jPanel2.add(label_vb, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 206, -1, -1));

        label_vc.setText(".");
        jPanel2.add(label_vc, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 226, -1, -1));

        label_ve.setText(".");
        jPanel2.add(label_ve, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 246, -1, -1));

        label_icsat.setText(".");
        jPanel2.add(label_icsat, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 289, -1, -1));

        label_vceq.setText(".");
        jPanel2.add(label_vceq, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 309, -1, -1));

        label_icq.setText(".");
        jPanel2.add(label_icq, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 980, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void In_vccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_vccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_vccActionPerformed

    private void In_R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_R2ActionPerformed

    private void In_REActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_REActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_REActionPerformed

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        vcc = Double.parseDouble(In_vcc.getText());
        System.out.println(In_vcc);
        re = Double.parseDouble(In_RE.getText());
        rc = Double.parseDouble(In_RC.getText());
        r1 = Double.parseDouble(In_R1.getText());
        r2 = Double.parseDouble(In_R2.getText());
        b = Double.parseDouble(In_B.getText());
        
        System.out.println(rb);
        System.out.println(rc);
        System.out.println(vbb);
        System.out.println(b);
        System.out.println("valores recuperados");
        Circuito circ4 = new Circuito(vcc,0,rc,0,b,r1,r2,re);
        circ4.Real();
        circ4.cadenas();
        label_ib.setText(circ4.imp_ib);
        label_ic.setText(circ4.imp_ic);
        label_ie.setText(circ4.imp_ie);
        label_vce.setText(circ4.imp_vce);
        label_vrc.setText(circ4.imp_vrc);
        label_vrb.setText(circ4.imp_vrb);
        label_vre.setText(circ4.imp_vre);
        label_vb.setText(circ4.imp_vb);
        label_vc.setText(circ4.imp_vc);
        label_ve.setText(circ4.imp_ve);
        label_icsat.setText(circ4.imp_icsat);
        label_vceq.setText(circ4.imp_vceq);
        
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarMousePressed

    private void btn_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_borrarMouseClicked
        // TODO add your handling code here:
       In_B.setText("");
       In_R1.setText("");
       In_R2.setText("");
       In_RC.setText("");
       In_RE.setText("");
       In_vcc.setText("");
    }//GEN-LAST:event_btn_borrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField In_B;
    private javax.swing.JTextField In_R1;
    private javax.swing.JTextField In_R2;
    private javax.swing.JTextField In_RC;
    private javax.swing.JTextField In_RE;
    private javax.swing.JTextField In_vcc;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_ib;
    private javax.swing.JLabel label_ic;
    private javax.swing.JLabel label_icq;
    private javax.swing.JLabel label_icsat;
    private javax.swing.JLabel label_ie;
    private javax.swing.JLabel label_vb;
    private javax.swing.JLabel label_vc;
    private javax.swing.JLabel label_vce;
    private javax.swing.JLabel label_vceq;
    private javax.swing.JLabel label_ve;
    private javax.swing.JLabel label_vrb;
    private javax.swing.JLabel label_vrc;
    private javax.swing.JLabel label_vre;
    // End of variables declaration//GEN-END:variables
}
