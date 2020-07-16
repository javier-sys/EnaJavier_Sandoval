package util;

import java.util.ArrayList;
import modelos.Usuario;

/**
 *
 * @author Edgard
 */
public class UsuarioUtil {
    
    public static ArrayList<Usuario> usuarios = new ArrayList();
    
    public static String createPassword(){
        return "XXXXXXXX";
    }
    
    public static Usuario obtenerUsuario(String id){
        Usuario temporal = null;
        for(Usuario u:usuarios){
            if(u.getId().equals(id)){
                temporal = u;
            }
        }
        return temporal;
    }
}
