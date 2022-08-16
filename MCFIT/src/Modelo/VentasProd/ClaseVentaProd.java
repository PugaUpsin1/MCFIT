
package Modelo.VentasProd;

public class ClaseVentaProd {
    private int idPagoPr;
    private double totalVenta; 
    private String fechaPago; 
    private String hora; 
    private String metodoPago; 
    private int idEmpleado; 
    private int idCliente; 

    public void setIdPagoPr(int idPagoPr) {
        this.idPagoPr = idPagoPr;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPagoPr() {
        return idPagoPr;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public String getHora() {
        return hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    
}
