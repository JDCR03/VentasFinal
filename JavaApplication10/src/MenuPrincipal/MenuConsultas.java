
package MenuPrincipal;

import consultas.ConsultarFacturas;
import consultas.ConsultarVentas;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;

/**
 *
 * @author JDCR03
 */
public class MenuConsultas extends javax.swing.JDialog {

    /**
     * Creates new form MenuConsultas
     */
    public MenuConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        RSAnimation.setSubir(500, 150, 10, 5, this);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFacturas = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Facturas y Ventas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel2.setText("Consultas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnVentas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 51, 51));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ventas42.png"))); // NOI18N
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Ventas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, -1));

        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Facturas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        btnFacturas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(0, 51, 51));
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/facturas42.png"))); // NOI18N
        btnFacturas.setBorder(null);
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/consultora.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
        ConsultarFacturas.main(null);
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        ConsultarVentas.main(null);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        try {        
            //Al dar clic subemos la ventana
            RSAnimation.setBajar(150, 650, 10, 5, this);
            //Damos un segundo de tiempo para cerrarla
            Thread.sleep(1000);
            //La cerramos
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(BaseDatosVendedores.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btnCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuConsultas dialog = new MenuConsultas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
