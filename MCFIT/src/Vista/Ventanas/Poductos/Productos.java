
package Vista.Ventanas.Poductos;

import Modelo.Conexion;
import Modelo.sqlUsuarios;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {
    public String codigo;
    public int fila;
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
        btnProveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setPreferredSize(new java.awt.Dimension(1301, 700));
        setResizable(false);

        ProdT = new JTable()
        {
            public boolean isCellEditable(int row,int column)
            {
                for(int i=0;i<ProdT.getRowCount();i++)
                {
                    if(row == i)
                    {
                        return false;
                    }
                }
                return true;
            }
        };
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
        ProdT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdTMouseClicked(evt);
            }
        });
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
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btneli.setBackground(new java.awt.Color(242, 242, 242));
        btneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(lblBuscarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneli))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnRefresh)))))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscarP))
                    .addComponent(btnBuscar)
                    .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnAgg)
                        .addGap(20, 20, 20)
                        .addComponent(btnEdit)
                        .addGap(20, 20, 20)
                        .addComponent(btneli)
                        .addGap(72, 72, 72)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
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
        
        this.txtBus.setText("");
        
        
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegreActionPerformed

    private void btnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggActionPerformed
        NuevoProducto prod = new NuevoProducto();
        prod.setVisible(true);
   //   this.setVisible();
    }//GEN-LAST:event_btnAggActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
        Conexion cn = new Conexion();
        String TipoProducto = this.txtBus.getText();
        
               
        DefaultTableModel dfm = new DefaultTableModel();
        Prod= this.ProdT;
        Prod.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","PRODUCTO","DESCRIPCION","PV","PC","EXISTENCIA", "PROVEDOR"});
        
        
        rs = cn.BuscarProductos(TipoProducto);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idProducto"),rs.getString("tipoProducto"),rs.getString("descripcion"),rs.getDouble("precioVenta"),rs.getDouble("precioCompra"),rs.getInt("existencia"),rs.getInt("idProveedor")});
            }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ProdTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTMouseClicked


    }//GEN-LAST:event_ProdTMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       PreparedStatement ps = null;
         ResultSet rs= null;
         VerProducto vPro = new VerProducto();
         
          try {
              Conexion objCon= new Conexion();
              Connection con = objCon.Conectar();
              
              int fila = ProdT.getSelectedRow();
              String idProducto = ProdT.getValueAt(fila, 0).toString();
              
              ps=con.prepareStatement("SELECT idProducto,tipoProducto,descripcion,precioVenta,precioCompra, existencia, foto, idProveedor FROM Productos WHERE idProducto= ?");
              ps.setString(1, idProducto);
              rs = ps.executeQuery();
              
              while(rs.next()){
                  
                  
                  VerProducto.txtIdProducto.setText(rs.getString("idProducto"));
                  VerProducto.txtTipoProducto.setText(rs.getString("tipoProducto"));
                  VerProducto.txtdescripcion.setText(rs.getString("descripcion"));
                  VerProducto.txtPrecioVenta.setText(rs.getString("precioVenta"));
                  VerProducto.txtPrecioCompra.setText(rs.getString("precioCompra"));
                  VerProducto.txtExistencia.setText(rs.getString("existencia"));
                  VerProducto.txtFotoProd.setText(rs.getString("foto"));
                  VerProducto.txtIdProveedor.setText(rs.getString("idProveedor"));
                  vPro.setVisible(true);
              }
              
          } catch (SQLException e) {
          }
                 
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed

    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
               PreparedStatement ps = null;
         ResultSet rs= null;
         VerProducto vPro = new VerProducto();
         
          try {
              Conexion objCon= new Conexion();
              Connection con = objCon.Conectar();
              
              int fila = ProdT.getSelectedRow();
              String idProducto = ProdT.getValueAt(fila, 0).toString();
              
              ps=con.prepareStatement("DELETE FROM Productos WHERE idProducto = ?;");
              ps.setString(1, idProducto);
              ps.toString();
              System.out.println(ps);
              ps.executeUpdate();
              
              
    
              
          } catch (SQLException e) {
              Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, e);
          } 
    }//GEN-LAST:event_btneliActionPerformed



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
    javax.swing.JButton btnProveedores;
    javax.swing.JButton btnRefresh;
    javax.swing.JButton btnRegre;
    javax.swing.JButton btneli;
    javax.swing.JLabel jLabel2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel lblBuscarP;
    javax.swing.JTextField txtBus;
    // End of variables declaration//GEN-END:variables
}
