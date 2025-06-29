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
public class Periodo {

    /*
     Atributos:
     tipoAcceso + TipoDeDato + nombreIdentificador
     Describen el estado del objeto en determinado momento.
     */
    
    // Fecha en la que inicia el período
    private LocalDate fechaInicio;
    
    // Fecha en la que finaliza el período
    private LocalDate fechaFin;

    
    // Métodos constructores

    /**
     * Constructor por defecto:
     * Establece el período como el día actual en ambos extremos.
     */
    
    public Periodo() {
        fechaInicio = LocalDate.now(); // Fecha actual del sistema
        fechaFin = LocalDate.now();    // Fecha final igual por defecto
    }

    /**
     * Constructor sobrecargado:
     * Permite definir una fecha de inicio y una fecha de fin personalizadas.
     * 
     * @param fechaInicio fecha desde la cual comienza el período
     * @param fechaFin fecha hasta la cual finaliza el período
     */
    
    public Periodo(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Métodos accesores y mutadores (getters y setters)

    /**
     * Obtiene la fecha de inicio del período.
     * @return fecha de inicio
     */
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Modifica la fecha de inicio del período.
     * @param fechaInicio nueva fecha de inicio
     */
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de finalización del período.
     * @return fecha de fin
     */
    
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Modifica la fecha de finalización del período.
     * @param fechaFin nueva fecha de fin
     */
    
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método toString
     /**
     * Representación textual del período con fecha de inicio y fin.
     * @return cadena con la información del período
     */
    @Override
    public String toString() {
        return "Inicio: " + this.getFechaInicio() + "\nFin: " + this.getFechaFin();
    }
}