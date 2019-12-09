package ticketse;

import javax.swing.JOptionPane;

public class Pagamento extends javax.swing.JDialog {
    public static PagamentoRealizado pagamentor = new PagamentoRealizado(new javax.swing.JFrame(), true);
    public static int compra = 0;
    
    public Pagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNumeroCartao = new javax.swing.JLabel();
        numeroCartaoCampo = new javax.swing.JTextField();
        textValidade = new javax.swing.JLabel();
        caixaMes = new javax.swing.JComboBox<>();
        caixaAno = new javax.swing.JComboBox<>();
        textCodigo = new javax.swing.JLabel();
        codigoCampo = new javax.swing.JTextField();
        textNome = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        textParcelas = new javax.swing.JLabel();
        caixaParcelas = new javax.swing.JComboBox<>();
        cancelarBotao = new javax.swing.JButton();
        comprarBotao = new javax.swing.JButton();
        textTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textNumeroCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNumeroCartao.setText("Número do cartão:");

        numeroCartaoCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textValidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textValidade.setText("Data de validade:");

        caixaMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaMes.setMaximumRowCount(12);
        caixaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        caixaAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaAno.setMaximumRowCount(13);
        caixaAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        textCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCodigo.setText("Código de segurança:");

        codigoCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNome.setText("Nome no cartão:");

        nomeCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textParcelas.setText("Número de parcelas:");

        caixaParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaParcelas.setMaximumRowCount(4);
        caixaParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a quantidade de parcelas", "1x", "2x", "3x" }));
        caixaParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaParcelasActionPerformed(evt);
            }
        });

        cancelarBotao.setBackground(new java.awt.Color(71, 94, 176));
        cancelarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBotao.setText("CANCELAR");
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        comprarBotao.setBackground(new java.awt.Color(71, 94, 176));
        comprarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comprarBotao.setForeground(new java.awt.Color(255, 255, 255));
        comprarBotao.setText("COMPRAR");
        comprarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBotaoActionPerformed(evt);
            }
        });

        textTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(0, 32, 144));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("DADOS DE PAGAMENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(caixaParcelas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comprarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nomeCampo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(caixaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(caixaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textValidade)
                                .addComponent(textNome))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textCodigo)))
                        .addComponent(numeroCartaoCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textNumeroCartao)
                    .addComponent(textParcelas))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textTitulo)
                .addGap(18, 18, 18)
                .addComponent(textNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroCartaoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(caixaParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBotaoActionPerformed
        if(numeroCartaoCampo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "PREENCHA O CAMPO DE NÚMERO DO CARTÃO!");
        }
        
        else if(caixaMes.getSelectedItem().equals("Mês")){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE O MÊS DE VALIDADE!");
        }
        
        else if(caixaAno.getSelectedItem().equals("Ano")){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE O ANO DE VALIDADE!");
        }
        
        else if(codigoCampo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "PREENCHA O CAMPO DE CÓDIGO!");
        }
        
        else if(nomeCampo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "PREENCHA O CAMPO DE NOME NO CARTÃO!");
        }
        
        else if(nomeCampo.getText().equalsIgnoreCase(MeusEventos.categoria1.getText())){
            JOptionPane.showMessageDialog(rootPane, "UM INGRESSO JÁ FOI VENDIDO PARA ESSA PESSOA!");
        }
        
        else if(caixaParcelas.getSelectedItem().equals("Selecione a quantidade de parcelas")){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE A QUANTIDADE DE PARCELAS!");
        }
        
        else{
        TicketseU.pagamento.setVisible(false);
        pagamentor.setVisible(true);
        compra++;
        } 
    }//GEN-LAST:event_comprarBotaoActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        TicketseU.pagamento.setVisible(false);
    }//GEN-LAST:event_cancelarBotaoActionPerformed

    private void caixaParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaParcelasActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pagamento dialog = new Pagamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> caixaAno;
    private javax.swing.JComboBox<String> caixaMes;
    private javax.swing.JComboBox<String> caixaParcelas;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JTextField codigoCampo;
    private javax.swing.JButton comprarBotao;
    public static javax.swing.JTextField nomeCampo;
    private javax.swing.JTextField numeroCartaoCampo;
    private javax.swing.JLabel textCodigo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textNumeroCartao;
    private javax.swing.JLabel textParcelas;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textValidade;
    // End of variables declaration//GEN-END:variables
}
