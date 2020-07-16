package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Division;

/**
 *
 * @author javie
 */
public class DivisionDAO extends Conexion {
    
    public int registrar(Division division) throws SQLException{
        String sentencia = "Insert into ciudad (nombre) values (?)";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setString(1, division.getNombre());
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    }
    public int modificar(Division division) throws SQLException{
        String sentencia = "update division set nombre = ? where codigo = ?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setString(1, division.getNombre());
            ps.setInt(2, division.getCodigo());
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    }
    public int eliminar(Division division) throws SQLException{
        String sentencia = "delete from ciudad where id = ?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1, division.getCodigo());
            return ps.executeUpdate();
        }catch(Exception e){
            return -1;
        }finally{
            desconectar();
        }
    }
    public Division obtenerDivision(int codigo) throws SQLException{
        String sentencia = "select * from ciudad where codigo=?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return (new Division(rs.getInt("codigo"),rs.getString("nombre")));
            }else{
                return null;
            }
        }catch(Exception e ){
            return null;
        }finally{
            desconectar();
        }
    }
    public Division obtenerDivision(String nombre) throws SQLException{
        String sentencia = "select * from division where nombre=?";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return (new Division(rs.getInt("codigo"),rs.getString("nombre")));
            }else{
                return null;
            }
        }catch(Exception e ){
            return null;
        }finally{
            desconectar();
        }
    }
      public boolean existeDivision(Division division) throws SQLException{
        try{
            String sentencia = "SELECT * FROM `division` WHERE `codigo` = ? "; /// ojooo  ver si exite ciudad con unas vistas
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ps.setInt(1, division.getCodigo());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }catch(Exception e){
            return false;
        }finally{
            desconectar();
        }
      }
    
    public ArrayList<Division> obtenerDivision() throws SQLException{
        String sentencia = "select * from division";
        try{
            conectar();
            PreparedStatement ps = obtenerPS(sentencia);
            ResultSet rs = ps.executeQuery();
            ArrayList<Division> Divisiones = new ArrayList();
            while(rs.next()){
                Divisiones.add(new Division(rs.getInt("codigo"),rs.getString("nombre")));
            }
            return Divisiones;
        }catch(Exception e ){
            return new ArrayList();
        }finally{
            desconectar();
        }
    }
}
