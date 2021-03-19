package excecoes;
//extends - heranca
//Exception - classe que esta sendo herdada

public class UsuarioNaoIdentificadoException extends Exception{

    public UsuarioNaoIdentificadoException(String message) {
        super(message); // passa a mensagem pelo contrutor da classe pai (Exception)

    }


}
