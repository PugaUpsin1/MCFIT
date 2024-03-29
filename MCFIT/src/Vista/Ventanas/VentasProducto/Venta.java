
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
                dfm.addRow(new Object[]{rs.getInt("idPagoPr"),rs.getDouble("totalVenta"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getString("metodoPago"),rs.getInt("idEmpleado"),rs.getInt("idCliente")});
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
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefreshV)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnRefreshV)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        //this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_btnRegresarVActionPerformed

    private void btnRefreshVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshVActionPerformed
        DefaultTableModel dfm = new DefaultTableModel();
        Vent= this.tablaVentas;
        Vent.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","TOTAL VENTA","FECHA PAGO","HORA","METODO PAGO", "IDEMPLEADO","IDCLIENTE"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectVentas();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idPagoPr"),rs.getDouble("totalVenta"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getString("metodoPago"),rs.getInt("idEmpleado"),rs.getInt("idCliente")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
    }//GEN-LAST:event_btnRefreshVActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Detalle_prod DetaVent = new Detalle_prod();
        DetaVent.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnBuscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVActionPerformed
        Conexion cn = new Conexion();
        String FechaPago = this.txtBuscarV.getText();
               
        DefaultTableModel dfm = new DefaultTableModel();
        Vent = this.Vent;
        Vent.setModel(dfm);
        
       
        dfm.setColumnIdentifiers(new Object[]{"ID","TOTAL VENTA","FECHA PAGO","HORA","METODO PAGO", "IDEMPLEADO","IDCLIENTE"});
        
        rs = cn.BuscarVenta(FechaPago);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idPagoPr"),rs.getDouble("totalVenta"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getString("metodoPago"),rs.getInt("idEmpleado"),rs.getInt("idCliente")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró la compra o no esta registrado");
        }
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
