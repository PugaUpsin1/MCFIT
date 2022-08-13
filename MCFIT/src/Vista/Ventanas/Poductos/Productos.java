
package Vista.Ventanas.Poductos;

import Modelo.Conexion;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {
    JTable Prod;
    ResultSet rs;
    Container cont = this.getContentPane();
    public Productos() {
        initComponents();
        cont.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Productos");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        Prod= this.ProdT;
        Prod.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","PRODUCTO","DESCRIPCION","PV","PC","EXISTENCIA", "PROVEDOR"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectProductos();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idProducto"),rs.getString("tipoProducto"),rs.getString("descripcion"),rs.getDouble("precioVenta"),rs.getDouble("precioCompra"),rs.getInt("existencia"),rs.getInt("idProveedor")});
            }
        } catch (Exception e) {
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProdT = new javax.swing.JTable();
        btnAgg = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegre = new javax.swing.JButton();
        txtBus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblBuscarP = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setPreferredSize(new java.awt.Dimension(1301, 700));
        setResizable(false);

        ProdT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ProdT);

        btnAgg.setBackground(new java.awt.Color(242, 242, 242));
        btnAgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/nuevo.png"))); // NOI18N
        btnAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(242, 242, 242));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/usuario.png"))); // NOI18N

        btneli.setBackground(new java.awt.Color(242, 242, 242));
        btneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N

        btnRefresh.setBackground(new java.awt.Color(242, 242, 242));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(242, 242, 242));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/lupa.png"))); // NOI18N
        btnBuscar.setAutoscrolls(true);

        btnRegre.setBackground(new java.awt.Color(242, 242, 242));
        btnRegre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        lblBuscarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscarP.setText("Buscar: ");

        jMenu1.setText("Propiedades");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(lblBuscarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh)))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscarP))
                    .addComponent(btnBuscar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAgg)
                        .addGap(20, 20, 20)
                        .addComponent(btnEdit)
                        .addGap(20, 20, 20)
                        .addComponent(btneli)
                        .addGap(72, 72, 72)
                        .addComponent(btnRefresh))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegreActionPerformed

    private void btnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggActionPerformed
        NuevoProducto prod = new NuevoProducto();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggActionPerformed


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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable ProdT;
    javax.swing.JButton btnAgg;
    javax.swing.JButton btnBuscar;
    javax.swing.JButton btnEdit;
    javax.swing.JButton btnRefresh;
    javax.swing.JButton btnRegre;
    javax.swing.JButton btneli;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel lblBuscarP;
    javax.swing.JTextField txtBus;
    // End of variables declaration//GEN-END:variables
}
