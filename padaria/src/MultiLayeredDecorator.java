public class MultiLayeredDecorator extends Cake {
    public MultiLayeredDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescricao();
    }

    @Override
    public double getCost() {
        return cake.getCost() + 5.0;
    }
}



