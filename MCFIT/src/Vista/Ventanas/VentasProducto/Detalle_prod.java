// detalle_prod pero es, detalle de las ventas.
package Vista.Ventanas.VentasProducto;

import Modelo.Conexion;
import Modelo.sqlCompras.Compras1;
import Modelo.sqlCompras.Ventas1;
import Modelo.sqlCompras.sqlCompras;
import Modelo.sqlCompras.sqlVentas;
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

public class Detalle_prod extends javax.swing.JFrame implements Runnable{ 
   String hora, minutos, segundos; 
   Thread hilo; 
   JTable DetaVent;
   double total;
   ResultSet rs;
   Container cont = this.getContentPane();
    
    public Detalle_prod() {
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
        this.setTitle("Detalle Ventas");
        
        
        DefaultTableModel dfm = new DefaultTableModel();
        DetaVent= this.tablaDetalleVentas;
        DetaVent.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"CANTIDAD","PRECIO","IDPRODUCTO","IDPAGOPROD"});
        
        Conexion cn = new Conexion();
        rs = cn.SelectDetalleVentas();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("cantidad"),rs.getDouble("precio"),rs.getInt("idProducto"), rs.getInt("idPagoPr")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxMetodoPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblDetalleProd = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblDetalleProd1 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        lblTotalVenta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalleVentas = new javax.swing.JTable();
        txtIdPagoPr = new javax.swing.JTextField();
        btnRegresarV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdProductoV = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnRealizar = new javax.swing.JButton();
        btnGuardarV = new javax.swing.JButton();
        btnRefreshV = new javax.swing.JButton();

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID Cliente: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Total Venta:");

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Hora: ");

        lblDetalleProd.setBackground(new java.awt.Color(255, 255, 0));
        lblDetalleProd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetalleProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleProd.setText("VENTA DE PRODUCTOS: ");
        lblDetalleProd.setToolTipText("");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel12.setToolTipText("");

        lblDetalleProd1.setBackground(new java.awt.Color(255, 255, 0));
        lblDetalleProd1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetalleProd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleProd1.setText("DETALLE VENTA DE PRODUCTOS: ");
        lblDetalleProd1.setToolTipText("");

        txtFechaHora.setEditable(false);
        txtFechaHora.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        lblTotalVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalVenta.setForeground(java.awt.Color.red);
        lblTotalVenta.setText("0");

        tablaDetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaDetalleVentas);

        btnRegresarV.setBackground(new java.awt.Color(242, 242, 242));
        btnRegresarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/regreso (1).png"))); // NOI18N
        btnRegresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ID PagoPr:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnRealizar.setText("Iniciar la Venta");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        btnGuardarV.setText("Finalizar la Compra");
        btnGuardarV.setToolTipText("");
        btnGuardarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVActionPerformed(evt);
            }
        });

        btnRefreshV.setBackground(new java.awt.Color(242, 242, 242));
        btnRefreshV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/iconmonstr-synchronization-3-32.png"))); // NOI18N
        btnRefreshV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtIdProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalVenta))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRefreshV)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardarV))))
                            .addComponent(lblDetalleProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
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
                                .addComponent(btnRealizar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDetalleProd, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                    .addComponent(txtIdCliente)
                                    .addComponent(txtIdPagoPr))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(txtHora))
                        .addGap(178, 178, 178))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetalleProd)
                    .addComponent(btnRegresarV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIdPagoPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtIdProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDetalleProd1)
                        .addGap(93, 93, 93)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTotalVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefreshV)
                            .addComponent(btnGuardarV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVActionPerformed
        Venta Vent = new Venta();
        Vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarVActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Para ejecutar la instrucción
        Conexion ne = new Conexion();
        
        int Cantidad = Integer.parseInt(this.spnCantidad.getValue().toString());
        double Precio = Double.parseDouble(this.txtPrecio.getText());
        int IDProducto = Integer.parseInt(this.txtIdProductoV.getText()); 
        int IDPagoPr = Integer.parseInt(this.txtIdPagoPr.getText());                 
               

        ne.InsertarDetalleVenta(Cantidad, Precio, IDProducto,IDPagoPr);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int num1 = Integer.parseInt(spnCantidad.getValue().toString());
        double num2 = Double.parseDouble(this.txtPrecio.getText());
        total = total+(num1 * num2);
        lblTotalVenta.setText(""+total+"0");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        Conexion ne = new Conexion();

        int IDPagoPr = Integer.parseInt(this.txtIdPagoPr.getText()); 
        double TotalVenta = Double.parseDouble(this.lblTotalVenta.getText());
        String FechaPago = this.txtFechaHora.getText();
        String Hora = this.txtHora.getText();      
        String MetodoPago = cbxMetodoPago.getSelectedItem().toString();
        int IDEmpleado = Integer.parseInt(this.txtIdEmpleado.getText()); 
        int IDCliente = Integer.parseInt(this.txtIdCliente.getText());
        
        ne.InsertarVenta(IDPagoPr, TotalVenta, FechaPago,Hora, MetodoPago,IDEmpleado, IDCliente);
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btnGuardarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVActionPerformed
        sqlVentas sqlC = new sqlVentas();
            Ventas1 mod = new Ventas1();
            
            String tot = new String(lblTotalVenta.getText());
            mod.setTotalPago(Double.valueOf(tot));
            String id = new String(txtIdPagoPr.getText());
            mod.setIdPago(Integer.valueOf(id));
         
            if(sqlC.actualizarTotalPago(mod)){
                JOptionPane.showMessageDialog(null, "Cliente modificado con éxito");
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
    }//GEN-LAST:event_btnGuardarVActionPerformed

    private void btnRefreshVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshVActionPerformed
        DefaultTableModel dfm = new DefaultTableModel();
        DetaVent= this.tablaDetalleVentas;
        DetaVent.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"CANTIDAD","PRECIO","IDPRODUCTO","IDPAGOPROD"});

        Conexion cn = new Conexion();
        rs = cn.SelectDetalleVentas();
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getInt("cantidad"),rs.getDouble("precio"),rs.getInt("idProducto"), rs.getInt("idPagoPr")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro Correctamente");
        }

    }//GEN-LAST:event_btnRefreshVActionPerformed
    
    public static String fechaActual(){
        Date fecha = new Date(); 
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY"); 
        return formatoFecha.format(fecha); 
    }
    
    public void hora(){
        //Calendar calendario = new GregorianCalendar(); 
        //Date horaActual = new Date(); 
        //calendario.setTime(horaActual);
        //hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        //minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        //segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    @Override
    public void run() {
        //Thread current = Thread.currentThread();
        
        //while(current == hilo){
        //    hora();
        //    txtHora.setText(hora+":"+minutos+":"+segundos);
        //}
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardarV;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JButton btnRefreshV;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDetalleProd;
    private javax.swing.JLabel lblDetalleProd1;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tablaDetalleVentas;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdPagoPr;
    private javax.swing.JTextField txtIdProductoV;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {        
        
        
    }
}
