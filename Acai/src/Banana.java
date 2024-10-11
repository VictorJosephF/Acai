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
        double adicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                adicional = 0.80;
                break;
            case MEDIO:
                adicional = 1.00;
                break;
            case GRANDE:
                adicional = 1.20;
                break;
        }
        return wrappee.custo() + adicional;
    }
}