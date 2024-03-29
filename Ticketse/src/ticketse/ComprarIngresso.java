package ticketse;

public class ComprarIngresso extends javax.swing.JDialog {

    public ComprarIngresso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        quadradoEvento = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        preço = new javax.swing.JLabel();
        textData = new javax.swing.JLabel();
        textHora = new javax.swing.JLabel();
        textLocal = new javax.swing.JLabel();
        caixaQntd = new javax.swing.JComboBox();
        quadradoIngresso1 = new javax.swing.JPanel();
        tituloIngresso = new javax.swing.JLabel();
        preçoIngresso = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        emailCampo = new javax.swing.JTextField();
        cpfCampo = new javax.swing.JTextField();
        textNome1 = new javax.swing.JLabel();
        textEmail1 = new javax.swing.JLabel();
        textCpf1 = new javax.swing.JLabel();
        pagarBotao = new javax.swing.JButton();
        textTotalIngressos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        quadradoEvento.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Título");

        descricao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao.setForeground(new java.awt.Color(150, 149, 149));
        descricao.setText("A descrição do negócio aqui neste quadrado de texto enorme com um texto enorme.");

        data.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data.setForeground(new java.awt.Color(115, 115, 115));
        data.setText("31/02/2019");

        hora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(115, 115, 115));
        hora.setText("25h");

        local.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        local.setForeground(new java.awt.Color(115, 115, 115));
        local.setText("Casa");

        preço.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preço.setForeground(new java.awt.Color(0, 32, 144));
        preço.setText("jLabel1");

        textData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textData.setForeground(new java.awt.Color(115, 115, 115));
        textData.setText("Data:");

        textHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textHora.setForeground(new java.awt.Color(115, 115, 115));
        textHora.setText("Hora:");

        textLocal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLocal.setForeground(new java.awt.Color(115, 115, 115));
        textLocal.setText("Local:");

        javax.swing.GroupLayout quadradoEventoLayout = new javax.swing.GroupLayout(quadradoEvento);
        quadradoEvento.setLayout(quadradoEventoLayout);
        quadradoEventoLayout.setHorizontalGroup(
            quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEventoLayout.createSequentialGroup()
                        .addComponent(textData)
                        .addGap(11, 11, 11)
                        .addComponent(data)
                        .addGap(14, 14, 14)
                        .addComponent(textHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora)
                        .addGap(13, 13, 13)
                        .addComponent(textLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(local)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preço))
                    .addGroup(quadradoEventoLayout.createSequentialGroup()
                        .addGroup(quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quadradoEventoLayout.setVerticalGroup(
            quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEventoLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoEventoLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(quadradoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data)
                            .addComponent(hora)
                            .addComponent(local)
                            .addComponent(textData)
                            .addComponent(textHora)
                            .addComponent(textLocal))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoEventoLayout.createSequentialGroup()
                        .addComponent(preço)
                        .addContainerGap())))
        );

        caixaQntd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caixaQntd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma quantidade", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        quadradoIngresso1.setBackground(new java.awt.Color(255, 255, 255));
        quadradoIngresso1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        tituloIngresso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloIngresso.setForeground(new java.awt.Color(0, 32, 144));
        tituloIngresso.setText("INGRESSO 1");

        preçoIngresso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preçoIngresso.setForeground(new java.awt.Color(0, 32, 144));
        preçoIngresso.setText("jLabel1");

        nomeCampo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        emailCampo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        cpfCampo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        textNome1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textNome1.setForeground(new java.awt.Color(0, 32, 144));
        textNome1.setText("Nome:");

        textEmail1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textEmail1.setForeground(new java.awt.Color(0, 32, 144));
        textEmail1.setText("E-mail:");

        textCpf1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textCpf1.setForeground(new java.awt.Color(0, 32, 144));
        textCpf1.setText("CPF:");

        javax.swing.GroupLayout quadradoIngresso1Layout = new javax.swing.GroupLayout(quadradoIngresso1);
        quadradoIngresso1.setLayout(quadradoIngresso1Layout);
        quadradoIngresso1Layout.setHorizontalGroup(
            quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                            .addComponent(textCpf1)
                            .addGap(20, 20, 20)
                            .addComponent(cpfCampo))
                        .addComponent(tituloIngresso)
                        .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                            .addComponent(textNome1)
                            .addGap(8, 8, 8)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                        .addComponent(textEmail1)
                        .addGap(6, 6, 6)
                        .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(preçoIngresso)
                .addContainerGap())
        );
        quadradoIngresso1Layout.setVerticalGroup(
            quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloIngresso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preçoIngresso)
                    .addComponent(textCpf1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pagarBotao.setBackground(new java.awt.Color(71, 94, 176));
        pagarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagarBotao.setForeground(new java.awt.Color(255, 255, 255));
        pagarBotao.setText("PAGAR");
        pagarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarBotaoActionPerformed(evt);
            }
        });

        textTotalIngressos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textTotalIngressos.setText("Total de ingressos:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 32, 144));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPRAR INGRESSO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(pagarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTotalIngressos)
                            .addComponent(quadradoIngresso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixaQntd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quadradoEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(quadradoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(textTotalIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(quadradoIngresso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pagarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ComprarIngresso dialog = new ComprarIngresso(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox caixaQntd;
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JLabel data;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel local;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JButton pagarBotao;
    private javax.swing.JLabel preço;
    private javax.swing.JLabel preçoIngresso;
    private javax.swing.JPanel quadradoEvento;
    private javax.swing.JPanel quadradoIngresso1;
    private javax.swing.JLabel textCpf1;
    private javax.swing.JLabel textData;
    private javax.swing.JLabel textEmail1;
    private javax.swing.JLabel textHora;
    private javax.swing.JLabel textLocal;
    private javax.swing.JLabel textNome1;
    private javax.swing.JLabel textTotalIngressos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloIngresso;
    // End of variables declaration//GEN-END:variables
}
