package banco.excecoes;

public class ValorDeDepositoNegativoException extends RuntimeException {
    public ValorDeDepositoNegativoException() {
        super("Valor do depósito deve ser maior que ZERO");
    }
}
