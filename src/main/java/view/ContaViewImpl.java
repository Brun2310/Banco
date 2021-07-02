package view;

import dominio.Conta;
import dominio.ContaEnum;
import services.ContaFactury;
import services.ContaService;

import javax.inject.Inject;
import java.util.Scanner;

public class ContaViewImpl implements ContaView{
    @Inject
    private ContaFactury contaFactory;

    @Override
    public Conta createConta(Scanner sc) {
        Conta conta = new Conta();
        System.out.println("Qual o tipo de conta a ser criada? \n 1 - Especial; \n 2 - Poupança; \n 3 - Regular;");
        int opcao = sc.nextInt();
        ContaEnum contaEnum = null;
        switch (opcao) {
            case 1:
                contaEnum = ContaEnum.CONTAESPECIAL;
                break;
            case 2:
                contaEnum = ContaEnum.CONTAPOUPANCA;
            case 3:
                contaEnum = ContaEnum.CONTAREGULAR;
        }
        ContaService contaService = contaFactory.createConta(contaEnum);
        return contaService.criarConta(conta);
    }
}
