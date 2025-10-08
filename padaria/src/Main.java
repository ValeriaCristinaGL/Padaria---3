import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cake> cakes = new ArrayList<>();

        cakes.add(new ChocolateCake()); // 10 Chocolate cake
        cakes.add(new SayingDecorator(new VanillaCake(), "PLAIN!")); // 10 Vanilla cake with saying "PLAIN!"
        cakes.add(new SayingDecorator(new SprinklesDecorator(new VanillaCake()), "FANCY!")); // 12 Vanilla cake with sprinkles with saying "FANCY!"

        Cake complexCake = new MultiLayeredDecorator(
                new SayingDecorator(
                        new SayingDecorator(
                                new SprinklesDecorator(
                                        new SprinklesDecorator(
                                                new StrawberryCake()
                                        )
                                ), "One of"
                        ), "EVERYTHING"
                )
        );
        cakes.add(complexCake); // 29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"

        for (Cake cake : cakes) {
            System.out.println(cake.getCost() + " " + cake.getDescription());
        }
    }
}

