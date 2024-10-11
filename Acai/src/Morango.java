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
        double adicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                adicional = 1.00;
                break;
            case MEDIO:
                adicional = 1.50;
                break;
            case GRANDE:
                adicional = 2.00;
                break;
        }
        return wrappee.custo() + adicional;
    }
}