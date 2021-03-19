package Colecoes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapExercicoCampeao  {

    private static final int COLUNA_NOME_DO_PAIS = 1;

    public static void main (String[] args) throws IOException  {

        //Com java.nio
        List<String> paises = Files.readAllLines(Path.of("C:\\Users\\JULI\\Desktop\\campeoes.txt"));

        String pais;
        Map<String, Integer> quantidadeTitulos = new HashMap<>();
        for (String linha: paises) {
             pais = linha
                    .split("-") [COLUNA_NOME_DO_PAIS]
                    .trim();

            if (!quantidadeTitulos.containsKey(pais)) {
                quantidadeTitulos.put(pais,1);
            }else {
                int quantidadeJaExistente = quantidadeTitulos.get(pais);
                quantidadeJaExistente++;
                quantidadeTitulos.put(pais, quantidadeJaExistente);
            }
        }


        for (Map.Entry<String, Integer> registro : quantidadeTitulos.entrySet()) {
            System.out.printf("\n%s -> %d", registro.getKey(), registro.getValue());
        }

           }
}
