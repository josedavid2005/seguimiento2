package Ejercicio15;

import java.util.Scanner;

public class AyudaAlcaldia {
    private String genero;
    private int edad;

    public AyudaAlcaldia(String genero, int edad) {
        this.genero = genero;
        this.edad = edad;
    }

    public double calcularValorMensual() {
        if (genero.equalsIgnoreCase("femenino")) {
            if (edad > 50) {
                return 120000;
            } else if (edad >= 30 && edad <= 50) {
                return 100000;
            }
        } else if (genero.equalsIgnoreCase("masculino")) {
            return 40000;
        }

        return 0;
    }

    public void mostrarMensaje() {
        double valorMensual = calcularValorMensual();
        System.out.println("El valor recibido mensualmente es: $" + valorMensual);
    }

    public static AyudaAlcaldia solicitarDatosPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el género (Femenino/Masculino): ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        return new AyudaAlcaldia(genero, edad);
    }
}
