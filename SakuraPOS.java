
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author adan2
 */
public class SakuraPOS extends javax.swing.JFrame {

    /**
     * Creates new form SakuraPOS
     */
    public SakuraPOS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtn9 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtnFillSpc = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jtxtBarCode = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtnEyePrimerYuya = new javax.swing.JButton();
        jbtnJellyMask = new javax.swing.JButton();
        jbtnFixerYuya = new javax.swing.JButton();
        jbtnSerum = new javax.swing.JButton();
        jbtnLiquidCYuya = new javax.swing.JButton();
        jbtnMultiUseInkYuya = new javax.swing.JButton();
        jbtnEyeMask = new javax.swing.JButton();
        jbtnAloeGelYb = new javax.swing.JButton();
        jbtnLiquidMakYuya = new javax.swing.JButton();
        jbtnLipMask = new javax.swing.JButton();
        jbtnLiquidLipYuya = new javax.swing.JButton();
        jbtnVelvetYuya = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 500));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(255, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn9.setBackground(new java.awt.Color(102, 255, 204));
        jbtn9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 90));

        jbtn7.setBackground(new java.awt.Color(102, 255, 204));
        jbtn7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 80, 90));

        jbtn8.setBackground(new java.awt.Color(102, 255, 204));
        jbtn8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 90));

        jbtn4.setBackground(new java.awt.Color(102, 255, 204));
        jbtn4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 90));

        jbtn5.setBackground(new java.awt.Color(102, 255, 204));
        jbtn5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, 90));

        jbtn6.setBackground(new java.awt.Color(102, 255, 204));
        jbtn6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 90));

        jbtn1.setBackground(new java.awt.Color(102, 255, 204));
        jbtn1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 90));

        jbtn3.setBackground(new java.awt.Color(102, 255, 204));
        jbtn3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, 90));

        jbtn2.setBackground(new java.awt.Color(102, 255, 204));
        jbtn2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, 90));

        jbtnFillSpc.setBackground(new java.awt.Color(0, 255, 204));
        jbtnFillSpc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtnFillSpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 260, 40));

        jbtnDot.setBackground(new java.awt.Color(102, 255, 204));
        jbtnDot.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, 60));

        jbtn0.setBackground(new java.awt.Color(102, 255, 204));
        jbtn0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 60));

        jbtnC.setBackground(new java.awt.Color(102, 255, 204));
        jbtnC.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 80, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 430));

        jtxtBarCode.setFont(new java.awt.Font("IDAHC39M Code 39 Barcode", 0, 20)); // NOI18N
        jtxtBarCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 330, 80));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Total");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("SubTotal");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("IVA");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 40));

        jtxtTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, 30));

        jtxtSubTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtSubTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 12, 220, 30));

        jtxtTax.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtTax.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 220, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 160));

        jPanel5.setBackground(new java.awt.Color(0, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 255, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Tipo de Pago:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        jLabel5.setBackground(new java.awt.Color(51, 255, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Monto");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 40));

        jLabel6.setBackground(new java.awt.Color(51, 255, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Cambio");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 40));

        jtxtDisplay.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 260, 30));

        jtxtChange.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtChange.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 260, 30));

        jcboPayment.setBackground(new java.awt.Color(0, 204, 204));
        jcboPayment.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Visa", "MasterCard" }));
        jcboPayment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 200, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 430, 160));

        jPanel6.setBackground(new java.awt.Color(0, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnReset.setBackground(new java.awt.Color(255, 153, 153));
        jbtnReset.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnReset.setText("Reiniciar");
        jbtnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153), null));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 40));

        jbtnPay.setBackground(new java.awt.Color(255, 153, 153));
        jbtnPay.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnPay.setText("Pagar");
        jbtnPay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153), null));
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        jbtnPrint.setBackground(new java.awt.Color(255, 153, 153));
        jbtnPrint.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnPrint.setText("Imprimir");
        jbtnPrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153), null));
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 40));

        jbtnExit.setBackground(new java.awt.Color(255, 153, 153));
        jbtnExit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnExit.setText("Salir");
        jbtnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153), null));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 400, 40));

        jbtnRemove.setBackground(new java.awt.Color(255, 153, 153));
        jbtnRemove.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnRemove.setText("Remover");
        jbtnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153), null));
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 420, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1310, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMinimumSize(new java.awt.Dimension(870, 430));
        jPanel2.setPreferredSize(new java.awt.Dimension(255, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnEyePrimerYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnEyePrimerYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnEyePrimerYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/PrimerOjosYuya.png"))); // NOI18N
        jbtnEyePrimerYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEyePrimerYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEyePrimerYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEyePrimerYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 130));

        jbtnJellyMask.setBackground(new java.awt.Color(102, 255, 204));
        jbtnJellyMask.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnJellyMask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/MascarillaLiquidaYb.png"))); // NOI18N
        jbtnJellyMask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnJellyMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnJellyMaskActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnJellyMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 130));

        jbtnFixerYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnFixerYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnFixerYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/FijadorYuya.png"))); // NOI18N
        jbtnFixerYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnFixerYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFixerYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnFixerYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 130));

        jbtnSerum.setBackground(new java.awt.Color(102, 255, 204));
        jbtnSerum.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnSerum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/SerumYb.png"))); // NOI18N
        jbtnSerum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSerum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSerumActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnSerum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 130));

        jbtnLiquidCYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnLiquidCYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnLiquidCYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/DelineadorColYuya.png"))); // NOI18N
        jbtnLiquidCYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLiquidCYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLiquidCYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnLiquidCYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 130));

        jbtnMultiUseInkYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnMultiUseInkYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnMultiUseInkYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/TintaMultYuya.png"))); // NOI18N
        jbtnMultiUseInkYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnMultiUseInkYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiUseInkYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnMultiUseInkYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 160, 130));

        jbtnEyeMask.setBackground(new java.awt.Color(102, 255, 204));
        jbtnEyeMask.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnEyeMask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/ParcheOjosYb.png"))); // NOI18N
        jbtnEyeMask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEyeMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEyeMaskActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEyeMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 130));

        jbtnAloeGelYb.setBackground(new java.awt.Color(102, 255, 204));
        jbtnAloeGelYb.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnAloeGelYb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/GelAloeYb.png"))); // NOI18N
        jbtnAloeGelYb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAloeGelYb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAloeGelYbActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAloeGelYb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 160, 130));

        jbtnLiquidMakYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnLiquidMakYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnLiquidMakYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/MaquillajeLiqYuya.png"))); // NOI18N
        jbtnLiquidMakYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLiquidMakYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLiquidMakYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnLiquidMakYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 170, 130));

        jbtnLipMask.setBackground(new java.awt.Color(102, 255, 204));
        jbtnLipMask.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnLipMask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/ParcheLabiosYb.png"))); // NOI18N
        jbtnLipMask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLipMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLipMaskActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnLipMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 160, 130));

        jbtnLiquidLipYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnLiquidLipYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnLiquidLipYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/LabialLiqYuya.png"))); // NOI18N
        jbtnLiquidLipYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLiquidLipYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLiquidLipYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnLiquidLipYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 170, 130));

        jbtnVelvetYuya.setBackground(new java.awt.Color(102, 255, 204));
        jbtnVelvetYuya.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnVelvetYuya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/LabialVelYuya.png"))); // NOI18N
        jbtnVelvetYuya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnVelvetYuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVelvetYuyaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnVelvetYuya, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 160, 130));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS Images/Sakura blossom nb.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 700, 430));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Cantidad", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 0, 330, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//============================================Here we have a Function - Aquí tenemos una función, Costo del Item====================================================
//===============agregamos 4.0 de "impuestos" que es el precio que las terminales cobran a los negocios aquí en MX, en tu caso modificalo como te plazca============
    
    public void ItemCost()
    {
        double sum = 0;
        
        for (int i = 0; i < jTable1.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cTax = (cTotal1 * 4.0)/100;
        String iTaxTotal = String.format("MXN %.2f", cTax);
        jtxtTax.setText(iTaxTotal);
        
        String iSubTotal = String.format("MXN %.2f", cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format("MXN %.2f", cTotal1 + cTax);
        jtxtTotal.setText(iTotal);
        
        String BarCode = String.format("Total is %.2f", cTotal1 + cTax);
        jtxtBarCode.setText(BarCode);
    }
    
    //============================================Here we have another Function, the Change Function - Aquí tenemos la función del cambio====================================================
    
    public void Change()
    {
        double sum =0;
        double tax =0;
        double cash = Double.parseDouble(jtxtDisplay.getText());
        
         for (int i = 0; i < jTable1.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
         
        double cTax = (sum * 4.0)/100;
        double cChange = (cash - (sum + cTax));
        
        String ChangeGiven = String.format("MXN %.2f",cChange);
        jtxtChange.setText(ChangeGiven);
    }
    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn7.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn7.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jtxtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBarCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBarCodeActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn0.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn0.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn8.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn8.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn9.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn9.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn4.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn4.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn5.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn5.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn6.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn6.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn1.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn1.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn2.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn2.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
          
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn3.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn3.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn3ActionPerformed
//================================
    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        
        jtxtDisplay.setText("");
        jtxtChange.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        
        if(! jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnJellyMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnJellyMaskActionPerformed
        double PriceOfItem = 28;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Jelly Mask", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnJellyMaskActionPerformed

    private void jbtnSerumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSerumActionPerformed
        double PriceOfItem = 130;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Serum Yaab", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnSerumActionPerformed

    private void jbtnEyeMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEyeMaskActionPerformed
        double PriceOfItem = 20;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Parches Ojos", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnEyeMaskActionPerformed

    private void jbtnLipMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLipMaskActionPerformed
        double PriceOfItem = 25;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Parches Labios", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnLipMaskActionPerformed

    private void jbtnFixerYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFixerYuyaActionPerformed
        double PriceOfItem = 180;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Fijador Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnFixerYuyaActionPerformed

    private void jbtnLiquidCYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLiquidCYuyaActionPerformed
        double PriceOfItem = 120;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Color Liquido Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnLiquidCYuyaActionPerformed

    private void jbtnLiquidMakYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLiquidMakYuyaActionPerformed
        double PriceOfItem = 230;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Maquillaje Liquido Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnLiquidMakYuyaActionPerformed

    private void jbtnVelvetYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVelvetYuyaActionPerformed
        double PriceOfItem = 100;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Velvet Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnVelvetYuyaActionPerformed

    private void jbtnEyePrimerYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEyePrimerYuyaActionPerformed
        double PriceOfItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Primer Ojos Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnEyePrimerYuyaActionPerformed

    private void jbtnMultiUseInkYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiUseInkYuyaActionPerformed
        double PriceOfItem = 160;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Tinta Multi Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnMultiUseInkYuyaActionPerformed

    private void jbtnLiquidLipYuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLiquidLipYuyaActionPerformed
        double PriceOfItem = 115;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Labial Liquido Yuya", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnLiquidLipYuyaActionPerformed

    private void jbtnAloeGelYbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAloeGelYbActionPerformed
        double PriceOfItem = 59;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Gel Aloe Yaab", "1",PriceOfItem });
        ItemCost();
    }//GEN-LAST:event_jbtnAloeGelYbActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        if (jcboPayment.getSelectedItem().equals("Efectivo"))
        {
            Change();
        }
        else
        {
            jtxtChange.setText("");
            jtxtDisplay.setText("");
        }
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
        jtxtTotal.setText("");
        jtxtSubTotal.setText("");
        jtxtDisplay.setText("");
        jtxtBarCode.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        
        MessageFormat header = new MessageFormat("Impresión en progeso awanta");
        MessageFormat footer = new MessageFormat("Página {0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No se encontró Impresora wn", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if (RemoveItem >= 0)
        {
            model.removeRow(RemoveItem);
        }
        
        ItemCost();
        
        if (jcboPayment.getSelectedItem().equals("Efectivo"))
        {
            Change();
        }
        else
        {
            jtxtChange.setText("");
            jtxtDisplay.setText("");
        }
    }//GEN-LAST:event_jbtnRemoveActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        
        frame = new JFrame("Salir");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si deseas salir", "Punto de Venta Básico Sakura: Yeri Universe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(SakuraPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SakuraPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SakuraPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SakuraPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SakuraPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAloeGelYb;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnEyeMask;
    private javax.swing.JButton jbtnEyePrimerYuya;
    private javax.swing.JButton jbtnFillSpc;
    private javax.swing.JButton jbtnFixerYuya;
    private javax.swing.JButton jbtnJellyMask;
    private javax.swing.JButton jbtnLipMask;
    private javax.swing.JButton jbtnLiquidCYuya;
    private javax.swing.JButton jbtnLiquidLipYuya;
    private javax.swing.JButton jbtnLiquidMakYuya;
    private javax.swing.JButton jbtnMultiUseInkYuya;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSerum;
    private javax.swing.JButton jbtnVelvetYuya;
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
