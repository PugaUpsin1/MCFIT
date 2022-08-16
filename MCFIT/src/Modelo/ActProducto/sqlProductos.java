
package Modelo.ActProducto;

import Modelo.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
/**
 *
 * @author issacpuga
 */
public class sqlProductos extends Conexion{
    public boolean Modificar(Productos1 pr){
        PreparedStatement ps = null;
        Connection cn = Conectar();
        
        String sql = "UPDATE Productos SET  tipoProducto = ?,descripcion = ?,precioVenta = ?,precioCompra=?, existencia= ? , foto = ?, idProveedor = ? WHERE idProducto = ?;";
        
        try {
            ps= (PreparedStatement) cn.prepareStatement(sql);
            ps.setString(1, pr.getTipoProducto());
            ps.setString(2, pr.getDescripcion());
            ps.setDouble(3, pr.getPrecioVenta());
            ps.setDouble(4, pr.getPrecioCompra());
            ps.setInt(5, pr.getExistencia());
            ps.setString(6, pr.getFoto());
            ps.setInt(7, pr.getIdProveedor());
            ps.setInt(8, pr.getIdProductos());
            ps.execute();
            
            return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
    }
    
        public boolean Eliminar(Productos1 pr){
        PreparedStatement ps = null;
        Connection cn = Conectar();
        
        String sql = "DELETE FROM Productos WHERE idProducto = ?;";
        
        try {
            ps= (PreparedStatement) cn.prepareStatement(sql);
            ps.setInt(1, pr.getIdProductos());
            ps.execute();
            
            return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
    }
}
