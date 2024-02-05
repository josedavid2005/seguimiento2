package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        PrestamoLibro prestamo = PrestamoLibro.solicitarDatosPrestamo();

        prestamo.consultarDatosPrestamo();
        prestamo.consultarEstadoPrestamo();
    }
}
