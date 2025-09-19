import java.util.InputMismatchException;
import java.util.Scanner;

public class Adoptar_mascota extends Gestor {
    public void AdoptarMascota() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el ID del cliente: ");
            int clienteId = sc.nextInt();
            System.out.print("Ingrese el ID de la mascota: ");
            int mascotaId = sc.nextInt();

            Registrar_cliente cliente = buscarClientePorId(clienteId);
            Agregar_mascota mascota = buscarMascotaPorId(mascotaId);

            if (cliente == null) {
                System.out.println("Error: No se encontró un cliente con ese ID.");
                return;
            }
            if (mascota == null) {
                System.out.println("Error: No se encontró una mascota con ese ID.");
                return;
            }
            if (mascota.isAdoptada()) {
                System.out.println("Error: Esta mascota ya ha sido adoptada.");
                return;
            }

            mascota.setAdoptada(true);
            mascota.setDueno(cliente);
            cliente.getMascotas().add(mascota);

            System.out.println("¡Adopción registrada con éxito!");
            System.out.println(cliente.getNombre() + " ha adoptado a " + mascota.getNombre());

        } catch (InputMismatchException e) {
            System.out.println("Error: Los IDs deben ser números.");
        }
    }



}
