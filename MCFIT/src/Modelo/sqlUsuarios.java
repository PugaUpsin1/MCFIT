
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class sqlUsuarios extends Conexion{
    public boolean registrar(Usuarios usr){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "INSERT INTO Empleados(usuario,nombre,apellido,password,correo,celular,foto) VALUES(?,?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                ps.setString(2, usr.getNombre());
                ps.setString(3, usr.getApellido());
                ps.setString(4, usr.getPassword());
                ps.setString(5, usr.getCorreo());
                ps.setInt(6, usr.getCelular());
                ps.setString(7, usr.getFoto());
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
}
