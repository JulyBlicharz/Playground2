package excecoes;

import java.io.IOException;

public class ExemploTrataExcexaoOuRelanca {

    public static void main(String[] args) {
        metodoA();


    }

    private static void metodoA() { // vai tratar com Try Catch

        try {
            metodoB();
        } catch (IOException e) { // se acontecer a excecao especifica , o Catch "pega
            //faca isso se acontecer IOException
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) { // Segura qualquer excecao
            System.out.println(e.getMessage());
            e.printStackTrace();// motra a excecao no console // nao usar na WEB
        }


    }

    private static void metodoB() throws Exception, IOException { // propagou a aexcecao
        throw new Exception("Deu ruim aqui...");
        //throw new IOException ("Deu ruim aqui...");
    }
}
