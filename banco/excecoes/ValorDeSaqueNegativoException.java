package banco.excecoes;

public class ValorDeSaqueNegativoException extends RuntimeException {
    public ValorDeSaqueNegativoException() {
        super("Valor do saque deve ser maior que 0(ZERO)");
    }
}
