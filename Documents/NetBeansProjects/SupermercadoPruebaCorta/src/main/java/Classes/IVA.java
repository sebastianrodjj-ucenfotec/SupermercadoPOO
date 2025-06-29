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

    private double valor;
    private Periodo periodo;

    public IVA() {
        valor = 0.0;
        periodo = new Periodo();
    }

    public IVA(double valor, Periodo periodo) {
        this.valor = valor;
        this.periodo = periodo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the periodo
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    @Override
    public String toString() {
        return "IVA: " + valor + "%\n" + periodo.toString();
    }
}

    

