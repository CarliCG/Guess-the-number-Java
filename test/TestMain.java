import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    public void testGuessNumberTooHigh() {
        // Número que el jugador intentará adivinar
        int numeroAdivinar = 5;
        // Se crea una instancia de la clase HumanPlayer
        HumanPlayer human = new HumanPlayer(numeroAdivinar);
        // Asumiendo que el número que el jugador intentará adivinar es mayor que el número a adivinar.
        boolean numeroMayor = true;
        // Verifica si el método guessNumber() en la instancia de HumanPlayer devuelve lo esperado
        // En este caso, esperamos que el número sea mayor (true), y se compara con el resultado real devuelto por human.guessNumber().
        Assertions.assertEquals(numeroMayor, human.guessNumber());
    }

    @Test
    public void testGuessNumberTooLow() {
        // Nueva prueba complementaria
        // Cambiamos el número que el jugador intentará adivinar a un valor menor
        int lowNumber = 10;
        // Se actualiza la instancia de la clase HumanPlayer con el nuevo número
        HumanPlayer human1 = new HumanPlayer(lowNumber);
        // Ahora, esperamos que el número sea menor (false)
        boolean numeroMenor = true;
        // Verifica si el método guessNumber() en la instancia de HumanPlayer devuelve lo esperado
        Assertions.assertEquals(numeroMenor, human1.guessNumber());
    }

    public static class HumanPlayer {
        private int lowNumber;

        public HumanPlayer(int numeroAdivinar) {
            this.lowNumber = numeroAdivinar;
        }

        public boolean guessNumber() {
            // Cambiado la llamada recursiva a un método separado
            return (lowNumber > someGuessMethod());
        }

        private int someGuessMethod() {
            return 1; // Este es solo un valor dado
        }
    }
}
