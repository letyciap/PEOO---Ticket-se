package ticketse;

public class MeusEventos extends javax.swing.JDialog {
    
        public static ImprimirIngresso imprimir;
    public MeusEventos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        textTitulo = new javax.swing.JLabel();
        campoPesquisa = new javax.swing.JTextField();
        buscarBotao = new javax.swing.JButton();
        quadradoEvento1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        textCategoria1 = new javax.swing.JLabel();
        categoria1 = new javax.swing.JLabel();
        textData1 = new javax.swing.JLabel();
        data1 = new javax.swing.JLabel();
        textHora1 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        textLocal1 = new javax.swing.JLabel();
        local1 = new javax.swing.JLabel();
        imprimir1 = new javax.swing.JButton();
        quadradoEvento2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        textCategoria2 = new javax.swing.JLabel();
        categoria2 = new javax.swing.JLabel();
        textData2 = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        textHora2 = new javax.swing.JLabel();
        hora2 = new javax.swing.JLabel();
        textLocal2 = new javax.swing.JLabel();
        local2 = new javax.swing.JLabel();
        imprimir2 = new javax.swing.JButton();
        quadradoEvento3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        textCategoria3 = new javax.swing.JLabel();
        categoria3 = new javax.swing.JLabel();
        textData3 = new javax.swing.JLabel();
        data3 = new javax.swing.JLabel();
        textHora3 = new javax.swing.JLabel();
        hora3 = new javax.swing.JLabel();
        textLocal3 = new javax.swing.JLabel();
        local3 = new javax.swing.JLabel();
        imprimir3 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        voltarBotao = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(0, 32, 144));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textTitulo.setText("MEUS EVENTOS");

        campoPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        buscarBotao.setBackground(new java.awt.Color(255, 255, 255));
        buscarBotao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarBotao.setForeground(new java.awt.Color(0, 32, 144));
        buscarBotao.setText("BUSCAR");
        buscarBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144), 0));

        quadradoEvento1.setBackground(new java.awt.Color(255, 253, 253));

        titulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titulo1.setText("Título");

        textCategoria1.setForeground(new java.awt.Color(108, 104, 104));
        textCategoria1.setText("Dono:");

        categoria1.setForeground(new java.awt.Color(108, 104, 104));
        categoria1.setText("eu");

        textData1.setForeground(new java.awt.Color(108, 104, 104));
        textData1.setText("Data:");

        data1.setForeground(new java.awt.Color(108, 104, 104));
        data1.setText("31/02/2019");

        textHora1.setForeground(new java.awt.Color(108, 104, 104));
        textHora1.setText("Hora:");

        hora1.setForeground(new java.awt.Color(108, 104, 104));
        hora1.setText("25h");

        textLocal1.setForeground(new java.awt.Color(108, 104, 104));
        textLocal1.setText("Local:");

        local1.setForeground(new java.awt.Color(108, 104, 104));
        local1.setText("Casa");

        imprimir1.setBackground(new java.awt.Color(71, 94, 176));
        imprimir1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        imprimir1.setForeground(new java.awt.Color(255, 255, 255));
        imprimir1.setText("Imprimir");
        imprimir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        imprimir1.setBorderPainted(false);
        imprimir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quadradoEvento1Layout = new javax.swing.GroupLayout(quadradoEvento1);
        quadradoEvento1.setLayout(quadradoEvento1Layout);
        quadradoEvento1Layout.setHorizontalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoEvento1Layout.createSequentialGroup()
                        .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1)
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addComponent(textCategoria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoria1)))
                        .addGap(391, 391, 391))
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addComponent(textLocal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                        .addComponent(textData1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data1))
                                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                        .addComponent(textHora1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hora1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        quadradoEvento1Layout.setVerticalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoria1))
                        .addGap(4, 4, 4)
                        .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addComponent(textData1)
                                .addGap(1, 1, 1)
                                .addComponent(textHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(textLocal1))
                            .addComponent(data1)
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(local1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quadradoEvento2.setBackground(new java.awt.Color(255, 253, 253));

        titulo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titulo2.setText("Título");

        textCategoria2.setForeground(new java.awt.Color(108, 104, 104));
        textCategoria2.setText("Dono:");

        categoria2.setForeground(new java.awt.Color(108, 104, 104));
        categoria2.setText("jLabel12");

        textData2.setForeground(new java.awt.Color(108, 104, 104));
        textData2.setText("Data:");

        data2.setForeground(new java.awt.Color(108, 104, 104));
        data2.setText("31/02/2019");

        textHora2.setForeground(new java.awt.Color(108, 104, 104));
        textHora2.setText("Hora:");

        hora2.setForeground(new java.awt.Color(108, 104, 104));
        hora2.setText("25h");

        textLocal2.setForeground(new java.awt.Color(108, 104, 104));
        textLocal2.setText("Local:");

        local2.setForeground(new java.awt.Color(108, 104, 104));
        local2.setText("Casa");

        imprimir2.setBackground(new java.awt.Color(71, 94, 176));
        imprimir2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        imprimir2.setForeground(new java.awt.Color(255, 255, 255));
        imprimir2.setText("Imprimir");
        imprimir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        imprimir2.setBorderPainted(false);
        imprimir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quadradoEvento2Layout = new javax.swing.GroupLayout(quadradoEvento2);
        quadradoEvento2.setLayout(quadradoEvento2Layout);
        quadradoEvento2Layout.setHorizontalGroup(
            quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                                .addComponent(textLocal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local2))
                            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                                .addComponent(textHora2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                                .addComponent(textData2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data2))
                            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                                .addComponent(textCategoria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoria2))
                            .addComponent(titulo2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quadradoEvento2Layout.setVerticalGroup(
            quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoEvento2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria2))
                .addGap(4, 4, 4)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addComponent(textData2)
                        .addGap(1, 1, 1)
                        .addComponent(textHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLocal2)
                            .addComponent(local2)))
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addComponent(data2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        quadradoEvento3.setBackground(new java.awt.Color(255, 253, 253));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Título");

        textCategoria3.setForeground(new java.awt.Color(108, 104, 104));
        textCategoria3.setText("Dono:");

        categoria3.setForeground(new java.awt.Color(108, 104, 104));
        categoria3.setText("jLabel12");

        textData3.setForeground(new java.awt.Color(108, 104, 104));
        textData3.setText("Data:");

        data3.setForeground(new java.awt.Color(108, 104, 104));
        data3.setText("31/02/2019");

        textHora3.setForeground(new java.awt.Color(108, 104, 104));
        textHora3.setText("Hora:");

        hora3.setForeground(new java.awt.Color(108, 104, 104));
        hora3.setText("25h");

        textLocal3.setForeground(new java.awt.Color(108, 104, 104));
        textLocal3.setText("Local:");

        local3.setForeground(new java.awt.Color(108, 104, 104));
        local3.setText("Casa");

        imprimir3.setBackground(new java.awt.Color(71, 94, 176));
        imprimir3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        imprimir3.setForeground(new java.awt.Color(255, 255, 255));
        imprimir3.setText("Imprimir");
        imprimir3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        imprimir3.setBorderPainted(false);
        imprimir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quadradoEvento3Layout = new javax.swing.GroupLayout(quadradoEvento3);
        quadradoEvento3.setLayout(quadradoEvento3Layout);
        quadradoEvento3Layout.setHorizontalGroup(
            quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                                .addComponent(textLocal3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local3))
                            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                                .addComponent(textHora3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                                .addComponent(textData3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data3))
                            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                                .addComponent(textCategoria3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoria3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quadradoEvento3Layout.setVerticalGroup(
            quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoEvento3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCategoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria3))
                .addGap(4, 4, 4)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addComponent(data3)
                        .addGap(4, 4, 4)
                        .addComponent(imprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addComponent(textData3)
                        .addGap(1, 1, 1)
                        .addComponent(textHora3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLocal3)
                            .addComponent(local3))))
                .addGap(37, 37, 37))
        );

        voltarBotao.setBackground(new java.awt.Color(255, 255, 255));
        voltarBotao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(0, 32, 144));
        voltarBotao.setText("VOLTAR");
        voltarBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144), 0));
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quadradoEvento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quadradoEvento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quadradoEvento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quadradoEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(quadradoEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(quadradoEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        TicketseU.meuseventos.setVisible(false);
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir1ActionPerformed
        imprimir = new ImprimirIngresso(new javax.swing.JFrame(), true);
        ImprimirIngresso.nome.setText(Cadastro.nomeCampo.getText());
        ImprimirIngresso.email.setText(Cadastro.emailCampo.getText());
        ImprimirIngresso.cpf.setText(Cadastro.cpfCampo.getText());
        ImprimirIngresso.titulo.setText(Ticketse.titulo1.getText());
        ImprimirIngresso.descricao.setText(Ticketse.descricao1.getText());
        ImprimirIngresso.data.setText(Ticketse.data1.getText());
        ImprimirIngresso.hora.setText(Ticketse.hora1.getText());
        ImprimirIngresso.local.setText(Ticketse.local1.getText());
        ImprimirIngresso.preço.setText("R$" + CadastrarEvento.precoCampo.getText());
        TicketseU.meuseventos.setVisible(false);
        imprimir.setVisible(true);
        
    }//GEN-LAST:event_imprimir1ActionPerformed

    private void imprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimir2ActionPerformed

    private void imprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimir3ActionPerformed

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
            java.util.logging.Logger.getLogger(MeusEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeusEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeusEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeusEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MeusEventos dialog = new MeusEventos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buscarBotao;
    private javax.swing.JTextField campoPesquisa;
    public static javax.swing.JLabel categoria1;
    private javax.swing.JLabel categoria2;
    private javax.swing.JLabel categoria3;
    public static javax.swing.JLabel data1;
    private javax.swing.JLabel data2;
    private javax.swing.JLabel data3;
    public static javax.swing.JLabel hora1;
    private javax.swing.JLabel hora2;
    private javax.swing.JLabel hora3;
    private javax.swing.JButton imprimir1;
    private javax.swing.JButton imprimir2;
    private javax.swing.JButton imprimir3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    public static javax.swing.JLabel local1;
    private javax.swing.JLabel local2;
    private javax.swing.JLabel local3;
    public static javax.swing.JPanel quadradoEvento1;
    public static javax.swing.JPanel quadradoEvento2;
    public static javax.swing.JPanel quadradoEvento3;
    private javax.swing.JLabel textCategoria1;
    private javax.swing.JLabel textCategoria2;
    private javax.swing.JLabel textCategoria3;
    private javax.swing.JLabel textData1;
    private javax.swing.JLabel textData2;
    private javax.swing.JLabel textData3;
    private javax.swing.JLabel textHora1;
    private javax.swing.JLabel textHora2;
    private javax.swing.JLabel textHora3;
    private javax.swing.JLabel textLocal1;
    private javax.swing.JLabel textLocal2;
    private javax.swing.JLabel textLocal3;
    private javax.swing.JLabel textTitulo;
    public static javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
