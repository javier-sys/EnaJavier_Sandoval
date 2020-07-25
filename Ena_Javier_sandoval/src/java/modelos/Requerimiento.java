
package modelos;

public class Requerimiento {

    public Requerimiento() {
    }

    public Requerimiento(int id, String nombre, String descripcion, Estado estado, Trabajador trabajador, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.trabajador = trabajador;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    private  int id;
    private String nombre;
    private String descripcion;
    private Estado estado;
    private  Trabajador trabajador;
    private Departamento departamento;      
      
}
