package banco.excecoes;

public class ContaInexistenteException extends RuntimeException{
    public ContaInexistenteException() {
        super("Conta inexistente");
    }

    public ContaInexistenteException(String message) {
        super(message);
    }
}
