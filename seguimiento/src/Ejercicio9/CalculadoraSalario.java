package Ejercicio9;

public class CalculadoraSalario {
    private double horasTrabajadas;

    public CalculadoraSalario(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        double salario;

        if (horasTrabajadas > 0 && horasTrabajadas <= 10) {
            salario = horasTrabajadas * 30000;
        } else if (horasTrabajadas > 10) {
            salario = 10 * 30000 + (horasTrabajadas - 10) * 33000;
        } else {
            salario = 0;
        }

        return salario;
    }

    public void mostrarMensaje(String nombre) {
        double salario = calcularSalario();
        System.out.println("Señor/a " + nombre + ", el número de horas es " + horasTrabajadas +
                " y su salario equivale a $" + salario);
    }
}
