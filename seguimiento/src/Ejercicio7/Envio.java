package Ejercicio7;

import java.util.Scanner;

public class Envio {
    private int numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    private String cedulaCliente;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private String estadoEnvio;

    public Envio(int numeroGuia, String fecha, String tipoEmbalaje, String cedulaCliente,
                 double peso, String ciudadOrigen, String ciudadDestino, double costo, String estadoEnvio) {
        this.numeroGuia = numeroGuia;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.estadoEnvio = estadoEnvio;
    }

    public double calcularCostoXKilo() {
        return costo / peso;
    }

    public void verificarEntrega() {
        if (estadoEnvio.equalsIgnoreCase("Entregado")) {
            System.out.println("El envío ha sido entregado con éxito.");
        } else {
            System.out.println("El envío aún no ha sido entregado.");
        }
    }

    public static Envio solicitarDatosEnvio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de guía: ");
        int numeroGuia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la fecha de envío: ");
        String fecha = scanner.nextLine();

        System.out.print("Ingrese el tipo de embalaje: ");
        String tipoEmbalaje = scanner.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        String cedulaCliente = scanner.nextLine();

        System.out.print("Ingrese el peso del envío en kilogramos: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese la ciudad de origen: ");
        String ciudadOrigen = scanner.nextLine();

        System.out.print("Ingrese la ciudad de destino: ");
        String ciudadDestino = scanner.nextLine();

        System.out.print("Ingrese el costo del envío: ");
        double costo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el estado del envío (Entregado/Pendiente): ");
        String estadoEnvio = scanner.nextLine();

        return new Envio(numeroGuia, fecha, tipoEmbalaje, cedulaCliente, peso,
                ciudadOrigen, ciudadDestino, costo, estadoEnvio);
    }

}
