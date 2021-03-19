package Colecoes;

import java.util.*;

public class Colecao {

    public static void main(String[] args) {
        // ArrayList linguagens = new ArrayList(); sem tipo
        // ArrayList<String> linguagens = new ArrayList(); // declara String apenas do lado esquerdo
        // List<String> lenguagens = new LinkedList<>();

        ArrayList <String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");

        System.out.println("Listagem");
        for (String lang: linguagens) {
            System.out.println(lang);
        }

        System.out.printf("\n Primeiro Elemento: %s", linguagens.get(0));

        Collections.sort(linguagens);

        System.out.println("\nListagem Ordenada");
        for (String lang: linguagens) {
            System.out.println(lang);
        }


        System.out.printf("\n Contem PHP? %s", linguagens.contains("PHP"));
        System.out.printf("\n Contem BASH? %s", linguagens.contains("BASH"));

        linguagens.remove("Java");

        System.out.printf("\nPrimeiro Elemento: %s", linguagens.get(0));

        System.out.println("\nListagem: ");

        for (String lang: linguagens) {
            System.out.println(lang);
        }

        System.out.printf("\n Posiçao na lista do item PHP %s", linguagens.indexOf("PHP"));






    }
}
