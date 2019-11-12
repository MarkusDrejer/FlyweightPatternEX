import java.util.Random;

public class FruitFlyweight {

    private static String[] colors = {"Red", "Green", "Black", "Yellow"};
    private static String[] sizes = {"Small", "Medium", "Large"};
    private static String[] states = {"Rotten", "Ripe"};
    private static Random rand = new Random();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            Fruits fruit = FruitFactory.getFruit(colors[rand.nextInt(colors.length)]);
            fruit.setSize(sizes[rand.nextInt(sizes.length)]);
            fruit.setState(states[rand.nextInt(states.length)]);

            fruit.eat();
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println("\n Number of created objects" + FruitFactory.fruitMap.size());
    }

}
