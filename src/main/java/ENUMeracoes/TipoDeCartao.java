package ENUMeracoes;

public enum TipoDeCartao {

    STANDARD (3.05F),
    GOLD (3.05F),
    PREMIUM (2.95F),
    BLACK (1.98F);

    private float taxaDeJuros;

    TipoDeCartao(float taxaDeJuros) {
       this.taxaDeJuros = taxaDeJuros;
    }

    public float getTaxaDeJuros() {
                return taxaDeJuros;
    }
}