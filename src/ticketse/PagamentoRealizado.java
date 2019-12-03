/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketse;

/**
 *
 * @author 20181041110020
 */
public class PagamentoRealizado extends javax.swing.JDialog {

    /**
     * Creates new form PagamentoRealizado
     */
    public PagamentoRealizado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        textPagamentoRealizado = new javax.swing.JTextField();
        voltarTelaIniciaoBotao = new javax.swing.JButton();
        imprimirBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        textPagamentoRealizado.setBackground(new java.awt.Color(240, 240, 240));
        textPagamentoRealizado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textPagamentoRealizado.setForeground(new java.awt.Color(115, 115, 115));
        textPagamentoRealizado.setText("PAGAMENTO REALIZADO COM SUCESSO!");
        textPagamentoRealizado.setBorder(null);
        textPagamentoRealizado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        voltarTelaIniciaoBotao.setBackground(new java.awt.Color(71, 94, 176));
        voltarTelaIniciaoBotao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltarTelaIniciaoBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarTelaIniciaoBotao.setText("<html> VOLTAR A TELA <br> INICIAL");
        voltarTelaIniciaoBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarTelaIniciaoBotao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        voltarTelaIniciaoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaIniciaoBotaoActionPerformed(evt);
            }
        });

        imprimirBotao.setBackground(new java.awt.Color(71, 94, 176));
        imprimirBotao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        imprimirBotao.setForeground(new java.awt.Color(255, 255, 255));
        imprimirBotao.setText("<html> IMPRIMIR <br> INGRESSO");
        imprimirBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimirBotao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(voltarTelaIniciaoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textPagamentoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textPagamentoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarTelaIniciaoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaIniciaoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaIniciaoBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarTelaIniciaoBotaoActionPerformed

    private void imprimirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PagamentoRealizado dialog = new PagamentoRealizado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimirBotao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField textPagamentoRealizado;
    private javax.swing.JButton voltarTelaIniciaoBotao;
    // End of variables declaration//GEN-END:variables
}