package ticketse;

public class PagamentoRealizado extends javax.swing.JDialog {
    public static ImprimirIngresso imprimir = new ImprimirIngresso(new javax.swing.JFrame(), true);

    public PagamentoRealizado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        textPagamentoRealizado = new javax.swing.JLabel();
        voltarTelaIniciaoBotao = new javax.swing.JButton();
        imprimirBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        textPagamentoRealizado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textPagamentoRealizado.setForeground(new java.awt.Color(115, 115, 115));
        textPagamentoRealizado.setText("PAGAMENTO REALIZADO COM SUCESSO!");

        voltarTelaIniciaoBotao.setBackground(new java.awt.Color(71, 94, 176));
        voltarTelaIniciaoBotao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltarTelaIniciaoBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarTelaIniciaoBotao.setText("<html>      VOLTAR À <br> TELA INICIAL");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarTelaIniciaoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPagamentoRealizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textPagamentoRealizado)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarTelaIniciaoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaIniciaoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaIniciaoBotaoActionPerformed
        Pagamento.pagamentor.setVisible(false);
    }//GEN-LAST:event_voltarTelaIniciaoBotaoActionPerformed

    private void imprimirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBotaoActionPerformed
        ImprimirIngresso.nome.setText(Cadastro.nomeCampo.getText());
        ImprimirIngresso.email.setText(Cadastro.emailCampo.getText());
        ImprimirIngresso.cpf.setText(Cadastro.cpfCampo.getText());
        ImprimirIngresso.titulo.setText(Ticketse.titulo1.getText());
        ImprimirIngresso.descricao.setText(Ticketse.descricao1.getText());
        ImprimirIngresso.data.setText(Ticketse.data1.getText());
        ImprimirIngresso.hora.setText(Ticketse.hora1.getText());
        ImprimirIngresso.local.setText(Ticketse.local1.getText());
        ImprimirIngresso.preço.setText("R$" + CadastrarEvento.precoCampo.getText());
        imprimir.setVisible(true);
        Pagamento.pagamentor.setVisible(false);
    }//GEN-LAST:event_imprimirBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void run() {
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
    private javax.swing.JLabel textPagamentoRealizado;
    private javax.swing.JButton voltarTelaIniciaoBotao;
    // End of variables declaration//GEN-END:variables
}
