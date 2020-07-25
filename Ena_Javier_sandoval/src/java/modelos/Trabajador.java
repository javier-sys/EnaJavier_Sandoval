
package modelos;


public class Trabajador {

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    private String nombre;
    private int id;
    private Departamento departamento;
    
}
