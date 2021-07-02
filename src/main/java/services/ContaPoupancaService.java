package services;

import annotation.TipoConta;
import dominio.Conta;
import dominio.ContaEnum;
import excecoes.NoUserException;
import excecoes.SaldoInsuficienteException;

import java.math.BigDecimal;

@TipoConta(value = ContaEnum.CONTAPOUPANCA)

public class ContaPoupancaService implements ContaService{
    public void sacar(Conta conta, BigDecimal valor) {
        if (conta.getSaldo().compareTo(valor) > 0) {
            conta.setSaldo(conta.getSaldo().subtract(valor));
            System.out.println("\nSaque no valor de " + valor.multiply(BigDecimal.valueOf(0.9903)) + " (taxa de 0.07%) realizado com sucesso");
        } else {
            throw new SaldoInsuficienteException(conta);
        }
    }

    public void depositar(Conta conta, BigDecimal valor) {
        conta.setSaldo(conta.getSaldo().add(valor.multiply(BigDecimal.valueOf(0.9903))));
        System.out.println("\nDeposito no valor de " + valor.multiply(BigDecimal.valueOf(0.9903)) + " (taxa de 0.07%) realizado com sucesso");
    }

    public void verSaldo(Conta conta) {
        System.out.println("Seu saldo atual é R$" + conta.getSaldo() + ",00");
    }

    @Override
    public Conta criarConta(Conta conta) {
        System.out.println("criando conta poupança");
        conta.setCaminhoArquivo("teste");
        if (null == conta.getUsuario()) {
            throw new NoUserException("Usuário inexistente");
        }
        return conta;
    }
}
