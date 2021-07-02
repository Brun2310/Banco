package services;

import dominio.Conta;

import java.math.BigDecimal;

public interface ContaService {
    void sacar(Conta conta, BigDecimal valor);
    void depositar(Conta conta, BigDecimal valor);
    void verSaldo(Conta conta);
    Conta criarConta(Conta conta);
}
