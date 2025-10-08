public class SayingDecorator extends BoloDecorator {
    private String mensagem;

    public SayingDecorator(Bolo bolo, String mensagem) {
        super(bolo);
        this.mensagem = mensagem;
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " with saying '" + mensagem + "'";
    }

    @Override
    public double getPreco() {
        return bolo.getPreco(); // sem custo adicional
    }
}

