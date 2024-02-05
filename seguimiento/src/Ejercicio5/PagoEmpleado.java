package Ejercicio5;

import java.util.Scanner;

public class PagoEmpleado {
    private int codEmpleado;
    private double salarioBasico;
    private double horasExtras;
    private double numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    public PagoEmpleado(int codEmpleado, double salarioBasico, double horasExtras, double numeroHoras,
                        double descuento, double descuentoPrestamo, double bonificacion, double neto) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        this.neto = neto;
    }

    public double calcularValorHE() {
        return salarioBasico * (horasExtras / numeroHoras);
    }

    public double calcularDevengado() {
        return salarioBasico + calcularValorHE() + bonificacion;
    }

    public double calcularDeducido() {
        return descuento + descuentoPrestamo;
    }

    public double calcularNeto() {
        return calcularDevengado() - calcularDeducido();
    }

    public static PagoEmpleado solicitarDatosPagoEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código de empleado: ");
        int codEmpleado = scanner.nextInt();

        System.out.print("Ingrese el salario básico: ");
        double salarioBasico = scanner.nextDouble();

        System.out.print("Ingrese las horas extras trabajadas: ");
        double horasExtras = scanner.nextDouble();

        System.out.print("Ingrese el número total de horas trabajadas: ");
        double numeroHoras = scanner.nextDouble();

        System.out.print("Ingrese el descuento: ");
        double descuento = scanner.nextDouble();

        System.out.print("Ingrese el descuento por préstamo: ");
        double descuentoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la bonificación: ");
        double bonificacion = scanner.nextDouble();

        System.out.println("Datos ingresados correctamente.");

        return new PagoEmpleado(codEmpleado, salarioBasico, horasExtras, numeroHoras,
                descuento, descuentoPrestamo, bonificacion, 0.0);
    }
}