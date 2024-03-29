package ticketse;

import javax.swing.JOptionPane;

public class Ticketse extends javax.swing.JFrame {
    
    public Ticketse() {
        initComponents();
        setDefaultCloseOperation(Ticketse.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        barraderolagem = new javax.swing.JScrollBar();
        logo = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        campoDePesquisa = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        quadradoEvento1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        descricao1 = new javax.swing.JLabel();
        excluir1 = new javax.swing.JButton();
        textData1 = new javax.swing.JLabel();
        data1 = new javax.swing.JLabel();
        textHora1 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        textLocal1 = new javax.swing.JLabel();
        local1 = new javax.swing.JLabel();
        editar1 = new javax.swing.JButton();
        textVagas1 = new javax.swing.JLabel();
        vagas1 = new javax.swing.JLabel();
        compras1 = new javax.swing.JButton();
        quadradoEvento2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        descricao2 = new javax.swing.JLabel();
        excluir2 = new javax.swing.JButton();
        textData2 = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        textHora2 = new javax.swing.JLabel();
        hora2 = new javax.swing.JLabel();
        textLocal2 = new javax.swing.JLabel();
        local2 = new javax.swing.JLabel();
        editar2 = new javax.swing.JButton();
        textVagas2 = new javax.swing.JLabel();
        vagas2 = new javax.swing.JLabel();
        compras2 = new javax.swing.JButton();
        quadradoEvento3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        descricao3 = new javax.swing.JLabel();
        excluir3 = new javax.swing.JButton();
        textData3 = new javax.swing.JLabel();
        data3 = new javax.swing.JLabel();
        textHora3 = new javax.swing.JLabel();
        hora3 = new javax.swing.JLabel();
        textLocal3 = new javax.swing.JLabel();
        local3 = new javax.swing.JLabel();
        editar3 = new javax.swing.JButton();
        textVagas3 = new javax.swing.JLabel();
        vagas3 = new javax.swing.JLabel();
        compras3 = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 253, 255));

        barraderolagem.setBackground(new java.awt.Color(149, 170, 247));
        barraderolagem.setForeground(new java.awt.Color(149, 170, 247));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

        botaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 32, 144));
        botaoCadastrar.setText("Novo Evento");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoDePesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        campoDePesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        botaoBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botaoBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoBuscar.setForeground(new java.awt.Color(0, 32, 144));
        botaoBuscar.setText("Buscar");
        botaoBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        botaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        quadradoEvento1.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo1.setText("Título");

        descricao1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao1.setForeground(new java.awt.Color(150, 149, 149));
        descricao1.setText("A descrição do evento é apresentada neste campo de texto, aqui o interessado  pode");

        excluir1.setBackground(new java.awt.Color(71, 94, 176));
        excluir1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        excluir1.setForeground(new java.awt.Color(255, 255, 255));
        excluir1.setText("Excluir");
        excluir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        excluir1.setBorderPainted(false);
        excluir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir1ActionPerformed(evt);
            }
        });

        textData1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textData1.setForeground(new java.awt.Color(115, 115, 115));
        textData1.setText("Data:");

        data1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data1.setForeground(new java.awt.Color(115, 115, 115));
        data1.setText("04/12/2019");

        textHora1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textHora1.setForeground(new java.awt.Color(115, 115, 115));
        textHora1.setText("Hora:");

        hora1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hora1.setForeground(new java.awt.Color(115, 115, 115));
        hora1.setText("7h");

        textLocal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLocal1.setForeground(new java.awt.Color(115, 115, 115));
        textLocal1.setText("Local:");

        local1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        local1.setForeground(new java.awt.Color(115, 115, 115));
        local1.setText("Casa");

        editar1.setBackground(new java.awt.Color(71, 94, 176));
        editar1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editar1.setForeground(new java.awt.Color(255, 255, 255));
        editar1.setText("Editar");
        editar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        editar1.setBorderPainted(false);
        editar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar1ActionPerformed(evt);
            }
        });

        textVagas1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textVagas1.setForeground(new java.awt.Color(115, 115, 115));
        textVagas1.setText("Vagas limite:");

        vagas1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vagas1.setForeground(new java.awt.Color(115, 115, 115));
        vagas1.setText("00");

        compras1.setBackground(new java.awt.Color(71, 94, 176));
        compras1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        compras1.setForeground(new java.awt.Color(255, 255, 255));
        compras1.setText("Compras");
        compras1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        compras1.setBorderPainted(false);
        compras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quadradoEvento1Layout = new javax.swing.GroupLayout(quadradoEvento1);
        quadradoEvento1.setLayout(quadradoEvento1Layout);
        quadradoEvento1Layout.setHorizontalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compras1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                                .addComponent(textData1)
                                .addGap(3, 3, 3)
                                .addComponent(data1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textHora1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textLocal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local1)
                                .addGap(18, 18, 18)
                                .addComponent(textVagas1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vagas1))
                            .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        quadradoEvento1Layout.setVerticalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo1)
                    .addComponent(editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compras1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data1)
                    .addComponent(hora1)
                    .addComponent(local1)
                    .addComponent(textData1)
                    .addComponent(textHora1)
                    .addComponent(textLocal1)
                    .addComponent(textVagas1)
                    .addComponent(vagas1))
                .addGap(7, 7, 7))
        );

        quadradoEvento2.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo2.setText("Título");

        descricao2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao2.setForeground(new java.awt.Color(150, 149, 149));
        descricao2.setText("A descrição do evento é apresentada neste campo de texto, aqui o interessado  pode");

        excluir2.setBackground(new java.awt.Color(71, 94, 176));
        excluir2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        excluir2.setForeground(new java.awt.Color(255, 255, 255));
        excluir2.setText("Excluir");
        excluir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        excluir2.setBorderPainted(false);
        excluir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir2ActionPerformed(evt);
            }
        });

        textData2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textData2.setForeground(new java.awt.Color(115, 115, 115));
        textData2.setText("Data:");

        data2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data2.setForeground(new java.awt.Color(115, 115, 115));
        data2.setText("04/12/2019");

        textHora2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textHora2.setForeground(new java.awt.Color(115, 115, 115));
        textHora2.setText("Hora:");

        hora2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hora2.setForeground(new java.awt.Color(115, 115, 115));
        hora2.setText("7h");

        textLocal2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLocal2.setForeground(new java.awt.Color(115, 115, 115));
        textLocal2.setText("Local:");

        local2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        local2.setForeground(new java.awt.Color(115, 115, 115));
        local2.setText("Casa");

        editar2.setBackground(new java.awt.Color(71, 94, 176));
        editar2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editar2.setForeground(new java.awt.Color(255, 255, 255));
        editar2.setText("Editar");
        editar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        editar2.setBorderPainted(false);
        editar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar2ActionPerformed(evt);
            }
        });

        textVagas2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textVagas2.setForeground(new java.awt.Color(115, 115, 115));
        textVagas2.setText("Vagas limite:");

        vagas2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vagas2.setForeground(new java.awt.Color(115, 115, 115));
        vagas2.setText("00");

        compras2.setBackground(new java.awt.Color(71, 94, 176));
        compras2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        compras2.setForeground(new java.awt.Color(255, 255, 255));
        compras2.setText("Compras");
        compras2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        compras2.setBorderPainted(false);
        compras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compras2ActionPerformed(evt);
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
                        .addComponent(titulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compras2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                                .addComponent(textData2)
                                .addGap(3, 3, 3)
                                .addComponent(data2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textHora2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textLocal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local2)
                                .addGap(18, 18, 18)
                                .addComponent(textVagas2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vagas2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quadradoEvento2Layout.setVerticalGroup(
            quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo2)
                    .addComponent(editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compras2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data2)
                    .addComponent(hora2)
                    .addComponent(local2)
                    .addComponent(textData2)
                    .addComponent(textHora2)
                    .addComponent(textLocal2)
                    .addComponent(textVagas2)
                    .addComponent(vagas2))
                .addGap(7, 7, 7))
        );

        quadradoEvento3.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo3.setText("Título");

        descricao3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao3.setForeground(new java.awt.Color(150, 149, 149));
        descricao3.setText("A descrição do evento é apresentada neste campo de texto, aqui o interessado  pode");

        excluir3.setBackground(new java.awt.Color(71, 94, 176));
        excluir3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        excluir3.setForeground(new java.awt.Color(255, 255, 255));
        excluir3.setText("Excluir");
        excluir3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        excluir3.setBorderPainted(false);
        excluir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir3ActionPerformed(evt);
            }
        });

        textData3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textData3.setForeground(new java.awt.Color(115, 115, 115));
        textData3.setText("Data:");

        data3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data3.setForeground(new java.awt.Color(115, 115, 115));
        data3.setText("04/12/2019");

        textHora3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textHora3.setForeground(new java.awt.Color(115, 115, 115));
        textHora3.setText("Hora:");

        hora3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hora3.setForeground(new java.awt.Color(115, 115, 115));
        hora3.setText("7h");

        textLocal3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLocal3.setForeground(new java.awt.Color(115, 115, 115));
        textLocal3.setText("Local:");

        local3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        local3.setForeground(new java.awt.Color(115, 115, 115));
        local3.setText("Casa");

        editar3.setBackground(new java.awt.Color(71, 94, 176));
        editar3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editar3.setForeground(new java.awt.Color(255, 255, 255));
        editar3.setText("Editar");
        editar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        editar3.setBorderPainted(false);
        editar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar3ActionPerformed(evt);
            }
        });

        textVagas3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textVagas3.setForeground(new java.awt.Color(115, 115, 115));
        textVagas3.setText("Vagas limite:");

        vagas3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vagas3.setForeground(new java.awt.Color(115, 115, 115));
        vagas3.setText("00");

        compras3.setBackground(new java.awt.Color(71, 94, 176));
        compras3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        compras3.setForeground(new java.awt.Color(255, 255, 255));
        compras3.setText("Compras");
        compras3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        compras3.setBorderPainted(false);
        compras3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compras3ActionPerformed(evt);
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
                        .addComponent(titulo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compras3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                                .addComponent(textData3)
                                .addGap(3, 3, 3)
                                .addComponent(data3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textHora3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textLocal3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local3)
                                .addGap(18, 18, 18)
                                .addComponent(textVagas3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vagas3)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quadradoEvento3Layout.setVerticalGroup(
            quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3)
                    .addComponent(editar3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compras3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data3)
                    .addComponent(hora3)
                    .addComponent(local3)
                    .addComponent(textData3)
                    .addComponent(textHora3)
                    .addComponent(textLocal3)
                    .addComponent(textVagas3)
                    .addComponent(vagas3))
                .addGap(7, 7, 7))
        );

        botaoSair.setBackground(new java.awt.Color(255, 255, 255));
        botaoSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(0, 32, 144));
        botaoSair.setText("Sair");
        botaoSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quadradoEvento2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quadradoEvento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quadradoEvento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(barraderolagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(quadradoEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quadradoEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quadradoEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(barraderolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static CadastrarEvento gerenciarevento = new CadastrarEvento(new javax.swing.JFrame(), false);
    int evento = 0;
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        evento++;
        if( evento == 1){
            LoginAdm.ticketse.setVisible(false);
            gerenciarevento.setVisible(true);
        }
        if (!quadradoEvento1.isVisible()){
            CadastrarEvento.ticketse.setVisible(false);
            gerenciarevento.setVisible(true);
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        String busca = campoDePesquisa.getText();
        
        
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void excluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir2ActionPerformed
        quadradoEvento2.setVisible(false);
        
    }//GEN-LAST:event_excluir2ActionPerformed

    private void excluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir3ActionPerformed
        quadradoEvento3.setVisible(false);
    }//GEN-LAST:event_excluir3ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        CadastrarEvento.ticketse.setVisible(false);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir1ActionPerformed
        quadradoEvento1.setVisible(false);
    }//GEN-LAST:event_excluir1ActionPerformed

    private void editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar1ActionPerformed
        CadastrarEvento.ticketse.setVisible(false);
        gerenciarevento.setVisible(true);
    }//GEN-LAST:event_editar1ActionPerformed

    private void editar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar2ActionPerformed
        CadastrarEvento.ticketse.setVisible(false);
        gerenciarevento.setVisible(true);
    }//GEN-LAST:event_editar2ActionPerformed

    private void editar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar3ActionPerformed
        CadastrarEvento.ticketse.setVisible(false);
        gerenciarevento.setVisible(true);
    }//GEN-LAST:event_editar3ActionPerformed

    private void compras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compras1ActionPerformed
        if (Pagamento.compra == 0) {
            JOptionPane.showMessageDialog(rootPane, "NINGUÉM COMPROU INGRESSO PARA ESSE EVENTO!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, Pagamento.nomeCampo.getText() + "COMPROU INGRESSO PARA ESSE EVENTO!");
        }
    }//GEN-LAST:event_compras1ActionPerformed

    private void compras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compras2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compras2ActionPerformed

    private void compras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compras3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compras3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ticketse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticketse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticketse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticketse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticketse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar barraderolagem;
    private javax.swing.JButton botaoBuscar;
    public static javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoDePesquisa;
    private javax.swing.JButton compras1;
    private javax.swing.JButton compras2;
    private javax.swing.JButton compras3;
    public static javax.swing.JLabel data1;
    public static javax.swing.JLabel data2;
    public static javax.swing.JLabel data3;
    public static javax.swing.JLabel descricao1;
    public static javax.swing.JLabel descricao2;
    public static javax.swing.JLabel descricao3;
    private javax.swing.JButton editar1;
    private javax.swing.JButton editar2;
    private javax.swing.JButton editar3;
    private javax.swing.JButton excluir1;
    public static javax.swing.JButton excluir2;
    public static javax.swing.JButton excluir3;
    public static javax.swing.JLabel hora1;
    public static javax.swing.JLabel hora2;
    public static javax.swing.JLabel hora3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JToggleButton jToggleButton1;
    protected static javax.swing.JLabel local1;
    public static javax.swing.JLabel local2;
    public static javax.swing.JLabel local3;
    private javax.swing.JLabel logo;
    public static javax.swing.JPanel quadradoEvento1;
    public static javax.swing.JPanel quadradoEvento2;
    public static javax.swing.JPanel quadradoEvento3;
    private javax.swing.JLabel textData1;
    private javax.swing.JLabel textData2;
    private javax.swing.JLabel textData3;
    private javax.swing.JLabel textHora1;
    private javax.swing.JLabel textHora2;
    private javax.swing.JLabel textHora3;
    private javax.swing.JLabel textLocal1;
    private javax.swing.JLabel textLocal2;
    private javax.swing.JLabel textLocal3;
    private javax.swing.JLabel textVagas1;
    private javax.swing.JLabel textVagas2;
    private javax.swing.JLabel textVagas3;
    public static javax.swing.JLabel titulo1;
    public static javax.swing.JLabel titulo2;
    public static javax.swing.JLabel titulo3;
    public static javax.swing.JLabel vagas1;
    protected static javax.swing.JLabel vagas2;
    protected static javax.swing.JLabel vagas3;
    // End of variables declaration//GEN-END:variables
}
