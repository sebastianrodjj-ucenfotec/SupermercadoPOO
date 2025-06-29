/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author sebas
 */
public class IVA {

    // Porcentaje del IVA (por ejemplo, 13.0 para 13%)
    private double valor;
    
    // Período durante el cual este valor del IVA es válido
    private Periodo periodo;
    
    // Constructor por defecto: establece un IVA de 0.0% y un período por defecto
    public IVA() {
        valor = 0.0;
        periodo = new Periodo();
    }

    // Constructor sobrecargado: permite establecer el valor y el período
    public IVA(double valor, Periodo periodo) {
        this.valor = valor;
        this.periodo = periodo;
    }

    /**
     * @return the valor
     */
    
    // Getter del porcentaje del IVA
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    
    // Setter para modificar el valor del IVA
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the periodo
     */
    
    // Getter del período asociado
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    
    // Setter para modificar el período
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    // Representación textual del IVA con su período
    @Override
    public String toString() {
        return "IVA: " + valor + "%\n" + periodo.toString();
    }
}

    

