/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author HP-PC
 */
public class result extends javax.swing.JPanel {
    public String imp_ib;
    public String imp_ic;
    public String imp_ie;
    public String imp_vce;
    public String imp_vrc;
    public String imp_vrb;
    public String imp_vre;
    public String imp_vb;
    public String imp_vc;
    public String imp_ve;
    public String imp_icsat;
    public String imp_vceq;
    public String imp_icq;
    /**
     * Creates new form result
     */
    public result(double ib,double ic, double ie, 
                  double vce, double vrc,double vrb,
                  double vre,double vb,double vc, 
                  double ve, double icsat,double vceq, 
                  double icq){
        imp_ib=ib*1000+" mA";
        imp_ic=ic*1000+" mA";
        imp_ie=ie*1000+" mA";
        imp_vce=vce+" V";
        imp_vrc=vrc+" V";
        imp_vrb=vrb+" V";
        imp_vre=vre+" V";
        imp_vb=vb+" V";
        imp_vc=vc+" V";
        imp_ve=ve+" V";
        imp_icsat=icsat*1000+" mA";
        imp_vceq=vceq+" V";
        
        label_ib.setText(imp_ib);
        label_ic.setText(imp_ic);
        label_ie.setText(imp_ie);
        label_vce.setText(imp_vce);
        label_vrc.setText(imp_vrc);
        label_vrb.setText(imp_vrb);
        label_vre.setText(imp_vre);
        label_vb.setText(imp_vb);
        label_vc.setText(imp_vc);
        label_ve.setText(imp_ve);
        label_icsat.setText(imp_icsat);
        label_vceq.setText(imp_vceq);
        
    }
    public result() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        label_ib = new javax.swing.JLabel();
        label_ic = new javax.swing.JLabel();
        label_ie = new javax.swing.JLabel();
        label_vce = new javax.swing.JLabel();
        label_vrc = new javax.swing.JLabel();
        label_vrb = new javax.swing.JLabel();
        label_vre = new javax.swing.JLabel();
        label_ve = new javax.swing.JLabel();
        label_vb = new javax.swing.JLabel();
        label_vc = new javax.swing.JLabel();
        label_icsat = new javax.swing.JLabel();
        label_vceq = new javax.swing.JLabel();
        label_icq = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ib = ");

        jLabel3.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ic =");

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ie = ");

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vce =");

        jLabel6.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vrc =");

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vrb =");

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vre =");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Vb =");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ve =");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vc =");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Icsat =");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Vceq =");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Icq =");

        label_ib.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_ib.setText("jLabel15");

        label_ic.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_ic.setText("jLabel16");

        label_ie.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_ie.setText("jLabel17");

        label_vce.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vce.setText("jLabel18");

        label_vrc.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vrc.setText("jLabel19");

        label_vrb.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vrb.setText("jLabel20");

        label_vre.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vre.setText("jLabel21");

        label_ve.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_ve.setText("jLabel22");

        label_vb.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vb.setText("jLabel23");

        label_vc.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vc.setText("jLabel24");

        label_icsat.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_icsat.setText("jLabel25");

        label_vceq.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_vceq.setText("jLabel26");

        label_icq.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        label_icq.setText("jLabel27");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uaalogo.jpg"))); // NOI18N

        jLabel29.setText("EasyTNP By: Paola Rebeca Garcia");

        jLabel30.setText("Adriana Torres ");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambiar parametros");

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel31.setText("Resultados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_vre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(1, 1, 1)))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_ib)
                                            .addComponent(label_ic)
                                            .addComponent(label_ie)
                                            .addComponent(label_vce)
                                            .addComponent(label_vrc)
                                            .addComponent(label_vrb)))
                                    .addComponent(jLabel8))
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_icq))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_vc))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label_vb)
                                                .addComponent(label_ve))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(39, 39, 39)
                                        .addComponent(label_icsat))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(39, 39, 39)
                                        .addComponent(label_vceq))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(112, 112, 112))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 402, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(69, 69, 69))))
                            .addComponent(jLabel28))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_ib)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_ic)
                                    .addComponent(jLabel10)
                                    .addComponent(label_ve)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(label_vc))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(label_icsat))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(label_vceq)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label_ie)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label_vce)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(label_vrc))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel8)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(label_vrb)
                            .addComponent(label_icq))
                        .addGap(18, 18, 18)
                        .addComponent(label_vre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(5, 5, 5)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_vb))
                        .addGap(53, 53, 53)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
