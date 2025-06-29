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
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Métodos constructores

    // Constructor por defecto (C.Default)
    public Periodo() {
        fechaInicio = LocalDate.now(); // Fecha actual del sistema
        fechaFin = LocalDate.now();    // Fecha final igual por defecto
    }

    // Constructor sobrecargado (C.Sobrecargado)
    public Periodo(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Métodos accesores y mutadores (getters y setters)

    /**
     * @return the fechaInicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método toString

    @Override
    public String toString() {
        return "Inicio: " + this.getFechaInicio() + "\nFin: " + this.getFechaFin();
    }
}