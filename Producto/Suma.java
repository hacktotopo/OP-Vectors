package Producto;
/*
 * @author Hacktotopo
*/

public class Suma extends javax.swing.JFrame {
    public Suma() {
        initComponents();
        this.setLocationRelativeTo(null);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SAJ = new javax.swing.JTextField();
        SAK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SAI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Datos2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SBJ = new javax.swing.JTextField();
        SBK = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SBI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Realizar = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        GoBack = new javax.swing.JButton();
        jTResultadoSuma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 550));
        setName("Suma de Vectores"); // NOI18N
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(65, 146, 227));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(550, 550));

        Datos.setBackground(new java.awt.Color(43, 43, 43));
        Datos.setPreferredSize(new java.awt.Dimension(550, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A");

        SAJ.setBackground(new java.awt.Color(119, 120, 123));
        SAJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAJ.setForeground(new java.awt.Color(236, 240, 241));
        SAJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAJActionPerformed(evt);
            }
        });

        SAK.setBackground(new java.awt.Color(119, 120, 123));
        SAK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAK.setForeground(new java.awt.Color(236, 240, 241));
        SAK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 196, 35));
        jLabel4.setText("I");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 196, 35));
        jLabel5.setText("J");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 196, 35));
        jLabel6.setText("K");

        SAI.setBackground(new java.awt.Color(119, 120, 123));
        SAI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAI.setForeground(new java.awt.Color(236, 240, 241));
        SAI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("U");

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SAI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(SAJ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SAK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(109, 109, 109))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(13, 13, 13)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SAI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Datos2.setBackground(new java.awt.Color(43, 43, 43));
        Datos2.setPreferredSize(new java.awt.Dimension(550, 150));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("B");

        SBJ.setBackground(new java.awt.Color(119, 120, 123));
        SBJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SBJ.setForeground(new java.awt.Color(236, 240, 241));
        SBJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SBJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBJActionPerformed(evt);
            }
        });

        SBK.setBackground(new java.awt.Color(119, 120, 123));
        SBK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SBK.setForeground(new java.awt.Color(236, 240, 241));
        SBK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 196, 35));
        jLabel11.setText("I");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 196, 35));
        jLabel12.setText("J");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 196, 35));
        jLabel13.setText("K");

        SBI.setBackground(new java.awt.Color(119, 120, 123));
        SBI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SBI.setForeground(new java.awt.Color(236, 240, 241));
        SBI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBIActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("V");

        javax.swing.GroupLayout Datos2Layout = new javax.swing.GroupLayout(Datos2);
        Datos2.setLayout(Datos2Layout);
        Datos2Layout.setHorizontalGroup(
            Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Datos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Datos2Layout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(53, 53, 53)
                        .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SBI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel12)
                            .addComponent(SBJ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SBK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(112, 112, 112))
                    .addGroup(Datos2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Datos2Layout.setVerticalGroup(
            Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Datos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SBI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Realizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Resolver.png"))); // NOI18N
        Realizar.setText("Realizar");
        Realizar.setPreferredSize(new java.awt.Dimension(83, 25));
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });

        Clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Reducir.png"))); // NOI18N
        Clean.setText("Limpiar");
        Clean.setPreferredSize(new java.awt.Dimension(83, 25));
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Regresar.png"))); // NOI18N
        GoBack.setText("Cerrar");
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });

        jTResultadoSuma.setEditable(false);
        jTResultadoSuma.setBackground(new java.awt.Color(245, 80, 100));
        jTResultadoSuma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTResultadoSuma.setForeground(new java.awt.Color(236, 240, 241));
        jTResultadoSuma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTResultadoSuma.setText("RESULTADO");
        jTResultadoSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUMA DE VECTORES");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Datos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTResultadoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Datos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTResultadoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoBack)
                    .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        VectoresHome mnu= new VectoresHome();
        mnu.show();
        dispose();
    }//GEN-LAST:event_GoBackActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        SAI.setText("");
        SAJ.setText("");
        SAK.setText("");
        SBI.setText("");
        SBJ.setText("");
        SBK.setText("");
        jTResultadoSuma.setText("RESULTADO");
    }//GEN-LAST:event_CleanActionPerformed

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed

        int RI=0, RJ = 0, RK = 0;

        int VI = 0, VJ = 0 , VK = 0,UI = 0, UJ = 0 , UK = 0;
        String SVECT = "";

        UI=Integer.parseInt(SAI.getText());
        UJ=Integer.parseInt(SAJ.getText());
        UK=Integer.parseInt(SAK.getText());
        VI=Integer.parseInt(SBI.getText());
        VJ=Integer.parseInt(SBJ.getText());
        VK=Integer.parseInt(SBK.getText());

        RI = (UI + VI);
        RJ = (UJ + VJ);
        RK = (UK + VK);

        SVECT = "";
        if (RI >= 0) {
            SVECT = "" + RI + "i";
        } else {
            SVECT = "" + RI + "i";
        }
        if (RJ >= 0) {
            SVECT += "+" + RJ + "j";
        } else {
            SVECT += "" + RJ + "j";
        }
        if (RK >= 0) {
            SVECT += "+" + RK + "k";
        } else {
            SVECT += "" + RK + "k";
        }
        jTResultadoSuma.setText(SVECT);
    }//GEN-LAST:event_RealizarActionPerformed

    private void SBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SBIActionPerformed

    private void SBJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SBJActionPerformed

    private void SAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAIActionPerformed

    private void SAJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAJActionPerformed

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
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clean;
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel Datos2;
    private javax.swing.JButton GoBack;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton Realizar;
    private javax.swing.JTextField SAI;
    private javax.swing.JTextField SAJ;
    private javax.swing.JTextField SAK;
    private javax.swing.JTextField SBI;
    private javax.swing.JTextField SBJ;
    private javax.swing.JTextField SBK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTResultadoSuma;
    // End of variables declaration//GEN-END:variables
}
