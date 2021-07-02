package dominio;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString()

public class Conta {
    private int NumeroConta;
    private Usuario usuario;
    private BigDecimal saldo;
    private BigDecimal limite;
    private String caminhoArquivo;

}
