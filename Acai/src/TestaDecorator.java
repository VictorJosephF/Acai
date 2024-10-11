public class TestaDecorator {
    public static void main(String[] args) {
        // 1. Açaí simples de tamanho PEQUENO
        Adicional acaiPequeno = new Acai(Tamanho.PEQUENO);
        System.out.println(acaiPequeno.getDescricao() + " - R$ " + String.format("%.2f", acaiPequeno.custo()));

        // 2. Açaí de tamanho MEDIO com Morango
        Adicional acaiMedioComMorango = new Morango(new Acai(Tamanho.MEDIO));
        System.out.println(acaiMedioComMorango.getDescricao() + " - R$ " + String.format("%.2f", acaiMedioComMorango.custo()));

        // 3. Açaí de tamanho GRANDE com Morango, Leite Condensado e Banana
        Adicional acaiGrandeComTudo = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.GRANDE))));
        System.out.println(acaiGrandeComTudo.getDescricao() + " - R$ " + String.format("%.2f", acaiGrandeComTudo.custo()));

        // Exemplos adicionais para monstrar diferentes tamanhos e combinações
        // 4. Açaí de tamanho MEDIO com Banana e Leite Condensado
        Adicional acaiMedioComBananaLeite = new LeiteCondensado(new Banana(new Acai(Tamanho.MEDIO)));
        System.out.println(acaiMedioComBananaLeite.getDescricao() + " - R$ " + String.format("%.2f", acaiMedioComBananaLeite.custo()));

        // 5. Açaí de tamanho PEQUENO com Morango e Banana
        Adicional acaiPequenoComMorangoBanana = new Banana(new Morango(new Acai(Tamanho.PEQUENO)));
        System.out.println(acaiPequenoComMorangoBanana.getDescricao() + " - R$ " + String.format("%.2f", acaiPequenoComMorangoBanana.custo()));
    }
}