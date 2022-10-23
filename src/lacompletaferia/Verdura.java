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
public class Verdura extends Producto {
    protected String color;
    //Contructores

    public Verdura() {
    }

    public Verdura(String color) {
        this.color = color;
    }

    public Verdura(String marca, String categoria, int precio, String color) {
        super(marca, categoria, precio);
        this.color = color;
    }
    
    //Setters y Getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Metodos
    @Override
    public String toString(){
        return " Marca: "+getMarca() + " | " + "Tipo de animal: "+getColor() + " | " + "Precio:"
                + getPrecio() + " | " + "Categoria: " + getCategoria();
    }
    @Override
    public double totalCompra(){
        double total = 0;
        Carrito car = new Carrito();
        return total = this.precio*car.contadorVerduras;
    }
}
