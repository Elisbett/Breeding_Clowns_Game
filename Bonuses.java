import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Bonuses {
    private Timer timer;
    //move to WorldLevel
    private int tearsForBonuses() {
        Random random = new Random();
        int tearsCost = (random.nextInt(5)) * level; //multiply by world lvl
        return tearsCost;
    }
    private void bonusesGenerator() {
        Random random = new Random();
        int time = random.nextInt(2);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                addBonusToList();
            }
        } 0, 60 000 * 3 + time * 30 000;); // падает каждые 3-4 мин
    }

    private void addBonusToList() {
        if (bonuses.size() < 4) {
            Bonuses bonus = new Bonuses();
            bonuses.add(bonus);
            System.out.println("Keegi valas popkorni maha( Tõsta!");
        }
    }
    private void collectBonuses() {
        int sum = 0;
        for(i = 0; i < bonuses.size(); i++) {
            sum += tearsForBonuses();
        }
        System.out.println("Sa korjasid " + bonises.size() + " popkorni!");
        bonuses.clear();
        System.out.println("Popkorni maha tõstmisest sa teenisid " + sum + " pisaraid)");
    }
    //добавить это в кошелек
}