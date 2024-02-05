package Ejercicio19;

import java.util.Scanner;

public class EstadoComputadora {
    private boolean emitePitido;
    private boolean discoDuroGira;

    public EstadoComputadora(boolean emitePitido, boolean discoDuroGira) {
        this.emitePitido = emitePitido;
        this.discoDuroGira = discoDuroGira;
    }

    public void determinarEstado() {
        if (emitePitido && discoDuroGira) {
            System.out.println("La computadora está averiada.");
        } else if (emitePitido) {
            System.out.println("Póngase en contacto con el soporte técnico.");
        } else if (!emitePitido && !discoDuroGira) {
            System.out.println("Verificar contactos de la unidad.");
        } else {
            System.out.println("Traiga la computadora para repararla en la central.");
        }
    }

    public static EstadoComputadora solicitarDatosComputadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿La computadora emite un pitido al iniciarse? (true/false): ");
        boolean emitePitido = scanner.nextBoolean();

        System.out.print("¿El disco duro gira? (true/false): ");
        boolean discoDuroGira = scanner.nextBoolean();

        return new EstadoComputadora(emitePitido, discoDuroGira);
    }
}
