/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Producto;

import Modelo.Clientes.Clientes1;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mariana Hernández
 */
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
                //java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
     
}
