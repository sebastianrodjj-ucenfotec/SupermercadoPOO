/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas para manipular clientes.
 * Puede ser implementada por cualquier clase que gestione una lista de clientes.
 * Permite registrar, eliminar, buscar y listar clientes registrados.
 * 
 * @author sebas
 */
public interface OperacionesCliente {

    /**
     * Registra un nuevo cliente si no está duplicado.
     * 
     * @param c objeto Clientes a agregar
     * @return true si el cliente fue agregado, false si ya existe
     */
    public boolean registrarCliente(Clientes c);

    /**
     * Elimina un cliente utilizando su número de cédula.
     * 
     * @param cedula número de cédula del cliente
     * @return true si fue eliminado correctamente, false si no se encontró
     */
    public boolean eliminarClientePorCedula(String cedula);

    /**
     * Busca y devuelve un cliente basado en su cédula.
     * 
     * @param cedula número de cédula del cliente buscado
     * @return objeto Clientes si existe, null si no se encuentra
     */
    public Clientes buscarClientePorCedula(String cedula);

    /**
     * Retorna todos los clientes registrados en forma de lista.
     * 
     * @return lista de clientes registrados
     */
    public List<Clientes> listarClientes();
}