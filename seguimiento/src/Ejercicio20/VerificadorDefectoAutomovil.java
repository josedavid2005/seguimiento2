package Ejercicio20;

import java.util.Scanner;

public class VerificadorDefectoAutomovil {
    private int numeroModelo;

    public VerificadorDefectoAutomovil(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    public void verificarDefecto() {
        if ((numeroModelo == 119) || (numeroModelo == 179) || (numeroModelo >= 189 && numeroModelo <= 195) || (numeroModelo == 221) || (numeroModelo == 780)) {
            System.out.println("El automóvil está defectuoso, llevar a garantía.");
        } else {
            System.out.println("Su automóvil no está defectuoso.");
        }
    }

    public static VerificadorDefectoAutomovil solicitarDatosAutomovil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de modelo de su automóvil: ");
        int numeroModelo = scanner.nextInt();

        return new VerificadorDefectoAutomovil(numeroModelo);
    }
}
