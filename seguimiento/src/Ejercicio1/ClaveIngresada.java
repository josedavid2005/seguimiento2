package Ejercicio1;

public class ClaveIngresada extends ClaveBase {
    private boolean cambioRequerido;
    public ClaveIngresada(String clave, boolean cambioRequerido) {
        super(clave);
        this.cambioRequerido = cambioRequerido;
    }

    public boolean isCambioRequerido() {
        return cambioRequerido;
    }
}
