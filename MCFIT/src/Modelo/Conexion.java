
package Modelo;


import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    public Connection Conectar(){
        Connection cn = null;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Gym","root","");
            
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
            rs = st.executeQuery("SELECT * FROM Productos;");
        } catch (SQLException ex) {

        }
        return rs;
        
    }
    
    public ResultSet SelectClientes(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Clientes;");
        } catch (SQLException ex) {

        }
        return rs;
        
    }
    
    public ResultSet SelectHistorial(){
        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Historial;");
        } catch (SQLException ex) {

        }
        return rs;
        
    }
    
    public class Usuarios{
        private int id;
        private String usuario;
        private String nombre;
        private String Apellido;
        private String password;
        private String correo;
        private int celular;
        private String foto;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public int getCelular() {
            return celular;
        }

        public void setCelular(int celular) {
            this.celular = celular;
        }

        public String getFoto() {
            return foto;
        }

        public void setFoto(String foto) {
            this.foto = foto;
        }
        
        
        
    }
    
    public class sqlUsuarios extends Conexion{
       
        public boolean registrar(Usuarios usr){
            PreparedStatement ps = null;
            Connection con = Conectar();
            
            String sql = "INSERT INTO Empleados(usuario,nombre,apellido,password,correo,celular,foto) VALUES(?,?,?,?,?,?,?)";
            
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                ps.setString(1, usr.getNombre());
                ps.setString(1, usr.getApellido());
                ps.setString(1, usr.password);
                ps.setString(1, usr.getCorreo());
                ps.setInt(1, usr.getCelular());
                ps.setString(1, usr.getFoto());
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
            
        }
        
    }
      
    
}
