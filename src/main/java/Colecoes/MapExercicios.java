package Colecoes;

import java.util.HashMap;
import java.util.Map;


public class MapExercicios {
    public static void main(String[] args) {

        HashMap<String, String> capitais = new  HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Florianopolis");
        capitais.put("RS", "Viamao");
        capitais.put("SP", "Viamao");

        System.out.println("Pega só as chaves: ");
       for (String capital : capitais.keySet()){
           System.out.println(capital);
       }

        System.out.println("\nPega so os valore: ");
       for (String cidade: capitais.values()){
           System.out.println(cidade);
       }

        System.out.println("\nPega todos os valores com Entry:  ");
       for (Map.Entry<String, String> entryCidade : capitais.entrySet()) {
           System.out.printf("\nEstado: %s - Cidade: %s", entryCidade.getKey(), entryCidade.getValue());
       }

    }
}
