public class Acai implements Adicional {
    private Tamanho tamanho;

    public Acai(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Açaí Simples (" + tamanho.toString() + ")";
    }

    @Override
    public double custo() {
        switch (tamanho) {
            case PEQUENO:
                return 5.00;
            case MEDIO:
                return 7.00;
            case GRANDE:
                return 9.00;
            default:
                return 5.00;
        }
    }

    @Override
    public Tamanho getTamanho() {
        return this.tamanho;
    }
}