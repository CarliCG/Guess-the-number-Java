import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre de la jugadora
        System.out.print("Ingresa tu nombre: ");
        String nombreJugadora = scanner.nextLine();

        // Crear objeto de jugador humano con el nombre ingresado
        HumanPlayer humanPlayer = new HumanPlayer(nombreJugadora) {
            @Override
            public int guessNumber() {
                return scanner.nextInt();
            }
        };
        ComputerPlayer computerPlayer = new ComputerPlayer("Ordenador");

        // Generación del Número a Adivinar
        int numeroAdivinar = new Random().nextInt(10) + 1;
        boolean juegoTerminado = false;
        int intentosJugadora = 0;  // Variable para contar los intentos de la jugadora
        int intentosComputador = 0; // Variable para contar intentos del computador

        // Lista para almacenar los intentos de la jugadora
        List<Integer> intentosJugadoraLista = new ArrayList<>();

        // Bucle que continuará hasta que el juego esté terminado
        while (true) {
            // Turno de la jugadora
            System.out.println("\n--- Turno de " + humanPlayer.getName() + " ---");
            int numeroJugadora = humanPlayer.makeGuess();
            intentosJugadoraLista.add(numeroJugadora);  // Agregar el intento a la lista
            intentosJugadora++;  // Incrementar el contador de intentos
            System.out.println(humanPlayer.getName() + " escribió: " + numeroJugadora);

            if (numeroJugadora == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosJugadora + " intentos.");
                // Imprimir los intentos de la jugadora después de la felicitación
                System.out.println("\nIntentos de " + humanPlayer.getName() + ": " + intentosJugadoraLista);
                juegoTerminado = true;
            } else if (numeroJugadora < numeroAdivinar) {
                System.out.println("No es el número correcto. Intenta con uno más alto.");
            } else {
                System.out.println("No es el número correcto. Intenta con uno más bajo.");
            }

            // Salir del bucle si el juego ha terminado
            if (juegoTerminado) {
                break;
            }

            // Turno del ordenador
            System.out.println("\n--- Turno del Ordenador ---");
            int numeroOrdenador = computerPlayer.guessNumber();
            intentosComputador++; // Incrementar el contador de intentos
            System.out.println("Ordenador escribió: " + numeroOrdenador);

            if (numeroOrdenador == numeroAdivinar) {
                System.out.println("¡El ordenador ha adivinado el número en " + intentosComputador + " intentos.");
                juegoTerminado = true;
            } else if (numeroOrdenador < numeroAdivinar) {
                System.out.println("El número es muy bajo.");
            } else {
                System.out.println("El número es muy alto.");
            }

            // Salir del bucle si el juego ha terminado
            if (juegoTerminado) {
                break;
            }
        }



        scanner.close();
    }
}
