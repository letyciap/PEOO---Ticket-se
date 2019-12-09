package ticketse;

public class GerenciarEvento extends javax.swing.JDialog {

    public GerenciarEvento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textTitulo = new javax.swing.JLabel();
        caixaCategorias = new javax.swing.JComboBox<String>();
        nomeCampo = new javax.swing.JTextField();
        descricaoCampo = new javax.swing.JTextField();
        localCampo = new javax.swing.JTextField();
        dataCampo = new javax.swing.JTextField();
        horaCampo = new javax.swing.JTextField();
        precoCampo = new javax.swing.JTextField();
        vagasCampo = new javax.swing.JTextField();
        okBotao = new javax.swing.JButton();
        textCategoria = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        textData = new javax.swing.JLabel();
        textDescricao = new javax.swing.JLabel();
        textLocal = new javax.swing.JLabel();
        textPreco = new javax.swing.JLabel();
        textHora = new javax.swing.JLabel();
        textVagas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(0, 32, 144));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("GERENCIAR EVENTO");

        caixaCategorias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaCategorias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nomeCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        descricaoCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        localCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dataCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataCampo.setPreferredSize(new java.awt.Dimension(105, 23));

        horaCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horaCampo.setPreferredSize(new java.awt.Dimension(105, 23));

        precoCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoCampo.setPreferredSize(new java.awt.Dimension(105, 23));

        vagasCampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vagasCampo.setPreferredSize(new java.awt.Dimension(105, 23));

        okBotao.setBackground(new java.awt.Color(71, 94, 176));
        okBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okBotao.setForeground(new java.awt.Color(255, 255, 255));
        okBotao.setText("TUDO OK!");
        okBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBotaoActionPerformed(evt);
            }
        });

        textCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCategoria.setText("Categoria:");

        textNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNome.setText("Nome:");

        textData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textData.setText("Data:");

        textDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textDescricao.setText("Descrição");

        textLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textLocal.setText("Local:");

        textPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textPreco.setText("Preço:");

        textHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textHora.setText("Hora:");

        textVagas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textVagas.setText("Vagas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(horaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textHora))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(precoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textPreco))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vagasCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textVagas)))
                                    .addComponent(okBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(localCampo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descricaoCampo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeCampo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(caixaCategorias, javax.swing.GroupLayout.Alignment.LEADING, 0, 450, Short.MAX_VALUE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCategoria)
                            .addComponent(textLocal)
                            .addComponent(textNome)
                            .addComponent(textDescricao)
                            .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caixaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(textNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(textDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(descricaoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(textLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(localCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textData, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(textHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(vagasCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20)
                .addComponent(okBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciarEvento dialog = new GerenciarEvento(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> caixaCategorias;
    private javax.swing.JTextField dataCampo;
    private javax.swing.JTextField descricaoCampo;
    private javax.swing.JTextField horaCampo;
    private javax.swing.JTextField localCampo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JButton okBotao;
    private javax.swing.JTextField precoCampo;
    private javax.swing.JLabel textCategoria;
    private javax.swing.JLabel textData;
    private javax.swing.JLabel textDescricao;
    private javax.swing.JLabel textHora;
    private javax.swing.JLabel textLocal;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textVagas;
    private javax.swing.JTextField vagasCampo;
    // End of variables declaration//GEN-END:variables
}
