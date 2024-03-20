import java.util.HashMap;

public class World {
    //подключить уровень мира
    //массив клоунов
    //уровень клоуна показывает, в каком он мире(1-6 клоун в мире 1, 7-12 во втором, 13-18 в третьем...)
    private HashMap<Integer, ClownsClass> clownIndex;

    private HashMap<Integer, String> levelName;

    public void addClown (int level, HashMap<Integer, ClownsClass> clownIndex, HashMap<Integer, String> levelName) {

        ClownsClass clown = new ClownsClass(levelName.get(level), level);
        clownIndex.put(clownIndex.size(), clown);
        System.out.println("Palju õnne! Sul sündis uus kloun " + clownIndex + "! Võte tema kasvutust tõsiselt!");
    }

    public static void main(String[] args) {
        int moneyInWallet = 5;

        clownIndex = new HashMap<Integer, ClownsClass>();

        private HashMap<Integer, String> levelName = new HashMap<Integer, String>();

        levelName.put(1, "Peeter Paanika");
        levelName.put(2, "Kertu Sambuka");
        levelName.put(3, "Bim Bam-Boom");
        levelName.put(4, "Pipi Pikksukk");
        levelName.put(5, "Irmeli Imelik");
        levelName.put(6, "Anton Rahu");
    }

}
