/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.edvin_reyes;

import com.gt.modo_oscuro.Pintor;
import com.gt.modo_oscuro.PintorBT;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        (new Pintor(Color.WHITE)).pintar(rootPanel);
//        oscuro(rootPanel, new Color (30,30,30));
        (new PintorBT(Color.CYAN)).pintar(botonPanel);
    }

//    public void oscuro(JPanel  contenedor, Color color) {
//
//        for (Component panel : contenedor.getComponents()) {
//            
//            if (panel.getClass() == JPanel.class) {
//              panel.setBackground(color);  
//            }
//            
//            if (panel.getClass() == JPanel.class) {
//                oscuro((JPanel) panel,color);
//            }
//        }
//        
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        downPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        passPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        botonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setLayout(new java.awt.BorderLayout());

        upPanel.setPreferredSize(new java.awt.Dimension(0, 100));

        jToggleButton1.setText("Modo Negro");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upPanelLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        rootPanel.add(upPanel, java.awt.BorderLayout.PAGE_START);

        downPanel.setLayout(new java.awt.BorderLayout());

        loginPanel.setPreferredSize(new java.awt.Dimension(0, 200));
        loginPanel.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        userPanel.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jLabel1.setText("Usuario");
        userPanel.add(jLabel1);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        userPanel.add(jTextField1);

        loginPanel.add(userPanel);

        passPanel.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jLabel2.setText("Contraseña");
        passPanel.add(jLabel2);

        jPasswordField1.setText("jPasswordField1");
        passPanel.add(jPasswordField1);

        loginPanel.add(passPanel);

        botonPanel.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        jButton1.setText("Salir");
        botonPanel.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check.png"))); // NOI18N
        jButton2.setText("Ingresar");
        botonPanel.add(jButton2);

        loginPanel.add(botonPanel);

        downPanel.add(loginPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        downPanel.add(infoPanel, java.awt.BorderLayout.PAGE_END);

        rootPanel.add(downPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(rootPanel, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
       
        if (jToggleButton1.isSelected()) {
        //hemos cambiado la función por un servicio 
//            oscuro(rootPanel,Color.CYAN);
              (new Pintor (Color.DARK_GRAY)).pintar(rootPanel);
              (new PintorBT(Color.MAGENTA)).pintar(botonPanel);
        
        }else {
            
//            oscuro(rootPanel,Color.DARK_GRAY);
              (new Pintor (Color.WHITE)).pintar(rootPanel);
              (new PintorBT(Color.GREEN)).pintar(botonPanel);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonPanel;
    private javax.swing.JPanel downPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JPanel upPanel;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
