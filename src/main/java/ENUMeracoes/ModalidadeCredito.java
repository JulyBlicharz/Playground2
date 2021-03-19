package ENUMeracoes;

import ENUMeracoes.TipoDeCartao;

public class ModalidadeCredito {

    public static TipoDeCartao obtemTipoDeCartao (float rendaMensal) {
//
//        if (rendaMensal < 1000) {
//            return  TipoDeCartao.STANDARD;
//        } else if (rendaMensal < 3000) {
//            return TipoDeCartao.GOLD;
//        }else if (rendaMensal < 10_000) {
//            return TipoDeCartao.PREMIUM;
//        } else {
//            return TipoDeCartao.BLACK;
//        }


        String tipoDeCartao;

        if(rendaMensal < 1000){
            tipoDeCartao = "STANDARD ";
        } else if(rendaMensal < 3000){
            tipoDeCartao = "GOLD";
        }else if(rendaMensal < 10_000){
            tipoDeCartao = "PREMIUM";
        }else {
            tipoDeCartao = "BLACK";
        }
        return TipoDeCartao.valueOf(tipoDeCartao.toUpperCase().trim());




    }

}



