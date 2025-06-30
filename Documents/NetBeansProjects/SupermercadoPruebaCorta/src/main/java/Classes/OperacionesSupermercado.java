/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 * Interfaz que define las operaciones básicas para un supermercado.
 * Cubre la inserción y búsqueda de productos, así como cálculos de inversión,
 * valor de venta, ganancia y control de productos expirados.
 * 
 * Puede ser implementada por cualquier clase que represente un supermercado.
 * 
 * @author sebas
 */
public interface OperacionesSupermercado {

    /**
     * Inserta un nuevo producto en la estructura interna del supermercado.
     * 
     * @param p objeto Producto a insertar
     */
    public void insertarProducto(Producto p);

    /**
     * Busca un producto por su código identificador.
     * 
     * @param cod código del producto
     * @return objeto Producto si se encontró, null en caso contrario
     */
    public Producto buscarProducto(String cod);

    /**
     * Calcula la inversión total de productos vigentes, tomando en cuenta la fecha de corte.
     * 
     * @param fechaCorte fecha límite para evaluar vigencia
     * @return valor total de la inversión en colones
     */
    public double calcularInversionTotal(LocalDate fechaCorte);

    /**
     * Calcula el valor de venta total de los productos vigentes.
     * 
     * @param fechaCorte fecha límite para evaluar vigencia
     * @return valor total de venta en colones
     */
    public double calcularValorDeVenta(LocalDate fechaCorte);

    /**
     * Calcula la ganancia estimada considerando el margen de utilidad por producto.
     * 
     * @param fechaCorte fecha límite para evaluar vigencia
     * @return ganancia total en colones
     */
    public double calcularGanancia(LocalDate fechaCorte);

    /**
     * Cuenta cuántos productos están expirados para la fecha dada.
     * 
     * @param fechaCorte fecha utilizada para evaluar si un producto está vencido
     * @return cantidad de productos expirados
     */
    public int contarProductosExpirados(LocalDate fechaCorte);
}