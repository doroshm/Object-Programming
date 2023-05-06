import java.util.Random;

public class RandomIncrementer implements Incrementable {
    private int ranInt;
    private Random rand;

    public RandomIncrementer() {
        rand = new Random();
        ranInt = rand.nextInt(41) + 10;
    }

    public void increment() {
        ranInt = rand.nextInt(41) + 10;
    }

    public int getValue() {
        return ranInt;
    }
}
