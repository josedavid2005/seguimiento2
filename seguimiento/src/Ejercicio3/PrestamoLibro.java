package Ejercicio3;

import java.util.Scanner;

public class PrestamoLibro {
    private int codPrestamo;
    private String fechaPrestamo;
    private String nombreLibro;
    private int codigoUsuario;
    private int diasDePrestamo;
    private String estadoPrestamo;

    public PrestamoLibro(int codPrestamo, String fechaPrestamo, String nombreLibro, int codigoUsuario, int diasDePrestamo, String estadoPrestamo) {
        this.codPrestamo = codPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasDePrestamo = diasDePrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    public void consultarEstadoPrestamo() {
        System.out.println("Estado del préstamo (Código " + codPrestamo + "): " + estadoPrestamo);
    }

    public void consultarDatosPrestamo() {
        System.out.println("Datos del préstamo (Código " + codPrestamo + "):");
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Libro prestado: " + nombreLibro);
        System.out.println("Código de usuario: " + codigoUsuario);
        System.out.println("Días de préstamo: " + diasDePrestamo);
        System.out.println("Estado del préstamo: " + estadoPrestamo);
    }

    public static PrestamoLibro solicitarDatosPrestamo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código de préstamo: ");
        int codPrestamo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la fecha de préstamo: ");
        String fechaPrestamo = scanner.nextLine();

        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = scanner.nextLine();

        System.out.print("Ingrese el código de usuario: ");
        int codigoUsuario = scanner.nextInt();

        System.out.print("Ingrese los días de préstamo: ");
        int diasDePrestamo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el estado del préstamo: ");
        String estadoPrestamo = scanner.nextLine();

        scanner.close();

        return new PrestamoLibro(codPrestamo, fechaPrestamo, nombreLibro, codigoUsuario, diasDePrestamo, estadoPrestamo);
    }
}
