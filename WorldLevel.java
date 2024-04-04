import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class WorldLevel {
    //для каждого мира свои боксы и свои бонусы

    private int level;
    private int minClownLevel;
    private int maxClownLevel;
    //boxes
    private HashMap<Integer, BoxesClass> boxes = new HashMap<Integer, BoxesClass>();
    private HashMap<Integer, ClownsClass> clownIndex;
    private Timer timer;
    //bonuses
    private ArrayList<Bonuses> bonuses = new ArrayList<Bonuses>();
    private int boxCounter = 0;

    public WorldLevel(int level, int minClownLevel) {
        this.level = level;
        this.minClownLevel = minClownLevel;
        this.maxClownLevel = minClownLevel + 5;
        this.clownIndex = new HashMap<>();
        this.timer = new Timer();
    }

    public int getLevel() {
        return level;
    }

    public HashMap<Integer, BoxesClass> getBoxes() {
        return boxes;
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
        if (maxOpenedClown == maxClownLevel) {
            Random random = new Random();
            int generatedColwnsLevel = random.nextInt(3) + minClownLevel;
            return generatedColwnsLevel;
        } else { return 0;}

    }

    public HashMap<Integer, ClownsClass> getClownIndex() {
        return clownIndex;
    }

    public void startBoxesGenerator() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                generateBox();
            }
        }, 0, 15000 + (level - 1) * 5000 ); //каждые 15 секунд + 5 секунд с повышением мира
    } // надо в мейне вызвать этот метод для всех открытых миров
    // и при открытии новых запускать его для них
    public void generateBox() {
        if (boxes.size() < 6) {
            BoxesClass box = new BoxesClass();
            boxes.put(boxCounter++, box);
            System.out.println("Kukkus uus karp!");
            System.out.println("Praegu sul on " + boxes.size() + " karp(i)!");
        }
    }

    //bonuses + добавить, чтобы первый раз был не сразу при запуске
    public void bonusesGenerator() {
        Random random = new Random();
        int time = random.nextInt(2);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                addBonusToList();
            }
        }, 0, 60000 * 3 + time * 30000); // падает каждые 3-4 мин
    }
    private void addBonusToList() {
        if (bonuses.size() < 4) {
            Bonuses bonus = new Bonuses();
            bonuses.add(bonus);
            System.out.println("Keegi valas popkorni maha( Tõsta!");
        }
    }
    public int collectBonuses() {
        int sum = 0;
        for (Bonuses element : bonuses) {
            sum += element.tearsForBonuses(level);
        }
        System.out.println("Sa korjasid " + bonuses.size() + " popkorni!");
        bonuses.clear();
        System.out.println("Popkorni maha tõstmisest sa teenisid " + sum + " pisaraid)");
        return sum;
    }
    //добавить это в кошелек
}
