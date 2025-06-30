/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar las operaciones sobre la lista de clientes.
 * Implementa la interfaz OperacionesCliente.
 * Permite registrar, buscar, eliminar y listar clientes sin permitir duplicados.
 * 
 * @author sebas
 */
public class GestorClientes implements OperacionesCliente {

    // Lista que almacena todos los clientes registrados
    private ArrayList<Clientes> clientes;

    /**
     * Constructor por defecto.
     * Inicializa la lista vacía de clientes.
     */
    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    /**
     * Registra un nuevo cliente en la lista, si no está duplicado.
     * 
     * @param c objeto Clientes a registrar
     * @return true si se agregó correctamente, false si ya existía
     */
    @Override
    public boolean registrarCliente(Clientes c) {
        for (Clientes existente : clientes) {
            if (existente.getCedula().equals(c.getCedula())) {
                return false; // Ya hay un cliente con la misma cédula
            }
        }
        return clientes.add(c);
    }

    /**
     * Elimina un cliente según su número de cédula.
     * 
     * @param cedula número de cédula del cliente a eliminar
     * @return true si fue eliminado, false si no se encontró
     */
    @Override
    public boolean eliminarClientePorCedula(String cedula) {
        for (Clientes c : clientes) {
            if (c.getCedula().equals(cedula)) {
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un cliente por su número de cédula.
     * 
     * @param cedula número de cédula del cliente a buscar
     * @return objeto Clientes si se encontró, null si no existe
     */
    @Override
    public Clientes buscarClientePorCedula(String cedula) {
        for (Clientes c : clientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Devuelve la lista completa de clientes registrados.
     * 
     * @return lista tipo List<Clientes>
     */
    @Override
    public List<Clientes> listarClientes() {
        return clientes;
    }
}