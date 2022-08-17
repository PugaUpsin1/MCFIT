
package Modelo.sqlCompras;

import Modelo.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author issacpuga
 */
public class sqlVentas extends Conexion{
        public boolean actualizarTotalPago(Ventas1 vo){
        PreparedStatement ps = null;
        Connection cn = Conectar();
        
        String sql = "UPDATE Pago_prod SET totalVenta = ? WHERE idPagoPr = ?;";
        
        try {
            ps=  (PreparedStatement) cn.prepareStatement(sql);
            ps.setDouble(1, vo.getTotalVenta());
            ps.setInt(2,vo.getIdPagoPr());
            ps.execute();
            
            return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
    }
}
