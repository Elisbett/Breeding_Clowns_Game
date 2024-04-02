import javax.swing.*;
import java.util.Random;
import java.util.TimerTask;

public class BoxesClass {
    // +++добавлять клоунов
    // +++запускать рандом уровня клоуна
    // +++отслеживать в каждом мире с каким-то временным промежутком появляются коробки, пока их (закрытых) не будет больше 6

    /*public void openTheBox (int worldLevel) {
        Random random = new Random(currentWorld * 6);
    }*/
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
    }
    private void generateBox() {
        if (boxes.size() < 6) {
            Box box = new Box();
            boxes.put(boxes.size(), box);
            System.out.println("Kukkus uus karp!");
            System.out.println("Praegu sul on " + boxes.size() + " karpi!");
        }
    }
}
