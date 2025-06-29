/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class Supermercado {

    /*
     Atributos:
     tipoAcceso + TipoDeDato + nombreIdentificador
     */
    private String nombre;
    private String telefono;
    private ArrayList<Producto> productos;

    /**
     * Constructor por defecto.
     * Inicializa el nombre y teléfono como cadenas vacías, y una lista vacía de productos.
     */
    public Supermercado() {
        nombre = "";
        telefono = "";
        productos = new ArrayList<>();
    }

    /**
     * Constructor sobrecargado.
     * 
     * @param nombre nombre del supermercado
     * @param telefono número de contacto
     */
    
    public Supermercado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        productos = new ArrayList<>();
    }

    /**
     * Inserta un producto al inventario.
     * 
     * @param p producto a agregar
     * @return true si se agregó con éxito
     */
    
    public boolean insertarProducto(Producto p) {
        return productos.add(p);
    }

    /**
     * Calcula la inversión total de productos vigentes.
     * 
     * @param fecha fecha de corte para evaluar expiración
     * @return suma del precio base por existencia de productos no vencidos
     */
    
    public double calcularInversionTotal(LocalDate fecha) {
        double total = 0.0;
        for (Producto p : productos) {
            if (!p.expirado(fecha)) {
                total += p.calcularInversion();
            }
        }
        return total;
    }

    /**
     * Calcula el valor total de venta de productos vigentes.
     * 
     * @param fecha fecha de corte
     * @return suma del precio de venta por existencia de productos no vencidos
     */
    
    public double calcularValorDeVenta(LocalDate fecha) {
        double total = 0.0;
        for (Producto p : productos) {
            if (!p.expirado(fecha)) {
                total += p.calcularPrecioVenta() * p.getExistencia();
            }
        }
        return total;
    }

    /**
     * Calcula la ganancia estimada (venta - inversión).
     * 
     * @param fecha fecha de corte
     * @return ganancia neta potencial
     */
    
    public double calcularGanancia(LocalDate fecha) {
        return calcularValorDeVenta(fecha) - calcularInversionTotal(fecha);
    }

    /**
     * Cuenta cuántos productos están expirados a una fecha dada.
     * 
     * @param fecha fecha a evaluar
     * @return cantidad de productos vencidos
     */
    
    public int contarProductosExpirados(LocalDate fecha) {
        int contador = 0;
        for (Producto p : productos) {
            if (p.expirado(fecha)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Cambia el valor de IVA de un producto por su código.
     * 
     * @param codigo código del producto
     * @param nuevoIVA nuevo valor de IVA
     * @return true si se encontró y actualizó el producto
     */
    
    public boolean cambiarIVA(String codigo, double nuevoIVA) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                p.getIva().setValor(nuevoIVA);
                return true;
            }
        }
        return false;
    }

    /**
     * Cambia la fecha de fin del período de IVA de un producto por su código.
     * 
     * @param codigo código del producto
     * @param nuevaFecha nueva fecha de fin
     * @return true si se actualizó correctamente
     */
    public boolean cambiarFechaFinalIVA(String codigo, LocalDate nuevaFecha) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                p.getIva().getPeriodo().setFechaFin(nuevaFecha);
                return true;
            }
        }
        return false;
    }

    
     /**
     * Representación textual del supermercado y su inventario.
     */
    
    // Método toString
    @Override
    public String toString() {
        String salida = "Supermercado: " + nombre + "\nTelefono: " + telefono + "\nProductos:\n";
        for (Producto p : productos) {
            salida += p.toString() + "\n--------------------------\n";
        }
        return salida;
    }
}

