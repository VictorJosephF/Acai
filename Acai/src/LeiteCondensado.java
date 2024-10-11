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
        double adicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                adicional = 1.50;
                break;
            case MEDIO:
                adicional = 2.00;
                break;
            case GRANDE:
                adicional = 2.50;
                break;
        }
        return wrappee.custo() + adicional;
    }
}