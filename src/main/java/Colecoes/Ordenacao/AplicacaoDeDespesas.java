package Colecoes.Ordenacao;

import java.util.*;

public class AplicacaoDeDespesas {

    public static void main(String[] args) {
        Despesa despesa1= new Despesa("Netflix", 37.90F);
        Despesa despesa2= new Despesa("Mercado", 120.00F);
        Despesa despesa3= new Despesa("Fruteira", 60F);
        Despesa despesa4= new Despesa("Amazon", 60F);
        Despesa despesa5= new Despesa("Netflix", 10F);

        List<Despesa> despesas = new LinkedList<>();

        despesas.add(despesa1);
        despesas.add(despesa2);
        despesas.add(despesa3);
        despesas.add(despesa4);
        despesas.add(despesa5);



//o TreeSet utiliza o compareTo criado na classe Despesa sem a necessidade de chamar o Colletion.sort
// ou passar o comapator no contrutor do treeSet que cria com essa ordem especifica
//        Set<Despesa> despesas = new TreeSet<>();
//        Set<Despesa> despesas = new TreeSet<>(new DespesaByValorComparator());
//        despesas.add(despesa1);
//        despesas.add(despesa2);
//        despesas.add(despesa3);
//        despesas.add(despesa4);
//        despesas.add(despesa5);



        Collections.sort(despesas); //Comparable
        System.out.println("\nOrdenação por Descriçao:\n ");
        for (Despesa desp: despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }

        Collections.sort(despesas, Comparator.reverseOrder()); //Comparable
        System.out.println("\nOrdenação por Descriçao DESC:\n ");
        for (Despesa desp: despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }

        Collections.sort(despesas, new DespesaByValorComparator()); //Comparator

        System.out.println("\nOrdenação por Valor: ");
        for (Despesa desp: despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }
    }
}
