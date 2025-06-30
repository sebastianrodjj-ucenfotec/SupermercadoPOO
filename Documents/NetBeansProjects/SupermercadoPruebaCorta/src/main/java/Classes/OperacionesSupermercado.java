/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 * Interfaz que define las operaciones básicas que debe implementar un supermercado.
 * Incluye inserción de productos y cálculos financieros sobre el inventario.
 * 
 * @author sebas
 */
public interface OperacionesSupermercado {

    /**
     * Inserta un nuevo producto en el inventario.
     * 
     * @param p producto a agregar
     * @return true si se agrega con éxito
     */
    public boolean insertarProducto(Producto p);

    /**
     * Calcula la inversión total de productos no vencidos.
     * 
     * @param fecha fecha de corte para evaluar vencimiento
     * @return valor total invertido
     */
    public double calcularInversionTotal(LocalDate fecha);

    /**
     * Calcula el valor total de venta de productos vigentes.
     * 
     * @param fecha fecha límite de vigencia
     * @return valor de venta total estimado
     */
    public double calcularValorDeVenta(LocalDate fecha);

    /**
     * Calcula la ganancia estimada sobre los productos vigentes.
     * 
     * @param fecha fecha de corte
     * @return utilidad neta
     */
    public double calcularGanancia(LocalDate fecha);

    /**
     * Cuenta la cantidad de productos vencidos a la fecha dada.
     * 
     * @param fecha fecha de evaluación
     * @return número de productos expirados
     */
    public int contarProductosExpirados(LocalDate fecha);
}