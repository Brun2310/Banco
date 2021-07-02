package excecoes;

import dominio.Conta;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(Conta conta) {
        super("O Usuario de conta " + conta + " não possui saldo suficiente");
    }
}
