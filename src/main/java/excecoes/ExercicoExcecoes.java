package excecoes;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicoExcecoes {

    private static final List<String> CIDADES = Arrays.asList(
                                                    "Porto Alegre", "Curitiba",
                                                    "São Paulo", "Rio de Janeiro",
                                                        "Cuiabá", "São Luis");
    public static void main(String[] args) throws  InputCapitalException{

        System.out.printf("Informe a posicao de uma das cidaddes [1-%d]: \n", CIDADES.size());
        int posicao = pedePosicaoAteInformadoCorreto();
        String nomeCidade = CIDADES.get(posicao-1);
        System.out.println("Você escolheu: "  + nomeCidade);

    }


    private static Integer pedePosicaoAteInformadoCorreto() {

        while (true) {
            try {
                return pedePosicao();
            } catch (InputCapitalException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int pedePosicao() throws InputCapitalException {
        int posicao = new Scanner(System.in).nextInt();

        if (posicao <= 0 || posicao > CIDADES.size()) {
            String message = String.format("Opção inválida, informe uma opção de 1 a %d", CIDADES.size());
            throw new InputCapitalException(message);
        }
        return posicao;
    }
}
