/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1.practica2_202201185;

import static ipc1.practica2_202201185.Inicio.distancia;
import static ipc1.practica2_202201185.Inicio.vehiculo;


/**
 *
 * @author andre
 */
public class verRecorrido extends javax.swing.JFrame {

    public static int d1 = 0;
    public static int d2 = 0;
    public static int d3 = 0;

    /**
     * Creates new form verRecorrido
     */
    public verRecorrido() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destinoLbl = new javax.swing.JLabel();
        vehiculo2Lbl = new javax.swing.JLabel();
        vehiculo3Lbl = new javax.swing.JLabel();
        vehiculo1Lbl = new javax.swing.JLabel();
        EnviarPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        destinoLbl.setBackground(new java.awt.Color(51, 204, 0));
        destinoLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        destinoLbl.setForeground(new java.awt.Color(0, 0, 0));
        destinoLbl.setOpaque(true);

        vehiculo2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ida.jpg"))); // NOI18N
        vehiculo2Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiculo2LblMouseClicked(evt);
            }
        });

        vehiculo3Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ida.jpg"))); // NOI18N
        vehiculo3Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiculo3LblMouseClicked(evt);
            }
        });

        vehiculo1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ida.jpg"))); // NOI18N
        vehiculo1Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiculo1LblMouseClicked(evt);
            }
        });

        EnviarPedidos.setText("Enviar");
        EnviarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiculo1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiculo3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiculo2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 799, Short.MAX_VALUE)
                .addComponent(destinoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnviarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(489, 489, 489))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(vehiculo1Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(vehiculo2Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(vehiculo3Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(destinoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(EnviarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehiculo1LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculo1LblMouseClicked
        // TODO add your handling code here
        recorrido pedidoConfirmado1 = new recorrido(vehiculo1Lbl, d1);
        pedidoConfirmado1.start();
    }//GEN-LAST:event_vehiculo1LblMouseClicked

    private void vehiculo2LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculo2LblMouseClicked
        // TODO add your handling code here:
        recorrido pedidoConfirmado2 = new recorrido(vehiculo2Lbl, d2);
        pedidoConfirmado2.start();
    }//GEN-LAST:event_vehiculo2LblMouseClicked

    private void vehiculo3LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculo3LblMouseClicked
        // TODO add your handling code here:
        recorrido pedidoConfirmado3 = new recorrido(vehiculo3Lbl, d3);
        pedidoConfirmado3.start();
    }//GEN-LAST:event_vehiculo3LblMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio open = new Inicio();
        open.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void EnviarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarPedidosActionPerformed
        // TODO add your handling code here:
        recorrido pedidoConfirmado1 = new recorrido(vehiculo1Lbl, d1);
        pedidoConfirmado1.start();
        recorrido pedidoConfirmado2 = new recorrido(vehiculo2Lbl, d2);
        pedidoConfirmado2.start();
        recorrido pedidoConfirmado3 = new recorrido(vehiculo3Lbl, d3);
        pedidoConfirmado3.start();
    }//GEN-LAST:event_EnviarPedidosActionPerformed

    public static void establecerDistancia(){
        if (vehiculo == 0) {
            d1 = distancia;
        } else if (vehiculo == 1) {
            d2 = distancia;
        } else if (vehiculo == 2) {
            d3 = distancia;
        }
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
            java.util.logging.Logger.getLogger(verRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verRecorrido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarPedidos;
    public static javax.swing.JLabel destinoLbl;
    public static javax.swing.JLabel vehiculo1Lbl;
    public static javax.swing.JLabel vehiculo2Lbl;
    public static javax.swing.JLabel vehiculo3Lbl;
    // End of variables declaration//GEN-END:variables
}
