import java.util.Random;
public class Bonuses {
    private int tearsForBonuses() {
        Random random = new Random();
        int tearsCost = (random.nextInt(5)) * level; //multiply by world lvl
        return tearsCost;
    }
}