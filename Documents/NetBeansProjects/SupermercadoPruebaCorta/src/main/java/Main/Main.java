/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author sebas
 */
import java.time.LocalDate;
import Classes.Producto;
import Classes.IVA;
import Classes.Expira;
import Classes.Periodo;
import Classes.Supermercado;

public class Main {
    public static void main(String[] args) {
        // Fecha de corte para verificar expiración
        LocalDate fechaCorte = LocalDate.now();

        // Crear periodo de IVA
        Periodo periodoIVA = new Periodo(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31));
        IVA ivaGeneral = new IVA(13.0, periodoIVA);

        // Crear fechas de expiración
        Expira fechaExp1 = new Expira(LocalDate.of(2025, 7, 15));
        Expira fechaExp2 = new Expira(LocalDate.of(2024, 12, 1));

        // Crear productos
        Producto producto1 = new Producto("P001", "Leche Entera", 20, 650.0, 25.0, ivaGeneral, fechaExp1);
        Producto producto2 = new Producto("P002", "Cereal Avena", 15, 1200.0, 30.0, ivaGeneral, fechaExp2);

        // Crear supermercado e insertar productos
        Supermercado supermercado = new Supermercado("Super El Chino", "8888-8888");
        supermercado.insertarProducto(producto1);
        supermercado.insertarProducto(producto2);

        // Mostrar detalles del supermercado
        System.out.println(supermercado.toString());

        // Cálculos financieros
        System.out.println("Inversion total (vigentes): " + supermercado.calcularInversionTotal(fechaCorte) + "Colones");
        System.out.println("Valor total de venta (vigentes): " + supermercado.calcularValorDeVenta(fechaCorte)+ "Colones");
        System.out.println("Ganancia estimada: " + supermercado.calcularGanancia(fechaCorte)+ "Colones");
        System.out.println("Cantidad de productos vencidos: " + supermercado.contarProductosExpirados(fechaCorte));
    }
}

