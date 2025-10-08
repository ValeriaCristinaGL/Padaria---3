public class SprinklesDecorator extends Cake {
    private final Cake baseCake;

    public SprinklesDecorator(Cake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public String getDescription() {
        return baseCake.getDescription() + " with sprinkles";
    }

    @Override
    public int getCost() {
        return baseCake.getCost() + 2;
    }
}
