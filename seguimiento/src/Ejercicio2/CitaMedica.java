package Ejercicio2;

import java.util.Scanner;

public class CitaMedica {
    private int codCita;
    private String fecha;
    private String hora;
    private String consultorio;
    private String nombreMedico;
    private String nombrePaciente;
    private CentroMedico centroMedico;

    public CitaMedica(int codCita, String fecha, String hora, String consultorio, String nombreMedico, String nombrePaciente, CentroMedico centroMedico) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.centroMedico = centroMedico;
    }

    public void crearCita() {
        System.out.println("Ingrese los datos para la nueva cita médica:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fecha (formato YYYY-MM-DD): ");
        this.fecha = scanner.nextLine();

        System.out.print("Hora: ");
        this.hora = scanner.nextLine();

        System.out.print("Consultorio: ");
        this.consultorio = scanner.nextLine();

        System.out.print("Nombre del médico: ");
        this.nombreMedico = scanner.nextLine();

        System.out.print("Nombre del paciente: ");
        this.nombrePaciente = scanner.nextLine();

        scanner.close();

        System.out.println("Cita médica creada para el paciente " + nombrePaciente + " con el médico " + nombreMedico);
    }

    public void consultarDatosCitas() {
        System.out.println("Datos de la cita médica: Código " + codCita + ", Fecha: " + fecha + ", Hora: " + hora
                + ", Consultorio: " + consultorio + ", Médico: " + nombreMedico + ", Paciente: " + nombrePaciente);
    }

    public void cambiarHora() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nueva hora (formato HH:mm): ");

        if (scanner.hasNextLine()) {
            String nuevaHora = scanner.nextLine();
            this.hora = nuevaHora;
            System.out.println("La hora de la cita médica ha sido cambiada a: " + nuevaHora);
        } else {
            System.out.println("No se proporcionó una nueva hora.");
        }
    }
}
