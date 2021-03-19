package excecoes;

public class ExemploExcecaoUnchecked {
    public static void main(String[] args) {

        metodoA();
        metodoB();

    }

    public static void metodoA() {
        System.out.println("Metodo A");
        metodoB();
    }

    public static void metodoB() {
        System.out.println("Metodo B");
        throw new RuntimeException("Metodo nao pode ser excecutado");
    }
}
