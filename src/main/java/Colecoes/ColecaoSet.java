package Colecoes;

import java.util.*;

public class ColecaoSet {

    public static void main(String[] args) {

        //HashSet <String> pessoas = new HashSet<>(); // nao garante a ordem
        //Set<String> pessoas = new HashSet<>(); pode referenciar no lado esqeurdo apenas a familia
        LinkedHashSet <String> pessoas = new LinkedHashSet<>(); // mantem a ordem de insercao
       // Set <String> pessoas = new TreeSet<>(); // ordem natural e de acordo com a tabelas ASCII minuscula e maiuscula nao tem a mesma ordem
      //System.out.println(pessoas.add ("Tom")); // boolean
        pessoas.add ("John");
        pessoas.add ("Mary");
        pessoas.add ("Peter");
        pessoas.add ("David");
        pessoas.add ("Alice");
       pessoas.add ("Tom");

       // for (String pessoa: pessoas){
         //   System.out.println(pessoa);
        //}

        pessoas.contains("Peter"); //nao funciona ?!?!?!?!
        pessoas.remove("Peter");


        HashSet <Integer> quantidades = new HashSet<>();
        quantidades.add (3);
        quantidades.add (2);
        quantidades.add (1);
        quantidades.add (4);
        quantidades.add (5);
        quantidades.add (6);
        quantidades.add (6);


        Iterator <Integer> quantidadesIterator = quantidades.iterator();
        System.out.println(quantidadesIterator.next()); // se nao tiver next ele dará erro (NoSuchElemenException)
        System.out.println(quantidadesIterator.next());
        System.out.println(quantidadesIterator.next());

        while (quantidadesIterator.hasNext()){
            System.out.println(quantidadesIterator.next());
        }


    }
}
