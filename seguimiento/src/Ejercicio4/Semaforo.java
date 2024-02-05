package Ejercicio4;

import java.util.Scanner;

public class Semaforo {
    private String colorBombilla;
    private boolean encendidoApagado;

    public Semaforo(String colorBombilla, boolean encendidoApagado) {
        this.colorBombilla = colorBombilla;
        this.encendidoApagado = encendidoApagado;
    }

    public boolean isEncendidoApagado() {
        return encendidoApagado;
    }

    public void cambiarColor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nuevo color de la bombilla: ");
        this.colorBombilla = scanner.nextLine();

        System.out.println("Color de la bombilla cambiado a: " + colorBombilla);
    }

    public void apagarSemaforo() {
        this.encendidoApagado = false;
        System.out.println("Semaforo apagado.");
    }

    public void encenderSemaforo() {
        this.encendidoApagado = true;
        System.out.println("Semaforo encendido.");
    }

    public void mostrarMensajeAIVehiculo() {
        if (encendidoApagado) {
            System.out.println("Atención conductores: El semáforo está en color " + colorBombilla);
        } else {
            System.out.println("Atención conductores: El semáforo está apagado");
        }
    }

    public static Semaforo solicitarDatosSemaforo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el color inicial de la bombilla: ");
        String colorInicial = scanner.nextLine();

        System.out.print("¿El semáforo está encendido? (true/false): ");
        boolean semaforoEncendido = scanner.nextBoolean();
        scanner.nextLine();

        return new Semaforo(colorInicial, semaforoEncendido);
    }
}
