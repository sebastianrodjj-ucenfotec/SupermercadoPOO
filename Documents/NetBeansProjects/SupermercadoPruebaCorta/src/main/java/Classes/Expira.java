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

    // Atributo privado que almacena la fecha de expiración
    private LocalDate fechaExpira;

    // Constructor por defecto: establece la fecha de expiración como la fecha actual
    public Expira() {
        fechaExpira = LocalDate.now();
    }
    
    // Constructor sobrecargado: permite especificar una fecha exacta
    public Expira(LocalDate fechaExpira) {
        this.fechaExpira=fechaExpira;

    }

    /**
     * @return the fechaExpira
     */
    
    // Getter para obtener la fecha de expiración
    public LocalDate getFechaExpira() {
        return fechaExpira;
    }

    /**
     * @param fechaExpira the fechaExpira to set
     */
    
    // Setter para cambiar la fecha de expiración
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

    /**
     * Representación textual del objeto Expira.
     * @return una cadena con la fecha de expiración
     */
    
    @Override 
    public String toString(){
        return "Fecha de expiracion" + fechaExpira;
    }
}
