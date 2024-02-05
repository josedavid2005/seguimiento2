package Ejercicio7;

import static Ejercicio7.Envio.solicitarDatosEnvio;

public class Main {
    public static void main(String[] args) {
        Envio envio = solicitarDatosEnvio();
        System.out.println("Costo por kilo del envío: " + envio.calcularCostoXKilo());
        envio.verificarEntrega();
    }
}
