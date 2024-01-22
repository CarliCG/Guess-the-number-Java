import java.util.Scanner;
// HumanPlayer hereda atributos y métodos de la clase base Player.
public class HumanPlayer extends Player {
    //define un constructor que toma un parámetro name
    public HumanPlayer(String name) {
        super(name); //super para llamar al constructor de la clase base (Player) y pasarle el nombre del jugador.
    }


    public int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hola " + name + ", ingresa un número: ");
        return scanner.nextInt();
    }
}