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

    // Constructor por defecto (C.Default)
    public Supermercado() {
        nombre = "";
        telefono = "";
        productos = new ArrayList<>();
    }

    // Constructor sobrecargado (C.Sobrecargado)
    public Supermercado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        productos = new ArrayList<>();
    }

    // Método para insertar producto
    public boolean insertarProducto(Producto p) {
        return productos.add(p);
    }

    // Método para calcular la inversión total
    public double calcularInversionTotal(LocalDate fecha) {
        double total = 0.0;
        for (Producto p : productos) {
            if (!p.expirado(fecha)) {
                total += p.calcularInversion();
            }
        }
        return total;
    }

    // Método para calcular el valor total de venta
    public double calcularValorDeVenta(LocalDate fecha) {
        double total = 0.0;
        for (Producto p : productos) {
            if (!p.expirado(fecha)) {
                total += p.calcularPrecioVenta() * p.getExistencia();
            }
        }
        return total;
    }

    // Método para calcular la ganancia estimada
    public double calcularGanancia(LocalDate fecha) {
        return calcularValorDeVenta(fecha) - calcularInversionTotal(fecha);
    }

    // Método para contar cuántos productos han expirado a una fecha
    public int contarProductosExpirados(LocalDate fecha) {
        int contador = 0;
        for (Producto p : productos) {
            if (p.expirado(fecha)) {
                contador++;
            }
        }
        return contador;
    }

    // Método para cambiar el IVA de un producto por código
    public boolean cambiarIVA(String codigo, double nuevoIVA) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                p.getIva().setValor(nuevoIVA);
                return true;
            }
        }
        return false;
    }

    // Método para cambiar la fecha de fin del período de IVA por código
    public boolean cambiarFechaFinalIVA(String codigo, LocalDate nuevaFecha) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                p.getIva().getPeriodo().setFechaFin(nuevaFecha);
                return true;
            }
        }
        return false;
    }

    // Método toString
    @Override
    public String toString() {
        String salida = "Supermercado: " + nombre + "\nTelejfono: " + telefono + "\nProductos:\n";
        for (Producto p : productos) {
            salida += p.toString() + "\n--------------------------\n";
        }
        return salida;
    }
}

