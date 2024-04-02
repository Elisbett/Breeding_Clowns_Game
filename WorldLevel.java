import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class WorldLevel {
    //для каждого мира свои боксы и свои бонусы

    private int level;
    private int minClownLevel;
    private int maxClownLevel = minClownLevel + 5;
    //boxes
    private HashMap<Integer, Box> boxes = new HashMap<Integer, Box>();
    private Timer timer;
    //bonuses
    private ArrayList<Bonuses>() bonuses = new ArrayList<Bonuses>();

    public WorldLevel(int level, int minClownLevel) {
        this.level = level;
        this.minClownLevel = minClownLevel;
    }

    public int getLevel() {
        return level;
    }

    //boxes
    public int clownsLevelInTheBox(int maxOpenedClown, int boxIndex) {
        boxes.remove(boxIndex);
        if (maxOpenedClown <= minClownLevel + 2) {
            return minClownLevel;
        }
        if (maxOpenedClown <= minClownLevel + 4) {
            Random random = new Random();
            int generatedColwnsLevel = random.nextInt(2) + minClownLevel;
            return generatedColwnsLevel;
        }
        if (maxOpenedClown == maxClownLevel ) {
            Random random = new Random();
            int generatedColwnsLevel = random.nextInt(3) + minClownLevel;
            return generatedColwnsLevel;
        }
    }
    
    private void startBoxesGenerator() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                generateBox();
            }
        }, 0, 15 000 + (level - 1) * 5 000 ); //каждые 15 секунд + 5 секунд с повышением мира
    } // надо в мейне вызвать этот метод для всех открытых миров
    // и при открытии новых запускать его для них
    private void generateBox() {
        if (boxes.size() < 6) {
            Box box = new Box();
            boxes.put(boxes.size(), box);
            System.out.println("Kukkus uus karp!");
            System.out.println("Praegu sul on " + boxes.size() + " karpi!");
        }
    }
    
    //bonuses
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
        for (Bonuses element : bonuses) {
            sum += element.tearsForBonuses();
        }
        System.out.println("Sa korjasid " + bonuses.size() + " popkorni!");
        bonuses.clear();
        System.out.println("Popkorni maha tõstmisest sa teenisid " + sum + " pisaraid)");
    }
    //добавить это в кошелек
}
