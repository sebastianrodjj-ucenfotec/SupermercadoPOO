/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int existencia;
    private double precioBase;
    private double porcentajeGanancia;
    private IVA iva;
    private Expira expira;
    
    /**
     * Constructor por defecto. Inicializa todos los valores con información básica.
     */
    
    public Producto(){
        codigo="";
        nombre="";
        existencia=0;
        precioBase=0.0;
        porcentajeGanancia=0.0;
        iva= new IVA();
        expira= new Expira();
        
    }
   
    /**
     * Constructor sobrecargado. Permite crear un producto con todos sus valores asignados.
     */
    
    public Producto (String codigo, String nombre, int existencia, double precioBase, double porcentajeGanancia, IVA iva, Expira expira){
        this.codigo=codigo;
        this.nombre=nombre;
        this.existencia=existencia;
        this.precioBase=precioBase;
        this.porcentajeGanancia=porcentajeGanancia;
        this.iva=iva;
        this.expira=expira;
        
        
         
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * @return the precioBase
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * @return the porcentajeGanancia
     */
    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    /**
     * @param porcentajeGanancia the porcentajeGanancia to set
     */
    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    /**
     * @return the iva
     */
    public IVA getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(IVA iva) {
        this.iva = iva;
    }

    /**
     * @return the expira
     */
    public Expira getExpira() {
        return expira;
    }

    /**
     * @param expira the expira to set
     */
    public void setExpira(Expira expira) {
        this.expira = expira;
    }

    /**
     * Verifica si el producto está expirado para una fecha dada.
     * @param fechaCorte la fecha con la que se compara
     * @return true si la fecha de expiración es anterior a fechaCorte
     */
    
    public boolean expirado(LocalDate fechaCorte) {
        return expira.esAnteriorA(fechaCorte); // Usa isBefore internamente
    }

    /**
     * Calcula la inversión total en este producto (precioBase × existencia).
     * @return total invertido
     */
    public double calcularInversion() {
        return precioBase * existencia;
    }

    /**
     * Calcula el precio final de venta considerando ganancia e IVA.
     * @return precio unitario con ganancia e impuesto
     */
    public double calcularPrecioVenta() {
        double ganancia = precioBase * (porcentajeGanancia / 100);
        double precioSinIVA = precioBase + ganancia;
        double montoIVA = precioSinIVA * (iva.getValor() / 100);
        return precioSinIVA + montoIVA;
    }

    /**
     * Representación textual del producto con todos sus atributos visibles.
     */    
    @Override
    public String toString() {
        return "Codigo: " + codigo +
               "\nNombre: " + nombre +
               "\nExistencia: " + existencia +
               "\nPrecio base: " + precioBase + " Colones" +
               "\n% Ganancia: " + porcentajeGanancia +
               "\n" + iva.toString() +
               "\n" + expira.toString();
    }


}
