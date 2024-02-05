package Ejercicio23;

public class Main {
    public static void main(String[] args) {
        GameOf21 game = new GameOf21();

        game.jugarUsuario();

        game.jugarMaquina();

        game.determinarGanador();
    }
}
