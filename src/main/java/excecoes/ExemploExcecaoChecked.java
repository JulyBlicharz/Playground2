package excecoes;

public class ExemploExcecaoChecked {

    public static void main(String[] args) throws Exception {

    metodoA();
    metodoB();

    }

    public static void metodoA() throws Exception{
        System.out.println("Metodo A");
        metodoB();
    }

    public static void metodoB () throws Exception {
        System.out.println("Metodo B");
       // Exception minhaExcecao = new Exception();
       // throw minhaExcecao;

       // if (algumaRegra)
       throw new Exception("Metodo noa seve ser exceutado");
    }
}
