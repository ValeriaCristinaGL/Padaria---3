public class SprinklesDecorator extends BoloDecorator {
    public SprinklesDecorator(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " with sprinkles";
    }

    @Override
    public double getPreco() {
        return bolo.getPreco() + 2.0;
    }
}
