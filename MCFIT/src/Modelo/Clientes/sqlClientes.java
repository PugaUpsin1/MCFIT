package Modelo.Clientes;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlClientes extends Conexion{
     public boolean registrar(Clientes1 clients){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "INSERT INTO Clientes(nombre,apellido,celular,edad,sexo,estadoCivil,fechaNacimiento,ocupacion,correoE,direccion,fechaInscripcion,rutaCuestionario,foto,idMembresia)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, clients.getNombre());
                ps.setString(2, clients.getApellido());
                ps.setString(3, clients.getCelular());
                ps.setInt(4, clients.getEdad());
                ps.setString(5, clients.getSexo());
                ps.setString(6, clients.getEstadoCivil());
                ps.setString(7, clients.getFechaNacimiento());
                ps.setString(8, clients.getOcupacion());
                ps.setString(9, clients.getCorreoE());
                ps.setString(10, clients.getDireccion());
                ps.setString(11, clients.getFechaInscripcion());
                ps.setString(12, clients.getRutaCuestionario());
                ps.setString(13, clients.getFoto()); 
                ps.setInt(14, clients.getIdMembresia());
                String res = ps.toString();
                System.out.println(res);
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
     
      public boolean modificar(Clientes1 clients){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "UPDATE Clientes SET nombre=?, apellido=?, celular=?, edad=?, sexo=?, estadoCivil=?, fechaNacimiento=?, ocupacion=?, correoE=?, direccion=?, fechaInscripcion=?, rutaCuestionario=?, foto=?, idMembresia=? WHERE idCliente=?;";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, clients.getNombre());
                ps.setString(2, clients.getApellido());
                ps.setString(3, clients.getCelular());
                ps.setInt(4, clients.getEdad());
                ps.setString(5, clients.getSexo());
                ps.setString(6, clients.getEstadoCivil());
                ps.setString(7, clients.getFechaNacimiento());
                ps.setString(8, clients.getOcupacion());
                ps.setString(9, clients.getCorreoE());
                ps.setString(10, clients.getDireccion());
                ps.setString(11, clients.getFechaInscripcion());
                ps.setString(12, clients.getRutaCuestionario());
                ps.setString(13, clients.getFoto()); 
                ps.setInt(14, clients.getIdMembresia());
                ps.setInt(15, clients.getIdCliente());
                String res = ps.toString();
                System.out.println(res);
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
        }
     
}
