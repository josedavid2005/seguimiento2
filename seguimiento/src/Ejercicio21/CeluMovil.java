package Ejercicio21;

import java.util.Scanner;

public class CeluMovil {
    private String operador;
    private int minutosInternacionales;

    public CeluMovil(String operador, int minutosInternacionales) {
        this.operador = operador;
        this.minutosInternacionales = minutosInternacionales;
    }

    public void calcularCostoTotal() {
        double cargoFijo;
        double valorMinutoInternacional;
        double valorPaqueteDatos;

        switch (operador.toLowerCase()) {
            case "tigo":
                cargoFijo = 45000;
                valorMinutoInternacional = 200;
                valorPaqueteDatos = 12000;
                break;
            case "claro":
                cargoFijo = 30000;
                valorMinutoInternacional = 100;
                valorPaqueteDatos = 18000;
                break;
            case "movistar":
                cargoFijo = 40000;
                valorMinutoInternacional = 250;
                valorPaqueteDatos = 8000;
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        double costoMinutosInternacionales = minutosInternacionales * valorMinutoInternacional;
        double costoTotal = cargoFijo + costoMinutosInternacionales + valorPaqueteDatos;

        System.out.println("Costo total del paquete: $" + costoTotal);
    }

    public static CeluMovil solicitarDatosCeluMovil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el operador (Tigo/Claro/Movistar): ");
        String operador = scanner.nextLine();

        System.out.print("Ingrese la cantidad de minutos internacionales consumidos: ");
        int minutosInternacionales = scanner.nextInt();

        return new CeluMovil(operador, minutosInternacionales);
    }
}
