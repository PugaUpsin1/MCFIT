
package Vista.Ventanas.Membresias;
import Modelo.Conexion;
import Vista.Ventanas.Clientes.addClientes;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Membresias extends javax.swing.JFrame {
    JTable Membre;
    ResultSet rs;
    Container cont = this.getContentPane();
    public Membresias() {
        initComponents();
        cont.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Membresias");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        Membre= this.tablaMembre;
        Membre.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"ID","PLAZO","COSTO","TIPO MEMBRESIA"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectMembresias();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idMembresia"),rs.getString("plazo"),rs.getFloat("costo"),rs.getString("tipoMembresia")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTipoMem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMembre = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRegresarM = new javax.swing.JButton();
        btnNuevoM = new javax.swing.JButton();
        btnEditarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        btnRefreshM = new javax.swing.JButton();
        cbxTipoMem2 = new javax.swing.JComboBox<>();

        cbxTipoMem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxTipoMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inscripción", "General", "Personalizado" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Membresías");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar: ");

        btnBuscarM.setBackground(new java.awt.Color(89, 88, 93));
        btnBuscarM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarM.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/lupa.png"))); // NOI18N
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        tablaMembre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMembre);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N

        btnRegresarM.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMActionPerformed(evt);
            }
        });

        btnNuevoM.setBackground(new java.awt.Color(242, 242, 242));
        btnNuevoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/nuevo.png"))); // NOI18N
        btnNuevoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMActionPerformed(evt);
            }
        });

        btnEditarM.setBackground(new java.awt.Color(242, 242, 242));
        btnEditarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/usuario.png"))); // NOI18N

        btnEliminarM.setBackground(new java.awt.Color(242, 242, 242));
        btnEliminarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/eliminar.png"))); // NOI18N

        btnRefreshM.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshMActionPerformed(evt);
            }
        });

        cbxTipoMem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxTipoMem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inscripción", "General", "Personalizado" }));
        cbxTipoMem2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoMem2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefreshM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoM)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresarM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxTipoMem2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarM)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbxTipoMem2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresarM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoM)
                    .addComponent(btnRefreshM)
                    .addComponent(btnEditarM)
                    .addComponent(btnEliminarM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMActionPerformed
        Principal Prin = new Principal();
        Prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarMActionPerformed

    private void btnNuevoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMActionPerformed
        agregarMembresia addMem = new agregarMembresia();
        addMem.setVisible(true);
    }//GEN-LAST:event_btnNuevoMActionPerformed

    private void btnRefreshMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshMActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        Conexion cn = new Conexion();
        String TipoMembresia = (String)this.cbxTipoMem2.getSelectedItem();
        
               
        DefaultTableModel dfm = new DefaultTableModel();
        Membre= this.Membre;
        Membre.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"IDMembresia","Plazo","Costo","TipoMembresia"});
        
        
        rs = cn.BuscarMembresia(TipoMembresia);
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("idMembresia"),rs.getString("plazo"),rs.getFloat("costo"),rs.getString("tipoMembresia")});
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void cbxTipoMem2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoMem2ItemStateChanged
        
    }//GEN-LAST:event_cbxTipoMem2ItemStateChanged

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
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membresias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnEditarM;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnNuevoM;
    private javax.swing.JButton btnRefreshM;
    private javax.swing.JButton btnRegresarM;
    private javax.swing.JComboBox<String> cbxTipoMem;
    private javax.swing.JComboBox<String> cbxTipoMem2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMembre;
    // End of variables declaration//GEN-END:variables
}
