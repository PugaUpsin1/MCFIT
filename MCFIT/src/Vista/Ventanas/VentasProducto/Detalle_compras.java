// detalle_prod pero es, detalle de las ventas.
package Vista.Ventanas.VentasProducto;

import Modelo.Conexion;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Detalle_compras extends javax.swing.JFrame implements Runnable{ 
   String hora, minutos, segundos; 
   Thread hilo; 
   JTable DetaCom;
   int cant;
   double precio;
   double total;
   ResultSet rs;
   Container cont = this.getContentPane();
    
    public Detalle_compras() {
        initComponents();
        //this.setTitle("Tiendita GYM");
        this.getContentPane().setBackground(new Color(252,207,22));
        
        //Codigo para 
        this.txtFechaHora.setText(fechaActual());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        
        cont.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setTitle("Detalle Compras");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        DetaCom= this.tablaDetalleCompras;
        DetaCom.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"CANTIDAD","PRECIO","IDPRODUCTO","IDCOMPRA"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectDetalleCompras();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("cantidad"),rs.getDouble("precio"),rs.getInt("idProducto"), rs.getInt("idCompra")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefreshC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxMetodoPago = new javax.swing.JComboBox<>();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblDetalleComp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblDetalleProd1 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        lblTotalCompra = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalleCompras = new javax.swing.JTable();
        txtIdCompra = new javax.swing.JTextField();
        btnRegresarV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        btnRefreshC1 = new javax.swing.JButton();
        btnGuardarC1 = new javax.swing.JButton();

        btnRefreshC.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Empleado: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ID Producto: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad: ");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        spnCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Método de pago: ");

        cbxMetodoPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia ", "Deposito ", "Otro " }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Total Compra:");

        btnAgregarC.setText("+");
        btnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Hora: ");

        lblDetalleComp.setBackground(new java.awt.Color(255, 255, 0));
        lblDetalleComp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetalleComp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleComp.setText("COMPRA DE PRODUCTOS: ");
        lblDetalleComp.setToolTipText("");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel12.setToolTipText("");

        lblDetalleProd1.setBackground(new java.awt.Color(255, 255, 0));
        lblDetalleProd1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetalleProd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleProd1.setText("DETALLE COMPRA DE PRODUCTOS: ");
        lblDetalleProd1.setToolTipText("");

        txtFechaHora.setEditable(false);
        txtFechaHora.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtHora.setEditable(false);
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        lblTotalCompra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalCompra.setForeground(java.awt.Color.red);
        lblTotalCompra.setText("0");

        tablaDetalleCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaDetalleCompras);

        btnRegresarV.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ID Compra:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnGuardarC.setText("Iniciar la Compra");
        btnGuardarC.setToolTipText("");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        btnRefreshC1.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshC1ActionPerformed(evt);
            }
        });

        btnGuardarC1.setText("Finalizar la Compra");
        btnGuardarC1.setToolTipText("");
        btnGuardarC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDetalleProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalCompra))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRefreshC1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardarC1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarC)))
                        .addGap(0, 35, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnGuardarC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblDetalleComp, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                    .addComponent(txtIdCompra))))
                        .addContainerGap(166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(532, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetalleComp)
                    .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblDetalleProd1)
                        .addGap(59, 106, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTotalCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefreshC1)
                            .addComponent(btnGuardarC1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(260, Short.MAX_VALUE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(221, 221, 221)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVActionPerformed
        Compras com = new Compras();
        com.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarVActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCActionPerformed
         //Para ejecutar la instrucción
         
        Conexion ne = new Conexion();
        
        int Cantidad = Integer.parseInt(this.spnCantidad.getValue().toString());
        double Precio = Double.parseDouble(this.txtPrecio.getText());
        int IDProducto = Integer.parseInt(this.txtIdProducto.getText()); 
        int IDCompra = Integer.parseInt(this.txtIdCompra.getText());                 
               

        ne.InsertarDetalleCompra(Cantidad, Precio, IDProducto,IDCompra);
        
        //JOptionPane.showMessageDialog(null, "DetalleCompra agregada con éxito");
        
        //Compras com = new Compras();
        //this.setVisible(false);
        //com.setVisible(true);
    }//GEN-LAST:event_btnAgregarCActionPerformed
//    void calcularTotal(){
//    //double total = Double.parseDouble(this.lblTotalCompra.getText());    
//    total = 0;
//    for(int i=0; i<tablaDetalleCompras.getRowCount(); i++)
//        {
//            int Cantidad =Integer.parseInt(tablaDetalleCompras.getValueAt(i, 3).toString());
//            double Precio =Double.parseDouble(tablaDetalleCompras.getValueAt(i, 4).toString());
//            total=total+(Cantidad * Precio);
//            System.out.println("resultado:" + total);
//        }
//        lblTotalCompra.setText(""+total+"0");
//    }
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int num1 = Integer.parseInt(spnCantidad.getValue().toString());
        double num2 = Double.parseDouble(this.txtPrecio.getText());
        total = total+(num1 * num2);
        lblTotalCompra.setText(""+total+"0");
        //this.calcularTotal();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        //Para ejecutar la instrucción
        Conexion ne = new Conexion();

        int IDCompra = Integer.parseInt(this.txtIdCompra.getText()); 
        double TotalCompra = Double.parseDouble(this.lblTotalCompra.getText());
        String Hora = this.txtHora.getText();
        String FechaCompra = this.txtFechaHora.getText();
        String MetodoPago = cbxMetodoPago.getSelectedItem().toString();
        int IDEmpleado = Integer.parseInt(this.txtIdEmpleado.getText()); 

        ne.InsertarCompra(IDCompra, TotalCompra, Hora,FechaCompra, MetodoPago,IDEmpleado);
        
        //JOptionPane.showMessageDialog(null, "Compra agregada con éxito");
        
        //Compras com = new Compras();
        //this.setVisible(false);
        //com.setVisible(true);
    }//GEN-LAST:event_btnGuardarCActionPerformed

    
    
    private void btnRefreshCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshCActionPerformed

    private void btnRefreshC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshC1ActionPerformed
        DefaultTableModel dfm = new DefaultTableModel();
        DetaCom= this.tablaDetalleCompras;
        DetaCom.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"CANTIDAD","PRECIO","IDPRODUCTO","IDCOMPRA"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectDetalleCompras();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("cantidad"),rs.getDouble("precio"),rs.getInt("idProducto"), rs.getInt("idCompra")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
           
    }//GEN-LAST:event_btnRefreshC1ActionPerformed

    private void btnGuardarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarC1ActionPerformed
    
    public static String fechaActual(){
        Date fecha = new Date(); 
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY"); 
        return formatoFecha.format(fecha); 
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar(); 
        Date horaActual = new Date(); 
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        
        while(current == hilo){
            hora();
            txtHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Detalle_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle_prod().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarC;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnGuardarC1;
    private javax.swing.JButton btnRefreshC;
    private javax.swing.JButton btnRefreshC1;
    private javax.swing.JButton btnRegresarV;
    private javax.swing.JComboBox<String> cbxMetodoPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDetalleComp;
    private javax.swing.JLabel lblDetalleProd1;
    private javax.swing.JLabel lblTotalCompra;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tablaDetalleCompras;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {        
        
        
    }
}
