package Colecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class CampeaoArrayList {

      public static void main(String[] args) throws IOException {

        ArrayList<String> campeoes = new ArrayList<>();

        FileReader fr = new FileReader("C:\\Users\\JULI\\Desktop\\campeoes.txt");
        BufferedReader br = new BufferedReader(fr);

        String fileContent;

        while ((fileContent = br.readLine()) != null) {
             //System.out.println(fileContent);
            (br.toString()).split("\n");
            campeoes.add(fileContent);
       }

        Collections.sort(campeoes);
        System.out.println("Campões Mundiais:");
        for (String champ: campeoes) {
            System.out.println(champ);
        }
        System.out.println("\nÉ pentaaaaa !!!!!");

   }
}