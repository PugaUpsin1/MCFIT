
package Proyecto;


import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;


public class Conexion {
    
    public Connection Conectar(){
        Connection cn = null;
        try {
            Class.forName("con.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym","root","");
            
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
            rs = st.executeQuery("SELECT + FROM Productos");
        } catch (SQLException ex) {

        }
        return rs;
        
    }
    
}
