package Ejercicio17;

import java.util.Scanner;

public class Triangulo {
    private int angulo1;
    private int angulo2;
    private int angulo3;

    public Triangulo(int angulo1, int angulo2, int angulo3) {
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
    }

    public boolean esTrianguloValido() {
        return (angulo1 + angulo2 + angulo3 == 180);
    }

    public void mostrarMensaje() {
        if (esTrianguloValido()) {
            System.out.println("Los ángulos ingresados forman un triángulo válido.");
        } else {
            System.out.println("Los ángulos ingresados no forman un triángulo válido.");
        }
    }

    public static Triangulo solicitarDatosAngulos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo: ");
        int angulo1 = scanner.nextInt();

        System.out.print("Ingrese el segundo ángulo: ");
        int angulo2 = scanner.nextInt();

        System.out.print("Ingrese el tercer ángulo: ");
        int angulo3 = scanner.nextInt();

        return new Triangulo(angulo1, angulo2, angulo3);
    }
}
