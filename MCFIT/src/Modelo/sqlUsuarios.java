
package Modelo;

import com.mysql.jdbc.ResultSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class sqlUsuarios extends Conexion{
    public boolean registrar(Usuarios usr){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "INSERT INTO Empleados(usuario,nombre,apellido,password,correo,celular) VALUES(?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                ps.setString(2, usr.getNombre());
                ps.setString(3, usr.getApellido());
                ps.setString(4, usr.getPassword());
                ps.setString(5, usr.getCorreo());
                ps.setString(6, usr.getCelular());
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
    
        public boolean login(Usuarios usr){
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = Conectar();
            
            String sql = "SELECT idEmpleado,usuario, password FROM Empleados WHERE usuario = ?";
            
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usr.getPassword().equals(rs.getString(3))){
                    usr.setId(rs.getInt(1));
                    return true;
                }else{
                    return false;
                }
                
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }


}
