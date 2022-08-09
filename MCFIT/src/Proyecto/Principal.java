
package Proyecto;

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
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JButton();
        btnNuevo3 = new javax.swing.JButton();
        btnNuevo4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenuItem();
        menuMembresias = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenuItem();
        menuHistorial = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Icons/Imagen 3.png"))); // NOI18N

        btnCompras.setBackground(new java.awt.Color(252, 207, 22));
        btnCompras.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnCompras.setText("COMPRAS");
        btnCompras.setBorderPainted(false);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnNuevo3.setBackground(new java.awt.Color(252, 207, 22));
        btnNuevo3.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnNuevo3.setText("PAGO PRODUCTO");
        btnNuevo3.setBorderPainted(false);
        btnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo3ActionPerformed(evt);
            }
        });

        btnNuevo4.setBackground(new java.awt.Color(252, 207, 22));
        btnNuevo4.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnNuevo4.setText("PAGO MEMBRESÍA");
        btnNuevo4.setBorderPainted(false);
        btnNuevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo4ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu2.setText("MCFIT");

        menuClientes.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuClientes.setText("Clientes");
        jMenu2.add(menuClientes);

        menuProductos.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuProductos.setText("Productos");
        jMenu2.add(menuProductos);

        menuMembresias.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuMembresias.setText("Membresías");
        menuMembresias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMembresiasActionPerformed(evt);
            }
        });
        jMenu2.add(menuMembresias);

        menuProveedores.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuProveedores.setText("Proveedores");
        jMenu2.add(menuProveedores);

        menuEmpleados.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuEmpleados.setText("Empleados");
        jMenu2.add(menuEmpleados);

        menuHistorial.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N
        menuHistorial.setText("Historial");
        menuHistorial.setToolTipText("");
        jMenu2.add(menuHistorial);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(jTabbedPane1)
                .addGap(805, 805, 805)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMembresiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMembresiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMembresiasActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo3ActionPerformed

    private void btnNuevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo4ActionPerformed


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
    javax.swing.JButton btnCompras;
    javax.swing.JButton btnNuevo3;
    javax.swing.JButton btnNuevo4;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuBar jMenuBar2;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JMenuItem menuClientes;
    javax.swing.JMenuItem menuEmpleados;
    javax.swing.JMenuItem menuHistorial;
    javax.swing.JMenuItem menuMembresias;
    javax.swing.JMenuItem menuProductos;
    javax.swing.JMenuItem menuProveedores;
    // End of variables declaration//GEN-END:variables
}
