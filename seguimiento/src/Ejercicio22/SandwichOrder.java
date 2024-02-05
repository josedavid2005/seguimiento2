package Ejercicio22;

import java.util.Scanner;

public class SandwichOrder {
    private String tamaño;
    private boolean tocineta;
    private boolean jalapeño;
    private boolean pavo;
    private boolean queso;

    public SandwichOrder(String tamaño, boolean tocineta, boolean jalapeño, boolean pavo, boolean queso) {
        this.tamaño = tamaño;
        this.tocineta = tocineta;
        this.jalapeño = jalapeño;
        this.pavo = pavo;
        this.queso = queso;
    }

    public void calcularCosto() {
        double costoBase;

        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoBase = 6000;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoBase = 12000;
        } else {
            System.out.println("Tamaño de sándwich no válido.");
            return;
        }

        double costoTocineta = tocineta ? 3000 : 0;
        double costoPavo = pavo ? 3000 : 0;
        double costoQueso = queso ? 2500 : 0;

        double costoTotal = costoBase + costoTocineta + costoPavo + costoQueso;

        System.out.println("Costo total del sándwich: $" + costoTotal);
    }

    public static SandwichOrder solicitarDatosSandwich() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del sándwich (pequeño/grande): ");
        String tamaño = scanner.nextLine();

        System.out.print("¿Desea tocineta? (true/false): ");
        boolean tocineta = scanner.nextBoolean();

        System.out.print("¿Desea jalapeño? (true/false): ");
        boolean jalapeño = scanner.nextBoolean();

        System.out.print("¿Desea pavo? (true/false): ");
        boolean pavo = scanner.nextBoolean();

        System.out.print("¿Desea queso? (true/false): ");
        boolean queso = scanner.nextBoolean();

        return new SandwichOrder(tamaño, tocineta, jalapeño, pavo, queso);
    }
}
