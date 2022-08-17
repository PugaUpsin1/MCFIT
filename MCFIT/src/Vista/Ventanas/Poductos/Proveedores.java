/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Ventanas.Poductos;

import com.mysql.jdbc.PreparedStatement;
import Modelo.Conexion;
import Modelo.Producto.sqlProveedores;
//import Modelo.Producto.Proveedores;
import Vista.Ventanas.Poductos.ModificarProveedores;
import Vista.Ventanas.Principal.Principal;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Proveedores extends javax.swing.JFrame {
       JTable Prov;
       ResultSet rs;
    Container prov = this.getContentPane();
       public Proveedores() {
        initComponents();
        prov.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Proveedores");
        Conexion cn = new Conexion();
        String nombreP = this.txtBus.getText();

        DefaultTableModel dfm = new DefaultTableModel();
        Prov= this.ProveT;
        Prov.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","DOMICILIO","TELEFONO","CONTACTO","EMAIL"});

        rs = cn.SelectProveedores();
        
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idProveedor"),rs.getString("nombreP"),rs.getString("domicilio"),rs.getString("telefono"),rs.getString("nombreContacto"),rs.getString("email")});
            }
        } catch (Exception e) {
        }
    }

    /**t
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnRegre = new javax.swing.JButton();
        txtBus = new javax.swing.JTextField();
        lblBuscarP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProveT = new javax.swing.JTable();
        btnAgg = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        lblBuscarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscarP.setText("Buscar: ");

        ProveT = new JTable()
        {
            public boolean isCellEditable(int row,int column)
            {
                for(int i=0;i<ProveT.getRowCount();i++)
                {
                    if(row == i)
                    {
                        return false;
                    }
                }
                return true;
            }
        };
        ProveT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ProveT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProveT);

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

        btnRefresh.setBackground(new java.awt.Color(242, 242, 242));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
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
                                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnRefresh))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscarP))
                    .addComponent(btnBuscar)
                    .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addGap(244, 244, 244)
                        .addComponent(btnRefresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Conexion cn = new Conexion();
        String nombreP = this.txtBus.getText();
        
               
        DefaultTableModel dfm = new DefaultTableModel();
        Prov= this.ProveT;
        Prov.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","DOMICILIO","TELEFONO","CONTACTO","EMAIL"});
        
        
        rs = cn.BuscarPreoveedores(nombreP);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idProveedor"),rs.getString("nombreP"),rs.getString("domicilio"),rs.getString("telefono"),rs.getString("nombreContacto"),rs.getString("email")});
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegreActionPerformed

    private void ProveTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveTMouseClicked

    }//GEN-LAST:event_ProveTMouseClicked

    private void btnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggActionPerformed
        AggProveedores prod = new AggProveedores();
        prod.setVisible(true);
        //   this.setVisible();
    }//GEN-LAST:event_btnAggActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        PreparedStatement ps = null; 
        ResultSet rs = null; 
        ModificarProveedores modificarProv = new ModificarProveedores(); 
        
        try{
            Conexion objCon = new Conexion(); 
            Connection con = (Connection) objCon.Conectar();
            
            int fila = ProveT.getSelectedRow();
            String idProveedor = ProveT.getValueAt(fila, 0).toString();
            
            ps = (PreparedStatement) con.prepareStatement("SELECT idProveedor, nombreP, domicilio, telefono,codigoP,nombreContacto, email,foto FROM Proveedores WHERE idProveedor=?;");
            ps.setString(1, idProveedor);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //idProveedor, nombreP, domicilio, telefono, codigoP, nombreContacto, email, foto
                ModificarProveedores.txtIdProveedor.setText(rs.getString("idProveedor"));
                ModificarProveedores.txtNombre.setText(rs.getString("nombreP"));
                ModificarProveedores.txtDomicilio.setText(rs.getString("domicilio"));
                ModificarProveedores.txtTelefono.setText(rs.getString("telefono"));
                ModificarProveedores.txtCP.setText(rs.getString("codigoP"));
                ModificarProveedores.txtNombreC.setText(rs.getString("nombreContacto"));
                ModificarProveedores.txtCorreoElectronico.setText(rs.getString("email"));
                ModificarProveedores.txtFotoProveedor.setText(rs.getString("foto"));
                
                 modificarProv.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error al modificar");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        DefaultTableModel dfm = new DefaultTableModel();
        Prov= this.ProveT;
        Prov.setModel(dfm);

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable ProveT;
    javax.swing.JButton btnAgg;
    javax.swing.JButton btnBuscar;
    javax.swing.JButton btnEdit;
    javax.swing.JButton btnRefresh;
    javax.swing.JButton btnRegre;
    javax.swing.JLabel jLabel2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel lblBuscarP;
    javax.swing.JTextField txtBus;
    // End of variables declaration//GEN-END:variables
}
