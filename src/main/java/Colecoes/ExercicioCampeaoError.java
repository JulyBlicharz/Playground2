package Colecoes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCampeaoError {

    public static void main(String[] args) throws IOException {
        ArrayList<String> campeoes = new ArrayList<>();

        File file = new File("C:\\Users\\JULI\\Desktop\\campeoes.txt");
        Scanner scan = new Scanner(file);

        String fileContent;

     while (scan.hasNextLine()) {
         fileContent = scan.nextLine();
         campeoes.add(fileContent);
     }

        Collections.sort(campeoes);

        System.out.println("Campões Mundiais:");
        for (String champ: campeoes) {
            System.out.println(champ);
        }
        System.out.println("\nBrasli é pentaaaaa !!!!!");
    }
}
