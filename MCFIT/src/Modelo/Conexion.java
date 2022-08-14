
package Modelo;


import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    public Connection Conectar(){
        Connection cn = null;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Gym","root","");
            
        } catch (Exception e) {
            
        }
        return cn; 
    }
     
     public ResultSet BuscarClientes(String Nombre){
         Connection cn = Conectar();
         Statement st; 
         ResultSet rs = null;
         
         try{
             st = cn.createStatement();
             rs = st.executeQuery("Select * from Clientes where nombre='"+Nombre+"';");
         } catch (SQLException ex) {
            //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return rs; 
     }
    public boolean InsertarCliente(int IDCliente, String Nombre, String Apellidos, String Celular, int Edad, String Sexo, String EstadoCivil, String FechaNacimiento, String Ocupacion, String CorreoE, String Direccion, String FechaInscripcion, String RutaCuestionario, String Foto, int IDMembresia){
        Connection cn = Conectar();
        Statement st; 
        ResultSet rs = null; 
        try{
            st = cn.createStatement(); 
            //String cadenaSQL = "call InsertarCliente('"+IDCliente+"','"+Nombre+"','"+Apellidos+"','"+Celular+"','"+Edad+"','"+Sexo+"','"+EstadoCivil+"','"+FechaNacimiento+"','"+Ocupacion+"','"+CorreoE+"','"+Direccion+"','"+FechaInscripcion+"','"+RutaCuestionario+"','"+Foto+"','"+IDMembresia+"');";
            String cadenaSQL = "insert into Clientes(idCliente, nombre, apellido,celular, edad, sexo, estadoCivil,fechaNacimiento, ocupacion, correoE, direccion, fechaIncripcion,rutaCuestionario, foto, idMembresia)values'"+IDCliente+"','"+Nombre+"','"+Apellidos+"','"+Celular+"','"+Edad+"','"+Sexo+"','"+EstadoCivil+"','"+FechaNacimiento+"','"+Ocupacion+"','"+CorreoE+"','"+Direccion+"','"+FechaInscripcion+"','"+RutaCuestionario+"','"+Foto+"','"+IDMembresia+"');";
            
            int registroClientes = st.executeUpdate(cadenaSQL);
            return true;
        }catch(SQLException ex){
            return false; 
        }
    }
    public boolean InsertarProducto(int IDproducto, String TipoProducto, String Descripcion, double PrecioVenta,double PrecioCompra,int Existencia,String Foto,int IDproveedor){
    
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            String cadenaSQL = "call InsertarProducto('"+IDproducto+"','"+TipoProducto+"','"+Descripcion+"','"+PrecioVenta+"','"+PrecioCompra+"','"+Existencia+"','"+Foto+"','"+IDproveedor +"');";
            int registro = st.executeUpdate(cadenaSQL);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public ResultSet BuscarProductos(String TipoProducto){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        
        try {
            st = cn.createStatement();
           // rs = st.executeQuery("select * from Productos where tipoProducto = 'Jugo (Licuado de leche de avena, fresa y banana)';");
            rs = st.executeQuery("select * from Productos where tipoProducto ='"+TipoProducto+"';");            
        } catch (SQLException ex) {
            
        }
        return rs;
    }
    public boolean InsertarMembresia(int IDMembresia, String Plazo, float Costo, String TipoMembresia){
    
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            String cadenaSQL = "call aggMembresia('"+IDMembresia+"','"+Plazo+"','"+Costo+"','"+TipoMembresia+"');";
            int registro = st.executeUpdate(cadenaSQL);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
     public ResultSet BuscarMembresia(String TipoMembresia){
         Connection cn = Conectar();
         Statement st; 
         ResultSet rs = null;
         
         try{
             st = cn.createStatement();
             rs = st.executeQuery("Select * from Membresias where tipoMembresia='"+TipoMembresia+"';");
         } catch (SQLException ex) {
            
        }
        return rs; 
     }
    public ResultSet BuscarPagoMem(String Nombre){
         Connection cn = Conectar();
         Statement st; 
         ResultSet rs = null;
         
         try{
             st = cn.createStatement();
             rs = st.executeQuery("Select * from Pago_mem inner join Clientes on Pago_mem.idCliente = Clientes.idCliente where nombre='"+Nombre+"';");
         } catch (SQLException ex) {
            //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return rs; 
     }
     
    
    public ResultSet SelectProductos(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Productos;");
        } catch (SQLException ex) {

        }
        return rs;       
    }
    
    public ResultSet SelectClientes(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Clientes;");
        } catch (SQLException ex) {

        }
        return rs;        
    }
    
    public ResultSet SelectHistorial(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Historial;");
        } catch (SQLException ex) {

        }
        return rs;       
    }
    
    public ResultSet SelectVentas(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Pago_prod;");
        } catch (SQLException ex) {

        }
        return rs;
    }
    
    public ResultSet SelectDetalleVentas(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Detalle_prod;");
        } catch (SQLException ex) {

        }
        return rs;
       
    }
    public ResultSet SelectMembresias(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Membresias;");
        } catch (SQLException ex) {

        }
        return rs;
    }
    public ResultSet SelectPagoMembresia(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Pago_mem;");
        } catch (SQLException ex) {

        }
        return rs;       
    }

}
