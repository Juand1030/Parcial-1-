import java.util.Scanner;

public class MenuBanco {
    private GestionCola gestion = new GestionCola();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n--- CAJERO POPULAR: GESTIÓN DE TURNOS ---");
            System.out.println("1. Agregar cliente a la fila");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Ver quién sigue en espera");
            System.out.println("4. Ver lista de espera completa");
            System.out.println("5. Cantidad de personas en cola");
            System.out.println("6. Vaciar cola (Emergencia)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                procesarOpcion(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número del 1 al 7.");
            }
        } while (opcion != 7);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Nombre completo: "); String nom = scanner.nextLine();
                System.out.print("Cédula/ID: "); String id = scanner.nextLine();
                System.out.print("Tipo (Depósito, Retiro, Consulta, Pago): "); String tipo = scanner.nextLine();
                System.out.print("¿Es prioridad (Adulto mayor/Discapacidad)? (s/n): ");
                boolean prio = scanner.nextLine().equalsIgnoreCase("s");
                
                gestion.encolarCliente(new Cliente(nom, id, tipo, prio));
                System.out.println("Cliente registrado en la fila.");
                break;
            case 2:
                Cliente atendido = gestion.atenderSiguiente();
                if (atendido != null) System.out.println("ATENDIENDO A: " + atendido);
                else System.out.println("No hay clientes en la fila.");
                break;
            case 3:
                Cliente proximo = gestion.verProximo();
                if (proximo != null) System.out.println("EL SIGUIENTE ES: " + proximo);
                else System.out.println("La cola está vacía.");
                break;
            case 4:
                System.out.println("--- ESTADO ACTUAL DE LA FILA ---");
                int cont = 0;
                for (Cliente c : gestion.getColaCompleta()) {
                    System.out.println((++cont) + ". " + c);
                }
                if (cont == 0) System.out.println("No hay nadie esperando.");
                break;
            case 5:
                System.out.println("Personas esperando: " + gestion.obtenerTamano());
                break;
            case 6:
                gestion.vaciarCola();
                System.out.println("La cola ha sido vaciada por emergencia.");
                break;
            case 7:
                System.out.println("Cerrando sistema...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
