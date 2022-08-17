
package Modelo.sqlCompras;

import Modelo.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class sqlCompras extends Conexion{
    public boolean actualizarTotalCompra(Compras co){
        PreparedStatement ps = null;
        Connection cn = Conectar();
        
        String sql = "UPDATE Compras SET totalCompra = ? WHERE idCompra = ?;";
        
        try {
            ps=  (PreparedStatement) cn.prepareStatement(sql);
            ps.setDouble(1, co.getTotalCompra());
            ps.setInt(2,co.getIdCompras());
            ps.execute();
            
            return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
    }
}
