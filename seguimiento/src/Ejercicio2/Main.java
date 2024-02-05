package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CentroMedico centroMedico = new CentroMedico("Hospital XYZ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código de la cita: ");
        int codCita = scanner.nextInt();
        scanner.nextLine();

        CitaMedica cita1 = new CitaMedica(codCita, null, null, null, null, null, centroMedico);

        cita1.crearCita();
        cita1.consultarDatosCitas();

        cita1.cambiarHora();

        cita1.consultarDatosCitas();

        scanner.close();
    }
}
