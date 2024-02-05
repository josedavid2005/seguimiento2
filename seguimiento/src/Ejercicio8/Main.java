package Ejercicio8;

import static Ejercicio8.Reclamo.solicitarDatosReclamo;

public class Main {
    public static void main(String[] args) {
        // Solicitar datos al usuario
        Reclamo reclamo = solicitarDatosReclamo();

        // Validar el estado del reclamo y mostrar mensaje de recepción
        if (reclamo.validarEstadoReclamo()) {
            reclamo.mensajeRecepcionReclamo();
        } else {
            System.out.println("El estado del reclamo ingresado no es válido.");
        }
    }
}
