/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 * Clase principal de ejecución del proyecto.
 * Demuestra el funcionamiento del módulo Supermercado y del menú interactivo para Clientes.
 * 
 * @author sebas
 */

import java.time.LocalDate;
import Classes.Producto;
import Classes.IVA;
import Classes.Expira;
import Classes.Periodo;
import Classes.Supermercado;
import Classes.ClienteMenu;  // clase que gestiona el menú de clientes

public class Main {
    public static void main(String[] args) {
        /*
         * === DEMOSTRACIÓN DE FUNCIONALIDAD DEL SUPERMERCADO ===
         * Se crean productos, se insertan en el supermercado y se hacen cálculos financieros.
         */

        // Fecha de corte actual para verificar vencimiento
        LocalDate fechaCorte = LocalDate.now();

        // Crear periodo de IVA válido para el año 2025
        Periodo periodoIVA = new Periodo(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31));
        IVA ivaGeneral = new IVA(13.0, periodoIVA);

        // Crear fechas de expiración para los productos
        Expira fechaExp1 = new Expira(LocalDate.of(2025, 7, 15));  // Producto vigente
        Expira fechaExp2 = new Expira(LocalDate.of(2024, 12, 1));  // Producto vencido

        // Crear productos con sus respectivos datos
        Producto producto1 = new Producto("P001", "Leche Entera", 20, 650.0, 25.0, ivaGeneral, fechaExp1);
        Producto producto2 = new Producto("P002", "Cereal Avena", 15, 1200.0, 30.0, ivaGeneral, fechaExp2);

        // Crear el supermercado e insertar productos
        Supermercado supermercado = new Supermercado("Super El Chino", "8888-8888");
        supermercado.insertarProducto(producto1);
        supermercado.insertarProducto(producto2);

        // Mostrar detalles del supermercado (productos incluidos)
        System.out.println(supermercado.toString());

        // Mostrar estadísticas financieras
        System.out.println("Inversión total (vigentes): " + supermercado.calcularInversionTotal(fechaCorte) + " Colones");
        System.out.println("Valor total de venta (vigentes): " + supermercado.calcularValorDeVenta(fechaCorte) + " Colones");
        System.out.println("Ganancia estimada: " + supermercado.calcularGanancia(fechaCorte) + " Colones");
        System.out.println("Cantidad de productos vencidos: " + supermercado.contarProductosExpirados(fechaCorte));
        
        System.out.println("\n--------------------------\n");

        /*
         * === INICIO DEL MÓDULO DE CLIENTES ===
         * Se lanza el menú interactivo para registrar, listar, buscar y eliminar clientes.
         */
        ClienteMenu menuClientes = new ClienteMenu();
        menuClientes.iniciar();
    }
}