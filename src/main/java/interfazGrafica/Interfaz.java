/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

import PeticionApi.PeticionApi;
import apiCarbon.Api;
import java.text.DecimalFormat;

/**
 *
 * @author eli
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();

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
        botonReset = new javax.swing.JButton();
        botonStart = new javax.swing.JButton();
        textoURL = new javax.swing.JTextField();
        jPanelResultado = new javax.swing.JPanel();
        labelPaginaResultado = new javax.swing.JLabel();
        webResultado = new javax.swing.JLabel();
        textoGramosCo2 = new javax.swing.JLabel();
        co2 = new javax.swing.JLabel();
        textobytes = new javax.swing.JLabel();
        bytes = new javax.swing.JLabel();
        textoenergia = new javax.swing.JLabel();
        energy = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        textoBooleanEcologico = new javax.swing.JLabel();
        IconEcologico = new javax.swing.JLabel();
        IconCo2 = new javax.swing.JLabel();
        IconBytes = new javax.swing.JLabel();
        IconTierra = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        panelCiudad = new javax.swing.JPanel();
        labelSabiasQue = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonReset.setBackground(new java.awt.Color(246, 131, 48));
        botonReset.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        botonReset.setForeground(new java.awt.Color(255, 255, 255));
        botonReset.setText("Reset");
        botonReset.setBorder(null);
        botonReset.setBorderPainted(false);
        botonReset.setDefaultCapable(false);
        botonReset.setFocusPainted(false);
        botonReset.setFocusable(false);
        botonReset.setRequestFocusEnabled(false);
        botonReset.setRolloverEnabled(false);
        botonReset.setVerifyInputWhenFocusTarget(false);
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });
        jPanel2.add(botonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 260, 50));

        botonStart.setBackground(new java.awt.Color(246, 131, 48));
        botonStart.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        botonStart.setForeground(new java.awt.Color(255, 255, 255));
        botonStart.setText("Start");
        botonStart.setBorder(null);
        botonStart.setBorderPainted(false);
        botonStart.setDefaultCapable(false);
        botonStart.setFocusPainted(false);
        botonStart.setFocusable(false);
        botonStart.setRequestFocusEnabled(false);
        botonStart.setRolloverEnabled(false);
        botonStart.setVerifyInputWhenFocusTarget(false);
        botonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStartActionPerformed(evt);
            }
        });
        jPanel2.add(botonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 260, 50));

        textoURL.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textoURL.setForeground(new java.awt.Color(102, 102, 102));
        textoURL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoURL.setText("www.");
        textoURL.setBorder(null);
        textoURL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textoURL.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        textoURL.setDragEnabled(true);
        textoURL.setMargin(new java.awt.Insets(6, 6, 6, 6));
        textoURL.setSelectionColor(new java.awt.Color(255, 255, 255));
        textoURL.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(textoURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 560, 40));

        jPanelResultado.setEnabled(false);
        jPanelResultado.setOpaque(false);
        jPanelResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPaginaResultado.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        labelPaginaResultado.setForeground(new java.awt.Color(255, 102, 0));
        labelPaginaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPaginaResultado.setText("PÁGINA CONSULTADA");
        jPanelResultado.add(labelPaginaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 347, 32));

        webResultado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        webResultado.setForeground(new java.awt.Color(255, 255, 255));
        webResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        webResultado.setText("www.mardealboran.eu");
        jPanelResultado.add(webResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 707, 347, 32));

        textoGramosCo2.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        textoGramosCo2.setForeground(new java.awt.Color(255, 255, 255));
        textoGramosCo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoGramosCo2.setText("gramos de Co2");
        jPanelResultado.add(textoGramosCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 185, 20));

        co2.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        co2.setForeground(new java.awt.Color(255, 102, 0));
        co2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        co2.setText("1235698563");
        jPanelResultado.add(co2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 185, 29));

        textobytes.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        textobytes.setForeground(new java.awt.Color(255, 255, 255));
        textobytes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobytes.setText("bytes transferidos");
        jPanelResultado.add(textobytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 185, 17));

        bytes.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        bytes.setForeground(new java.awt.Color(255, 102, 0));
        bytes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bytes.setText("1235698563");
        jPanelResultado.add(bytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 185, 29));

        textoenergia.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        textoenergia.setForeground(new java.awt.Color(255, 255, 255));
        textoenergia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoenergia.setText("energía necesaria");
        jPanelResultado.add(textoenergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 185, 20));

        energy.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        energy.setForeground(new java.awt.Color(255, 102, 0));
        energy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        energy.setText("1235698563");
        jPanelResultado.add(energy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 185, 29));

        green.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        green.setForeground(new java.awt.Color(255, 102, 0));
        green.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        green.setText("ecológico");
        jPanelResultado.add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 185, 29));

        textoBooleanEcologico.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 15)); // NOI18N
        textoBooleanEcologico.setForeground(new java.awt.Color(255, 255, 255));
        textoBooleanEcologico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBooleanEcologico.setText("host sostenible");
        jPanelResultado.add(textoBooleanEcologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 185, 17));

        IconEcologico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/byte.png"))); // NOI18N
        jPanelResultado.add(IconEcologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 120, 130));

        IconCo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/co2.png"))); // NOI18N
        IconCo2.setRequestFocusEnabled(false);
        jPanelResultado.add(IconCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 130));

        IconBytes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/electricidad.png"))); // NOI18N
        jPanelResultado.add(IconBytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, 130));

        IconTierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plantea.png"))); // NOI18N
        jPanelResultado.add(IconTierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, 130));

        labelCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ciudad.png"))); // NOI18N
        labelCiudad.setText("jLabel8");
        jPanelResultado.add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, 0, -1, 770));

        labelError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gato.png"))); // NOI18N
        labelError.setVisible(false);
        jPanelResultado.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 530, 670));

        panelCiudad.setOpaque(false);

        javax.swing.GroupLayout panelCiudadLayout = new javax.swing.GroupLayout(panelCiudad);
        panelCiudad.setLayout(panelCiudadLayout);
        panelCiudadLayout.setHorizontalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        panelCiudadLayout.setVerticalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jPanelResultado.add(panelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1350, 0, -1, -1));

        labelSabiasQue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabiasque.png"))); // NOI18N
        jPanelResultado.add(labelSabiasQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(-680, 0, 1370, 770));

        labelPaginaResultado.setVisible(false);
        labelSabiasQue.setVisible(false);
        webResultado.setVisible(false);
        textoGramosCo2.setVisible(false);
        co2.setVisible(false);
        textobytes.setVisible(false);
        bytes.setVisible(false);
        textoenergia.setVisible(false);
        energy.setVisible(false);
        green.setVisible(false);
        textoBooleanEcologico.setVisible(false);
        IconEcologico.setVisible(false);
        IconCo2.setVisible(false);
        IconBytes.setVisible(false);
        IconTierra.setVisible(false);

        jPanel2.add(jPanelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 690, 770));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jPanel2.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStartActionPerformed

        //Instancio un objeto Api donde llama a la clase
        Api respuesta = PeticionApi.peticionDatoUrl(textoURL.getText());
//        jLabel8.setVisible(false);

        if (respuesta != null) {

            co2.setText("%.5f".formatted(respuesta.getStatistics().getCo2().getGrid().getGrams()));

            bytes.setText(respuesta.getBytes().toString());

            energy.setText("%.5f".formatted(respuesta.getStatistics().getEnergy()));
            
            green.setText(respuesta.getGreen().toString().equalsIgnoreCase("true") ? "Es ecológico" : "No es ecológico");
            
            
            
            webResultado.setText(textoURL.getText());
            
            //Mostramos los paneles de resultado
            mostrarPanelesResultado(true);
          
          
        }else{
        
            labelError.setVisible(true);
            mostrarPanelesResultado(false);
            labelCiudad.setVisible(false);
        
        }

    }//GEN-LAST:event_botonStartActionPerformed

    private String [] frase(double co2){
        String [] listaFrase = new String [3];
        double kg = co2*120;
        double sumo = kg/150;
        double te = kg/0.0073800940707;
        
        listaFrase[0]="%.0f".formatted(kg);
        listaFrase[1]="%.2f".formatted(sumo);
        listaFrase[2]="%.0f".formatted(te);
        
        return listaFrase;
    
    }
    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        
        //Pone todos los paneles resultado en oculto
        //Muestra el panel ciudad
        mostrarPanelesResultado(false);
        labelError.setVisible(false);
        //TextArea de resultado a null
        textoURL.setText("www.");
        
        
        
    }//GEN-LAST:event_botonResetActionPerformed

  
    
    private void mostrarPanelesResultado(Boolean mostrar){
        //Invisible el jLabel, siempre al contrario
           labelCiudad.setVisible(!mostrar);
         //Label error no debe mostrarse
         labelError.setVisible(!mostrar);
           //Paneles de resultado
           labelPaginaResultado.setVisible(mostrar);
           labelSabiasQue.setVisible(mostrar);
         webResultado.setVisible(mostrar);
            textoGramosCo2.setVisible(mostrar);
            co2.setVisible(mostrar);
            textobytes.setVisible(mostrar);
            bytes.setVisible(mostrar);
            textoenergia.setVisible(mostrar);
            energy.setVisible(mostrar);
            green.setVisible(mostrar);
            textoBooleanEcologico.setVisible(mostrar);
            IconEcologico.setVisible(mostrar);
            IconCo2.setVisible(mostrar);
            IconBytes.setVisible(mostrar);
            IconTierra.setVisible(mostrar);
    
    
    }
    
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
    private javax.swing.JLabel IconBytes;
    private javax.swing.JLabel IconCo2;
    private javax.swing.JLabel IconEcologico;
    private javax.swing.JLabel IconTierra;
    private javax.swing.JButton botonReset;
    private javax.swing.JButton botonStart;
    private javax.swing.JLabel bytes;
    private javax.swing.JLabel co2;
    private javax.swing.JLabel energy;
    private javax.swing.JLabel green;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelPaginaResultado;
    private javax.swing.JLabel labelSabiasQue;
    private javax.swing.JPanel panelCiudad;
    private javax.swing.JLabel textoBooleanEcologico;
    private javax.swing.JLabel textoGramosCo2;
    private javax.swing.JTextField textoURL;
    private javax.swing.JLabel textobytes;
    private javax.swing.JLabel textoenergia;
    private javax.swing.JLabel webResultado;
    // End of variables declaration//GEN-END:variables

}
