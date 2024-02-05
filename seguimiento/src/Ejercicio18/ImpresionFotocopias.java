package Ejercicio18;

import java.util.Scanner;

public class ImpresionFotocopias {
    private int cantidadCopias;

    public ImpresionFotocopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    private double calcularPrecioPorCopia() {
        if (cantidadCopias >= 0 && cantidadCopias < 500) {
            return 120.0;
        } else if (cantidadCopias < 750) {
            return 100.0;
        } else if (cantidadCopias < 1000) {
            return 80.0;
        } else {
            return 50.0;
        }
    }

    public double calcularPrecioTotal() {
        return cantidadCopias * calcularPrecioPorCopia();
    }

    public void mostrarMensaje() {
        System.out.println("Precio por copia: $" + calcularPrecioPorCopia());
        System.out.println("Precio total: $" + calcularPrecioTotal());
    }

    public static ImpresionFotocopias solicitarDatosImpresion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de copias que desea imprimir: ");
        int cantidadCopias = scanner.nextInt();

        return new ImpresionFotocopias(cantidadCopias);
    }
}