import java.util.Random;
public class Bonuses {
    public int tearsForBonuses(int level) {
        Random random = new Random();
        int tearsCost = (random.nextInt(5)) * level; //multiply by world lvl
        return tearsCost;
    }
}
