
// pago del producto en bd es Pago_prod
package Vista.Ventanas.VentasProducto;

import Modelo.Conexion;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Venta extends javax.swing.JFrame {
    JTable Vent;
    ResultSet rs;
    Container cont = this.getContentPane();
   
    public Venta() {
        initComponents();
        cont.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Ventas");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        Vent= this.tablaVentas;
        Vent.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","TOTAL VENTA","FECHA PAGO","HORA","METODO PAGO", "IDEMPLEADO","IDCLIENTE"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectVentas();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idPagoPr"),rs.getFloat("totalVenta"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getString("metodoPago"),rs.getInt("idEmpleado"),rs.getInt("idCliente")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnRegresarV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        txtBuscarV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarV = new javax.swing.JButton();
        btnNuevoV = new javax.swing.JButton();
        btnEditarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();
        btnRefreshV = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        btnRegresarV.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVActionPerformed(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        btnBuscarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/lupa.png"))); // NOI18N
        btnBuscarV.setAutoscrolls(true);
        btnBuscarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVActionPerformed(evt);
            }
        });

        btnNuevoV.setBackground(new java.awt.Color(242, 242, 242));
        btnNuevoV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/nuevo.png"))); // NOI18N
        btnNuevoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVActionPerformed(evt);
            }
        });

        btnEditarV.setBackground(new java.awt.Color(242, 242, 242));
        btnEditarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/usuario.png"))); // NOI18N

        btnEliminarV.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N

        btnRefreshV.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshVActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(242, 242, 242));
        btnVentas.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/verificar (1).png"))); // NOI18N
        btnVentas.setText("Detalle Ventas");
        btnVentas.setActionCommand("  Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnRefreshV)
                            .addGap(343, 343, 343)
                            .addComponent(btnEliminarV)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEditarV)
                            .addGap(18, 18, 18)
                            .addComponent(btnNuevoV))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnVentas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarV)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEliminarV)
                        .addComponent(btnEditarV)
                        .addComponent(btnRefreshV, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarVActionPerformed

    private void btnNuevoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVActionPerformed
        
        //  this.setVisible(false);
    }//GEN-LAST:event_btnNuevoVActionPerformed

    private void btnRefreshVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshVActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Detalle_prod DetaVent = new Detalle_prod();
        DetaVent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnBuscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarVActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarV;
    private javax.swing.JButton btnEditarV;
    private javax.swing.JButton btnEliminarV;
    private javax.swing.JButton btnNuevoV;
    private javax.swing.JButton btnRefreshV;
    private javax.swing.JButton btnRegresarV;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtBuscarV;
    // End of variables declaration//GEN-END:variables
}
