public class Banana extends BaseDecorator {
    public Banana(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        return wrappee.custo() + 1.00; // Custo adicional da banana
    }
}