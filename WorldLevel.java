import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WorldLevel {
    //Создать класс уровень мира. Он повышается при открытии нового клоуна lvl/2 + 1.
    //к нему подключен клас клоунов, класс коробок, (класс рандомных штук)

    //придумать, как удалять коробки из списка коробок при их открытии, когда появяется новый клоун

    private int level;
    private int minClownLevel;
    private int maxClownLevel = minClownLevel + 5;
    //boxes
    private ArrayList<Box> boxes;
    private Timer timer;

    public WorldLevel(int level, int minClownLevel) {
        this.level = level;
        this.minClownLevel = minClownLevel;
    }

    public int clownsLevelInTheBox(int maxOpenedClown) {
        boxes.remove(0);
                //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

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
    }
    private void generateBox() {
        if (boxes.size() < 6) {
            Box box = new Box();
            boxes.add(box);
            System.out.println("Kukkus uus karp!");
            System.out.println("Praegu sul on " + boxes.size() + " karpi!");
        }
    }
}
