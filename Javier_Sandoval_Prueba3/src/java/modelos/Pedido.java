
package modelos;

/**
 *
 * @author javie
 */
public class Pedido {

    public void setId(int id) {
        this.id = id;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedido(int id, Producto producto, int cantidad, String correo, String estado) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.correo = correo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEstado() {
        return estado;
    }

    
    private int id;
    private Producto producto;
    private int cantidad;
    private String correo;
    private String estado;
    
    public Pedido() {
    }
    
    
    
}
