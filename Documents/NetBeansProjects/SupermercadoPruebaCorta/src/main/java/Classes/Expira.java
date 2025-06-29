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
public class Expira {

    private LocalDate fechaExpira;

    public Expira() {
        fechaExpira = LocalDate.now();
    }

    public Expira(LocalDate fechaExpira) {
        this.fechaExpira=fechaExpira;

    }

    /**
     * @return the fechaExpira
     */
    public LocalDate getFechaExpira() {
        return fechaExpira;
    }

    /**
     * @param fechaExpira the fechaExpira to set
     */
    public void setFechaExpira(LocalDate fechaExpira) {
        this.fechaExpira = fechaExpira;
    }
    /*  /**
    * Indica si esta fecha de expiración es anterior a una fecha dada.
    * @param fechaReferencia fecha con la cual se compara
    * @return true si está expirada, false si aún está vigente
    */
    public boolean esAnteriorA(LocalDate fechaReferencia) {
        return fechaExpira.isBefore(fechaReferencia);
    }

    public String toString(){
        return "Fecha de expiracion" + fechaExpira;
    }
}
/* hello */