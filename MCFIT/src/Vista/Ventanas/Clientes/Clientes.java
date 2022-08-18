package Vista.Ventanas.Clientes;

import Vista.Ventanas.Historial;
import Modelo.Conexion;
import Vista.Ventanas.Poductos.VerProducto;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {
    JTable Client;
    ResultSet rs;
    Container cont = this.getContentPane();
    public Clientes() {
        initComponents();
        cont.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Clientes");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        Client= this.ClienT;
        Client.setModel(dfm);
        
        //dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD","SEXO","ESTADO CIVIL","FECHA DE NACIMIENTO","OCUPACION","CORREO","DIRECCION","FECHA DE INSCRIPCION","CUESTIONARIO","FOTO","MEMBRESIA"});
        dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD", "CORREO"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectClientes();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE")});
                //dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE"),rs.getString("sexo"),rs.getString("estadoCivil"), rs.getString("fechaNacimiento"),rs.getString("ocupacion"),rs.getString("correoE"), rs.getString("direccion"), rs.getString("fechaInscripcion"), rs.getString("rutaCuestionario"), rs.getString("foto"), rs.getInt("idMembresia")});
            }
        } catch (Exception e) {
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAgg = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegre = new javax.swing.JButton();
        txtBus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClienT = new javax.swing.JTable();
        btnHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(1301, 700));
        setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        ClienT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ClienT);

        btnHistorial.setBackground(new java.awt.Color(242, 242, 242));
        btnHistorial.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Historial.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                        .addComponent(btnHistorial))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(151, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgg)
                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnRefresh))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnHistorial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnBuscar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        DefaultTableModel dfm = new DefaultTableModel();
        Client= this.ClienT;
        Client.setModel(dfm);
        
        //dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD","SEXO","ESTADO CIVIL","FECHA DE NACIMIENTO","OCUPACION","CORREO","DIRECCION","FECHA DE INSCRIPCION","CUESTIONARIO","FOTO","MEMBRESIA"});
        dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD", "CORREO"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectClientes();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE")});
                //dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE"),rs.getString("sexo"),rs.getString("estadoCivil"), rs.getString("fechaNacimiento"),rs.getString("ocupacion"),rs.getString("correoE"), rs.getString("direccion"), rs.getString("fechaInscripcion"), rs.getString("rutaCuestionario"), rs.getString("foto"), rs.getInt("idMembresia")});
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegreActionPerformed

    private void btnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggActionPerformed
        addClientes addC = new addClientes();
        addC.setVisible(true);
        
    }//GEN-LAST:event_btnAggActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        Historial Hist = new Historial();
        Hist.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Conexion cn = new Conexion();
        String Nombre = this.txtBus.getText();
               
        DefaultTableModel dfm = new DefaultTableModel();
        Client = this.ClienT;
        Client.setModel(dfm);
        
        //dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD","SEXO","ESTADO CIVIL","FECHA DE NACIMIENTO","OCUPACION","CORREO","DIRECCION","FECHA DE INSCRIPCION","CUESTIONARIO","FOTO","MEMBRESIA"});
        dfm.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","TELEFONO","EDAD", "CORREO"});
        
        rs = cn.BuscarClientes(Nombre);
        try {
            while(rs.next()){
                //dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE"),rs.getString("sexo"),rs.getString("estadoCivil"), rs.getString("fechaNacimiento"),rs.getString("ocupacion"),rs.getString("correoE"), rs.getString("direccion"), rs.getString("fechaInscripcion"), rs.getString("rutaCuestionario"), rs.getString("foto"), rs.getInt("idMembresia")});
                dfm.addRow(new Object[]{rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("celular"),rs.getInt("edad"),rs.getString("correoE")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente o no esta registrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         PreparedStatement ps = null;
         ResultSet rs= null;
         ModificarCliente modificarCliente = new ModificarCliente();
         
          try {
              Conexion objCon= new Conexion();
              Connection con = objCon.Conectar();
              
              int fila = ClienT.getSelectedRow();
              String idCliente = ClienT.getValueAt(fila, 0).toString();
              
              ps=con.prepareStatement("SELECT idCliente,nombre,apellido,celular,edad,sexo,estadoCivil,fechaNacimiento,ocupacion,correoE,direccion,fechaInscripcion,rutaCuestionario,foto,idMembresia FROM Clientes WHERE idCliente= ?");
              ps.setString(1, idCliente);
              rs = ps.executeQuery();
              
              while(rs.next()){
                  ModificarCliente.txtCliente.setText(rs.getString("idCliente"));
                  ModificarCliente.txtNombre.setText(rs.getString("nombre"));
                  ModificarCliente.txtApellidos.setText(rs.getString("apellido"));
                  ModificarCliente.txtEdad.setText(rs.getString("edad"));
                  ModificarCliente.txtCelular.setText(rs.getString("celular"));
                  ModificarCliente.cmbSexo.setSelectedItem("sexo");
                  ModificarCliente.txtEstadoCivil.setText(rs.getString("estadoCivil"));
                  ModificarCliente.txtFechaN.setText(rs.getString("fechaNacimiento"));
                  ModificarCliente.txtOcupacion.setText(rs.getString("ocupacion"));
                  ModificarCliente.txtCorreoElectronico.setText(rs.getString("correoE"));
                  ModificarCliente.txtDireccion.setText(rs.getString("direccion"));
                  ModificarCliente.txtFechaInscripcion.setText(rs.getString("fechaInscripcion"));
                  ModificarCliente.txtCuestionarioPrevio.setText(rs.getString("rutaCuestionario"));
                  ModificarCliente.txtFotoCliente.setText(rs.getString("foto"));
                  ModificarCliente.txtMembresia.setText(rs.getString("idMembresia"));
                  
                  modificarCliente.setVisible(true);
              }
              
          }catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Ocurrió un error al modificar");
          }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClienT;
    private javax.swing.JButton btnAgg;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBus;
    // End of variables declaration//GEN-END:variables
}
