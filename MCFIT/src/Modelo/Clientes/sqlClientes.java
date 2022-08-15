package Modelo.Clientes;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlClientes extends Conexion{
     public boolean registrar(Clientes client){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String insertarCliente = "INSERT INTO Clientes(idCliente,nombre,apellido,celular,edad,sexo,estadoCivil,fechaNacimiento,ocupacion,correoE,direccion,fechaInscripcion,rutaCuestionario,foto,idMembresia)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(insertarCliente);
                ps.setInt(1, client.getIdCliente());
                ps.setString(2, client.getNombre());
                ps.setString(3, client.getApellido());
                ps.setString(4, client.getCelular());
                ps.setInt(5, client.getEdad());
                ps.setString(6, client.getEstadoCivil());
                ps.setString(7, client.getFechaNacimiento());
                ps.setString(8, client.getOcupacion());
                ps.setString(9, client.getCorreoE());
                ps.setString(10, client.getDireccion());
                ps.setString(11, client.getFechaInscripcion());
                ps.setString(12, client.getRutaCuestionario());
                ps.setString(13, client.getFoto());
                ps.setString(14, client.getNombre());
                ps.setString(15, client.getNombre());
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
}
