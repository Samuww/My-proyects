/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;

/**
 *
 * @author LABPC02-17
 */
public class Reglas extends javax.swing.JFrame {

    /**
     * Creates new form Reglas
     */
    public Reglas() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl1, "src/ImagenesJuego/wild.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl2, "src/ImagenesJuego/pajaro.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl10, "src/ImagenesJuego/tigre.png");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblJuegar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("REGLAS DE JUEGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lbl4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl4.setText("Multiplica la ganancia");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 150, 40));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 110));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, 110));
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 110, 110));

        lbl5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl5.setText("     3 = 1 giro");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 40));

        lbl6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl6.setText("    Completa un par o mas");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, 40));

        lblJuegar.setBackground(new java.awt.Color(255, 255, 204));
        lblJuegar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblJuegar.setText("JUGAR");
        lblJuegar.setOpaque(true);
        lblJuegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJuegarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJuegarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJuegarMouseExited(evt);
            }
        });
        jPanel1.add(lblJuegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblJuegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuegarMouseClicked
        fmr_JuegoDos prin = new fmr_JuegoDos();
        if(prin.isVisible() == true){
            this.setVisible(false);
            
        }else{
            this.setVisible(false);
            prin.setVisible(true);
        }

    }//GEN-LAST:event_lblJuegarMouseClicked

    private void lblJuegarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuegarMouseEntered
        lblJuegar.setBackground(new Color(255,212 ,66 ));
    }//GEN-LAST:event_lblJuegarMouseEntered

    private void lblJuegarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuegarMouseExited
        lblJuegar.setBackground(new Color(255,255 ,204 ));
    }//GEN-LAST:event_lblJuegarMouseExited

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
            java.util.logging.Logger.getLogger(Reglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reglas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lblJuegar;
    // End of variables declaration//GEN-END:variables
}
