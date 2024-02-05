package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ClaveBase claveBase = new ClaveBase("claveSegura");
        ClaveIngresada claveIngresada = new ClaveIngresada("claveUsuario", true);

        EstadoSistema estadoSistema = new EstadoSistema(true);

        UsuarioBase usuarioBase = new UsuarioBase("usuario1", claveBase, estadoSistema);
        UsuarioIngresado usuarioIngresado = new UsuarioIngresado("usuario2", claveIngresada, estadoSistema);

        usuarioBase.validarEstado();
        usuarioBase.permitirAcceso();

        usuarioIngresado.validarEstado();
        usuarioIngresado.permitirAcceso();

        estadoSistema.setSistemaActivo(false);

        usuarioBase.validarEstado();
        usuarioBase.permitirAcceso();

        usuarioIngresado.validarEstado();
        usuarioIngresado.permitirAcceso();
    }
}


