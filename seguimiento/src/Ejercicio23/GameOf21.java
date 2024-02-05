package Ejercicio23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameOf21 {
    private ArrayList<Integer> baraja;
    private int puntajeUsuario;
    private int puntajeMaquina;

    public GameOf21() {
        baraja = new ArrayList<>();
        puntajeUsuario = 0;
        puntajeMaquina = 0;
        inicializarBaraja();
        repartirCartas();
    }

    private void inicializarBaraja() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 4; j++) {
                baraja.add(i);
            }
        }
        Collections.shuffle(baraja);
    }

    private void repartirCartas() {
        for (int i = 0; i < 2; i++) {
            puntajeUsuario += obtenerCarta();
        }

        for (int i = 0; i < 2; i++) {
            puntajeMaquina += obtenerCarta();
        }

        System.out.println("Carta de la máquina: " + obtenerCarta());
    }

    private int obtenerCarta() {
        if (baraja.isEmpty()) {
            System.out.println("Se ha agotado la baraja. Reiniciando...");
            inicializarBaraja();
        }
        int carta = baraja.remove(0);
        return carta;
    }

    public void jugarUsuario() {
        Scanner scanner = new Scanner(System.in);
        char seleccion;

        do {
            System.out.println("Tu puntuación actual: " + puntajeUsuario);
            System.out.print("¿Quieres tomar otra carta? (S/N): ");
            seleccion = scanner.next().charAt(0);

            if (seleccion == 'S' || seleccion == 's') {
                puntajeUsuario += obtenerCarta();
            }

        } while ((seleccion == 'S' || seleccion == 's') && puntajeUsuario <= 21);
    }

    public void jugarMaquina() {
        while (puntajeMaquina < 17) {
            puntajeMaquina += obtenerCarta();
        }

        System.out.println("Puntuación de la máquina: " + puntajeMaquina);
    }

    public void determinarGanador() {
        System.out.println("Tu puntuación final: " + puntajeUsuario);
        System.out.println("Puntuación de la máquina: " + puntajeMaquina);

        if (puntajeUsuario > 21 && puntajeMaquina > 21) {
            System.out.println("Ambos jugadores pierden.");
        } else if (puntajeUsuario > 21 || (puntajeMaquina <= 21 && puntajeMaquina > puntajeUsuario)) {
            System.out.println("¡La máquina gana!");
        } else if (puntajeMaquina > 21 || (puntajeUsuario <= 21 && puntajeUsuario > puntajeMaquina)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Es un empate.");
        }
    }
}
