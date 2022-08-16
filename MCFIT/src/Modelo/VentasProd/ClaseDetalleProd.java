
package Modelo.VentasProd;

public class ClaseDetalleProd {
    private int cantidad; 
    private double precio; 
    private int idProducto; 
    private int idPagoPr; 

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getIdPagoPr() {
        return idPagoPr;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdPagoPr(int idPagoPr) {
        this.idPagoPr = idPagoPr;
    }
    
    
}
