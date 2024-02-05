package Ejercicio1;

public class UsuarioBase {
    private String usuario;
    private ClaveBase clave;
    private EstadoSistema estado;

    // Constructor
    public UsuarioBase(String usuario, ClaveBase clave, EstadoSistema estado) {
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }

    public void validarEstado() {
        if (estado.isSistemaActivo()) {
            System.out.println("El sistema está activo.");
        } else {
            System.out.println("El sistema está inactivo. No se puede acceder.");
        }
    }

    public void permitirAcceso() {
        if (estado.isSistemaActivo()) {
            System.out.println("Acceso permitido para el usuario: " + usuario);
        } else {
            System.out.println("Acceso denegado. El sistema está inactivo.");
        }
    }
}
