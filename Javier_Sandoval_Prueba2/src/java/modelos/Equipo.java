package modelos;


public class Equipo {

 public Equipo() {
    }

    public Equipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    int codigo;
   String nombre ;
   Estadio estadio;
   Division division;
   Ciudad ciudad;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public Division getDivision() {
        return division;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo(int codigo, String nombre, Estadio estadio, Division division, Ciudad ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadio = estadio;
        this.division = division;
        this.ciudad = ciudad;
    }
   
   
}
