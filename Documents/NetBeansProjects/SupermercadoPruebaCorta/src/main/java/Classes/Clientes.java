/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Clase que representa a un cliente dentro del sistema.
 * Contiene información básica como cédula, nombre y teléfono.
 * Se puede extender para asociar cuentas u otras operaciones.
 * 
 * @author sebas
 */
public class Clientes {

    /*
     * Atributos privados de la clase.
     * Representan los datos personales del cliente.
     */
    private String cedula;
    private String nombre;
    private String telefono;

    /**
     * Constructor por defecto.
     * Inicializa todos los campos como cadenas vacías.
     */
    public Clientes() {
        cedula = "";
        nombre = "";
        telefono = "";
    }

    /**
     * Constructor sobrecargado.
     * Permite crear un objeto Cliente con todos los datos desde el inicio.
     * 
     * @param cedula número de identificación único del cliente
     * @param nombre nombre completo del cliente
     * @param telefono número telefónico del cliente
     */
    public Clientes(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Retorna la cédula del cliente.
     * 
     * @return String con el número de cédula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Permite modificar la cédula del cliente.
     * 
     * @param cedula nueva cédula a asignar
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Retorna el nombre completo del cliente.
     * 
     * @return String con el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite modificar el nombre del cliente.
     * 
     * @param nombre nuevo nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el número de teléfono asociado al cliente.
     * 
     * @return String con el teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Permite modificar el número telefónico del cliente.
     * 
     * @param telefono nuevo teléfono a asignar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve una representación textual del objeto cliente.
     * 
     * @return información del cliente en formato legible
     */
    @Override
    public String toString() {
        return "Cédula: " + cedula + "\nNombre: " + nombre + "\nTeléfono: " + telefono;
    }
}