import java.util.HashMap;

public class FruitFactory {

    private static consoleColors cc = new consoleColors();
    public static HashMap<String, Fruits> fruitMap = new HashMap<>();

    public static Fruits getFruit(String color) {
        Fruits fruit;
        if (fruitMap.containsKey(color)) {
            fruit = fruitMap.get(color);
        } else {
            cc.printTxtGreen(color + " Apple created").print(true);
            cc.clearTxtBuffer();
            fruit = new Apple(color);
            fruitMap.put(color, fruit);
        }
        return fruit;
    }

}
