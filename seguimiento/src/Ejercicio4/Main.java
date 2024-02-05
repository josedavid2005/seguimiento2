package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = Semaforo.solicitarDatosSemaforo();

        semaforo.cambiarColor();
        semaforo.mostrarMensajeAIVehiculo();

        if (semaforo.isEncendidoApagado()) {
            semaforo.apagarSemaforo();
        } else {
            semaforo.encenderSemaforo();
        }

        semaforo.mostrarMensajeAIVehiculo();
    }
}
