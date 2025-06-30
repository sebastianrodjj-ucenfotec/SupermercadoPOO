/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

/**
 * Clase que presenta un menú interactivo por consola para gestionar clientes.
 * Utiliza la clase GestorClientes como backend para realizar operaciones
 * como registrar, buscar, listar y eliminar clientes.
 * 
 * Esta clase representa la interfaz de texto entre el usuario y el sistema.
 * 
 * @author sebas
 */
public class ClienteMenu {

    // Instancia de gestor para manejar la lógica y lista de clientes
    private GestorClientes gestor;

    // Objeto Scanner para leer datos desde la consola
    private Scanner sc;

    /**
     * Constructor por defecto.
     * Inicializa el gestor de clientes y el escáner de entrada.
     */
    public ClienteMenu() {
        gestor = new GestorClientes();
        sc = new Scanner(System.in);
    }

    /**
     * Inicia el menú principal que permite al usuario realizar distintas
     * operaciones sobre los clientes.
     */
    public void iniciar() {
        int opcion;
        do {
            System.out.println("=== MENU CLIENTES ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Buscar cliente");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    // Registro de nuevo cliente
                    System.out.print("Cedula: ");
                    String ced = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Telefono: ");
                    String tel = sc.nextLine();

                    Clientes nuevo = new Clientes(ced, nom, tel);

                    if (gestor.registrarCliente(nuevo)) {
                        System.out.println("Cliente registrado.");
                    } else {
                        System.out.println("El cliente ya existe.");
                    }
                    break;

                case 2:
                    // Listado de todos los clientes
                    System.out.println("--- Clientes registrados ---");
                    for (Clientes c : gestor.listarClientes()) {
                        System.out.println(c.toString());
                        System.out.println("---------------------------");
                    }
                    break;

                case 3:
                    // Eliminación de cliente por cédula
                    System.out.print("Cedula del cliente a eliminar: ");
                    String cedulaEliminar = sc.nextLine();

                    if (gestor.eliminarClientePorCedula(cedulaEliminar)) {
                        System.out.println("Cliente eliminado.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 4:
                    // Búsqueda de cliente por cédula
                    System.out.print("Cedula a buscar: ");
                    String cedulaBuscar = sc.nextLine();

                    Clientes encontrado = gestor.buscarClientePorCedula(cedulaBuscar);
                    if (encontrado != null) {
                        System.out.println(encontrado.toString());
                    } else {
                        System.out.println("Cliente no existe.");
                    }
                    break;

                case 5:
                    // Cierre del menú
                    System.out.println("Cerrando modulo de clientes...");
                    break;

                default:
                    System.out.println("Opcion no válida.");
            }

        } while (opcion != 5);
    }
}