package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Posicion;

public class PosicionDAO extends Conexion {
    
 
    public int registrarPocision(Posicion p) throws ClassNotFoundException, SQLException{
        String sentencia = "insert into usuario values (?,?)";
        try{
        conectar();
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1, p.getCodigo());
        ps.setString(2, p.getNombre());
        
        int r = ps.executeUpdate();
        return r;
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    }
    public int modificarUsuario(Posicion p) throws ClassNotFoundException, SQLException{
        String sentencia = "update usuario set nombre=?,apellido=?,password=? where id=?";
        try{
        conectar();
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1, p.getCodigo());
        ps.setString(2, p.getNombre());;
        int r = ps.executeUpdate();
        return r;
        }catch(Exception e){
            return -1;
        }finally{
        desconectar();
        }
    }
    public int eliminarUsuario(Posicion p) throws ClassNotFoundException, SQLException{
        String sentencia = "delete from usuario where id=?";
        try{
        conectar();
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1, p.getCodigo());
        int r = ps.executeUpdate();
        return r;
        }catch(Exception e){
            return -1;
        }finally{
        desconectar();
        }
    }
    public ArrayList<Posicion> obtenerPosiciones() throws ClassNotFoundException, SQLException{
        String sentencia = "select * from posicion";
        try{
        conectar();
        PreparedStatement ps= obtenerPS(sentencia);
        ResultSet rs = ps.executeQuery();
        ArrayList<Posicion> lista = new ArrayList();
        while(rs.next()){
            lista.add(new Posicion(rs.getString("codigo"),rs.getString("nombre")));
        }
        return lista;
        }catch(Exception e){
            return new ArrayList();
        }finally{
            desconectar();
        }
    }
    public Posicion obtenerPocision(String id) throws ClassNotFoundException, SQLException{
        String sentencia = "select * from posicion where id = ?";
        try{
        conectar();
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        Posicion u = null;
        if(rs.next()){
           u= new Posicion(rs.getString("codigo"),rs.getString("nombre"));
        }
        return u;
        }catch(Exception e){
            return null;
        }finally{
            desconectar();
        }
    }
    
}
