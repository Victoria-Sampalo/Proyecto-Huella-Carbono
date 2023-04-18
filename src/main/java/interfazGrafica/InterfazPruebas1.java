/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;


/**
 *
 * @author eli
 */
public class Interfaz extends javax.swing.JFrame {

    private String co2String;
    private String bytesString; 
    private String energyString;
    private Boolean ecologico;
    private String urlBase;
    
    
    public Interfaz() {
        initComponents();
        this.urlBase="";
        this.co2String="";
        this.bytesString="";
        this.energyString="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonStart = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanelResultado = new javax.swing.JPanel();
        webResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        co2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bytes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        energy = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonStart.setBackground(new java.awt.Color(232, 116, 26));
        botonStart.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        botonStart.setForeground(new java.awt.Color(255, 255, 255));
        botonStart.setText("Start");
        botonStart.setBorder(null);
        botonStart.setBorderPainted(false);
        botonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStartActionPerformed(evt);
            }
        });
        jPanel2.add(botonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 200, 60));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("  http://www...");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextField1.setDragEnabled(true);
        jTextField1.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jTextField1.setOpaque(true);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 530, 40));

        jPanelResultado.setOpaque(false);

        webResultado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        webResultado.setForeground(new java.awt.Color(255, 255, 255));
        webResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        webResultado.setText("www.mardealboran.eu");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("cantidad de Co2");

        co2.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        co2.setForeground(new java.awt.Color(255, 102, 0));
        co2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        co2.setText("1235698563");

        jLabel9.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("bytes transferidos");

        bytes.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        bytes.setForeground(new java.awt.Color(255, 102, 0));
        bytes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bytes.setText("1235698563");

        jLabel11.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("energía necesaria");

        energy.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        energy.setForeground(new java.awt.Color(255, 102, 0));
        energy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        energy.setText("1235698563");

        green.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        green.setForeground(new java.awt.Color(255, 102, 0));
        green.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        green.setText("ecológico");

        jLabel14.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("host sostenible");

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bytes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(co2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energy, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(107, 107, 107))
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(webResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addComponent(co2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addComponent(bytes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(201, 201, 201)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addComponent(energy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(webResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel2.add(jPanelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 690, 770));

        fondo.setAlignmentY(0.0F);
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStartActionPerformed

        
        
    }//GEN-LAST:event_botonStartActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonStart;
    private javax.swing.JLabel bytes;
    private javax.swing.JLabel co2;
    private javax.swing.JLabel energy;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel green;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel webResultado;
    // End of variables declaration//GEN-END:variables
}

