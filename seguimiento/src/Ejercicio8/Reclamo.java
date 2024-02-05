package Ejercicio8;

import java.util.Scanner;

public class Reclamo {
    private int numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String estadoReclamo;

    public Reclamo(int numeroReclamo, String nombrePersona, String asunto, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.estadoReclamo = estadoReclamo;
    }

    public boolean validarEstadoReclamo() {
        // Lógica para validar el estado del reclamo
        return estadoReclamo.equalsIgnoreCase("Pendiente") || estadoReclamo.equalsIgnoreCase("Resuelto");
    }

    public void mensajeRecepcionReclamo() {
        System.out.println("Gracias por su reclamo. Estamos procesando su solicitud.");
    }

    public static Reclamo solicitarDatosReclamo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de reclamo: ");
        int numeroReclamo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombrePersona = scanner.nextLine();

        System.out.print("Ingrese el asunto del reclamo: ");
        String asunto = scanner.nextLine();

        System.out.print("Ingrese el estado del reclamo (Pendiente/Resuelto): ");
        String estadoReclamo = scanner.nextLine();

        return new Reclamo(numeroReclamo, nombrePersona, asunto, estadoReclamo);
    }

}
