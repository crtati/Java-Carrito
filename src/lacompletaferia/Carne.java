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
public class Carne extends Producto {
    //Atributos
    protected String animal;
    
    //Constructores

    public Carne() {
    }

    public Carne(String marca, String categoria, int precio, String animal) {
        super(marca,categoria,precio);
        this.animal = animal;


    }
    //Getters y Setters
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
    //Metodos
    @Override
    public String toString(){
        return " Marca: "+getMarca() + " | " + "Tipo de animal: "+getAnimal() + " | " + "Precio:"
                + getPrecio() + " | " + "Categoria: " + getCategoria();
    }
    @Override
    public double totalCompra(){
        double total = 0;
        Carrito car = new Carrito();
        return total = this.precio*car.contadorCarne;
    }

}
