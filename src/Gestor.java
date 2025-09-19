import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestor {
    private ArrayList<Agregar_mascota> listamascotas = new ArrayList<>();
    private ArrayList<Registrar_cliente> listaclientes = new ArrayList<>();


    public void buscarMascota() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar mascota por:");
        System.out.print("1. ID\n");
        System.out.print("2. Nombre\n");
        System.out.print("Dejar en blanco para mostrar todos los Mascotas\n");
        String opcion = sc.nextLine();
        ArrayList<Agregar_mascota> resultados = new ArrayList<>();

        if (opcion.equals("1")) {
            try {
                System.out.print("Ingrese ID de la mascota: ");
                int id = sc.nextInt();
                Agregar_mascota mascota = buscarMascotaPorId(id);
                if (mascota != null) {
                    resultados.add(mascota);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El ID debe ser un número.");
            }
        } else if (opcion.equals("2")) {
            System.out.print("Ingrese nombre de la mascota: ");
            String nombre = sc.nextLine();
            for (Agregar_mascota mascota : listamascotas) {
                if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                    resultados.add(mascota);
                }
            }
        } else {
            resultados.addAll(listamascotas);
        }

        System.out.println("--- Resultados de Búsqueda de Mascotas ---");
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron mascotas con ese criterio.");
        } else {
            for (Agregar_mascota mascota : resultados) {
                mascota.imprimir_mascota();
            }
        }
    }

    public void buscarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar cliente por: ");
        System.out.print("1. ID\n");
        System.out.print("2. Nombre\n");
        System.out.print("Dejar en blanco para mostrar todos los clientes\n");
        String opcion = sc.nextLine();
        ArrayList<Registrar_cliente> resultados = new ArrayList<>();

        if (opcion.equals("1")) {
            try {
                System.out.print("Ingrese ID del cliente: ");
                int id = sc.nextInt();
                Registrar_cliente cliente = buscarClientePorId(id);
                if (cliente != null) {
                    resultados.add(cliente);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El ID debe ser un número.");
            }
        } else if (opcion.equals("2")) {
            System.out.print("Ingrese nombre del cliente: ");
            String nombre = sc.nextLine();
            for (Registrar_cliente cliente : listaclientes) {
                if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                    resultados.add(cliente);
                }
            }
        } else {
            resultados.addAll(listaclientes);
        }

        System.out.println("--- Resultados de Búsqueda de Clientes ---");
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron clientes con ese criterio.");
        } else {
            for (Registrar_cliente cliente : resultados) {
                cliente.Imprimir_cliente();
            }
        }
    }

    public Agregar_mascota buscarMascotaPorId(int id) {
        for (Agregar_mascota mascota : listamascotas) {
            if (mascota.getID() == id) {
                return mascota;
            }
        }
        return null;
    }

    public Registrar_cliente buscarClientePorId(int id) {
        for (Registrar_cliente cliente : listaclientes) {
            if (cliente.getID() == id) {
                return cliente;
            }
        }
        return null;
    }

    // Getters y Setters para las listas principales
    public ArrayList<Agregar_mascota> getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(ArrayList<Agregar_mascota> listamascotas) {
        this.listamascotas = listamascotas;
    }

    public ArrayList<Registrar_cliente> getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList<Registrar_cliente> listaclientes) {
        this.listaclientes = listaclientes;
    }
}
