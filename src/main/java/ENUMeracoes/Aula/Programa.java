package ENUMeracoes.Aula;


import ENUMeracoes.Aula.TipoDeOpcao;

public class Programa {


    public static void main(String[] args) {

        System.out.println(TipoDeOpcao.NAO);
        System.out.println(TipoDeOpcao.SIM.name()); // metodo especifico enum -> contem uma String com o valor Sim
        System.out.println(TipoDeOpcao.SIM.toString()); // metoda da String -> contem uma String com o valor Sim
    }
}
