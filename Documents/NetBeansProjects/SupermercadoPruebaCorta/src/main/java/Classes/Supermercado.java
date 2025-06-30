/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase que representa un supermercado.
 * Administra un inventario de productos y realiza cálculos financieros.
 * Implementa la interfaz OperacionesSupermercado.
 * 
 * @author sebas
 */
public class Supermercado implements OperacionesSupermercado {

    // Atributos del supermercado
    private String nombre;
    private String telefono;
    private ArrayList<Producto> productos;

    // Constructor por defecto
    public Supermercado() {
        nombre = "";
        telefono = "";
        productos = new ArrayList<>();
    }

    // Constructor sobrecargado
    public Supermercado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        productos = new ArrayList<>();
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Inserta un producto al inventario.
     */
    @Override
    public boolean insertarProducto(Producto p) {
        return productos.add(p);
    }

    /**
     * Calcula la inversión total en productos vigentes.
     */
    @Override
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
     * Calcula el valor estimado de venta de productos vigentes.
     */
    @Override
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
     * Calcula la ganancia estimada sobre productos vigentes.
     */
    @Override
    public double calcularGanancia(LocalDate fecha) {
        return calcularValorDeVenta(fecha) - calcularInversionTotal(fecha);
    }

    /**
     * Cuenta la cantidad de productos que han expirado.
     */
    @Override
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
     * Cambia el valor del IVA para un producto específico.
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
     * Cambia la fecha final del período de IVA de un producto.
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
    @Override
    public String toString() {
        String salida = "Supermercado: " + nombre + "\nTelefono: " + telefono + "\nProductos:\n";
        for (Producto p : productos) {
            salida += p.toString() + "\n--------------------------\n";
        }
        return salida;
    }
}