package excecoes;

public class InputCapitalException extends Exception{

    public InputCapitalException(String messagem) {
       super(messagem); // passa a mensagem pelo construtor da classe pai - Exception
    }
}
