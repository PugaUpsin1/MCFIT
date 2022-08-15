/*
 * Descripción: ventana para registrar clientes
 * Nombre: Mariana Hernández Colio 
 * Fecha: agosto/2022
 */
package Vista.Ventanas.Clientes;

import Modelo.Clientes.sqlClientes;
import Modelo.Conexion;
import Vista.Ventanas.Principal.Principal;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class addClientes extends javax.swing.JFrame implements ActionListener {

    JButton botonFotoCliente;
    Container cont = this.getContentPane();

    public addClientes() {
        initComponents();

        this.getContentPane().setBackground(Color.WHITE);

        //---CODIGO PARA BOTONES DE FOTOS
        //Codigo para el FileChooser de la foto del Cliente
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.btnFotoCliente.addActionListener(this);
        //this.lblFotoCliente.setBounds(500,400,10,10);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Codigo para el FileChooser de la foto del formulario
        this.btnCuestionarioPrevio.addActionListener(this);

        this.txtFechaInscripcion.setText(fechaActual());
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatoFecha.format(fecha);
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(this.lblFotoCliente.getWidth(), this.lblFotoCliente.getHeight(), Image.SCALE_SMOOTH);
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
        txtCuestionarioPrevio = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblFotoCliente = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtFotoCliente = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        btnCuestionarioPrevio = new javax.swing.JButton();
        txtCelular = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        btnFotoCliente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        lblOcupacion = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        txtFechaInscripcion = new javax.swing.JTextField();
        lblFechaInscripcion = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblCuestionarioPrevio = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMembresia = new javax.swing.JTextField();
        jDateFechaN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre(s):");

        txtCuestionarioPrevio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidos.setText("Apellido(s):");

        lblFotoCliente.setBackground(new java.awt.Color(204, 204, 204));
        lblFotoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFotoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFotoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoClienteActionPerformed(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTelefono.setText("Celular: ");

        btnCuestionarioPrevio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/formulario.png"))); // NOI18N
        btnCuestionarioPrevio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnCuestionarioPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioPrevioActionPerformed(evt);
            }
        });

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEdad.setText("Edad:");

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

        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/guadar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSexo.setText("Sexo:");

        cmbSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbSexo.setMaximumRowCount(3);
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre", "Otro" }));

        lblEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstadoCivil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEstadoCivil.setText("Estado Civil:");

        txtEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblOcupacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOcupacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOcupacion.setText("Ocupación:");

        txtOcupacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFechaInscripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblFechaInscripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaInscripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaInscripcion.setText("Fecha de inscripción:");

        lblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaNacimiento.setText("Fecha de nacimiento: ");

        lblCorreoElectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorreoElectronico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreoElectronico.setText("Correo electrónico: ");

        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDireccion.setText("Dirección: ");

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIdCliente.setText("Id Cliente:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCuestionarioPrevio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCuestionarioPrevio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCuestionarioPrevio.setText("Cuestionario previo: ");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Ventanas/Icons/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Membresía: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOcupacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(txtFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDireccion)
                                                .addComponent(txtFechaInscripcion)
                                                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDateFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtIdCliente))
                                .addGap(57, 57, 57)
                                .addComponent(lblFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCuestionarioPrevio)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnLimpiar)
                                            .addGap(42, 42, 42)
                                            .addComponent(btnGuardar))
                                        .addComponent(txtCuestionarioPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCuestionarioPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(338, 338, 338)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFotoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFotoCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblIdCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblNombre)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblApellidos)
                                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefono))
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(jDateFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOcupacion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaInscripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCuestionarioPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCuestionarioPrevio))
                    .addComponent(btnCuestionarioPrevio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoClienteActionPerformed
        JFileChooser fileCliente = new JFileChooser();
        fileCliente.setCurrentDirectory(new File(System.getProperty("user.home"))); //user.home, user.dir

        //Filtro de archivos para las fotos del cliente
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
        fileCliente.addChoosableFileFilter(filter);

        int resultFtCliente = fileCliente.showSaveDialog(null);

        if (resultFtCliente == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileCliente.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.lblFotoCliente.setIcon(ResizeImage(path));
            this.txtFotoCliente.setText(path);
        } else if (resultFtCliente == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Debes agregar la foto del cliente");
        }
    }//GEN-LAST:event_btnFotoClienteActionPerformed

    private void btnCuestionarioPrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestionarioPrevioActionPerformed
        JFileChooser fileCustionario = new JFileChooser();
        fileCustionario.setCurrentDirectory(new File(System.getProperty("user.dir")));

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.Images", "jpg", "png");
        fileCustionario.addChoosableFileFilter(filtro);

        int respuesta = fileCustionario.showSaveDialog(null);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File fileSeleccionado = fileCustionario.getSelectedFile();
            String ruta = fileSeleccionado.getAbsolutePath();
            this.txtCuestionarioPrevio.setText(ruta);
        } else if (respuesta == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Debes agregar la foto del cuestionario");
        }

    }//GEN-LAST:event_btnCuestionarioPrevioActionPerformed

    private void txtFotoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoClienteActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    public void Limpiar() {
        this.txtIdCliente.setText("");
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtCelular.setText("");
        this.txtEdad.setText("");
        this.cmbSexo.setSelectedIndex(0);
        this.txtEstadoCivil.setText("");
        this.jDateFechaN.setDateFormatString("");
        this.txtOcupacion.setText("");
        this.txtDireccion.setText("");
        this.txtFechaInscripcion.setText(fechaActual());
        this.txtCorreoElectronico.setText("");
        this.txtCuestionarioPrevio.setText("");
        this.txtFotoCliente.setText("");
        this.txtMembresia.setText("");
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Clientes addC = new Clientes();
        addC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion cn = new Conexion(); 
        sqlClientes sqlC = new sqlClientes();

        int IDCliente = Integer.parseInt(this.txtIdCliente.getText());
        String Nombre = this.txtNombre.getText();
        String Apellidos = this.txtApellidos.getText();
        String Celular = this.txtCelular.getText();
        int Edad = Integer.parseInt(this.txtEdad.getText());
        String Sexo = (String) this.cmbSexo.getSelectedItem();
        String EstadoCivil = this.txtEstadoCivil.getText();
        String FechaNacimiento = this.jDateFechaN.getDate().toString();
        String Ocupacion = this.txtOcupacion.getText();
        String Direccion = this.txtDireccion.getText();
        String FechaInscripcion = this.txtFechaInscripcion.getText();
        String CorreoE = this.txtCorreoElectronico.getText();
        String RutaCuestionario = this.txtCuestionarioPrevio.getText();
        String Foto = this.txtFotoCliente.getText();
        int IDMembresia = Integer.parseInt(this.txtMembresia.getText());

        //cn.InsertarCliente(IDCliente, Nombre, Apellidos, Celular, Edad, Sexo, EstadoCivil, FechaNacimiento, Ocupacion, CorreoE, Direccion, FechaInscripcion, RutaCuestionario, Foto, IDMembresia);
        sqlC.InsertarCliente(IDCliente, Nombre, Apellidos, Celular, Edad, Sexo, EstadoCivil, FechaNacimiento, Ocupacion, CorreoE, Direccion, FechaInscripcion, RutaCuestionario, Foto, IDMembresia);

        this.Limpiar();

        JOptionPane.showMessageDialog(null, "Cliente agregado con éxito");

        //System.out.println("Id:"+IDCliente+"\nNombre:"+Nombre+"\nFechaNa:"+FechaNacimiento);
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        new addClientes();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCuestionarioPrevio;
    private javax.swing.JButton btnFotoCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbSexo;
    private com.toedter.calendar.JDateChooser jDateFechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblCuestionarioPrevio;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaInscripcion;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFotoCliente;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOcupacion;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtCuestionarioPrevio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtFechaInscripcion;
    private javax.swing.JTextField txtFotoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMembresia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOcupacion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
