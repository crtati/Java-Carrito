/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacompletaferia;

import java.util.ArrayList;
import java.util.Scanner;




public class Carrito implements Calculos{
    
    
    
    
    
    
    
    
    private ArrayList<Producto> listaProductosComprados;
    //Atributos
    protected int contadorCarne = 0;
    protected int contadorVerduras = 0;
    protected int contadorBebestibles = 0;
    protected double precioCarne = 1200;
    protected double precioVerdura = 800;
    protected double precioBebestible = 2000;
    //Constructores------------------------------------------------------------
    public Carrito() {
        listaProductosComprados = new ArrayList<>();
    }
    
    //Setters y Getters--------------------------------------------------------
    public ArrayList<Producto> getListaProductosComprados() {
        return listaProductosComprados;
    }

    public void setListaProductosComprados(ArrayList<Producto> listaProductosComprados) {
        this.listaProductosComprados = listaProductosComprados;
    }
    
    
    //Metodos------------------------------------------------------------------
    public void menú(){
        System.out.println("---La Completa Feria---");
        System.out.println("1.-Comprar Productos");
        System.out.println("2.-Mostrar Productos");
        System.out.println("3.-Eliminar Productos");
        System.out.println("4.-Salir");
    }
    //VALIDAR PRODUCTO
    public boolean validarProducto(String marca) {
        for (Producto p : listaProductosComprados) {
            if (p.marca.equals(marca)) {
                return true;

            }
        }
        return false;
    
    }
    //AGREGAR PRODUCTOS
    public void agregarProducto(Scanner sc) {
        System.out.println("¿Que producto desea comprar?");
        System.out.println("1.-Carnes");
        System.out.println("2.-Verduras");
        System.out.println("3.-Bebestibles");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Ingrese tipo de carne");
                System.out.println("1.-Vacuno");
                System.out.println("2.-Cerdo");
                System.out.println("3.-Pollo");
                int tipoCarne = sc.nextInt();
                if (tipoCarne == 1){
                    boolean existe = this.validarProducto("Arre Beef");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Carne("Arre Beef","Carne",1200,"Vacuno"));
                    }
 
                    
                }else if (tipoCarne == 2){
                    boolean existe = this.validarProducto("San José");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Carne("San José","Carne",1400,"Cerdo"));
                    }

                }else if (tipoCarne == 3){
                    boolean existe = this.validarProducto("Super Pollo");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Carne("Super Pollo","Carne",1600,"Pollo"));
                    }
                    
                }else{
                    System.out.println("Opcion incorrecta");
                }
                contadorCarne++;
                break;
            case 2:
                System.out.println("Ingrese tipo de verdura");
                System.out.println("1.-Lechuga");
                System.out.println("2.-Pimiento");
                System.out.println("3.-Brocoli");
                int tipoVerdura = sc.nextInt();
                if (tipoVerdura == 1){
                    boolean existe = this.validarProducto("La tia Juana");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Verdura("La tia Juana","Lechuga",600,"Verde"));
                    }
                    
                }else if (tipoVerdura == 2){
                    boolean existe = this.validarProducto("BioVivo");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Verdura("BioVivo","Betarraga",800,"Roja"));
                    }
                    
                }else if (tipoVerdura == 3){
                    boolean existe = this.validarProducto("Plump");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Verdura("Plump","Brocoli",1000,"Verde"));
                    }
                    
                }else{
                    System.out.println("Opcion incorrecta");
                }
                contadorVerduras++;
                break;
            case 3:
                System.out.println("Ingrese tipo de bebestible");
                System.out.println("1.-Normal");
                System.out.println("2.-Zero");
                System.out.println("3.-Light");
                int tipoBebestible = sc.nextInt();
                if (tipoBebestible == 1){
                    boolean existe = this.validarProducto("CocaCola");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Bebestible("CocaCola","Normal",2000,"500 ML"));
                    }
                    
                    
                }else if (tipoBebestible == 2){
                    boolean existe = this.validarProducto("Pepsi");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Bebestible("Pepsi","Zero",2500,"1 Litro"));
                    }
                    
                    
                }else if (tipoBebestible == 3){
                    boolean existe = this.validarProducto("Fanta");
                    if (existe){System.out.println("Producto nuevamente agragado");
                    }else{
                        listaProductosComprados.add(new Bebestible("Fanta","Light",1800,"2 Litros"));
                    }
                    
                    
                }else{
                    System.out.println("Opcion incorrecta");
                }
                contadorBebestibles++;
                break;
            default: System.out.println("Opcion invalida");
    
            }
        }
        
    //MOSTRAR PRODUCTOS
    public void mostrarProducto() {
        for (Producto p : listaProductosComprados) {
            if (p instanceof Carne) {
                Carne car = (Carne) p;
                System.out.println("x"+contadorCarne+car.toString());
                System.out.println("Total de la compra: " + sumaCompraCarne());
                System.out.println("Total del descuento: " + descuentoCarne());
                        
            }
            if (p instanceof Verdura) {
                Verdura ver = (Verdura) p;
                System.out.println("x"+contadorVerduras + ver.toString());
                System.out.println("Total de la compra: " + sumaCompraVerduras());
                
            }
            if (p instanceof Bebestible) {
                Bebestible bes = (Bebestible) p;
                System.out.println("x"+contadorBebestibles+ bes.toString());
                System.out.println("Total de la compra: " + sumaCompraBebestibles());
                System.out.println("Total del descuento: " + descuentoBebestible());
                
            }
               
        }
        System.out.println("Total de la compra con IVA:"+ calcularIva());
    } 
    //ELIMINAR PRODUCTOS
    public void eliminarProducto() {
        mostrarProducto();
        System.out.println("Ingrese por teclado la marca del producto mostrada:");
        Scanner sk = new Scanner(System.in);  
        String eliminar = sk.nextLine();
        boolean existe = this.validarProducto(eliminar);
        
        
        if(existe){
            listaProductosComprados.clear();
        }else
            System.out.println("No tienes este producto en tu carrito");
        
    }
    
    public double sumaCompraCarne(){
        double total = 0;
        return total = contadorCarne * precioCarne;
    }
    public double sumaCompraVerduras(){
        double total = 0;
        return total = contadorVerduras * precioVerdura;
    }
    public double sumaCompraBebestibles(){
        double total = 0;
        return total = contadorBebestibles * precioBebestible;
    }
    
    
    public double calcularTotal(){
        return this.sumaCompraCarne() + this.sumaCompraVerduras() + this.sumaCompraBebestibles();
    }
    
    public double descuentoCarne(){
        return this.sumaCompraCarne() * 0.2;
    }
    
    public double descuentoBebestible(){
        return this.sumaCompraBebestibles() * 0.12;
    }
    
    public double totalDescuentos(){
        return this.descuentoCarne() + this.descuentoBebestible();
    }
    
    public double precioFinalProducto(){
        return this.calcularTotal() - this.totalDescuentos();
    }
    public double calcularIva(){
        return this.precioFinalProducto()* 1.19;
    }
    
}
 


