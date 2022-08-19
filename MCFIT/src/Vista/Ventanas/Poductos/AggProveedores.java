
package Vista.Ventanas.Poductos;

import Modelo.Producto.sqlProveedores;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import Modelo.Producto.Proveedores;

public class AggProveedores extends javax.swing.JFrame implements ActionListener {
    JButton botonFotoCliente;
    
    public AggProveedores() {
        initComponents();
        //this.getContentPane().setBackground(new Color(139,150,216));
        this.getContentPane().setBackground(Color.WHITE);
        
        //---CODIGO PARA BOTONES DE FOTOS
        //Codigo para el FileChooser de la foto del Cliente
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.btnFotoCliente.addActionListener(this);
        //this.lblFotoCliente.setBounds(500,400,10,10);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
        
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(this.lblFotoProveedor.getWidth(), this.lblFotoProveedor.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblnombrep = new javax.swing.JLabel();
        lbldom = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblFotoProveedor = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();
        txtFotoProveedor = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblIdp = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        lblcp = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnFotoCliente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtNombreC = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtDomicilio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblnombrep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnombrep.setText("Nombre de Contacto:");

        lbldom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldom.setText("Domicilio:");

        lblCorreoElectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorreoElectronico.setText("Correo electrónico: ");

        lblFotoProveedor.setBackground(new java.awt.Color(204, 204, 204));
        lblFotoProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtIdProveedor.setEditable(false);
        txtIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFotoProveedor.setEditable(false);
        txtFotoProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFotoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoProveedorActionPerformed(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");

        lblIdp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdp.setText("Id Proveedor:");

        txtCP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblcp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcp.setText("Codigo Postal:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFotoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/foto.png"))); // NOI18N
        btnFotoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFotoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoClienteActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtNombreC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/guadar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDomicilio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCorreoElectronico)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblnombrep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoElectronico)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcp)
                            .addComponent(lblIdp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lbldom)
                            .addComponent(lblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFotoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFotoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnCancelar)
                .addGap(80, 80, 80)
                .addComponent(btnLimpiar)
                .addGap(75, 75, 75)
                .addComponent(btnGuardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdp)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldom)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcp)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFotoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFotoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombrep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFotoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoProveedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFotoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoClienteActionPerformed
        JFileChooser fileProveedor = new JFileChooser();
        fileProveedor.setCurrentDirectory(new File(System.getProperty("user.home"))); //user.home, user.dir

        //Filtro de archivos para las fotos del cliente
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","png");
        fileProveedor.addChoosableFileFilter(filter);

        int resultFtCliente = fileProveedor.showSaveDialog(null);

        if(resultFtCliente==JFileChooser.APPROVE_OPTION){
            File selectedFile = fileProveedor.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.lblFotoProveedor.setIcon(ResizeImage(path));
            this.txtFotoProveedor.setText(path);
        }else if(resultFtCliente == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Debes agregar la imagen del proveedor");
       }
    }//GEN-LAST:event_btnFotoClienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void Limpiar(){
        this.txtIdProveedor.setText("");
        this.txtNombre.setText("");
        this.txtDomicilio.setText("");
        this.txtTelefono.setText("");
        this.txtNombreC.setText("");
        this.txtCorreoElectronico.setText("");
        this.txtFotoProveedor.setText("");
    }    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            sqlProveedores sqlP = new sqlProveedores();
            Proveedores prov = new Proveedores(); 
            
            prov.setNombreP(this.txtNombre.getText());
            prov.setDomicilio(this.txtDomicilio.getText());
            prov.setTelefono(this.txtTelefono.getText());
            prov.setCodigoP(this.txtCP.getText());
            prov.setNombreContacto(this.txtNombreC.getText());
            prov.setEmail(this.txtCorreoElectronico.getText());
            prov.setFoto(this.txtFotoProveedor.getText());
                    
            if(sqlP.registrar(prov)){            
                JOptionPane.showMessageDialog(null, "Proveedor agregado con éxito");
                this.Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
        //</editor-fold>
        new Proveedores();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AggProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFotoCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblFotoProveedor;
    private javax.swing.JLabel lblIdp;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblcp;
    private javax.swing.JLabel lbldom;
    private javax.swing.JLabel lblnombrep;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtFotoProveedor;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {    
        
    }
}
