import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class World {
    // добавить общение
    // добавить мирыб засунуть все листы и переменные

    //подключить уровень мира
    //массив клоунов
    //уровень клоуна показывает, в каком он мире(1-6 клоун в мире 1, 7-12 во втором, 13-18 в третьем...)
    public void addClown (int level, HashMap<Integer, ClownsClass> clownIndex, HashMap<Integer, String> levelName, int maxOpenedClown) {
        ClownsClass clown = new ClownsClass(levelName.get(level), level);
        clownIndex.put(clownIndex.size(), clown);
        System.out.println("Palju õnne! Sul sündis uus kloun " + clownIndex + "! Võte tema kasvutust tõsiselt!"); // после заменить индекс на имя

        //переменная для максимальный уровень для выпадения клоунов из коробки
        if (level > maxOpenedClown) {
            maxOpenedClown = level;
        }
    }
    public void deleteClowns (int clownIndeks, HashMap<Integer, ClownsClass> clownsClassHashMap) {
        if (clownsClassHashMap.containsKey(clownIndeks)) {
            clownsClassHashMap.remove(clownIndeks);
            System.out.println("Kloun indeksiga " + clownIndeks + " on eemaldatud!");
            //потом подправить для пользователей подправить: поменять индекс на имя
        } else {
            System.out.println("Kloun indeksiga " + clownIndeks + " ei eksisteeri((((");
        }
    }
    //скрещивание этих шутов
    public void breeding (int clown1Indeks, int clown2Indeks, HashMap<Integer, ClownsClass> clownsClassHashMap, HashMap<Integer, String> levelName) {
        if (clownsClassHashMap.containsKey(clown1Indeks) && clownsClassHashMap.containsKey(clown2Indeks)) {
            //если клоуны вообще есть
            ClownsClass clown1 = clownsClassHashMap.get(clown1Indeks);
            ClownsClass clown2 = clownsClassHashMap.get(clown2Indeks);

            //проверяем на одинаковый уровень
            if (clown1.getLevel() == clown2.getLevel()) {
                int newLevel = clown1.getLevel() + 1;

                clownsClassHashMap.remove(clown1Indeks);
                clownsClassHashMap.remove(clown2Indeks);

                addClown(newLevel, HashMap<Integer, ClownsClass> clownsClassHashMap, HashMap<Integer, String> levelName);
                System.out.println("метод сработал)))");
            }
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, ClownsClass> clownIndex  = new HashMap<Integer, ClownsClass>();
        HashMap<Integer, String> levelName = new HashMap<Integer, String>();

        //world 1
        levelName.put(1, "Peeter Paanika");
        levelName.put(2, "Kertu Sambuka");
        levelName.put(3, "Bim Bam-Boom");
        levelName.put(4, "Pipi Pikksukk");
        levelName.put(5, "Irmeli Imelik");
        levelName.put(6, "Anton Rahu");
        //world 2
        levelName.put(7, "lvl_7");
        levelName.put(8, "lvl_8");
        levelName.put(9, "lvl_9");
        levelName.put(10, "lvl_10");
        levelName.put(11, "lvl_11");
        levelName.put(12, "lvl_12");
        //world 3
        levelName.put(13, "lvl_13");
        levelName.put(14, "lvl_14");
        levelName.put(15, "lvl_15");
        levelName.put(16, "lvl_16");
        levelName.put(17, "lvl_17");
        levelName.put(18, "lvl_18");
        //world 4
        levelName.put(19, "lvl_19");
        levelName.put(20, "lvl_20");
        levelName.put(21, "lvl_21");
        levelName.put(22, "lvl_22);
        levelName.put(23, "lvl_23");
        levelName.put(24, "lvl_24");
        //world 5
        levelName.put(25, "lvl_25");
        levelName.put(26, "lvl_26");
        levelName.put(27, "lvl_27");
        levelName.put(28, "lvl_28");
        levelName.put(29, "lvl_29");
        levelName.put(30, "lvl_30");
        //world 6
        levelName.put(31, "lvl_31");
        levelName.put(32, "lvl_32");
        levelName.put(33, "lvl_33");
        levelName.put(34, "lvl_34");
        levelName.put(35, "lvl_35");
        levelName.put(36, "lvl_36");


        int moneyInWallet = 5;

        int maxOpenedClown = 0;

        WorldLevel world1 = new WorldLevel(1, 1);
        WorldLevel world2 = new WorldLevel(2, 7);
        WorldLevel world3 = new WorldLevel(3, 13);
        WorldLevel world4 = new WorldLevel(4, 19);
        WorldLevel world5 = new WorldLevel(5, 25);
        WorldLevel world6 = new WorldLevel(6, 31);



    }

}
