package Colecoes;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicoArrayLlist {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Kiersten");
        name.add("Zaneta");
        name.add("Frank");
        name.add("Tedi");
        name.add("Bryana");
        name.add("Marigold");
        name.add("Devan");
        name.add("Jerrilyn");
        name.add("Isac");
        name.add("Kathrine");
        name.add("Bryana");

        System.out.println("Nova lista com os Primeiros 3 nomes ordenados");


        ArrayList<String> primeiros = new ArrayList<>();
        primeiros.add(name.get(0));
        primeiros.add(name.get(1));
        primeiros.add(name.get(2));

        Collections.sort(name);

        // System.out.println(primeirosNomes);

        //Outra forma de imprimir os 3 primeiros
     /*
        int contador = 0;
        for (String pessoa: name) {
            if (contador >= 3) {
                break;
            }
            primeiros.add(name);
            contador++;
        }

        for (String nome: primeiros){
            System.out.println(nome);
        }
        */


        System.out.println(primeiros);
//        for (String primeirosNomes: PrimeirosTres) {
//            System.out.println(primeirosNomes);
        //}

        System.out.println();
       ArrayList <String> novaLista = removeDuplicados(name);
        //for (String lang: novaLista) {
          //  System.out.println(lang);
        //}

        Iterator<String> imprimeNovaListaComIterator = novaLista.iterator(); // USAR iTERATOR AO INVES DO FOR
        while(imprimeNovaListaComIterator.hasNext()){
            System.out.println("***COm Iterator -> " + imprimeNovaListaComIterator.next());
        }

      //System.out.println("Lista de nomes sem repetições:\n " + novaLista);

        ArrayList <String> hashLista = removerDuplicadosComHash(name);
        System.out.println("\nLista de nomes sem repetições usando HASH: \n" + hashLista);

        LinkedHashSet<String> primeirosSemDuplicacao = new LinkedHashSet<>();
        primeirosSemDuplicacao.add(name.get(0));
        primeirosSemDuplicacao.add(name.get(1));
        primeirosSemDuplicacao.add(name.get(2));

        System.out.println("\n*************primeirosSemDuplicacao: " + primeirosSemDuplicacao);

        }

        public static  ArrayList <String> removeDuplicados (ArrayList<String> name) {
            ArrayList <String> novaLista = new ArrayList <> ();
            for (String item: name){
                if (!novaLista.contains(item)){
                    novaLista.add(item);
                }
            }
        return novaLista;
        }

        public static ArrayList <String> removerDuplicadosComHash (ArrayList<String> name) {
            //   Set <String> set = new LinkedHashSet<>(name); //Melhor opcao
            Set<String> set = new LinkedHashSet<>();
            set.addAll(name);
            name.clear();
            name.addAll(set);
            return name;

        }

}
