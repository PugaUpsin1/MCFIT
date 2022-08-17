package Modelo.Producto;

import Modelo.Clientes.Clientes1;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlProveedores extends Conexion{
        public boolean registrar(Proveedores prov){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "INSERT INTO Proveedores(nombreP, domicilio, telefono, codigoP, nombreContacto, email, foto)VALUES(?,?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, prov.getNombreP());
                ps.setString(2, prov.getDomicilio());
                ps.setString(3, prov.getTelefono());
                ps.setString(4, prov.getCodigoP());
                ps.setString(5, prov.getNombreContacto());
                ps.setString(6, prov.getEmail());
                ps.setString(7, prov.getFoto());
                
                String res = ps.toString();
                System.out.println(res);
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                return false;
            }
            
        }
        
        public boolean Modificar(Proveedores prov){
            PreparedStatement ps = null;
            Connection cn = Conectar();

            String sql = "UPDATE Proveedores SET  idProveedor=?,nombreP=?, domicilio=?, telefono=?, codigoP=?, nombreContacto=?, email=?, foto=? WHERE idProveedor=?;";

            try {
                ps= cn.prepareStatement(sql);
                ps.setInt(1, prov.getIdProveedor());
                ps.setString(2, prov.getNombreP());
                ps.setString(3, prov.getDomicilio());
                ps.setString(4, prov.getTelefono());
                ps.setString(5, prov.getCodigoP());
                ps.setString(6, prov.getNombreContacto());
                ps.setString(7, prov.getEmail());
                ps.setString(8, prov.getFoto());
                ps.setInt(9, prov.getIdProveedor());
                
                String res = ps.toString();
                System.out.println(res);
                ps.execute();
                return true;
                } catch (SQLException ex) {
                    return false;
                }
    }
     
}
