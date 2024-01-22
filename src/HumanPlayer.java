import java.util.Scanner;

// HumanPlayer hereda atributos y métodos de la clase base Player.
public abstract class HumanPlayer extends Player {
    private boolean primerTurno = true;

    // Define un constructor que toma un parámetro name
    public HumanPlayer(String name) {
        super(name); // Super para llamar al constructor de la clase base (Player) y pasarle el nombre del jugador.
    }


    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);

        if (primerTurno) {
            System.out.print("Hola " + name + ", ingresa un número del 1 al 100: ");
            primerTurno = false;
        } else {
            System.out.print("Tu turno, " + name + ", ingresa un número del 1 al 100: ");
        }

        return scanner.nextInt();
    }
}
