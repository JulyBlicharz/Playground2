package ENUMeracoes.avancado;

public enum TipoMovimento {

    DEBITO(1.5F,"D"),
    CREDITO(6.5F,"C"),
    SAQUE(3.0F,"S"),
    PIX(0F,"P"),
    TED(5F,"T");

    //Define atributos
    private float valorTarifa;
    private String sigla;

    //Construtor sem visibilidade
    TipoMovimento(float valorTarifa, String sigla) {
        this.valorTarifa = valorTarifa;
        this.sigla = sigla;
    }

    //Cria getters para pegar ps atributos
    public float getValorTarifa() {
        return valorTarifa;
    }

    public String getSigla() {
        return sigla;
    }

    //metodo utilitario para buscar pela Sigla

    public static TipoMovimento obtemAPartirDaSigla(String sigla) {
        for (TipoMovimento tipo : TipoMovimento.values()) {
            if (tipo.getSigla().equalsIgnoreCase(sigla)) {
                return tipo;
            }
        }

        throw new IllegalArgumentException("Tipo não encontrado");
    }

    public static TipoMovimento obtemAPartirDaTarifa(float tarifaCobrada) {
        for (TipoMovimento tipo : TipoMovimento.values()) {
            if (tipo.getValorTarifa() == tarifaCobrada) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo não encontrado");
    }
}






//public enum TipoMovimento {
//    DEBITO, CREDITO, SAQUE, TED
//}