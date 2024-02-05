package Ejercicio12;

import java.util.Scanner;

public class ParImpar {
    private int numero;

    public ParImpar(int numero) {
        this.numero = numero;
    }

    public String determinarParImpar() {
        return (numero % 2 == 0) ? "par" : "impar";
    }

    public void mostrarMensaje() {
        System.out.println("El número ingresado es " + determinarParImpar());
    }

    public static ParImpar solicitarDatosNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        return new ParImpar(numero);
    }
}
