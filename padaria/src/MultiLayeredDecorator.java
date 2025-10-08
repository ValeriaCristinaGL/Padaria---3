public class MultiLayeredDecorator extends BoloDecorator {
    public MultiLayeredDecorator(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return "Multi-layered " + bolo.getDescricao();
    }

    @Override
    public double getPreco() {
        return bolo.getPreco() + 5.0;
    }
}



