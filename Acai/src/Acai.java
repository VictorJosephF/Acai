public class Acai implements Adicional {
    @Override
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double custo() {
        return 5.00; // Preço base do açaí
    }
}