public class Morango extends BaseDecorator {
    public Morango(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    @Override
    public double custo() {
        return wrappee.custo() + 1.50; // Custo adicional do morango
    }
}
