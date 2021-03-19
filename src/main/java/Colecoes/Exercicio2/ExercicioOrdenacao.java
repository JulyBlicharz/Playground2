package Colecoes.Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExercicioOrdenacao {

    public static void main(String[] args) {
        Produto produto1= new Produto ("Creme Dental 90g", 2.49F, 2.99F);
        Produto produto2= new Produto ("Sabonete em Barra Corporal 90g", 2.99F, 3.30F);
        Produto produto3= new Produto ("Protetor Solar 30 FPS 200ml", 37.39F, 39.12F);
        Produto produto4= new Produto ("Fralda P Confort - 50 Unidades", 44.90F, 44.90F);
        Produto produto5= new Produto ("Condicionador 200ml", 18.90F, 15.00F);

        List <Produto> produtos = new LinkedList<>();


        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        //Collections.sort(produtos);

        System.out.println("\nOrdenação por nome do produto:\n ");
        for (Produto prod: produtos){
            System.out.println(prod.getNomeProduto());
        }

    }
}
