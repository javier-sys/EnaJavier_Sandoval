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

    public Equipo(int codigo, String nombre, Estadio estadio, Division division, Ciudad ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadio = estadio;
        this.division = division;
        this.ciudad = ciudad;
    }
   
   
}
