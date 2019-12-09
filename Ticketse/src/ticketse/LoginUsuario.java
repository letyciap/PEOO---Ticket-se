package ticketse;

import javax.swing.JOptionPane;

public class LoginUsuario extends javax.swing.JDialog {
    
    public static TicketseU ticketseu = new TicketseU();
    
    public LoginUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        loginText = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        senhaText = new javax.swing.JLabel();
        entrarBotao = new javax.swing.JButton();
        senhaCampo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        loginText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginText.setText("Nome:");

        nomeCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCampo.setMinimumSize(new java.awt.Dimension(6, 27));
        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        senhaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaText.setText("Senha:");

        entrarBotao.setBackground(new java.awt.Color(71, 94, 176));
        entrarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("ENTRAR");
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
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
                    .addComponent(loginText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(entrarBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(loginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(senhaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(entrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed
        for (int i = 0; i < Cadastro.nome.length; i++) {
            if (Cadastro.nome[i].equals(nomeCampo.getText()) && Cadastro.senha[i].equals(senhaCampo.getText())) {
                TicketseU.quadradoEvento1.setVisible(true);
                TicketseU.titulo1.setText(Ticketse.titulo1.getText());
                TicketseU.data1.setText(Ticketse.data1.getText());
                TicketseU.descricao1.setText(Ticketse.descricao1.getText());
                TicketseU.hora1.setText(Ticketse.hora1.getText());
                TicketseU.local1.setText(Ticketse.local1.getText());
                TicketseU.preco1.setText("R$ " + CadastrarEvento.precoCampo.getText());
                TicketseU.quadradoEvento2.setVisible(false);
                TicketseU.quadradoEvento3.setVisible(false);
                ticketseu.setVisible(true);
                Login.loginU.setVisible(false);
                PosLoginU.loginusuario.setVisible(false);
            } else if (i == Cadastro.nome.length - 1) {
                JOptionPane.showMessageDialog(rootPane, "LOGIN INVÁLIDO. POR FAVOR, CONFIRA SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE.");
            }
        }

    }//GEN-LAST:event_entrarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginUsuario dialog = new LoginUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton entrarBotao;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel logo;
    public static javax.swing.JTextField nomeCampo;
    public static javax.swing.JPasswordField senhaCampo;
    private javax.swing.JLabel senhaText;
    // End of variables declaration//GEN-END:variables
}
