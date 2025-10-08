public class SayingDecorator extends Cake {
    private final Cake baseCake;
    private String mensagem;

    public SayingDecorator(Cake baseCake, String mensagem) {
        this.baseCake = baseCake;
        this.mensagem = mensagem;
    }

    @Override
    public String getDescription() {
        return baseCake.getDescription() + " with saying '" + mensagem + "'";
    }

    @Override
    public double getCost() {
        return baseCake.getCost(); // sem custo adicional
    }
}

