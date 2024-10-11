public class TestaDecorator {
    public static void main(String[] args) {
        // 1. Açaí simples
        Adicional acaiSimples = new Acai();
        System.out.println(acaiSimples.getDescricao() + " - R$ " + String.format("%.2f", acaiSimples.custo()));

        // 2. Açaí + Morango
        Adicional acaiComMorango = new Morango(new Acai());
        System.out.println(acaiComMorango.getDescricao() + " - R$ " + String.format("%.2f", acaiComMorango.custo()));

        // 3. Açaí + Morango + Leite Condensado + Banana
        Adicional acaiComTudo = new Banana(new LeiteCondensado(new Morango(new Acai())));
        System.out.println(acaiComTudo.getDescricao() + " - R$ " + String.format("%.2f", acaiComTudo.custo()));
    }
}