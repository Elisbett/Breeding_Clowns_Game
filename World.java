import java.util.HashMap;

public class World {
    // добавить общение
    // добавить мирыб засунуть все листы и переменные

    //подключить уровень мира
    //массив клоунов
    //уровень клоуна показывает, в каком он мире(1-6 клоун в мире 1, 7-12 во втором, 13-18 в третьем...)


    public void addClown (int level, HashMap<Integer, ClownsClass> clownIndex, HashMap<Integer, String> levelName) {

        ClownsClass clown = new ClownsClass(levelName.get(level), level);
        clownIndex.put(clownIndex.size(), clown);
        System.out.println("Palju õnne! Sul sündis uus kloun " + clownIndex + "! Võte tema kasvutust tõsiselt!"); // после заменить индекс на имя
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
                System.out.println();
            }

        }
    }

    // первый мир
    public static void main(String[] args) {
        HashMap<Integer, ClownsClass> clownIndex  = new HashMap<Integer, ClownsClass>();
        HashMap<Integer, String> levelName = new HashMap<Integer, String>();

        levelName.put(1, "Peeter Paanika");
        levelName.put(2, "Kertu Sambuka");
        levelName.put(3, "Bim Bam-Boom");
        levelName.put(4, "Pipi Pikksukk");
        levelName.put(5, "Irmeli Imelik");
        levelName.put(6, "Anton Rahu");

        int moneyInWallet = 5;


    }

}
