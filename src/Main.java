import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre de la jugadora
        System.out.print("Ingresa tu nombre: ");
        String nombreJugadora = scanner.nextLine();

        // Crear objeto de jugador humano con el nombre ingresado
        HumanPlayer humanPlayer = new HumanPlayer(nombreJugadora);
        ComputerPlayer computerPlayer = new ComputerPlayer("Ordenador");

        // Generación del Número a Adivinar
        int numeroAdivinar = new Random().nextInt(10) + 1;
        boolean juegoTerminado = false;
        int intentosJugadora = 0;  // Variable para contar los intentos de la jugadora
        int intentosComputador= 0; //Variable para contar intetnos del computador

        // Bucle que continuará hasta que el juego esté terminado
        while (!juegoTerminado) {
            // Turno de la jugadora
            int numeroJugadora = humanPlayer.guessNumber();
            intentosJugadora++;  // Incrementar el contador de intentos
            System.out.println(nombreJugadora + " escribió: " + numeroJugadora);

            if (numeroJugadora == numeroAdivinar) {
                System.out.println("¡Felicidades! has adivinado el número en " + intentosJugadora + " intentos.");
                juegoTerminado = true;
            } else {
                System.out.println("No es el número correcto. Sigue intentando.");
            }

            // Salir del bucle si el juego ha terminado
            if (juegoTerminado) {
                break;
            }

            // Turno del ordenador
            int numeroOrdenador = computerPlayer.guessNumber();
            intentosComputador++; //Incrementar el contador de intentos
            System.out.println("Ordenador escribió: " + numeroOrdenador);

            if (numeroOrdenador == numeroAdivinar) {
                System.out.println("¡El ordenador ha adivinado el número en " + intentosComputador + " intentos.");
                juegoTerminado = true;
            } else {
                System.out.println("No es el número correcto. El ordenador sigue intentando.");
            }
        }

        scanner.close();
    }
}
