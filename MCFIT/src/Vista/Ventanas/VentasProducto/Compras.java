
package Vista.Ventanas.VentasProducto;
import Modelo.Conexion;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {
    JTable Comp;
    ResultSet rs;
    Container cont = this.getContentPane();
    
    public Compras() {
        initComponents();
        cont.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Compras");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        Comp= this.tablaCompras;
        Comp.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","TOTAL COMPRA","HORA","FECHA COMPRA","METODO PAGO", "IDEMPLEADO"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectCompras();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idCompra"),rs.getFloat("totalCompra"),rs.getString("hora"),rs.getString("fechaCompra"),rs.getString("metodoPago"),rs.getInt("idEmpleado")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnRegresarC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        btnBuscarC = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnEditarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnRefreshC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compras");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        btnRegresarC.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCompras);

        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/lupa.png"))); // NOI18N
        btnBuscarC.setAutoscrolls(true);
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        btnCompras.setBackground(new java.awt.Color(242, 242, 242));
        btnCompras.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/verificar (1).png"))); // NOI18N
        btnCompras.setText("Detalle Compras");
        btnCompras.setActionCommand("  Ventas");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnEditarC.setBackground(new java.awt.Color(242, 242, 242));
        btnEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/usuario.png"))); // NOI18N

        btnEliminarC.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N

        btnRefreshC.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefreshC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarC)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarC))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresarC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215)))))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCompras)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarC)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresarC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefreshC)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarCActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarCActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        Conexion cn = new Conexion();
        String FechaCompra = this.txtBuscarC.getText();
               
        DefaultTableModel dfm = new DefaultTableModel();
        Comp = this.tablaCompras;
        Comp.setModel(dfm);
        
       
        dfm.setColumnIdentifiers(new Object[]{"ID","TOTAL COMPRA","HORA","FECHA COMPRA","METODO PAGO", "IDEMPLEADO"});
        
        rs = cn.BuscarCompra(FechaCompra);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idCompra"),rs.getDouble("totalCompra"),rs.getString("hora"),rs.getString("fechaCompra"),rs.getString("metodoPago"),rs.getInt("idEmpleado")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró la compra o no esta registrado");
        }
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        Detalle_compras DetaComp = new Detalle_compras();
        DetaComp.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnRefreshCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshCActionPerformed

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEditarC;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnRefreshC;
    private javax.swing.JButton btnRegresarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCompras;
    private javax.swing.JTextField txtBuscarC;
    // End of variables declaration//GEN-END:variables
}
