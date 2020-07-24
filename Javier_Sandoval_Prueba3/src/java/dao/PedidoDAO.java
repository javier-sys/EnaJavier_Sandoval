package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Pedido;
import modelos.Producto;
import util.Conexion;


public class PedidoDAO extends Conexion {
    
    public int registrar(Pedido  ped ) throws SQLException{
        String sentencia = "INSERT INTO pedido(id_producto,cantidad,correo,estado) VALUES (?,?,?,?)";
        
        //INSERT INTO estadio( nombre, capacidad, id_ciudad) VALUES (?,?,?)
        
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1,(int)ped.getProducto().getCodigo());
            ps.setInt(2, ped.getCantidad());
            ps.setString(3, ped.getCorreo());
            ps.setString(4, ped.getEstado());
            
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    }
   /* public int modificar(Estadio estadio) throws SQLException{
        String sentencia = "update estadio set nombre = ? where id_estadio = ?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setString(1, estadio.getNombre());
            ps.setInt(2, estadio.getCapacidad());
            
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    } */
  /*  public int eliminar(Estadio estadio) throws SQLException{
        String sentencia = "delete from estadio where id = ?";
      {
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1, estadio.getId());
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
      }finally{
            desconectar();
        }
    } */
   
    
    public Pedido obtenerPedido(int id) throws SQLException{
        
        try{
            String sentencia = "SELECT * FROM `vista_estadio` WHERE idestadio=?";
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Pedido p = null;
            if(rs.next()){
                  
                //Producto pro = new Producto(rs.getInt("identidad"),rs.getString("nombre_ciudad"),rs.getString("descr);
              //  p = new Pedido(rs.getInt("idestadio"),rs.getString("nombre_estadio"),rs.getInt("capacidad"),rs.getInt());
                
            }
            return p;
        }catch(Exception e ){
            return null;
        }finally{
            desconectar();
        }
    }
    public Producto obtenerProducto(String nombre) throws SQLException{
        String sentencia = "select * from producto where nombre=?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return (new Producto (rs.getInt("codigo"),rs.getString("nombre")));
            }else{
                return null;
            }
        }catch(Exception e ){
            return null;
        }finally{
            desconectar();
        }
    }
    public ArrayList<Producto> obtenerProductos() throws SQLException{
        String sentencia = "select * from producto";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ResultSet rs = ps.executeQuery();
            ArrayList<Producto> Productos = new ArrayList();
            while(rs.next()){
                Productos.add(new Producto(rs.getInt("codigo"),rs.getString("nombre")));
            }
            return Productos;
        }catch(Exception e ){
            return new ArrayList();
        }finally{
            desconectar();
        }
    }
    
}