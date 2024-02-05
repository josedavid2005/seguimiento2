package Ejercicio14;

import java.util.Scanner;

public class MayorEntreTres {
    private double numero1;
    private double numero2;
    private double numero3;

    public MayorEntreTres(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double encontrarNumeroMayor() {
        return Math.max(Math.max(numero1, numero2), numero3);
    }

    public void mostrarMensaje() {
        System.out.println("El número mayor entre los tres números es: " + encontrarNumeroMayor());
    }

    public static MayorEntreTres solicitarDatosNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        return new MayorEntreTres(numero1, numero2, numero3);
    }
}
