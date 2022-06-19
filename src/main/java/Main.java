import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int PLOTS = 20;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Введите цену участка за кв.м: ");
            int price = sc.nextInt();
            List<Land> lands = new ArrayList<>();
            for(int i = 0; i < PLOTS; i++){
                lands.add(new Land());
            }
            System.out.println("Участки с ценой не более " + price + " за м2: ");
            lands.stream().filter(a -> a.getCost() / (a.getLength() * a.getWidth()) <= price)
                    .toList().forEach(System.out::println);
        }
    }
}
