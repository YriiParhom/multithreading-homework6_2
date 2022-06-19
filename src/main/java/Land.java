import java.util.Random;

public class Land {
    private final int length;
    private final int width;
    private final int cost;
    private final Random random = new Random();

    public Land() {
        this.length = random.nextInt(100) + 60;
        this.width = random.nextInt(30) + 10;
        this.cost = length * width * (random.nextInt(1000) + 500);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Участок " + length + " м.п" +
                " х " + width + " м.п, стоимость = " + cost +
                " рублей.";
    }
}
