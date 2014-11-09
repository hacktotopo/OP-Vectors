package Producto;
/*
 * @author Hacktotopo
*/

public class VectoresHome extends javax.swing.JFrame {
    public VectoresHome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogo = new javax.swing.JPanel();
        LOGO = new javax.swing.JButton();
        Menú = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        MOperaciones = new javax.swing.JMenu();
        IMVEscalar = new javax.swing.JMenuItem();
        IPCruz = new javax.swing.JMenuItem();
        IPMixto = new javax.swing.JMenuItem();
        IResta = new javax.swing.JMenuItem();
        ISuma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPERACIONES");
        setBackground(new java.awt.Color(30, 33, 37));
        setName("INICIO"); // NOI18N

        PanelLogo.setBackground(new java.awt.Color(189, 195, 199));
        PanelLogo.setPreferredSize(new java.awt.Dimension(500, 500));

        LOGO.setBackground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo-Tecnologico.png"))); // NOI18N
        LOGO.setBorder(null);
        LOGO.setBorderPainted(false);
        LOGO.setContentAreaFilled(false);
        LOGO.setFocusPainted(false);
        LOGO.setFocusable(false);
        LOGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Menú.setBackground(new java.awt.Color(43, 43, 43));
        Menú.setForeground(new java.awt.Color(236, 240, 241));

        MenuArchivo.setBackground(new java.awt.Color(52, 152, 219));
        MenuArchivo.setForeground(new java.awt.Color(236, 240, 241));
        MenuArchivo.setText("Archivo");

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMSalir);

        Menú.add(MenuArchivo);

        MOperaciones.setBackground(new java.awt.Color(52, 152, 219));
        MOperaciones.setForeground(new java.awt.Color(236, 240, 241));
        MOperaciones.setText("Operaciones");
        MOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOperacionesActionPerformed(evt);
            }
        });

        IMVEscalar.setText("Multiplicación Vector X Escalar");
        IMVEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMVEscalarActionPerformed(evt);
            }
        });
        MOperaciones.add(IMVEscalar);

        IPCruz.setText("Producto Cruz");
        IPCruz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPCruzActionPerformed(evt);
            }
        });
        MOperaciones.add(IPCruz);

        IPMixto.setText("Producto Mixto");
        IPMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPMixtoActionPerformed(evt);
            }
        });
        MOperaciones.add(IPMixto);

        IResta.setText("Resta de Vectores");
        IResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRestaActionPerformed(evt);
            }
        });
        MOperaciones.add(IResta);

        ISuma.setText("Suma de Vectores");
        ISuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISumaActionPerformed(evt);
            }
        });
        MOperaciones.add(ISuma);

        Menú.add(MOperaciones);

        setJMenuBar(Menú);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        PanelLogo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMSalirActionPerformed

    private void IPCruzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPCruzActionPerformed
        new ProductoCruz().setVisible(true);
        dispose();
    }//GEN-LAST:event_IPCruzActionPerformed

    private void IPMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPMixtoActionPerformed
        new ProductoMixto().setVisible(true);
        dispose();
    }//GEN-LAST:event_IPMixtoActionPerformed

    private void ISumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISumaActionPerformed
        new Suma().setVisible(true);
        dispose();
    }//GEN-LAST:event_ISumaActionPerformed

    private void IRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRestaActionPerformed
        new Resta().setVisible(true);
        dispose();      
    }//GEN-LAST:event_IRestaActionPerformed

    private void LOGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOActionPerformed
    
    }//GEN-LAST:event_LOGOActionPerformed

    private void MOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOperacionesActionPerformed

    }//GEN-LAST:event_MOperacionesActionPerformed

    private void IMVEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMVEscalarActionPerformed
        new Multiplicacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_IMVEscalarActionPerformed

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
            java.util.logging.Logger.getLogger(VectoresHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VectoresHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VectoresHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VectoresHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VectoresHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IMVEscalar;
    private javax.swing.JMenuItem IPCruz;
    private javax.swing.JMenuItem IPMixto;
    private javax.swing.JMenuItem IResta;
    private javax.swing.JMenuItem ISuma;
    private javax.swing.JButton LOGO;
    private javax.swing.JMenu MOperaciones;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuBar Menú;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JMenuItem jMSalir;
    // End of variables declaration//GEN-END:variables
}
