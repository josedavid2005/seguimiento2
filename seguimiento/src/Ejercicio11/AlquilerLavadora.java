package Ejercicio11;

import java.util.Scanner;

public class AlquilerLavadora {
    private int tipoLavadora;
    private int horasAlquiladas;

    public AlquilerLavadora(int tipoLavadora, int horasAlquiladas) {
        this.tipoLavadora = tipoLavadora;
        this.horasAlquiladas = horasAlquiladas;
    }

    public double calcularCostoTotal() {
        double costoPorHora = (tipoLavadora == 1) ? 4000 : 3000;
        double costoSinDescuento = horasAlquiladas * costoPorHora;

        if (horasAlquiladas > 3) {
            double descuento = 0.03 * costoSinDescuento;
            return costoSinDescuento - descuento;
        } else {
            return costoSinDescuento;
        }
    }

    public void mostrarMensaje() {
        System.out.println("El costo total del alquiler es: $" + calcularCostoTotal());
    }

    public static AlquilerLavadora solicitarDatosAlquiler() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de lavadora (1 para grande, 2 para pequeña): ");
        int tipoLavadora = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas alquiladas: ");
        int horasAlquiladas = scanner.nextInt();

        return new AlquilerLavadora(tipoLavadora, horasAlquiladas);
    }
}
