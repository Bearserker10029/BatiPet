import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        Adoptar_mascota adoptar_mascota = new Adoptar_mascota();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n--- Menú BatiPet ---");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Adoptar mascota");
            System.out.println("4. Buscar mascota");
            System.out.println("5. Buscar cliente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        Agregar_mascota mascota = Agregar_mascota.registrar();
                        gestor.getListamascotas().add(mascota);
                        System.out.println("¡Mascota agregada con éxito con ID: " + mascota.getID() + "!");
                        break;
                    case 2:
                        Registrar_cliente cliente = Registrar_cliente.registrar();
                        gestor.getListaclientes().add(cliente);
                        System.out.println("¡Cliente registrado con éxito con ID: " + cliente.getID() + "!");
                        break;
                    case 3:
                        adoptar_mascota.AdoptarMascota();
                        break;
                    case 4:
                        gestor.buscarMascota();
                        break;
                    case 5:
                        gestor.buscarCliente();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
            }
        }
    }
}
