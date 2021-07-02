package services;

import annotation.ContaAnnotationLiteral;
import dominio.ContaEnum;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class ContaFactury {
    @Inject
    @Any
    private Instance<ContaService> contaServiceInstance;

    public ContaService createConta(ContaEnum contaEnum) {
        final ContaAnnotationLiteral literal = new ContaAnnotationLiteral(contaEnum);
        return contaServiceInstance.select(literal).get();
    }
}
