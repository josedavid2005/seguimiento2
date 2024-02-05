package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas durante la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        CalculadoraSalario calculadora = new CalculadoraSalario(horasTrabajadas);
        calculadora.mostrarMensaje(nombre);

        scanner.close();
    }
}
