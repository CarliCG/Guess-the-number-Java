import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }


    @Override
    public int guessNumber() {
        Random random = new Random();
        System.out.println(name + " está ingresando un número...");
        return random.nextInt(10) + 1;
    }
}