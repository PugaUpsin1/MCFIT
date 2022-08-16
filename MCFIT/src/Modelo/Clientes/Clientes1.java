package Modelo.Clientes;

import java.util.Date;

public class Clientes1 {
     private int idCliente;
     private String nombre; 
     private String apellido; 
     private String celular;
     private int edad;
     private String sexo;
     private String estadoCivil;
     private String fechaNacimiento;
     private String ocupacion;
     private String correoE;
     private String direccion;
     private String fechaInscripcion;
     private String rutaCuestionario;
     private String foto;
     int idMembresia; 

    /*public Clientes1(int idCliente, String nombre, String apellido, String celular, int edad, String sexo, String estadoCivil, String fechaNacimiento, String ocupacion, String correoE, String direccion, String fechaInscripcion, String rutaCuestionario, String foto, int idMembresia) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
        this.correoE = correoE;
        this.direccion = direccion;
        this.fechaInscripcion = fechaInscripcion;
        this.rutaCuestionario = rutaCuestionario;
        this.foto = foto;
        this.idMembresia = idMembresia;
    }*/
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setRutaCuestionario(String rutaCuestionario) {
        this.rutaCuestionario = rutaCuestionario;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getCorreoE() {
        return correoE;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public String getRutaCuestionario() {
        return rutaCuestionario;
    }

    public String getFoto() {
        return foto;
    }

    public int getIdMembresia() {
        return idMembresia;
    }
    
    
}
