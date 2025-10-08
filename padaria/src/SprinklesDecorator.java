public class SprinklesDecorator extends Cake {
    private final Cake baseCake;
    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 2.0;
    }
}
