
package controladores;
import dao.PosicionDAO;
import modelos.Posicion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.*;

@WebServlet(name = "ControladorPosicion", urlPatterns = {"/ControladorPosicion"})

public class ControladorPosicion extends HttpServlet {
    
    
      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("accion")!=null){
        String accion = request.getParameter("accion");
        switch(accion){
         case "1": registrar(request,response);
                break;
            /*case "2": modificar(request,response);
                break;
            case "3": eliminar(request,response);
                break;
                */
            default: response.sendRedirect("index.jsp?msj=No te pases");
        }
        }else{
            response.sendRedirect("index.jsp?msj=No te pases");
        }
    }
  
            
   /* private void eliminar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try{
        String id = request.getParameter("id").trim();
        if(id.equals("")){
            response.sendRedirect("intranet.jsp?msj=Campos incompletos");
        }else{
            UsuarioDAO ud = new UsuarioDAO();
            Usuario u = new Usuario();
            u.setId(id);
            int respuesta = ud.eliminarUsuario(u);
            if(respuesta==1){
            HttpSession sesion = request.getSession();
            response.sendRedirect(((Usuario)sesion.getAttribute("usuario")).getId().equals(id)?
                   "Salir":"intranet.jsp?msj=Usuario eliminado");
            }else{
                response.sendRedirect("intranet.jsp?msj=No se pudo eliminar el usuario");
            }
        }
        }catch(Exception e){
             response.sendRedirect("intranet.jsp?msj="+e.getMessage());
        }
    }*/
   /*private void modificar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try{
        String id = request.getParameter("id").trim();
        String nombre = request.getParameter("nombre").trim();
        String apellido = request.getParameter("apellido").trim();
        String password = request.getParameter("password").trim();
        if(id.equals("")||nombre.isEmpty()||apellido.length()==0){
            response.sendRedirect("intranet.jsp?msj=Campos incompletos");
        }else{
            UsuarioDAO ud = new UsuarioDAO();
            if(password.equals("")){
                password = ud.obtenerUsuario(id).getPassword();
            }
            Usuario u = new Usuario(id,nombre,apellido,password);
            int respuesta = ud.modificarUsuario(u);
            response.sendRedirect(respuesta==1?"intranet.jsp?msj=Usuario modificado":
                    "intranet.jsp?msj=Usuario no se pudo modificar");
        }
        }catch(Exception e){
            response.sendRedirect("intranet.jsp?msj="+e.getMessage());
        }
    }*/
    
     private void registrar(HttpServletRequest request, HttpServletResponse response) throws IOException{
           try{
            String codigo = request.getParameter("codigo").trim();
            String nombre = request.getParameter("nombre").trim();
        
            if(codigo.equals("")||nombre.isEmpty()){
                response.sendRedirect("registro.jsp?msj=Campos incompletos");
            }else{
                Posicion posicionNueva = new Posicion(codigo,nombre);
                PosicionDAO ud = new PosicionDAO();
                HttpSession sesion = request.getSession();
                if(ud.obtenerPocision(posicionNueva.getCodigo())==null){
                    int respuesta = ud.registrarPocision(posicionNueva);
                    if(respuesta==1){
                    response.sendRedirect((sesion.getAttribute("usuario")!=null)?"intranet.jsp?msj=posicion registrada"
                            :"index.jsp?msj=Usuario registrado, inicie sesion");
                    }else{
                    response.sendRedirect((sesion.getAttribute("usuario")!=null)?"intranet.jsp?msj=posicion no se puede registar"
                            :"index.jsp?msj=Usuario no se puede registrar");
                    }

                }else{
                    response.sendRedirect((sesion.getAttribute("usuario")!=null)?"intranet.jsp?msj=posicion ya existe":
                            "registro.jsp?msj=Usuario ya existe");
                }
            }
           }catch(Exception e){
               response.sendRedirect("index.jsp?msj="+e.getMessage());
           }
    
}
}
