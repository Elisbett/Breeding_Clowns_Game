import java.util.HashMap;

public class Shop {
    private static HashMap<Integer, Integer> collection = new HashMap<>(); //level, price
    // maxOpenedClown в World при работе магазина, аоказывать товар по нему

    public static void main(String[] args) {
        //world 1
        collection.put(1, 0);
        collection.put(2, 0);
        collection.put(3, 0);
        collection.put(4, 0);
        collection.put(5, 0);
        collection.put(6, 0);
        //world 2
        collection.put(7, 0);
        collection.put(8, 0);
        collection.put(9, 0);
        collection.put(10, 0);
        collection.put(11, 0);
        collection.put(12, 0);
        //world 3
        collection.put(13, 0);
        collection.put(14, 0);
        collection.put(15, 0);
        collection.put(16, 0);
        collection.put(17, 0);
        collection.put(18, 0);
        //world 4
        collection.put(19, 0);
        collection.put(20, 0);
        collection.put(21, 0);
        collection.put(22, 0);
        collection.put(23, 0);
        collection.put(24, 0);
        //world 5
        collection.put(25, 0);
        collection.put(26, 0);
        collection.put(27, 0);
        collection.put(28, 0);
        collection.put(29, 0);
        collection.put(30, 0);
        //world 6
        collection.put(31, 0);
        collection.put(32, 0);
        collection.put(33, 0);
        collection.put(34, 0);
        collection.put(35, 0);
        collection.put(36, 0);

    }
}

