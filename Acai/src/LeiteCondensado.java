public class LeiteCondensado extends BaseDecorator {
    public LeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        return wrappee.custo() + 2.00; // Custo adicional do leite condensado
    }
}
