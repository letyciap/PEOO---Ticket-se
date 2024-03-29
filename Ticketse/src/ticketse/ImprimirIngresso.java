package ticketse;

public class ImprimirIngresso extends javax.swing.JDialog {

    public ImprimirIngresso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        quadradoIngresso1 = new javax.swing.JPanel();
        textNome1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        preço = new javax.swing.JLabel();
        codigoDeBarras = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textEmail1 = new javax.swing.JLabel();
        textCpf1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        textoHora1 = new javax.swing.JLabel();
        textoLocal1 = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        quadradoIngresso1.setBackground(new java.awt.Color(255, 255, 255));
        quadradoIngresso1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        quadradoIngresso1.setPreferredSize(new java.awt.Dimension(70, 350));

        textNome1.setForeground(new java.awt.Color(0, 32, 144));
        textNome1.setText("Nome:");

        email.setForeground(new java.awt.Color(0, 32, 144));
        email.setText("jLabel1");

        cpf.setForeground(new java.awt.Color(0, 32, 144));
        cpf.setText("jLabel1");

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

        codigoDeBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/Union.png"))); // NOI18N

        textEmail1.setForeground(new java.awt.Color(0, 32, 144));
        textEmail1.setText("E-mail:");

        textCpf1.setForeground(new java.awt.Color(0, 32, 144));
        textCpf1.setText("CPF:");

        nome.setForeground(new java.awt.Color(0, 32, 144));
        nome.setText("jLabel1");

        data2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data2.setForeground(new java.awt.Color(115, 115, 115));
        data2.setText("Data:");

        textoHora1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoHora1.setForeground(new java.awt.Color(115, 115, 115));
        textoHora1.setText("Hora:");

        textoLocal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoLocal1.setForeground(new java.awt.Color(115, 115, 115));
        textoLocal1.setText("Local:");

        javax.swing.GroupLayout quadradoIngresso1Layout = new javax.swing.GroupLayout(quadradoIngresso1);
        quadradoIngresso1.setLayout(quadradoIngresso1Layout);
        quadradoIngresso1Layout.setHorizontalGroup(
            quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                        .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                                .addComponent(data2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data))
                            .addComponent(titulo)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNome1)
                                    .addComponent(textEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textCpf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpf)
                                    .addComponent(email)
                                    .addComponent(nome))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                        .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoHora1)
                            .addComponent(textoLocal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                                .addComponent(local)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(preço))
                            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                                .addComponent(hora)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(codigoDeBarras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quadradoIngresso1Layout.setVerticalGroup(
            quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoIngresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(textEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(textCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(data2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(textoHora1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preço)
                    .addGroup(quadradoIngresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(local)
                        .addComponent(textoLocal1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoDeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        voltarBotao.setBackground(new java.awt.Color(71, 94, 176));
        voltarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("VOLTAR À TELA INICIAL");
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quadradoIngresso1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quadradoIngresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        PagamentoRealizado.imprimir.setVisible(false);
        MeusEventos.imprimir.setVisible(false);
    }//GEN-LAST:event_voltarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ImprimirIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImprimirIngresso dialog = new ImprimirIngresso(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel codigoDeBarras;
    public static javax.swing.JLabel cpf;
    public static javax.swing.JLabel data;
    private javax.swing.JLabel data2;
    public static javax.swing.JLabel descricao;
    public static javax.swing.JLabel email;
    public static javax.swing.JLabel hora;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel local;
    private javax.swing.JLabel logo;
    public static javax.swing.JLabel nome;
    public static javax.swing.JLabel preço;
    private javax.swing.JPanel quadradoIngresso1;
    private javax.swing.JLabel textCpf1;
    private javax.swing.JLabel textEmail1;
    private javax.swing.JLabel textNome1;
    private javax.swing.JLabel textoHora1;
    private javax.swing.JLabel textoLocal1;
    public static javax.swing.JLabel titulo;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
