import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }


    @Override
    public int guessNumber() {
        Random random = new Random();

        return random.nextInt(10) + 1;
    }
}