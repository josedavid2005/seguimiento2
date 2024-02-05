package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        DeterminarPositivoNegativo determinador = new DeterminarPositivoNegativo(numero);
        determinador.mostrarMensaje();

        scanner.close();
    }
}
