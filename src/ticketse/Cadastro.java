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
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Cadastro() {
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

        logo = new javax.swing.JLabel();
        nomeText = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        textCPF = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JTextField();
        textEmail = new javax.swing.JLabel();
        emailCampo = new javax.swing.JTextField();
        textSenha = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JTextField();
        textPerfil = new javax.swing.JLabel();
        perfilCampo = new javax.swing.JComboBox<String>();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        nomeText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeText.setText("Nome");

        nomeCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCampo.setMinimumSize(new java.awt.Dimension(6, 27));

        textCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCPF.setText("CPF");

        cpfCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cpfCampo.setMinimumSize(new java.awt.Dimension(6, 27));

        textEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textEmail.setText("E-mail");

        emailCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailCampo.setMinimumSize(new java.awt.Dimension(6, 27));

        textSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textSenha.setText("Senha");

        senhaCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaCampo.setMinimumSize(new java.awt.Dimension(6, 27));

        textPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textPerfil.setText("Perfil");

        perfilCampo.setEditable(true);
        perfilCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perfilCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione seu perfil", "Usuário", "Administrador" }));

        botaoCadastrar.setBackground(new java.awt.Color(71, 94, 176));
        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("CADASTRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 78, Short.MAX_VALUE)
                        .addComponent(logo)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perfilCampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeText)
                            .addComponent(textCPF)
                            .addComponent(textEmail)
                            .addComponent(textSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPerfil)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(nomeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(textSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeText;
    private javax.swing.JComboBox<String> perfilCampo;
    private javax.swing.JTextField senhaCampo;
    private javax.swing.JLabel textCPF;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textPerfil;
    private javax.swing.JLabel textSenha;
    // End of variables declaration//GEN-END:variables
}