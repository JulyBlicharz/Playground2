package ENUMeracoes;



public class TaxaDeJuros {

//    public float obtemTaxaDeJuros (TipoDeCartao tipoDeCartao) {
//
//        return tipoDeCartao.getValorJuros();

        public static float obtemTaxa (String  tipo){
            return TipoDeCartao.valueOf(tipo).getTaxaDeJuros();
    }
}
