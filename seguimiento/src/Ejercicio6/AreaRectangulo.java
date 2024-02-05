package Ejercicio6;

import java.util.Scanner;

public class AreaRectangulo {
    private double base;
    private double altura;

    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public boolean validarDatosIngresados() {
        return base > 0 && altura > 0;
    }

    public double calcularArea() {
        return base * altura;
    }

    public static AreaRectangulo solicitarDatosRectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        return new AreaRectangulo(base, altura);
    }
}
