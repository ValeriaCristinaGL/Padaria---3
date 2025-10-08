public class SayingDecorator extends Cake {
    private String mensagem;

    public SayingDecorator(Cake cake, String mensagem) {
        super(cake);
        this.mensagem = mensagem;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying '" + mensagem + "'";
    }

    @Override
    public double getCost() {
        return cake.getCost(); // sem custo adicional
    }
}

