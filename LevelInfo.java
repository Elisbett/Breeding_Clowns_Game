import java.util.HashMap;

public class LevelInfo {
    private String name;
    private int cost;

    public LevelInfo(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return (int) Math.pow(cost, 3) + 5;
    } //!! если будем менять формулу стоимости, то не забыть поменять sout в покупке первого
}
