/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author andres.giraldoy
 */
public class ConocerHojasCafeView extends javax.swing.JFrame {

    /**
     * Creates new form ConocerHojasCafeView
     */
    public ConocerHojasCafeView() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonConoceInstalaciones1 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a Hojas Cafe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 253;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jButtonConoceInstalaciones1.setBackground(new java.awt.Color(255, 164, 101));
        jButtonConoceInstalaciones1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonConoceInstalaciones1.setText("Conoce a nuestros inquilinos");
        jButtonConoceInstalaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConoceInstalaciones1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 128, 0, 0);
        jPanel1.add(jButtonConoceInstalaciones1, gridBagConstraints);

        jButtonSalir.setBackground(new java.awt.Color(188, 172, 161));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 304;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 128, 44, 0);
        jPanel1.add(jButtonSalir, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConoceInstalaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConoceInstalaciones1ActionPerformed
        // TODO add your handling code here:
        ConocerInquilinosView conocerInquilinosFrame = new ConocerInquilinosView();
        conocerInquilinosFrame.setVisible(true);
        conocerInquilinosFrame.pack();
        conocerInquilinosFrame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButtonConoceInstalaciones1ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        BienvenidaView BienvenidaFrame = new BienvenidaView();
        BienvenidaFrame.setVisible(true);
        BienvenidaFrame.pack();
        BienvenidaFrame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConoceInstalaciones1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
