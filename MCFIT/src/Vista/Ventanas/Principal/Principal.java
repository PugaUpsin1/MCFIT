
package Vista.Ventanas.Principal;

import Vista.Ventanas.Clientes.Clientes;
import Vista.Ventanas.Poductos.Productos;
import Vista.Ventanas.Poductos.Proveedores;
import Vista.Ventanas.Clientes.addClientes;
import Vista.Ventanas.VentasProducto.Venta;
import Vista.Ventanas.VentasProducto.Compras;
import Vista.Ventanas.Membresias.Membresias;
import Vista.Ventanas.Membresias.agregarPagoMem;
import Vista.Ventanas.VentasProducto.Detalle_prod;
import java.awt.Color;
import java.awt.Container;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame implements Runnable{
    Container cont = this.getContentPane();
    String hora, minutos, segundos; 
    Thread hilo; 
    public Principal() {
        initComponents();
        hilo = new Thread(this);
        hilo.start();
        cont.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("MCFIT");
        this.setSize(1301,700);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnMembresia = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnconf = new javax.swing.JButton();
        btnVentas1 = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        lblHoraActual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuAddCliente = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuAggPagoMem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuAggVenta = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MC FIT");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1301, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Imagen 3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, 83));

        btnProductos.setBackground(new java.awt.Color(242, 242, 242));
        btnProductos.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/proteina.png"))); // NOI18N
        btnProductos.setText("  Productos");
        btnProductos.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        btnProductos.setMinimumSize(new java.awt.Dimension(0, 0));
        btnProductos.setPreferredSize(new java.awt.Dimension(1301, 700));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 201, 230, 100));

        btnMembresia.setBackground(new java.awt.Color(242, 242, 242));
        btnMembresia.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnMembresia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/tarjeta-de-membresia 2.png"))); // NOI18N
        btnMembresia.setText("Membresías");
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 311, 230, 100));

        btnProveedores.setBackground(new java.awt.Color(242, 242, 242));
        btnProveedores.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Proveedor.png"))); // NOI18N
        btnProveedores.setText(" Proveedores");
        btnProveedores.setActionCommand("  Ventas");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 230, 100));

        btnClientes1.setBackground(new java.awt.Color(242, 242, 242));
        btnClientes1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/Clientes.png"))); // NOI18N
        btnClientes1.setText("Clientes");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 201, 230, 100));

        btnconf.setBackground(new java.awt.Color(242, 242, 242));
        btnconf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/configuraciones.png"))); // NOI18N
        btnconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfActionPerformed(evt);
            }
        });
        getContentPane().add(btnconf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 30));

        btnVentas1.setBackground(new java.awt.Color(242, 242, 242));
        btnVentas1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/DetalleVentas.png"))); // NOI18N
        btnVentas1.setText("    Ventas");
        btnVentas1.setActionCommand("  Ventas");
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 311, 230, 100));

        btnCompras.setBackground(new java.awt.Color(242, 242, 242));
        btnCompras.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/DetalleCompra.png"))); // NOI18N
        btnCompras.setText("    Compras");
        btnCompras.setActionCommand("  Ventas");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 230, 100));

        lblHoraActual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHoraActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraActual.setText("     ");
        getContentPane().add(lblHoraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        jMenu4.setText("Clientes");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        menuAddCliente.setText("+ Nuevo cliente");
        menuAddCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddClienteActionPerformed(evt);
            }
        });
        jMenu4.add(menuAddCliente);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/tarjeta-de-membresia.png"))); // NOI18N
        jMenu5.setText("Membresías");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        menuAggPagoMem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuAggPagoMem.setText("+ Agregar pago ");
        menuAggPagoMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAggPagoMemActionPerformed(evt);
            }
        });
        jMenu5.add(menuAggPagoMem);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ventas");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        menuAggVenta.setText("+ Agregar Venta");
        menuAggVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuAggVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAggVentaActionPerformed(evt);
            }
        });
        jMenu6.add(menuAggVenta);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos Prod = new Productos();
        Prod.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        Membresias Membre = new Membresias();
        Membre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores p = new Proveedores();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        // TODO add your handling code here:
        Clientes Clien = new Clientes();
        Clien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfActionPerformed
        Configuracion Conf = new Configuracion();
        Conf.setVisible(true);
    }//GEN-LAST:event_btnconfActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        // TODO add your handling code here:
        Venta vent = new Venta();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVentas1ActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        Compras comp = new Compras();
        comp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    private void menuAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddClienteActionPerformed
        addClientes nuevoC = new addClientes(); 
        nuevoC.setVisible(true);
    }//GEN-LAST:event_menuAddClienteActionPerformed

    private void menuAggPagoMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAggPagoMemActionPerformed
        agregarPagoMem pagoM = new agregarPagoMem(); 
        pagoM.setVisible(true);
    }//GEN-LAST:event_menuAggPagoMemActionPerformed

    private void menuAggVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAggVentaActionPerformed
        Detalle_prod venta = new Detalle_prod(); 
        venta.setVisible(true);
    }//GEN-LAST:event_menuAggVentaActionPerformed
    public void hora(){
        Calendar calendario = new GregorianCalendar(); 
        Date horaActual = new Date(); 
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run() {
        Thread current = Thread.currentThread();
        while(current == hilo){
            hora();
            lblHoraActual.setText(hora+":"+minutos+":"+segundos);
            //txtHora.setText(hora+":"+minutos+":"+segundos);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnClientes1;
    javax.swing.JButton btnCompras;
    javax.swing.JButton btnMembresia;
    javax.swing.JButton btnProductos;
    javax.swing.JButton btnProveedores;
    javax.swing.JButton btnVentas1;
    javax.swing.JButton btnconf;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenu jMenu5;
    javax.swing.JMenu jMenu6;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuBar jMenuBar2;
    javax.swing.JLabel lblHoraActual;
    javax.swing.JMenu menuAddCliente;
    javax.swing.JMenuItem menuAggPagoMem;
    javax.swing.JMenu menuAggVenta;
    // End of variables declaration//GEN-END:variables
}
