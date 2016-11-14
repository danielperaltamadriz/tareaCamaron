package my.t2gui1;

import java.util.LinkedList;
import java.util.Vector;

public class T2GUI extends javax.swing.JFrame {

    public T2GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup btnGroup = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        cedulaText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        sinDescuentoText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        conDescuentoText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        calcularBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pinkyText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        blancoText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jumboText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoText = new javax.swing.JTextArea();
        registroBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pinkyPrecio = new javax.swing.JTextField();
        pinkyLimiteA = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pinkyDescB = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pinkyLimiteB = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        pinkyDescA = new javax.swing.JTextField();
        modPinky = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jumboPrecio = new javax.swing.JTextField();
        jumboLimiteA = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jumboDescB = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jumboLimiteB = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jumboDescA = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        blancoPrecio = new javax.swing.JTextField();
        blancoLimiteA = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        blancoDescB = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        blancoLimiteB = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        blancoDescA = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        pinkyHistoria = new javax.swing.JRadioButton();
        blancoHistoria = new javax.swing.JRadioButton();
        jumboHistoria = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        scientificName = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Cédula");

        nombreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTextKeyReleased(evt);
            }
        });

        cedulaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(cedulaText))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cálculo de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        sinDescuentoText.setEnabled(false);

        jLabel13.setText("Venta sin Descuento");

        conDescuentoText.setEnabled(false);

        jLabel15.setText("Venta con Descuento");

        calcularBtn.setText("Calcular Venta");
        calcularBtn.setEnabled(false);
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sinDescuentoText, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(conDescuentoText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calcularBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sinDescuentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(conDescuentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcularBtn)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kilos de Camarón", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setText("Kg");

        pinkyText.setText("0");
        pinkyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinkyTextKeyTyped(evt);
            }
        });

        jLabel5.setText("Camarón Pinky");

        jLabel6.setText("Kg");

        blancoText.setText("0");
        blancoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                blancoTextKeyTyped(evt);
            }
        });

        jLabel7.setText("Camarón Blanco");

        jLabel8.setText("Kg");

        jumboText.setText("0");
        jumboText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumboTextKeyTyped(evt);
            }
        });

        jLabel9.setText("Camarón Jumbo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jumboText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pinkyText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(blancoText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinkyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blancoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jumboText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Registros de clientes al final del día");

        resultadoText.setColumns(20);
        resultadoText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultadoText.setRows(5);
        resultadoText.setEnabled(false);
        jScrollPane1.setViewportView(resultadoText);

        registroBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        registroBtn.setText("Registro de Clientes");
        registroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        limpiarBtn.setText("Limpiar Registro");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(registroBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarBtn))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registroBtn)
                    .addComponent(limpiarBtn))
                .addGap(34, 34, 34)
                .addComponent(jButton3)
                .addGap(16, 16, 16))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        jTabbedPane2.addTab("tab1", jPanel4);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pnky", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel8.setName(""); // NOI18N

        jLabel17.setText("Precio");

        jLabel18.setText("Descuento B");

        pinkyPrecio.setText("5840");
        pinkyPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkyPrecioActionPerformed(evt);
            }
        });
        pinkyPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyPrecioKeyReleased(evt);
            }
        });

        pinkyLimiteA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyLimiteAKeyReleased(evt);
            }
        });

        jLabel23.setText("Límite A");

        pinkyDescB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyDescBKeyReleased(evt);
            }
        });

        jLabel24.setText("Límite B");

        pinkyLimiteB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyLimiteBKeyReleased(evt);
            }
        });

        jLabel25.setText("Descuento A");

        pinkyDescA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinkyDescAKeyReleased(evt);
            }
        });

        modPinky.setText("Modificar");
        modPinky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPinkyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pinkyPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(pinkyLimiteA)
                                    .addComponent(pinkyDescB)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pinkyLimiteB)
                                    .addComponent(pinkyDescA)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modPinky)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pinkyPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(pinkyLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(pinkyLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pinkyDescA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(pinkyDescB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(modPinky)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jumbo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel12.setName(""); // NOI18N

        jLabel31.setText("Precio");

        jLabel32.setText("Descuento B");

        jumboPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboPrecioKeyReleased(evt);
            }
        });

        jumboLimiteA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboLimiteAKeyReleased(evt);
            }
        });

        jLabel33.setText("Límite A");

        jumboDescB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboDescBKeyReleased(evt);
            }
        });

        jLabel34.setText("Límite B");

        jumboLimiteB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboLimiteBKeyReleased(evt);
            }
        });

        jLabel35.setText("Descuento A");

        jumboDescA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumboDescAKeyReleased(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jumboPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(jumboLimiteA)
                                    .addComponent(jumboDescB)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jumboLimiteB)
                                    .addComponent(jumboDescA)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jumboPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jumboLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jumboLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jumboDescA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jumboDescB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blanco", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel13.setName(""); // NOI18N

        jLabel36.setText("Precio");

        jLabel37.setText("Descuento B");

        blancoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoPrecioKeyReleased(evt);
            }
        });

        blancoLimiteA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoLimiteAKeyReleased(evt);
            }
        });

        jLabel38.setText("Límite A");

        blancoDescB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoDescBKeyReleased(evt);
            }
        });

        jLabel39.setText("Límite B");

        blancoLimiteB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoLimiteBKeyReleased(evt);
            }
        });

        jLabel40.setText("Descuento A");

        blancoDescA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blancoDescAKeyReleased(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blancoPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(blancoLimiteA)
                                    .addComponent(blancoDescB)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blancoLimiteB)
                                    .addComponent(blancoDescA)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(blancoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(blancoLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(blancoLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(blancoDescA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(blancoDescB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel5);

        btnGroup.add(pinkyHistoria);
        pinkyHistoria.setText("Camarón Pinky");
        pinkyHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkyHistoriaActionPerformed(evt);
            }
        });

        btnGroup.add(blancoHistoria);
        blancoHistoria.setText("Camarón Blanco");
        blancoHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoHistoriaActionPerformed(evt);
            }
        });

        btnGroup.add(jumboHistoria);
        jumboHistoria.setText("Camarón Jumbo");
        jumboHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumboHistoriaActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre:");

        jLabel11.setText("Nombre Científico:");

        jLabel12.setText("Tamaño:");

        jLabel14.setText("Color:");

        jLabel16.setText("Peso:");

        name.setEditable(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        scientificName.setEditable(false);

        size.setEditable(false);

        color.setEditable(false);
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        weight.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(blancoHistoria)
                        .addGap(172, 172, 172)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(scientificName)
                                    .addComponent(size, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                    .addComponent(weight)))))
                    .addComponent(jumboHistoria)
                    .addComponent(pinkyHistoria))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pinkyHistoria)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(scientificName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(blancoHistoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jumboHistoria)
                .addGap(64, 64, 64)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        jTabbedPane2.addTab("tab4", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        if (precios.size() == 0) {
            precios.add(5840);
            precios.add(10045);
            precios.add(23200);
        }
        if (limitesA.size() == 0) {
            limitesA.add(5);
            limitesA.add(5);
            limitesA.add(5);
        }
        if (limitesB.size() == 0) {
            limitesB.add(10);
            limitesB.add(10);
            limitesB.add(10);
        }
        if (descsA.size() == 0) {
            descsA.add(5.0);
            descsA.add(7.0);
            descsA.add(4.0);
        }
        if (descsB.size() == 0) {
            descsB.add(10.0);
            descsB.add(5.0);
            descsB.add(7.0);
        }
        d = new Descuentos();
        d.setPinky(precios.get(0), limitesA.get(0), limitesB.get(0), descsA.get(0), descsB.get(0));
        d.setBlanco(precios.get(1), limitesA.get(1), limitesB.get(1), descsA.get(1), descsB.get(1));
        d.setJumbo(precios.get(2), limitesA.get(2), limitesB.get(2), descsA.get(2), descsB.get(2));
        d.descuento_pinky(Double.parseDouble(pinkyText.getText()));
        d.descuento_blanco(Double.parseDouble(blancoText.getText()));
        d.descuento_jumbo(Double.parseDouble(jumboText.getText()));
        cliente = new Cliente(nombreText.getText(), cedulaText.getText(), d);
        conDescuentoText.setText(String.valueOf(cliente.getCompra().getPrecioConDescuento()));
        sinDescuentoText.setText(String.valueOf(cliente.getCompra().getPrecioSinDescuento()));
        listaClientes.add(cliente);
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void pinkyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyTextKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyText.setText(pinkyText.getText().replace(evt.getKeyChar(), '\0'));
        }
    }//GEN-LAST:event_pinkyTextKeyReleased

    private void nombreTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextKeyReleased
        habilitandoBtn();
    }//GEN-LAST:event_nombreTextKeyReleased

    private void cedulaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTextKeyReleased
        habilitandoBtn();
    }//GEN-LAST:event_cedulaTextKeyReleased

    private void blancoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoTextKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoText.setText(blancoText.getText().replace(evt.getKeyChar(), '\0'));
        }
    }//GEN-LAST:event_blancoTextKeyReleased

    private void jumboTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboTextKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboText.setText(jumboText.getText().replace(evt.getKeyChar(), '\0'));
        }
    }//GEN-LAST:event_jumboTextKeyReleased

    private void registroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroBtnActionPerformed
        String resultado = "";
        for (int i = 0; i < listaClientes.size(); i++) {
            resultado += "Cliente:" + listaClientes.get(i).getNombre();
            resultado += " Cédula:" + listaClientes.get(i).getCedula();
            resultado += " Pinky:" + listaClientes.get(i).getCompra().getPinky().getKilos();
            resultado += " Blanco:" + listaClientes.get(i).getCompra().getBlanco().getKilos();
            resultado += " Jumbo:" + listaClientes.get(i).getCompra().getJumbo().getKilos();
            resultado += " Venta en Colones:" + listaClientes.get(i).getCompra().getPrecioConDescuento();
            resultado += "\n";
        }
        resultadoText.setText(resultado);
    }//GEN-LAST:event_registroBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        limpiarEspacios();
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void blancoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoTextKeyTyped
        if (blancoText.getText().isEmpty()) {
            blancoText.setText("0");
        }

    }//GEN-LAST:event_blancoTextKeyTyped

    private void pinkyTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyTextKeyTyped
        if (pinkyText.getText().isEmpty()) {
            pinkyText.setText("0");
        }

    }//GEN-LAST:event_pinkyTextKeyTyped

    private void jumboTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboTextKeyTyped
        if (jumboText.getText().isEmpty()) {
            jumboText.setText("0");
        }
    }//GEN-LAST:event_jumboTextKeyTyped

    private void pinkyHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkyHistoriaActionPerformed
        name.setText(d.getPinky().getName());
        scientificName.setText(d.getPinky().getScientificName());
        size.setText(d.getPinky().getSize());
        color.setText(d.getPinky().getColor());
        weight.setText(d.getPinky().getWeight());

    }//GEN-LAST:event_pinkyHistoriaActionPerformed

    private void blancoHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoHistoriaActionPerformed
        name.setText(d.getBlanco().getName());
        scientificName.setText(d.getBlanco().getScientificName());
        size.setText(d.getBlanco().getSize());
        color.setText(d.getBlanco().getColor());
        weight.setText(d.getBlanco().getWeight());
    }//GEN-LAST:event_blancoHistoriaActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void jumboHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumboHistoriaActionPerformed
        name.setText(d.getJumbo().getName());
        scientificName.setText(d.getJumbo().getScientificName());
        size.setText(d.getJumbo().getSize());
        color.setText(d.getJumbo().getColor());
        weight.setText(d.getJumbo().getWeight());
    }//GEN-LAST:event_jumboHistoriaActionPerformed

    private void pinkyPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyPrecioKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyPrecio.setText(pinkyPrecio.getText().replace("" + evt.getKeyChar(), ""));
        }
        d.getPinky().setPrecio(5840);
        precios.set(0, 5840);
    }//GEN-LAST:event_pinkyPrecioKeyReleased

    private void pinkyLimiteAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyLimiteAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyLimiteA.setText(pinkyLimiteA.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesA.set(0, 5);

    }//GEN-LAST:event_pinkyLimiteAKeyReleased

    private void pinkyDescBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyDescBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyDescB.setText(pinkyDescB.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (pinkyDescB.getText().length() - 1 < pinkyDescB.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (pinkyDescB.getText().replace(".", "").length() > 0) {
                pinkyDescB.setText(pinkyDescB.getText() + ".");
            }
        }
        descsB.set(0, 1.00);
    }//GEN-LAST:event_pinkyDescBKeyReleased

    private void pinkyLimiteBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyLimiteBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyLimiteB.setText(pinkyLimiteB.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesA.set(0, 10);

    }//GEN-LAST:event_pinkyLimiteBKeyReleased

    private void pinkyDescAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinkyDescAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            pinkyDescA.setText(pinkyDescA.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (pinkyDescA.getText().length() - 1 < pinkyDescA.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (pinkyDescA.getText().replace(".", "").length() > 0) {
                pinkyDescA.setText(pinkyDescA.getText() + ".");
            }
        }
        descsA.set(0, 5.0);

    }//GEN-LAST:event_pinkyDescAKeyReleased

    private void jumboPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboPrecioKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboPrecio.setText(jumboPrecio.getText().replace("" + evt.getKeyChar(), ""));
        }
        precios.set(2, 23200);
    }//GEN-LAST:event_jumboPrecioKeyReleased

    private void jumboLimiteAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboLimiteAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboLimiteA.setText(jumboLimiteA.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesA.set(2, 5);

    }//GEN-LAST:event_jumboLimiteAKeyReleased

    private void jumboDescBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboDescBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboDescB.setText(jumboDescB.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (jumboDescB.getText().length() - 1 < jumboDescB.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (jumboDescB.getText().replace(".", "").length() > 0) {
                jumboDescB.setText(jumboDescB.getText() + ".");
            }
        }
        descsB.set(2, 7.0);
    }//GEN-LAST:event_jumboDescBKeyReleased

    private void jumboLimiteBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboLimiteBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboLimiteB.setText(jumboLimiteB.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesB.set(2, 10);

    }//GEN-LAST:event_jumboLimiteBKeyReleased

    private void jumboDescAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumboDescAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            jumboDescA.setText(jumboDescA.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (jumboDescA.getText().length() - 1 < jumboDescA.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (jumboDescA.getText().replace(".", "").length() > 0) {
                jumboDescA.setText(jumboDescA.getText() + ".");
            }
        }
        descsA.set(2, 4.0);
    }//GEN-LAST:event_jumboDescAKeyReleased

    private void blancoPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoPrecioKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoPrecio.setText(blancoPrecio.getText().replace("" + evt.getKeyChar(), ""));
        }
        precios.set(1, 10045);
    }//GEN-LAST:event_blancoPrecioKeyReleased

    private void blancoLimiteAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoLimiteAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoLimiteA.setText(blancoLimiteA.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesA.set(1, 5);

    }//GEN-LAST:event_blancoLimiteAKeyReleased

    private void blancoDescBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoDescBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoDescB.setText(blancoDescB.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (blancoDescB.getText().length() - 1 < blancoDescB.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (blancoDescB.getText().replace(".", "").length() > 0) {
                blancoDescB.setText(blancoDescB.getText() + ".");
            }
        }
        descsB.set(1, 15.0);

    }//GEN-LAST:event_blancoDescBKeyReleased

    private void blancoLimiteBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoLimiteBKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoLimiteB.setText(blancoLimiteB.getText().replace("" + evt.getKeyChar(), ""));
        }
        limitesB.set(1, 10);

    }//GEN-LAST:event_blancoLimiteBKeyReleased

    private void blancoDescAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blancoDescAKeyReleased
        if (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) {
            blancoDescA.setText(blancoDescA.getText().replace("" + evt.getKeyChar(), ""));
        }
        if (blancoDescA.getText().length() - 1 < blancoDescA.getText().replace(".", "").length() && evt.getKeyCode() == 46) {
            if (blancoDescA.getText().replace(".", "").length() > 0) {
                blancoDescA.setText(blancoDescA.getText() + ".");
            }
        }
        descsA.set(1, 7.0);

    }//GEN-LAST:event_blancoDescAKeyReleased

    private void pinkyPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkyPrecioActionPerformed

    }//GEN-LAST:event_pinkyPrecioActionPerformed
    private void modPinkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPinkyActionPerformed
        if (pinkyPrecio.getText().length() > 0) {
            precios.set(0, Integer.parseInt(pinkyPrecio.getText()));
        }
        if (pinkyLimiteA.getText().length() > 0) {
            limitesA.set(0, Integer.parseInt(pinkyLimiteA.getText()));
        }
        if (pinkyLimiteB.getText().length() > 0) {
            limitesB.set(0, Integer.parseInt(pinkyLimiteB.getText()));
        }
        if (pinkyDescA.getText().length() > 0) {
            descsA.set(0, Double.parseDouble(pinkyDescA.getText()));
        }
        if (pinkyDescB.getText().length() > 0) {
            descsB.set(0, Double.parseDouble(pinkyDescB.getText()));
        }
    }//GEN-LAST:event_modPinkyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (blancoPrecio.getText().length() > 0) {
            precios.set(1, Integer.parseInt(blancoPrecio.getText()));
        }
        if (blancoLimiteA.getText().length() > 0) {
            limitesA.set(1, Integer.parseInt(blancoLimiteA.getText()));
        }
        if (blancoLimiteB.getText().length() > 0) {
            limitesB.set(1, Integer.parseInt(blancoLimiteB.getText()));
        }
        if (blancoDescA.getText().length() > 0) {
            descsA.set(1, Double.parseDouble(blancoDescA.getText()));
        }
        if (blancoDescB.getText().length() > 0) {
            descsB.set(1, Double.parseDouble(blancoDescB.getText()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jumboPrecio.getText().length() > 0) {
            precios.set(2, Integer.parseInt(jumboPrecio.getText()));
        }
        if (jumboLimiteA.getText().length() > 0) {
            limitesA.set(2, Integer.parseInt(jumboLimiteA.getText()));
        }
        if (jumboLimiteB.getText().length() > 0) {
            limitesB.set(2, Integer.parseInt(jumboLimiteB.getText()));
        }
        if (jumboDescA.getText().length() > 0) {
            descsA.set(2, Double.parseDouble(jumboDescA.getText()));
        }
        if (jumboDescB.getText().length() > 0) {
            descsB.set(2, Double.parseDouble(jumboDescB.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpiarEspacios() {
        nombreText.setText("");
        cedulaText.setText("");
        pinkyText.setText("0");
        blancoText.setText("0");
        jumboText.setText("0");
        conDescuentoText.setText("");
        sinDescuentoText.setText("");
    }

    private void habilitandoBtn() {
        calcularBtn.setEnabled(!nombreText.getText().isEmpty() && !cedulaText.getText().isEmpty());
        boolean enabled = (!pinkyText.getText().isEmpty() || !blancoText.getText().isEmpty() || !jumboText.getText().isEmpty());
        calcularBtn.setEnabled(calcularBtn.isEnabled() && enabled);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2GUI().setVisible(true);
            }
        });
    }
    private LinkedList<Cliente> listaClientes = new LinkedList<>();
    Cliente cliente;
    Descuentos d;
    Vector<Integer> precios = new Vector<>();
    Vector<Integer> limitesA = new Vector<>();
    Vector<Integer> limitesB = new Vector<>();
    Vector<Double> descsA = new Vector<>();
    Vector<Double> descsB = new Vector<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blancoDescA;
    private javax.swing.JTextField blancoDescB;
    private javax.swing.JRadioButton blancoHistoria;
    private javax.swing.JTextField blancoLimiteA;
    private javax.swing.JTextField blancoLimiteB;
    private javax.swing.JTextField blancoPrecio;
    private javax.swing.JTextField blancoText;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JTextField color;
    private javax.swing.JTextField conDescuentoText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jumboDescA;
    private javax.swing.JTextField jumboDescB;
    private javax.swing.JRadioButton jumboHistoria;
    private javax.swing.JTextField jumboLimiteA;
    private javax.swing.JTextField jumboLimiteB;
    private javax.swing.JTextField jumboPrecio;
    private javax.swing.JTextField jumboText;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JButton modPinky;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField pinkyDescA;
    private javax.swing.JTextField pinkyDescB;
    private javax.swing.JRadioButton pinkyHistoria;
    private javax.swing.JTextField pinkyLimiteA;
    private javax.swing.JTextField pinkyLimiteB;
    private javax.swing.JTextField pinkyPrecio;
    private javax.swing.JTextField pinkyText;
    private javax.swing.JButton registroBtn;
    private javax.swing.JTextArea resultadoText;
    private javax.swing.JTextField scientificName;
    private javax.swing.JTextField sinDescuentoText;
    private javax.swing.JTextField size;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
