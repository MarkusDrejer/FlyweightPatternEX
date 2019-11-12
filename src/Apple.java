public class Apple implements Fruits {

    private final String color;
    private String size;
    private String state;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("Eaten a " + color + " Apple of size " + size + " with state " + state);
    }
}
