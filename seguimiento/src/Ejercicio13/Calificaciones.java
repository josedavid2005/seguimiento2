package Ejercicio13;

import java.util.Scanner;

public class Calificaciones {
    private double fisica;
    private double quimica;
    private double biologia;
    private double matematicas;
    private double informatica;

    public Calificaciones(double fisica, double quimica, double biologia, double matematicas, double informatica) {
        this.fisica = fisica;
        this.quimica = quimica;
        this.biologia = biologia;
        this.matematicas = matematicas;
        this.informatica = informatica;
    }

    public double calcularPromedio() {
        return (fisica + quimica + biologia + matematicas + informatica) / 5.0;
    }

    public String determinarCalificacion() {
        double promedio = calcularPromedio();

        if (promedio >= 0 && promedio <= 5.9) {
            return "Mala";
        } else if (promedio >= 6 && promedio <= 8) {
            return "Buena";
        } else {
            return "Excelente";
        }
    }

    public void mostrarMensaje() {
        System.out.println("El promedio de las calificaciones es: " + calcularPromedio());
        System.out.println("La calificación es: " + determinarCalificacion());
    }

    public static Calificaciones solicitarDatosCalificaciones() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación de Física (0-10): ");
        double fisica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Química (0-10): ");
        double quimica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Biología (0-10): ");
        double biologia = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Matemáticas (0-10): ");
        double matematicas = scanner.nextDouble();

        System.out.print("Ingrese la calificación de Informática (0-10): ");
        double informatica = scanner.nextDouble();

        return new Calificaciones(fisica, quimica, biologia, matematicas, informatica);
    }
}
