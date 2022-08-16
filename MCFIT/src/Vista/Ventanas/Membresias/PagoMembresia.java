
package Vista.Ventanas.Membresias;

import Modelo.Conexion;
import java.awt.Container;
import java.sql.ResultSet;
import javax.swing.JTable;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class PagoMembresia extends javax.swing.JFrame {
    JTable PagoM;
    ResultSet rs;
    Container cont = this.getContentPane();
    public PagoMembresia() {
       
        initComponents();
        cont.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Pago Membresia");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        PagoM= this.tablaPagoM;
        PagoM.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","METODO PAGO","FECHA PAGO","HORA","IDCLIENTE", "IDEMPLEADO", "IDMEMBRESIA"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectPagoMembresia();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idPagoMem"),rs.getString("metodoPago"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getInt("idCliente"),rs.getInt("idEmpleado"),rs.getInt("idMembresia")});
            }
        } catch (Exception e) {
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnRegresarPM = new javax.swing.JButton();
        lblBuscarP = new javax.swing.JLabel();
        txtBuscarPM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagoM = new javax.swing.JTable();
        btnBuscarPM = new javax.swing.JButton();
        btnAggPM = new javax.swing.JButton();
        btnEliminarPM = new javax.swing.JButton();
        btnRefreshPM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1301, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        btnRegresarPM.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPMActionPerformed(evt);
            }
        });

        lblBuscarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscarP.setText("Buscar: ");

        tablaPagoM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPagoM);

        btnBuscarPM.setBackground(new java.awt.Color(242, 242, 242));
        btnBuscarPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/lupa.png"))); // NOI18N
        btnBuscarPM.setAutoscrolls(true);
        btnBuscarPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPMActionPerformed(evt);
            }
        });

        btnAggPM.setBackground(new java.awt.Color(242, 242, 242));
        btnAggPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/nuevo.png"))); // NOI18N
        btnAggPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggPMActionPerformed(evt);
            }
        });

        btnEliminarPM.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N

        btnRefreshPM.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresarPM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201)
                                .addComponent(lblBuscarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarPM, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarPM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAggPM)
                                    .addComponent(btnRefreshPM)
                                    .addComponent(btnEliminarPM))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarPM)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBuscarP)
                                .addComponent(txtBuscarPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegresarPM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAggPM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(btnRefreshPM))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPMActionPerformed
        Membresias Prin = new Membresias();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarPMActionPerformed

    private void btnBuscarPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPMActionPerformed

        Conexion cn = new Conexion();
        String Nombre = this.txtBuscarPM.getText();

        DefaultTableModel dfm = new DefaultTableModel();
        PagoM= this.tablaPagoM;
        PagoM.setModel(dfm);

                dfm.setColumnIdentifiers(new Object[]{"ID","METODO PAGO","FECHA PAGO","HORA","IDCLIENTE", "IDEMPLEADO", "IDMEMBRESIA"});

        rs = cn.BuscarPagoMem(Nombre);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idPagoMem"),rs.getString("metodoPago"),rs.getDate("fechaPago"),rs.getString("hora"),rs.getInt("idCliente"),rs.getInt("idEmpleado"),rs.getInt("idMembresia")});
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnBuscarPMActionPerformed

    private void btnAggPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggPMActionPerformed
        agregarPagoMem aggPM = new agregarPagoMem();
        aggPM.setVisible(true);
       
    }//GEN-LAST:event_btnAggPMActionPerformed

    private void btnRefreshPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshPMActionPerformed


    }//GEN-LAST:event_btnRefreshPMActionPerformed

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
            java.util.logging.Logger.getLogger(PagoMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoMembresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoMembresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggPM;
    private javax.swing.JButton btnBuscarPM;
    private javax.swing.JButton btnEliminarPM;
    private javax.swing.JButton btnRefreshPM;
    private javax.swing.JButton btnRegresarPM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarP;
    private javax.swing.JTable tablaPagoM;
    private javax.swing.JTextField txtBuscarPM;
    // End of variables declaration//GEN-END:variables
}
