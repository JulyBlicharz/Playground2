package ENUMeracoes;

public class ExercicioEnumeracoes {



    public static void main(String[] args) {

//        System.out.println("GERACAO DE CARTAO DE CREDITO");
//        System.out.println("\nSelecione a opcao que melhor condiz com a sua renda mensal");

//        List<String> rendaMensal = Arrays.asList(
//                TipoDeCartao.STANDARD.toString(), TipoDeCartao.GOLD.toString(),
//                TipoDeCartao.PREMIUM.toString(), TipoDeCartao.BLACK.toString());

//        List<TipoDeCartao> rendaMensal = new ArrayList<>();
//                rendaMensal.add(TipoDeCartao.STANDARD), rendaMensal.add(TipoDeCartao.GOLD),
//                        rendaMensal.add(PREMIUM) ,rendaMensal.add(TipoDeCartao.BLACK);

//        rendaMensal.addAll(Arrays.asList(TipoDeCartao.values()));


//        System.out.println("Opcao 1 - Renda Mensal < 1000");
//        System.out.println("Opcao 2 - Renda Mensal < 3000");
//        System.out.println("Opcao 3 - Renda Mensal < 10000");
//        System.out.println("Opcao 4 - Renda Mensal >= 10000");
//
//        System.out.println("Digite a Opcao: ");
//
//        Integer input = new Scanner(System.in).nextInt();
//
//        switch (input) {
//             case 1:
//                System.out.println("Você selecionou menor que 1000 reais");
//                break;
//            case 2:
//                System.out.println("Você selecionou menor que 3000 reais");
//                break;
//            case 3:
//                System.out.println("Você selecionou menor que 10.000 reais");
//                break;
//            case 4:
//                System.out.println("Você selecionou maior ou igual a 10.000 reais");
//                break;
//            default:
//                throw new ArrayIndexOutOfBoundsException("Renda não configurado!");
//            }
//
//
//        System.out.println("Seu Cartao será do Tipo: " + rendaMensal.get(input));



//            if (input == 1) {
//                System.out.println("Seu Cartao será do Tipo: " + TipoDeCartao.STANDRD);
//            }else if (input == 2) {
//                System.out.println("Seu Cartao será do Tipo: " + TipoDeCartao.GOLD);
//            }else if (input == 3) {
//                System.out.println("Seu Cartao será do Tipo: " + TipoDeCartao.PREMIUM);
//            }else if (input == 4) {
//                System.out.println("Seu Cartao será do Tipo: " + TipoDeCartao.BLACK);
//            }

        ModalidadeCredito modalidade = new ModalidadeCredito();
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(900));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(2999));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(9999));
        System.out.println(ModalidadeCredito.obtemTipoDeCartao(11000));

        TaxaDeJuros taxaDeJuros = new TaxaDeJuros();
        System.out.println(TaxaDeJuros.obtemTaxa("GOLD"));
        System.out.println(TaxaDeJuros.obtemTaxa("PREMIUM"));
        System.out.println(TaxaDeJuros.obtemTaxa("BLACK"));
        System.out.println(TaxaDeJuros.obtemTaxa("STANDARD"));




    }
}
