package Ejercicio10;

public class DeterminarPositivoNegativo {
    private double numero;

    public DeterminarPositivoNegativo(double numero) {
        this.numero = numero;
    }

    public String determinarPositivoNegativo() {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    public void mostrarMensaje() {
        System.out.println("El número ingresado es " + determinarPositivoNegativo());
    }

}
