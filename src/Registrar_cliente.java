import java.util.ArrayList;
import java.util.Scanner;

public class Registrar_cliente {

    private static int nextId = 1;

    private int ID;
    private String nombre;
    private String DNI;
    private String correo;
    private String telefono;
    private ArrayList<Agregar_mascota> mascotas;


    public Registrar_cliente() {
        this.ID = nextId++;
        this.mascotas = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Agregar_mascota> getMascotas() {
        return mascotas;
    }

    public static Registrar_cliente registrar(){
        Scanner sc = new Scanner(System.in);
        Registrar_cliente cliente = new Registrar_cliente();
        System.out.print("Nombre: ");
        cliente.setNombre(sc.nextLine());
        System.out.print("DNI: ");
        cliente.setDNI(sc.nextLine());
        System.out.print("Correo: ");
        cliente.setCorreo(sc.nextLine());
        System.out.print("Telefono: ");
        cliente.setTelefono(sc.nextLine());
        return cliente;
    }

    public void Imprimir_cliente(){
        System.out.println("--------------------");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        if (!mascotas.isEmpty()) {
            System.out.println("Mascotas adoptadas:");
            for (Agregar_mascota mascota : mascotas) {
                mascota.imprimir_mascota();
            }
        }
        System.out.println("--------------------");
    }
}
