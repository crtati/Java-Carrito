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
public interface Calculos  {
    double calcularTotalNeto();
    double descuentoCarne();
    double descuentoBebestible();
    double totalDescuentos();
    double precioFinalProducto();
    double calcularIva();
    double calcularTotalBruto();
}
