
package modelos;


public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private int precio;
    private Estado estado;

    public Producto() {
    }
    
      public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion= "";
        this.cantidad=0;
        Estado es= new Estado(1,"");
        this.precio=0;
        this.estado= es ;
        
    }
    

    public Producto(int codigo, String nombre, String descripcion, int cantidad, int precio, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
