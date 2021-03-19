package ENUMeracoes.avancado;

public class TarifaMovimento {

    public float valorTarifa(TipoMovimento tipoMovimento) {

        switch (tipoMovimento) {
            case DEBITO:
                return 1.5F;
            case CREDITO:
                return 6.5F;
            case SAQUE:
                return 3.0F;
            default:
                throw new IllegalArgumentException("Tipo não configurado!");
        }
    }
}