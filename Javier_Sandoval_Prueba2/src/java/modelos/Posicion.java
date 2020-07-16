
package modelos;


public class Posicion {
       String codigo;
    String nombre;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  

    public Posicion(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    

    public Posicion(String nombre) {
        this.nombre = nombre;
    }
  
}
