import java.util.Random;

public class Main {
    //Se crean dos objetos de jugador, uno para el jugador humano y otro para el jugador de computadora
    public static void main(String[] args) {
        HumanPlayer humanPlayer = new HumanPlayer("Jugadora");
        ComputerPlayer computerPlayer = new ComputerPlayer("Ordenador");

    //Generación del Número a Adivinar
        int numeroAdivinar = new Random().nextInt(10) + 1;
        boolean juegoTerminado = false;

    // crear un bucle que continuará hasta que el juego esté terminado
        while (!juegoTerminado) {
            // Turno de la jugadora
            int numeroJugadora = humanPlayer.guessNumber();
            System.out.println("Jugadora escrbió: " + numeroJugadora);

            if (numeroJugadora == numeroAdivinar) {
                System.out.println("¡Felicidades! Jugadora ha adivinado el número.");
                break;
            } else {
                System.out.println("No es el número correcto. Sigue intentando.");
            }

            // Turno del ordenador
            int numeroOrdenador = computerPlayer.guessNumber();
            System.out.println("Ordenador escribió: " + numeroOrdenador);

            if (numeroOrdenador == numeroAdivinar) {
                System.out.println("¡El ordenador ha adivinado el número!");
                juegoTerminado = true;
            } else {
                System.out.println("No es el número correcto. El ordenador sigue intentando.");
            }
        }
    }
}
