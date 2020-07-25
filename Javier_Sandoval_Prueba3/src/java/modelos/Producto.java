/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author javie
 */
public class Producto {

    public Producto(int codigo, String nombre, String descripcion, int cantidad, int precio, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = "";
        this.cantidad = 0;
        this.precio = 0;
        Estado e = new Estado (1,"Activo");
        this.estado = e;
    }
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private int precio;
    private Estado estado;
    
    
    
}
