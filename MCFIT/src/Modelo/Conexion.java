
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

    public boolean InsertarProducto(int IDproducto, String TipoProducto, double PrecioVenta,double PrecioCompra,int Existencia,String Foto,int IDproveedor){
    
    Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            String cadenaSQL = "call InsertarProducto('"+IDproducto+"','"+TipoProducto+"','"+PrecioVenta+"','"+PrecioCompra+"','"+Existencia+"','"+Foto+"','"+IDproveedor +"');";
            int registro = st.executeUpdate(cadenaSQL);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
 
}
