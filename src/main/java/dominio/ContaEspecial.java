package dominio;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString()

public class ContaEspecial extends Conta{

    public ContaEspecial(int NumeroConta, Usuario usuario, BigDecimal saldo, BigDecimal limite, String caminhoArquivo) {
        super(NumeroConta, usuario, saldo, limite, caminhoArquivo);
    }

    private BigDecimal saldo;
    private final BigDecimal limite = BigDecimal.valueOf(200);
}
