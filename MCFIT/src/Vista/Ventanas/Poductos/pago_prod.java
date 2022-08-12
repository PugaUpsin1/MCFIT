/*
Descripcion: Realización de la tabla de Pago Productos.
Nombre: Lizbet Argelia Padilla Moreno.
Fecha: 26/06/2022.
 */
package Vista.Ventanas.Poductos;
import java.awt.Color;

public class pago_prod extends javax.swing.JFrame {

   
    public pago_prod() {
        initComponents();
        getContentPane().setBackground(new Color(139,150,216));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHora = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        lblPagoProd = new javax.swing.JLabel();
        txtMetodoPago = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        lblTotalVenta = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        lblFechaPago = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        lblMetodoPago = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblIdEmpleado = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtIdPago = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtTotalVenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPagoProd = new javax.swing.JTable();
        txtFechaPago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtHora.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        lblIdCliente.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblIdCliente.setText("ID Cliente:");

        lblPagoProd.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblPagoProd.setText("Id del pago del Producto:");

        txtMetodoPago.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        txtIdCliente.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        lblTotalVenta.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblTotalVenta.setText("Total de la venta:");

        txtIdEmpleado.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        lblFechaPago.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblFechaPago.setText("Fecha del Pago:");

        txtBuscar.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        lblHora.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblHora.setText("Hora:");

        btnNuevo.setBackground(new java.awt.Color(89, 88, 93));
        btnNuevo.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorderPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblMetodoPago.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblMetodoPago.setText("Método de pago:");

        btnGuardar.setBackground(new java.awt.Color(89, 88, 93));
        btnGuardar.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblIdEmpleado.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblIdEmpleado.setText("ID Empleado:");

        btnEditar.setBackground(new java.awt.Color(89, 88, 93));
        btnEditar.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        lblBuscar.setText("Buscar:");

        btnEliminar.setBackground(new java.awt.Color(89, 88, 93));
        btnEliminar.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);

        txtIdPago.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(89, 88, 93));
        btnBuscar.setFont(new java.awt.Font("Louis George Cafe", 0, 14)); // NOI18N
        btnBuscar.setText("O-");
        btnBuscar.setBorderPainted(false);

        txtTotalVenta.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        tablaPagoProd.setBackground(new java.awt.Color(255, 255, 102));
        tablaPagoProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaPagoProd);

        txtFechaPago.setFont(new java.awt.Font("Louis George Cafe", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIdCliente)
                                            .addComponent(lblFechaPago)
                                            .addComponent(lblHora)
                                            .addComponent(lblMetodoPago)
                                            .addComponent(lblIdEmpleado))
                                        .addGap(2, 2, 2))
                                    .addComponent(lblTotalVenta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPagoProd)
                                .addGap(29, 29, 29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblPagoProd)
                        .addGap(25, 25, 25)
                        .addComponent(lblTotalVenta)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaPago)
                        .addGap(24, 24, 24)
                        .addComponent(lblHora)
                        .addGap(22, 22, 22)
                        .addComponent(lblMetodoPago)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNuevo)
                                .addGap(12, 12, 12)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(18, 18, 18)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(pago_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago_prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFechaPago;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblPagoProd;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JTable tablaPagoProd;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
