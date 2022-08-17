
package Vista.Ventanas.Principal;

import Vista.Ventanas.Poductos.Productos;
import Vista.Ventanas.Clientes.Clientes;
import Vista.Ventanas.VentasProducto.Venta;
import Vista.Ventanas.VentasProducto.Compras;
import Vista.Ventanas.Membresias.Membresias;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    Container cont = this.getContentPane();
 
    public Principal() {
        initComponents();
        cont.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("MCFIT");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnMembresia = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnconf = new javax.swing.JButton();
        btnVentas1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1301, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, 83));

        btnProductos.setBackground(new java.awt.Color(242, 242, 242));
        btnProductos.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/proteina.png"))); // NOI18N
        btnProductos.setText("  Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 201, 230, 100));

        btnMembresia.setBackground(new java.awt.Color(242, 242, 242));
        btnMembresia.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnMembresia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/tarjeta-de-membresia 2.png"))); // NOI18N
        btnMembresia.setText("Membresías");
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 311, 230, 100));

        btnCompras.setBackground(new java.awt.Color(242, 242, 242));
        btnCompras.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/DetalleCompra.png"))); // NOI18N
        btnCompras.setText("    Compras");
        btnCompras.setActionCommand("  Ventas");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 230, 100));

        btnClientes1.setBackground(new java.awt.Color(242, 242, 242));
        btnClientes1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Clientes.png"))); // NOI18N
        btnClientes1.setText("Clientes");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 201, 230, 100));

        btnconf.setBackground(new java.awt.Color(242, 242, 242));
        btnconf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/configuraciones.png"))); // NOI18N
        btnconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfActionPerformed(evt);
            }
        });
        getContentPane().add(btnconf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 30));

        btnVentas1.setBackground(new java.awt.Color(242, 242, 242));
        btnVentas1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/DetalleVentas.png"))); // NOI18N
        btnVentas1.setText("    Ventas");
        btnVentas1.setActionCommand("  Ventas");
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 311, 230, 100));

        jMenu4.setText("Propiedades");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos Prod = new Productos();
        Prod.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        Membresias Membre = new Membresias();
        Membre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        Compras comp = new Compras();
        comp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        // TODO add your handling code here:
        Clientes Clien = new Clientes();
        Clien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfActionPerformed
        Configuracion Conf = new Configuracion();
        Conf.setVisible(true);
    }//GEN-LAST:event_btnconfActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        // TODO add your handling code here:
        Venta vent = new Venta();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVentas1ActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnClientes1;
    javax.swing.JButton btnCompras;
    javax.swing.JButton btnMembresia;
    javax.swing.JButton btnProductos;
    javax.swing.JButton btnVentas1;
    javax.swing.JButton btnconf;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
