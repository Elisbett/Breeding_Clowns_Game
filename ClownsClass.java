import java.util.Random;

public class ClownsClass implements Comparable {
    private String name;
    private int clownLevel;

    public ClownsClass(String name, int level) {
        this.name = name;
        this.clownLevel = clownLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return clownLevel;
    }

    public void setLevel(int level) {
        this.clownLevel = level;
    }

    public double slapTheClown () {
        Random random = new Random();
        int tearsCost = (random.nextInt(8) + 2) * clownLevel;
        // +++подумать, как считать уровни мира, как связать с планетой и какие бонусы это будет давать
        int phraseNumber = random.nextInt(3);
        switch (phraseNumber) {
            case 0:
                System.out.println("Yippee! Kloun " + name + "nuttab!");
                System.out.println("Teda pekstes teenisid " + tearsCost + " pisaraid uue klouni ostmiseks)))");
                break;
            case 1:
                System.out.println( name + " sai laksu)");
                System.out.println("Klouni peeksmisega pressisid sa temalt välja " + tearsCost + " pisarat!");
                break;
            case 2:
                System.out.println("Yippee! Kloun " + name + "nuttab!");
                System.out.println(tearsCost);
                break;
        }
        return tearsCost;
    }

    @Override
    public int compareTo(Object theSecondClown) {
        return this.clownLevel.compareTo(theSecondClown.clownLevel);
    }
}
// подстроить имена в избиении. пусть зависят от уровня клоуна