package ticketse;

import javax.swing.JOptionPane;

public class LoginAdm extends javax.swing.JDialog {

    public LoginAdm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        chaveDeAcessoText = new javax.swing.JLabel();
        chaveDeAcessoCampo = new javax.swing.JTextField();
        senhaText = new javax.swing.JLabel();
        entrarBotao = new javax.swing.JButton();
        senhaCampo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        chaveDeAcessoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chaveDeAcessoText.setText("Chave de Acesso:");

        chaveDeAcessoCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chaveDeAcessoCampo.setMinimumSize(new java.awt.Dimension(6, 27));
        chaveDeAcessoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveDeAcessoCampoActionPerformed(evt);
            }
        });

        senhaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaText.setText("Senha:");

        entrarBotao.setBackground(new java.awt.Color(71, 94, 176));
        entrarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("ENTRAR");
        entrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });

        senhaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(senhaCampo)
                    .addComponent(senhaText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chaveDeAcessoText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(entrarBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(chaveDeAcessoCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(chaveDeAcessoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chaveDeAcessoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Ticketse ticketse = new Ticketse();
    private void chaveDeAcessoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveDeAcessoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaveDeAcessoCampoActionPerformed

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed
        for (int i = 0; i <Cadastro.chave.length; i++) {
            if (Cadastro.chave[i].equals(chaveDeAcessoCampo.getText()) && Cadastro.senha[i].equals(senhaCampo.getText())) {
                Ticketse.quadradoEvento1.setVisible(false);
                Ticketse.quadradoEvento2.setVisible(false);
                Ticketse.quadradoEvento3.setVisible(false);
                ChaveDeAcesso.loginadm.setVisible(false);
                ticketse.setVisible(true);
            }else if (i == Cadastro.chave.length - 1){
                JOptionPane.showMessageDialog(rootPane, "LOGIN INVÁLIDO. POR FAVOR, CONFIRA SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE.");
            }
        }
    }//GEN-LAST:event_entrarBotaoActionPerformed

    private void senhaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCampoActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginAdm dialog = new LoginAdm(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField chaveDeAcessoCampo;
    private javax.swing.JLabel chaveDeAcessoText;
    private javax.swing.JButton entrarBotao;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField senhaCampo;
    private javax.swing.JLabel senhaText;
    // End of variables declaration//GEN-END:variables
}
