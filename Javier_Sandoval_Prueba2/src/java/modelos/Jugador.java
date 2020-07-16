
package modelos;

import java.util.Date;


public class Jugador {

    public Jugador() {
    }

    public Jugador(int id, String nombre, String apellido, Date edad, String sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    
    int id ;
    String nombre;
    String apellido;
    Date edad;
    String sueldo;
    
    
    
}
