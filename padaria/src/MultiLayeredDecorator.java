public class MultiLayeredDecorator extends Cake {
    private final Cake baseCake;

    public MultiLayeredDecorator(Cake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + baseCake.getDescription();
    }

    @Override
    public int getCost() {
        return baseCake.getCost() + 5;
    }
}



