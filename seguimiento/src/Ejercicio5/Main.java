package Ejercicio5;

import static Ejercicio5.PagoEmpleado.solicitarDatosPagoEmpleado;

public class Main {
    public static void main(String[] args) {
        PagoEmpleado empleado = solicitarDatosPagoEmpleado();
        System.out.println("Valor de horas extras calculado: " + empleado.calcularValorHE());
        System.out.println("Devengado calculado: " + empleado.calcularDevengado());
        System.out.println("Deducido calculado: " + empleado.calcularDeducido());
        System.out.println("Neto calculado: " + empleado.calcularNeto());
    }
}
