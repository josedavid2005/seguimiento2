package Ejercicio16;

import java.util.Scanner;

public class CostoMensualidad {
    private int cantidadDias;

    public CostoMensualidad(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double calcularCostoMensualidad() {
        if (cantidadDias == 15) {
            return 18000;
        } else if (cantidadDias == 30) {
            return 35000;
        } else if (cantidadDias == 90) {
            return 86000;
        } else {
            return 0;
        }
    }

    public void mostrarMensaje() {
        double costoMensualidad = calcularCostoMensualidad();
        if (costoMensualidad == 0) {
            System.out.println("No se encontró el costo para la cantidad de días ingresada.");
        } else {
            System.out.println("El costo de la mensualidad es: $" + costoMensualidad);
        }
    }

    public static CostoMensualidad solicitarDatosMensualidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días (15, 30 o 90): ");
        int cantidadDias = scanner.nextInt();

        return new CostoMensualidad(cantidadDias);
    }
}
