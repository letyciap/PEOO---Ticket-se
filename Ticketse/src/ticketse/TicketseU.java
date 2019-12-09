package ticketse;

public class TicketseU extends javax.swing.JFrame {
    public static Pagamento pagamento = new Pagamento(new javax.swing.JFrame(), true);
    public static MeusEventos meuseventos = new MeusEventos(new javax.swing.JFrame(), true);

    public TicketseU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        barraderolagem = new javax.swing.JScrollBar();
        logo = new javax.swing.JLabel();
        campoDePesquisa = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        quadradoEvento1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        descricao1 = new javax.swing.JLabel();
        comprar1 = new javax.swing.JButton();
        textData1 = new javax.swing.JLabel();
        data1 = new javax.swing.JLabel();
        textHora1 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        textLocal1 = new javax.swing.JLabel();
        local1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        quadradoEvento2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        descricao2 = new javax.swing.JLabel();
        comprar2 = new javax.swing.JButton();
        textData2 = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        textHora2 = new javax.swing.JLabel();
        hora2 = new javax.swing.JLabel();
        textLocal2 = new javax.swing.JLabel();
        local2 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        quadradoEvento3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        descricao3 = new javax.swing.JLabel();
        comprar3 = new javax.swing.JButton();
        textData3 = new javax.swing.JLabel();
        data3 = new javax.swing.JLabel();
        textHora3 = new javax.swing.JLabel();
        hora3 = new javax.swing.JLabel();
        textLocal3 = new javax.swing.JLabel();
        local3 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoEventos = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 253, 255));

        barraderolagem.setBackground(new java.awt.Color(149, 170, 247));
        barraderolagem.setForeground(new java.awt.Color(149, 170, 247));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketse/LOGO.png"))); // NOI18N

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

        comprar1.setBackground(new java.awt.Color(71, 94, 176));
        comprar1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comprar1.setForeground(new java.awt.Color(255, 255, 255));
        comprar1.setText("Comprar");
        comprar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        comprar1.setBorderPainted(false);
        comprar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar1ActionPerformed(evt);
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

        preco1.setBackground(new java.awt.Color(0, 51, 153));
        preco1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        preco1.setForeground(new java.awt.Color(0, 51, 153));
        preco1.setText("00");

        javax.swing.GroupLayout quadradoEvento1Layout = new javax.swing.GroupLayout(quadradoEvento1);
        quadradoEvento1.setLayout(quadradoEvento1Layout);
        quadradoEvento1Layout.setHorizontalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento1Layout.createSequentialGroup()
                        .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preco1)))
                .addContainerGap())
        );
        quadradoEvento1Layout.setVerticalGroup(
            quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoEvento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data1)
                    .addComponent(hora1)
                    .addComponent(local1)
                    .addComponent(textData1)
                    .addComponent(textHora1)
                    .addComponent(textLocal1)
                    .addComponent(preco1))
                .addGap(7, 7, 7))
        );

        quadradoEvento2.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo2.setText("Título");

        descricao2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao2.setForeground(new java.awt.Color(150, 149, 149));
        descricao2.setText("A descrição do evento é apresentada neste campo de texto, aqui o interessado  pode");

        comprar2.setBackground(new java.awt.Color(71, 94, 176));
        comprar2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comprar2.setForeground(new java.awt.Color(255, 255, 255));
        comprar2.setText("Comprar");
        comprar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        comprar2.setBorderPainted(false);
        comprar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar2ActionPerformed(evt);
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

        preco2.setBackground(new java.awt.Color(0, 51, 153));
        preco2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        preco2.setForeground(new java.awt.Color(0, 51, 153));
        preco2.setText("00");

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
                        .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento2Layout.createSequentialGroup()
                        .addComponent(descricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preco2)))
                .addContainerGap())
        );
        quadradoEvento2Layout.setVerticalGroup(
            quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoEvento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data2)
                    .addComponent(hora2)
                    .addComponent(local2)
                    .addComponent(textData2)
                    .addComponent(textHora2)
                    .addComponent(textLocal2)
                    .addComponent(preco2))
                .addGap(5, 5, 5))
        );

        quadradoEvento3.setBackground(new java.awt.Color(255, 255, 255));
        quadradoEvento3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));

        titulo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo3.setText("Título");

        descricao3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao3.setForeground(new java.awt.Color(150, 149, 149));
        descricao3.setText("A descrição do evento é apresentada neste campo de texto, aqui o interessado  pode");

        comprar3.setBackground(new java.awt.Color(71, 94, 176));
        comprar3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comprar3.setForeground(new java.awt.Color(255, 255, 255));
        comprar3.setText("Comprar");
        comprar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        comprar3.setBorderPainted(false);
        comprar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar3ActionPerformed(evt);
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

        preco3.setBackground(new java.awt.Color(0, 51, 153));
        preco3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        preco3.setForeground(new java.awt.Color(0, 51, 153));
        preco3.setText("00");

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
                        .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadradoEvento3Layout.createSequentialGroup()
                        .addComponent(descricao3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preco3)))
                .addContainerGap())
        );
        quadradoEvento3Layout.setVerticalGroup(
            quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoEvento3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quadradoEvento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data3)
                    .addComponent(hora3)
                    .addComponent(local3)
                    .addComponent(textData3)
                    .addComponent(textHora3)
                    .addComponent(textLocal3)
                    .addComponent(preco3))
                .addGap(5, 5, 5))
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

        botaoEventos.setBackground(new java.awt.Color(255, 255, 255));
        botaoEventos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoEventos.setForeground(new java.awt.Color(0, 32, 144));
        botaoEventos.setText("Meus Eventos");
        botaoEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 32, 144)));
        botaoEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEventosActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(barraderolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        String busca = campoDePesquisa.getText();
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void comprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar1ActionPerformed
        pagamento.setVisible(true);
    }//GEN-LAST:event_comprar1ActionPerformed

    private void comprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar2ActionPerformed
        pagamento.setVisible(true);
    }//GEN-LAST:event_comprar2ActionPerformed

    private void comprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar3ActionPerformed
        pagamento.setVisible(true);
    }//GEN-LAST:event_comprar3ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        LoginUsuario.ticketseu.setVisible(false);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEventosActionPerformed
        if(Pagamento.compra == 0 ){
        MeusEventos.quadradoEvento1.setVisible(false);
        MeusEventos.quadradoEvento2.setVisible(false);
        MeusEventos.quadradoEvento3.setVisible(false);
        meuseventos.setVisible(true);
        }else if(Pagamento.compra == 1 ) {
        MeusEventos.quadradoEvento2.setVisible(false);
        MeusEventos.quadradoEvento3.setVisible(false);
        MeusEventos.quadradoEvento1.setVisible(true);
        MeusEventos.titulo1.setText(Ticketse.titulo1.getText());
        MeusEventos.categoria1.setText(Pagamento.nomeCampo.getText());
        MeusEventos.data1.setText(Ticketse.data1.getText());
        MeusEventos.hora1.setText(Ticketse.hora1.getText());
        MeusEventos.local1.setText(Ticketse.local1.getText());
        meuseventos.setVisible(true);}
        else{
        MeusEventos.quadradoEvento2.setVisible(false);
        MeusEventos.quadradoEvento3.setVisible(false);
        MeusEventos.quadradoEvento1.setVisible(true);
        MeusEventos.titulo1.setText(Ticketse.titulo1.getText());
        MeusEventos.categoria1.setText(Pagamento.nomeCampo.getText());
        MeusEventos.data1.setText(Ticketse.data1.getText());
        MeusEventos.hora1.setText(Ticketse.hora1.getText());
        MeusEventos.local1.setText(Ticketse.local1.getText());
        meuseventos.setVisible(true);}                                          

    }//GEN-LAST:event_botaoEventosActionPerformed

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
            java.util.logging.Logger.getLogger(TicketseU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketseU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketseU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketseU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketseU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar barraderolagem;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoEventos;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoDePesquisa;
    private javax.swing.JButton comprar1;
    private javax.swing.JButton comprar2;
    private javax.swing.JButton comprar3;
    public static javax.swing.JLabel data1;
    private javax.swing.JLabel data2;
    private javax.swing.JLabel data3;
    public static javax.swing.JLabel descricao1;
    private javax.swing.JLabel descricao2;
    private javax.swing.JLabel descricao3;
    public static javax.swing.JLabel hora1;
    private javax.swing.JLabel hora2;
    private javax.swing.JLabel hora3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JLabel local1;
    private javax.swing.JLabel local2;
    private javax.swing.JLabel local3;
    private javax.swing.JLabel logo;
    public static javax.swing.JLabel preco1;
    public static javax.swing.JLabel preco2;
    public static javax.swing.JLabel preco3;
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
    public static javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
