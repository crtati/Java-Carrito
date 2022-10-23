/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacompletaferia;

/**
 *
 * @author Taty
 */
public abstract class Producto {
    
    //Atributos
    protected String marca;
    protected String categoria;
    protected int precio;
    

    //Constructores
    public Producto() {
    }

    public Producto(String marca, String categoria, int precio) {
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
    }
    //Setters y Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String tipo) {
        this.marca = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String nombre) {
        this.categoria = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //Metodo
    public abstract double totalCompra();
}
