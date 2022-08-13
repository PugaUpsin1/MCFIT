
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
    
    public boolean InsertarClientes(int IDCliente, String Nombre, String Apellidos, String Celular, int Edad, int Sexo, String EstadoCivil, String FechaNacimiento, String Ocupacion, String CorreoE, String Direccion, int IDMembresia, String FechaInscripcion, String RutaCuestionario, String Foto){
        Connection cn = Conectar();
        Statement st; 
        ResultSet rs = null; 
        try{
            st = cn.createStatement(); 
            String cadenaSQL = "call InsertarClientes('"+IDCliente+"','"+Nombre+"','"+Apellidos+"','"+Celular+"','"+Edad+"','"+Sexo+"','"+EstadoCivil+"','"+FechaNacimiento+"','"+Ocupacion+"','"+CorreoE+"','"+Direccion+"','"+IDMembresia+"','"+FechaInscripcion+"','"+RutaCuestionario+"','"+Foto+"');";
            int registro = st.executeUpdate(cadenaSQL);
            return true;
        }catch(SQLException ex){
            return false; 
        }
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

}
