package banco.excecoes;

public class TransferenciaMesmaContaException extends RuntimeException {
    public TransferenciaMesmaContaException() {
        super("Não pode ser feita transferencia para mesma conta");
    }
}
