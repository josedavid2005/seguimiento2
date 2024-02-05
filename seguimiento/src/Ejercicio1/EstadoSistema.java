package Ejercicio1;

public class EstadoSistema {
    private boolean sistemaActivo;

    public EstadoSistema(boolean sistemaActivo) {
        this.sistemaActivo = sistemaActivo;
    }

    public boolean isSistemaActivo() {
        return sistemaActivo;
    }
    public void setSistemaActivo(boolean sistemaActivo) {
        this.sistemaActivo = sistemaActivo;
    }
}

