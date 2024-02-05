package Ejercicio6;

import static Ejercicio6.AreaRectangulo.solicitarDatosRectangulo;

public class Main {
    public static void main(String[] args) {
        AreaRectangulo rectangulo = solicitarDatosRectangulo();

        if (rectangulo.validarDatosIngresados()) {
            System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        } else {
            System.out.println("Los datos ingresados no son válidos para calcular el área del rectángulo.");
        }
    }
}
