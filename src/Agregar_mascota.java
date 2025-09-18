import java.util.InputMismatchException;
import java.util.Scanner;

public class Agregar_mascota {

    private static int nextId = 1;

    private int ID;
    private int tipo; // 1=Normal, 2=Exótica
    private String nombre;
    private String especie;
    private int edad;
    private String paisOrigen; // Solo para exóticas
    private boolean adoptada;
    private Registrar_cliente dueno;

    public Agregar_mascota() {
        this.ID = nextId++;
        this.adoptada = false;
        this.dueno = null;
        this.paisOrigen = "N/A";
    }

    // Getters y Setters

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean isAdoptada() {
        return adoptada;
    }

    public void setAdoptada(boolean adoptada) {
        this.adoptada = adoptada;
    }

    public Registrar_cliente getDueno() {
        return dueno;
    }

    public void setDueno(Registrar_cliente dueno) {
        this.dueno = dueno;
    }

    public static Agregar_mascota registrar(){
        Scanner sc = new Scanner(System.in);
        Agregar_mascota mascota = new Agregar_mascota();

        System.out.println("Ingrese el nombre de la mascota:");
        mascota.setNombre(sc.nextLine());

        System.out.println("Ingrese la especie:");
        mascota.setEspecie(sc.nextLine());

        while (true) {
            try {
                System.out.println("Ingrese la edad:");
                mascota.setEdad(sc.nextInt());
                sc.nextLine(); // Consumir salto de línea
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número.");
                sc.nextLine(); // Limpiar buffer
            }
        }

        while (true) {
            try {
                System.out.println("Ingrese el tipo de mascota (1=Normal, 2=Exótica):");
                int tipoMascota = sc.nextInt();
                sc.nextLine();
                if (tipoMascota == 1 || tipoMascota == 2) {
                    mascota.setTipo(tipoMascota);
                    if (tipoMascota == 2) {
                        System.out.println("Ingrese el país de origen:");
                        mascota.setPaisOrigen(sc.nextLine());
                    }
                    break;
                } else {
                    System.out.println("Error: Tipo no válido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El tipo debe ser un número.");
            }
        }
        return mascota;
    }

    public void imprimir_mascota(){
        System.out.println("\t--------------------");
        System.out.println("\tID: " + ID);
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEspecie: " + especie);
        System.out.println("\tEdad: " + edad);
        if (tipo == 2) {
            System.out.println("\tPaís de Origen: " + paisOrigen);
        }
        if (adoptada) {
            System.out.println("\tAdoptada por: " + dueno.getNombre() + " (ID Cliente: " + dueno.getID() + ")");
        } else {
            System.out.println("\tEstado: Disponible para adopción");
        }
        System.out.println("\t--------------------");
    }
}
