package services;

import annotation.TipoConta;
import dominio.Conta;
import dominio.ContaEnum;
import excecoes.NoUserException;
import excecoes.SaldoInsuficienteException;

import java.math.BigDecimal;

@TipoConta(value = ContaEnum.CONTAESPECIAL)
public class ContaEspecialService implements ContaService{

    @Override
    public void sacar(Conta conta, BigDecimal valor) {
        if (conta.getSaldo().compareTo(valor) > 0) {
            conta.setSaldo(conta.getSaldo().subtract(valor));
            System.out.println("\nSaque no valor de " + valor + "realizado com sucesso");
        } else if (conta.getSaldo().add(conta.getLimite()).compareTo(valor) > 0) {
            conta.setSaldo(BigDecimal.valueOf(0));
            BigDecimal credito = valor.subtract(conta.getSaldo());
            conta.setLimite(conta.getLimite().subtract(credito));
            System.out.println("\nSaque no valor de " + valor + "realizado com sucesso (Utilizado limite de  R$ 200,00)");
        } else {
            throw new SaldoInsuficienteException(conta);
        }
    }

    @Override
    public void depositar(Conta conta, BigDecimal valor) {
        if (conta.getLimite().compareTo(BigDecimal.valueOf(200)) == 0){
            conta.setSaldo(conta.getSaldo().add(valor));
        } else {
            conta.setLimite(conta.getLimite().add(valor));
            if (conta.getLimite().compareTo(BigDecimal.valueOf(200)) > 0){
                conta.setSaldo(conta.getLimite().subtract(BigDecimal.valueOf(200)));
                conta.setLimite(BigDecimal.valueOf(200));
            }
        }
        System.out.println("\nDeposito no valor de " + valor + " realizado com sucesso");
    }

    @Override
    public void verSaldo(Conta conta) {
        System.out.println("Seu saldo atual é R$" + conta.getSaldo() + ",00");

    }

    @Override
    public Conta criarConta(Conta conta) {
        System.out.println("criando conta especial");
        conta.setCaminhoArquivo("teste");
        if (null == conta.getUsuario()) {
            throw new NoUserException("Usuário inexistente");
        }
        return conta;
    }
}
